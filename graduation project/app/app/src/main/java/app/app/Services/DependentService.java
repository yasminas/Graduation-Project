package app.app.Services;

import app.app.Entities.Dependent;
import app.app.Repositories.DependentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DependentService {

    @Autowired
   DependentRepo DependentRepo;

    public ResponseEntity<Boolean> adddependent(Dependent dependent)
    {

        ResponseEntity<Boolean> response;
        DependentRepo.save(dependent);

        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}
