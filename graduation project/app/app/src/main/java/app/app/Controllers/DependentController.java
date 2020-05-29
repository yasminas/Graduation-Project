package app.app.Controllers;

import app.app.Entities.Dependent;

import app.app.Services.DependentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DependentController {
    @Autowired
    DependentService DependentService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/adddependent",method = RequestMethod.POST)
    public ResponseEntity<Boolean> Adddependent(@RequestBody Dependent dependent) {
        return  DependentService.adddependent(dependent);
    }
}
