package app.app.Services;

import app.app.Entities.Patient;
import app.app.Repositories.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    PatientRepo patientRepo;
    public ResponseEntity<Boolean> addpatient(Patient patient)
    {

        ResponseEntity<Boolean> response;
        patientRepo.save(patient);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }

}
