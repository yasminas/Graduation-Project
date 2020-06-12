package app.app.Controllers;

import app.app.Entities.Seizure;
import app.app.Repositories.PatientRepo;
import app.app.Repositories.SeizureRepo;
import app.app.Services.SeizureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SeizureController {
    @Autowired
    PatientRepo patientRepo;
    @Autowired
    SeizureService SeizureService;
    @Autowired
    SeizureRepo SeizureRepo;

    @CrossOrigin(origins = "*")
    /**adding seizure**/
    @RequestMapping(value = "/addPatient/{id}", method = RequestMethod.POST)
    public ResponseEntity<Boolean> Addseizure(@RequestBody Seizure seizure) {

        return SeizureService.addseizure(seizure);
    }
}
    /**Updating**/
  /**  @GetMapping("/edit/{id}")/**get by id **/
   /** public Patient getPatientById(@PathVariable(value = "id") Integer id) {
        Seizure patient = SeizureRepo.findById(id);


        return patientRepo.findById(id);
    }

    @PutMapping("/edit/{id}")
    public Patient updatePatient(@PathVariable(value = "id") Integer id,
                                 @Valid @RequestBody Seizure newpatient  ) {
        Seizure patient = SeizureRepo.findById(id);

        /**for patient section **/
      /**  patient.setMode(newpatient.getMode());
      /**  patient.setMName(newpatient.getMName());
        patient.setLName(newpatient.getLName());
        patient.setSex(newpatient.getSex());
        patient.setAge(newpatient.getAge());
        patient.setPNumber(newpatient.getPNumber());
        patient.setUpdatedAt(newpatient.getUpdatedAt());
        patient.setEducation(newpatient.getEducation());
        patient.setOccupation(newpatient.getOccupation());
        patient.setMaritalstatus(newpatient.getMaritalstatus());
        patient.setActivedriving(newpatient.getActivedriving());
        patient.setFamilyConsanguinity(newpatient.getFamilyConsanguinity());
        patient.setMenarcheAge(newpatient.getMenarcheAge());
        patient.setSeekpreg(newpatient.getSeekpreg());
        patient.setPrepreg(newpatient.getPrepreg());
        patient.setSeizurefreedom(newpatient.getSeizurefreedom());
        patient.setRegularity(newpatient.getRegularity());
        patient.setPrepregAED(newpatient.getPrepregAED());
        patient.setDrugfertility(newpatient.getDrugfertility());
        patient.setFolicAcid(newpatient.getFolicAcid());
        patient.setComplianceAED(newpatient.getComplianceAED());
        patient.setContraception(newpatient.getContraception());
        patient.setCurrentPregnant(newpatient.getCurrentPregnant());
        patient.setChangeAED(newpatient.getChangeAED());
        patient.setCatamEpilepsy(newpatient.getCatamEpilepsy());
        patient.setMenopause(newpatient.getMenopause());
        patient.setLactating(newpatient.getLactating());
        patient.setThreeD(newpatient.getThreeD());
        patient.setSpecialhabits(newpatient.getSpecialhabits());
        patient.setComo(newpatient.getComo());**/
/**For Seizure section**/

      /**  Patient updated = patientRepo.save(patient);

        return updated;
    }

}**/
