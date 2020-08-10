package app.app.Services;
import app.app.Entities.Doc;
import app.app.Repositories.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;
import java.util.Properties;
import java.util.Random;

@Service
public class DoctorServices {
    @Autowired
    private DoctorRepo Doctorrepo ;

    // add user
    public  ResponseEntity<Boolean> addDoctor(Doc Doctor) {
        ResponseEntity<Boolean> response;
        Doc temp = Doctorrepo.findByEmail(Doctor.getEmail());

        System.out.println(Doctor.getEmail());
        if (temp == null ) {
            Doctor.setPassword(hashPassword(Doctor.getPassword()));
            Doctor.setIsdeleted(false);
            Doctorrepo.save(Doctor);
            response = new ResponseEntity<>(true, HttpStatus.OK);
            return response;
        }
        else {
            response = new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
            return response;
        }

    }

    // remove user
    public ResponseEntity<Boolean> removeDoctor(Doc doctor) {
        ResponseEntity<Boolean> response;
        System.out.println(doctor.getEmail());
        Doc temp = Doctorrepo.findByEmail(doctor.getEmail());
        if (temp != null && temp.getIsdeleted()==false) {
            temp.setIsdeleted(true);
            Doctorrepo.save(temp);
            response = new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            response = new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
        }
        return response;
    }



    // login
    public ResponseEntity<String> login(Doc doctor, HttpSession session) throws MessagingException, javax.mail.MessagingException {
        ResponseEntity<String> response;
        session.setAttribute("Email",doctor.getEmail());
        Doc temp1 =Doctorrepo.findByEmail(doctor.getEmail());
        boolean checkpss= checkPass(doctor.getPassword(),temp1.getPassword());
        if (temp1 != null && temp1.getIsdeleted()==false && checkpss==true ) {
            //Integer code= sendemail(temp1.getEmail());
            //Doctorrepo.delete(temp1);
           // Doctor temp= new Doctor();
            //temp=temp1;
            // temp1.setCode(code);
            //Doctorrepo.save(temp);
            response = new ResponseEntity<>("login Asuccessfully", HttpStatus.OK);
            System.out.println("kolo 100 100 ");
            return response;
        } else {
            response = new ResponseEntity<>("Not Allowed", HttpStatus.BAD_REQUEST);
            System.out.println(" msh kolo 100 100 ");

            return response;
        }



    }
    private String hashPassword(String plainTextPassword){
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
    }

    // decode and check pass
    private Boolean checkPass(String plainPassword, String hashedPassword) {
        if (BCrypt.checkpw(plainPassword, hashedPassword))
        {
            //System.out.println("The password matches.");
            return true;
        }
        else{
            // System.out.println("The password does not match.")
            return false;
        }
    }
    // send email
    public Integer sendemail(String email) throws MessagingException, javax.mail.MessagingException {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
        mailSender.setUsername("kasralainy6@gmail.com");
        mailSender.setPassword("kasralainy@1234");
        Properties prop = mailSender.getJavaMailProperties();
        prop.put("mail.transport.protocol", "smtp");
        prop.put("mail.smtp.port", 465);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.startssl.enable", "true");
        prop.put("mail.smtp.startssl.required", "true");
        prop.put("mail.debug", "true");
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mailMsg = new MimeMessageHelper(mimeMessage);
        mailMsg.setFrom("kasralainy6@gmail.com");
        mailMsg.setTo(email);
        mailMsg.setSubject("verification code ");
        Integer code=generateRandomDigits(4);
        mailMsg.setText("Hi! Your verfication code is "+ code);
        mailSender.send(mimeMessage);
        System.out.println("---Done---");
        return code;

    }
    // generate random code
    public static int generateRandomDigits(int n) {
        int m = (int) Math.pow(10, n - 1);
        return m + new Random().nextInt(9 * m);
    }
    /* public ResponseEntity<String> loginstep2(Doctor user , Integer code) throws javax.mail.MessagingException {

         Doctor temp=userrepo.findByUsername(user.getUsername());
         Integer logcode =temp.getLogcode();
         ResponseEntity<String> response;
         if (logcode.equals(code))
         {
             response = new ResponseEntity<>(temp.getRole().getName(), HttpStatus.OK);
             return  response;
         }
         else
         {
             response =new ResponseEntity<>("wrong code",HttpStatus.BAD_REQUEST);
             return  response;
         }

     }*/

    public ResponseEntity<String> forgetpass(Doc doctor) throws javax.mail.MessagingException, MessagingException {
        Doc temp=Doctorrepo.findByEmail(doctor.getEmail());
        ResponseEntity<String> response;

        if(temp!=null)
        {
            Integer code =sendemail(temp.getEmail());
            Doctorrepo.delete(temp);
            temp.setCode(code);
            Doctorrepo.save(temp);
            response = new ResponseEntity<>("Email Sent successfully", HttpStatus.OK);
            return response;

        }
        else
        {
            response = new ResponseEntity<>("Not Allowed", HttpStatus.BAD_REQUEST);
            return response;
        }
    }
    public ResponseEntity<String> resetpass(Doc user, Integer code) {
        Doc temp=Doctorrepo.findByEmail(user.getEmail());
        ResponseEntity<String> response;
        Integer logcode= temp.getCode();
        System.out.println(logcode);
        System.out.println(code);
        if (temp !=null && logcode.equals(code ))
        {
            Doctorrepo.delete(temp);
            temp.setPassword(hashPassword(user.getPassword()));
            Doctorrepo.save(temp);
            response = new ResponseEntity<>("success reset ", HttpStatus.OK);
            return response;
        }
        else
        {
            response = new ResponseEntity<>("Not Allowed", HttpStatus.BAD_REQUEST);
            return response;
        }
    }



    public ResponseEntity<Boolean> logout(HttpSession session) {
        ResponseEntity<Boolean> logoutresponse;
        session.removeAttribute("Email");
        session.invalidate();
        logoutresponse =new ResponseEntity<>(true,HttpStatus.OK);
        return logoutresponse;
    }


}
