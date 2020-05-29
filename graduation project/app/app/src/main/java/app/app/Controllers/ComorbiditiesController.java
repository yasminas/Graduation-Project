package app.app.Controllers;

import app.app.Entities.Comorbidities;
import app.app.Services.ComorbiditiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComorbiditiesController {
   @Autowired
   ComorbiditiesService ComorbiditiesService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addcomo",method = RequestMethod.POST)
    public ResponseEntity<Boolean> Addcomo(@RequestBody Comorbidities como) {
        return  ComorbiditiesService.addcomo(como);
    }
}
