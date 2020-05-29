package app.app.Controllers;

import app.app.Entities.GeneralizednonMotor;
import app.app.Services.GeneralizednonMotorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class GeneralizednonMotorController {
    @Autowired
    GeneralizednonMotorService GeneralizednonMotorService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addGNM",method = RequestMethod.POST)
    public ResponseEntity<Boolean> AddGNM(@RequestBody GeneralizednonMotor GNM) {
        return  GeneralizednonMotorService.addGNM(GNM);
    }
}
