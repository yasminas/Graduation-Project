package app.app.Controllers;

import app.app.Entities.NeuroScore;
import app.app.Services.NeuroScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NeuroScoreController {
    @Autowired
    NeuroScoreService NeuroScoreService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addscore",method = RequestMethod.POST)
    public ResponseEntity<Boolean> Addscore(@RequestBody NeuroScore score) {
        return  NeuroScoreService.addscore(score);
    }
}
