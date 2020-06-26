/**
package app.app.Services;

import app.app.Entities.FollowUp;
import app.app.Repositories.followRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class followservice {
    @Autowired
    followRepo followrepo;
    public ResponseEntity<Boolean> followup(FollowUp followup)
    {

        ResponseEntity<Boolean> response;
        followrepo.save(followup);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}
**/