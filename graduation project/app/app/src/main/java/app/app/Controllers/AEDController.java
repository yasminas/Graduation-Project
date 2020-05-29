package app.app.Controllers;
import app.app.Services.AEDService;

import app.app.Entities.AED;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AEDController {
    @Autowired
    AEDService AEDService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addAED",method = RequestMethod.POST)
    public ResponseEntity<Boolean> AddAED(@RequestBody AED AED) {
        return  AEDService.addAED(AED);
    }
}
