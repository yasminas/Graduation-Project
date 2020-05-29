package app.app.Services;

import app.app.Entities.Seizure;
import app.app.Repositories.SeizureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SeizureService {
    @Autowired
    SeizureRepo SeizureRepo;
    public ResponseEntity<Boolean> addseizure(Seizure seizure)
    {

        ResponseEntity<Boolean> response;
        SeizureRepo.save(seizure);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}
