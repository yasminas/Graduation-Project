package app.app.Controllers;

import app.app.Entities.Patient;
import app.app.Repositories.PatientRepo;
import app.app.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class PatientController  {
    @Autowired
    PatientService patientService;
    @Autowired
    PatientRepo patientRepo;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addPatient",method = RequestMethod.POST)
    public ResponseEntity<Boolean> Addpatient(@RequestBody Patient patient) {
        return  patientService.addpatient(patient);
    }


    /** Deleting value**/

    @DeleteMapping ("/delete/{id}")
    public String deletePatient(@PathVariable("id") Integer id, Model Entities) {
        Patient patient = patientRepo.findById(id);
        patientRepo.delete(patient);
        Entities.addAttribute("patients", patientRepo.findAll());
        return "index";   /**elpage elle hy view feha el list kolha**/

    }

    /**Updating
     * @return**/
    @GetMapping("/edit/{id}")
    public Patient getNoteById(@PathVariable(value = "id") Integer id) {
        Patient patient = patientRepo.findById(id);


         return patientRepo.findById(id);
    }

    @PutMapping("/edit/{id}")
    public Patient updateNote(@PathVariable(value = "id") Integer id,
                           @Valid @RequestBody Patient newpatient) {

        Patient patient = patientRepo.findById(id);
        patient.setFName(newpatient.getFName());
        patient.setMName(newpatient.getMName());
        patient.setLName(newpatient.getLName());
        patient.setSex(newpatient.getSex());
        patient.setAge(newpatient.getAge());
        patient.setPNumber(newpatient.getPNumber());
        patient.setCreatedAt(newpatient.getCreatedAt());
        patient.setUpdatedAt(newpatient.getUpdatedAt());


        Patient updated = patientRepo.save(patient);
        return updated;
    }
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



}
