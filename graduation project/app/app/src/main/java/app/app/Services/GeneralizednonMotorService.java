package app.app.Services;

import app.app.Entities.GeneralizednonMotor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import app.app.Repositories.GeneralizednonMotorRepo;
@Service
public class GeneralizednonMotorService {
    @Autowired
    GeneralizednonMotorRepo GeneralizednonMotorRepo;
    public ResponseEntity<Boolean> addGNM(GeneralizednonMotor GNM)
    {

        ResponseEntity<Boolean> response;
        GeneralizednonMotorRepo.save(GNM);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}
