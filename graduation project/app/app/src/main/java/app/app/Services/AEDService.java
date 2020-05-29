package app.app.Services;

import app.app.Entities.AED;
import app.app.Repositories.AEDRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AEDService {
    @Autowired
    AEDRepo AEDRepo;
    public ResponseEntity<Boolean> addAED(AED AED)
    {

        ResponseEntity<Boolean> response;
        AEDRepo.save(AED);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}

