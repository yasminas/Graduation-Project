/*package app.app.Services;

import app.app.Entities.Test;
import app.app.Entities.lab;
import app.app.Repositories.LabRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LabService {
    @Autowired
    LabRepo labRepo;
    public ResponseEntity<Boolean> addlab(lab lab)
    {

        ResponseEntity<Boolean> response;
        Test test =new Test();
        labRepo.insertlab(lab);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}*/
