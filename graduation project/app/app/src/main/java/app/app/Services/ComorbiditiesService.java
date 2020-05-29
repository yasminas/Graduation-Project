package app.app.Services;

import app.app.Entities.Comorbidities;
import app.app.Repositories.ComorbiditiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ComorbiditiesService {
    @Autowired
   ComorbiditiesRepo ComorbiditiesRepo;
    public ResponseEntity<Boolean> addcomo(Comorbidities como)
    {

        ResponseEntity<Boolean> response;
        ComorbiditiesRepo.save(como);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}
