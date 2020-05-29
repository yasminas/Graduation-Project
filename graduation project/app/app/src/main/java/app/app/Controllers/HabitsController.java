package app.app.Controllers;

import app.app.Entities.SpecialHabits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HabitsController {
    @Autowired
    app.app.Services.HabitsService HabitsService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addhabit",method = RequestMethod.POST)
    public ResponseEntity<Boolean> Addhabit(@RequestBody SpecialHabits habit) {
        return  HabitsService.addhabit(habit);
    }
}
