package app.app.Controllers;

import app.app.Entities.Test;
import app.app.Services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class LabController {
    @Autowired
    TestService testService;
    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addtest",method = RequestMethod.POST)
    public ResponseEntity<Boolean> addtestlab(@RequestBody Test test) {
    return  testService.Addtest(test);
    }
}
