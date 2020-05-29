package app.app.Controllers;

import app.app.Entities.Features;
import app.app.Services.FeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FeaturesController {
    @Autowired
    FeaturesService  FeaturesService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addfeature",method = RequestMethod.POST)
    public ResponseEntity<Boolean> Addpatient(@RequestBody Features feature) {
        return  FeaturesService.addfeature(feature);
    }
}
