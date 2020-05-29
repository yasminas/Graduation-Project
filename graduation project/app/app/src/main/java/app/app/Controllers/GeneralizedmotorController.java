package app.app.Controllers;

import app.app.Entities.Generalizedmotor;
import app.app.Services.GeneralizedmotorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GeneralizedmotorController {
    @Autowired
    GeneralizedmotorService GeneralizedmotorService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addGM",method = RequestMethod.POST)
    public ResponseEntity<Boolean> AddGM(@RequestBody Generalizedmotor GM) {
        return  GeneralizedmotorService.addGM(GM);
    }
}
