package app.app.Controllers;

import app.app.Entities.Patient;
import app.app.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController  {
    @Autowired
    PatientService patientService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addPatient",method = RequestMethod.POST)
    public ResponseEntity<Boolean> Addpatient(@RequestBody Patient patient) {
        return  patientService.addpatient(patient);
    }
}
