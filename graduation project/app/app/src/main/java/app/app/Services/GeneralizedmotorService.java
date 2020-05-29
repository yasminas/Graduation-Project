package app.app.Services;

import app.app.Entities.Generalizedmotor;
import app.app.Repositories.GeneralizedmotorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GeneralizedmotorService {
    @Autowired
    GeneralizedmotorRepo GeneralizedmotorRepo;
    public ResponseEntity<Boolean> addGM(Generalizedmotor GM)
    {

        ResponseEntity<Boolean> response;
        GeneralizedmotorRepo.save(GM);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}
