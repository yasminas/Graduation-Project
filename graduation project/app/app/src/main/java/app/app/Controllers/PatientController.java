package app.app.Controllers;

import app.app.Entities.Patient;
import app.app.Repositories.DoctorRepo;
import app.app.Repositories.PatientRepo;
import app.app.Repositories.SeizureRepo;
import app.app.Services.PatientService;
import app.app.Services.SeizureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class PatientController {
    @Autowired
    PatientService patientService;
    @Autowired
    PatientRepo patientRepo;
    @Autowired
    SeizureRepo SeizureRepo;
    @Autowired
    SeizureService SeizureService;
    @Autowired
    private DoctorRepo Doctorrepo;

    @CrossOrigin(origins = "*")


    /**view list**/
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public List<Patient> getAllPatients(Model Entities) {
        List<Patient> persons = new ArrayList<>();
        patientRepo.findAll().forEach(persons::add);
        System.out.println(persons.size());
        System.out.println("Hellow ffrom the other side of the woorld");

        return persons;
    }


    /**
     * Adding new patient
     **/
    @RequestMapping(value = "/addPatient", method = RequestMethod.POST)
    public ResponseEntity<Boolean> Addpatient(@RequestBody Patient patient) {
        return patientService.addpatient(patient);
    }


    /**
     * Deleting value
     **/

    @DeleteMapping("/delete/{id}")
    public String deletePatient(@PathVariable("id") Integer id, Model Entities) {
        Patient patient = patientRepo.findById(id);
        patientRepo.delete(patient);
        Entities.addAttribute("patients", patientRepo.findAll());
        return "index";   /**elpage elle hy view feha el list kolha**/

    }


    /**
     * details for one patient
     **/
    @GetMapping("/view/{id}")
/**get by id **/
    public Patient getPatientById(@PathVariable(value = "id") Integer id) {
        Patient patient = patientRepo.findById(id);
        return patientRepo.findById(id);
    }

    /**
     * Updating
     **/

    @PutMapping("/edit/{id}")

    public String updatePatient(@PathVariable int id,
                                @RequestBody Patient newpatient) {
        Patient patient = patientRepo.findById(id);
        newpatient.setId(id);
        patient = newpatient;
        patientRepo.save(newpatient);


        return "updated";
    }


}

















   /* public String updatePatient(@PathVariable(value = "id") Integer id,
                                @Valid @RequestBody Patient newpatient )
                                 {
    */
      /*  Patient patient = patientRepo.findById(id);



           /**for patient section **/
   /*    patient.setFName(newpatient.getFName());
        patient.setMName(newpatient.getMName());
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
          patient.setComo(newpatient.getComo());
/**For Seizure section**/


         /* Patient updated = patientRepo.save(patient);


           return "updated";
       }*/






































   /** @GetMapping ("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Integer id, Model Entities) {
        List<Patient> patient = patientRepo.findById(id);
        Entities.addAttribute("patients", patient);
        return "update-customer";
    }
    @PostMapping("/edit/{id}")
    public String updateUser(@PathVariable("id") Integer id, @Valid Patient patient, BindingResult result, Model Entities) {
        if (result.hasErrors()) {
            patient.setId(id);
            return "update-customer";
        }


        patientRepo.save(patient);
        Entities.addAttribute("patients", patientRepo.findAll());
        return "index";
    }
**/


/**
@CrossOrigin(origins = "*")
/**kant request mapping**/
  /**@GetMapping
    public String getAllPatients(Model Entities)
    {
        List<Patient> list = patientService.getAllPatients();

        Entities.addAttribute("patients", list);
        return "list-patients";
    }


    @PutMapping (path= {"/edit", "/edit/{id}"})
    public String editPatientById( Model Entities, @PathVariable("id") Optional<Integer> id)
            throws RecordNotFoundException
    {
        if (id.isPresent()) {
            Patient entity = patientService.getPatientById(id.get());

            Entities.addAttribute("patient", entity);


        } else {
            Entities.addAttribute("patient", new Patient());
        }
        return "add-edit-patient";
    }

    @DeleteMapping(value =  "/delete/{id}")
    public String deletePatientById(Model Entities, @PathVariable("id") Integer id)
            throws RecordNotFoundException
    {
        patientService.deletePatientById(id);

        return "redirect:/";
    }


    @RequestMapping(value = "/createPatient", method = RequestMethod.POST)


    public String createOrUpdatePatient(@RequestBody Patient patient)
    {
        patientService.createOrUpdatePatient(patient);
        return "redirect:/";
    }**/
/**Create Patient**/




