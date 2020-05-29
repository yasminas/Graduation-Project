package app.app.Services;

import app.app.Entities.Test;
import app.app.Repositories.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestRepo testrepo;
    public ResponseEntity<Boolean> Addtest(Test test)
    {

        ResponseEntity<Boolean> response;
        testrepo.save(test);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}
