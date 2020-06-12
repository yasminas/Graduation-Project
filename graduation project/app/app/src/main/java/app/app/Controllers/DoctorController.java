package app.app.Controllers;

import app.app.Entities.Doctor;
import app.app.Repositories.DoctorRepo;
import app.app.Services.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;


@RestController
public class DoctorController {

    @Autowired
    DoctorRepo Doctorrepo;

    @Autowired
    DoctorServices Doctorservices;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/Register", method = RequestMethod.POST)
    public ResponseEntity<Boolean> addDoctor(@RequestBody Doctor doctor) {
        return Doctorservices.addDoctor(doctor);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/removeDoctor", method = RequestMethod.POST)
    public ResponseEntity<Boolean> removeDoctor(@RequestBody Doctor doctor) throws Exception {
        return Doctorservices.removeDoctor(doctor);
    }
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<String> login(@RequestBody Doctor doctor, HttpSession session) throws Exception {

        return Doctorservices.login(doctor, session);
    }
    /*@CrossOrigin(origins = "*")
    @RequestMapping(value="/verifycode",method = RequestMethod.POST)
    public ResponseEntity<String> loginstep2(@RequestBody Doctor user, @RequestParam("code") Integer code) throws MessagingException {
        return  Doctorservices.loginstep2(user,code);
    }*/
    @CrossOrigin(origins = "*")
    @RequestMapping(value="/forgetpass",method = RequestMethod.POST)
    public ResponseEntity<String> forgetpass(@RequestBody Doctor doctor) throws MessagingException {
        return  Doctorservices.forgetpass(doctor);
    }
    @CrossOrigin(origins = "*")
    @RequestMapping(value="/resetpass",method = RequestMethod.POST)
    public ResponseEntity<String> resetpass(@RequestBody Doctor doctor, @RequestParam("code") Integer code) throws MessagingException {
        return  Doctorservices.resetpass(doctor,code);
    }
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ResponseEntity<Boolean> logout(HttpSession session) throws Exception {
        return Doctorservices.logout(session);
    }



}
