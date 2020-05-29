package app.app.Controllers;

import app.app.Entities.Seizure;
import app.app.Services.SeizureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SeizureController {
    @Autowired
    SeizureService SeizureService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addseizure",method = RequestMethod.POST)
    public ResponseEntity<Boolean> Addseizure(@RequestBody Seizure seizure) {

        return  SeizureService.addseizure(seizure);
    }
}
