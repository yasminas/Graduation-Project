/**
package app.app.Controllers;

import app.app.Entities.FollowUp;
import app.app.Services.followservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class followController {
    @Autowired
    followservice followservice;
    @CrossOrigin(origins = "*")
    @RequestMapping(value="/follow",method = RequestMethod.POST)
    public ResponseEntity<Boolean> Addfollowup(@RequestBody FollowUp followup) {
        return  followservice.followup(followup);
    }
}
**/