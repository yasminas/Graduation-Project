package app.app.Services;

import app.app.Entities.Patient;
import app.app.Repositories.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

@Autowired
    PatientRepo patientRepo;

/** get list **/
public List<Patient> getAllPatient()
{
    List<Patient> result = (List<Patient>) patientRepo.findAll();

    if(result.size() > 0) {
        return result;
    } else {
        return new ArrayList<Patient>();
    }
}
/**creating**/
  public ResponseEntity<Boolean> addpatient(Patient patient)
    {

        ResponseEntity<Boolean> response;
        patientRepo.save(patient);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }



    /**Updating**/




   /** public List<Patient> getAllPatients()
    {
        List<Patient> result = (List<Patient>) patientRepo.findAll();

        if(result.size() > 0) {
            return result;
        } else {
            return new ArrayList<Patient>();
        }


    }


   public Patient getPatientById(Integer id) throws RecordNotFoundException {
        Optional<Patient> patient = patientRepo.findById(id);

        if(patient.isPresent()) {

            return patient.get();
        } else {
            throw new RecordNotFoundException("No patient record exist for given id");
        }
    }


   public void deletePatientById(Integer id) throws RecordNotFoundException
    {
        Optional<Patient> patient = patientRepo.findById(id);
        if(patient.isPresent())
        {
            patientRepo.deleteById(id);
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }

    }
    }**/




  /**  public Patient createOrUpdatePatient(Patient entity) {
        if(entity.getId()  == null)
        {
            entity = patientRepo.save(entity);

            return entity;
        }
        else
        {
            Optional<Patient> patient = patientRepo.findById(entity.getId());

            if(patient.isPresent())
            {

          Patient newpatient = patient.get();

                newpatient.setFName(entity.getFName());
                newpatient.setMName(entity.getMName());
                newpatient.setLName(entity.getLName());
                newpatient.setSex(entity.getSex());
                newpatient.setAge(entity.getAge());
                newpatient.setPNumber(entity.getPNumber());
                newpatient.setCreatedAt(entity.getCreatedAt());
                newpatient.setUpdatedAt(entity.getUpdatedAt());
                newpatient.setEducation(entity.getEducation());
                newpatient.setOccupation(entity.getOccupation());
                newpatient.setMaritalstatus(entity.getMaritalstatus());
                newpatient.setActivedriving(entity.getActivedriving());
                newpatient.setFamilyConsanguinity(entity.getFamilyConsanguinity());
                newpatient.setMenarcheAge(entity.getMenarcheAge());
                newpatient.setSeekpreg(entity.getSeekpreg());
                newpatient.setPrepreg(entity.getPrepreg());
                newpatient.setSeizurefreedom(entity.getSeizurefreedom());
                newpatient.setRegularity(entity.getRegularity());
                newpatient.setPrepregAED(entity.getPrepregAED());
                newpatient.setDrugfertility(entity.getDrugfertility());
                newpatient.setFolicAcid(entity.getFolicAcid());
                newpatient.setComplianceAED(entity.getComplianceAED());
                newpatient.setContraception(entity.getContraception());
                newpatient.setCurrentPregnant(entity.getCurrentPregnant());
                newpatient.setChangeAED(entity.getChangeAED());
                newpatient.setCatamEpilepsy(entity.getCatamEpilepsy());
                newpatient.setMenopause(entity.getMenopause());
                newpatient.setLactating(entity.getLactating());
                newpatient.setThreeD(entity.getThreeD());


               newpatient = patientRepo.save(newpatient);

                return newpatient;
            } else {

                entity = patientRepo.save(entity);

                return entity;
            }

        }

    }
**/




}
