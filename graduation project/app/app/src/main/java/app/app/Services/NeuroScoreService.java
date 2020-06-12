/*
package app.app.Services;

import app.app.Entities.NeuroScore;
import app.app.Repositories.NeuroScoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NeuroScoreService {
    @Autowired
  NeuroScoreRepo NeuroScoreRepo;
    
    public ResponseEntity<Boolean> addscore(NeuroScore score)
    {

        ResponseEntity<Boolean> response;
        NeuroScoreRepo.save(score);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}
*/