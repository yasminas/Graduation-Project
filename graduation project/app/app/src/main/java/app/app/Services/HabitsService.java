/*
package app.app.Services;

import app.app.Repositories.HabitsRepo;

import app.app.Entities.SpecialHabits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HabitsService {
    @Autowired
   HabitsRepo HabitsRepo;
    public ResponseEntity<Boolean> addhabit(SpecialHabits habit)
    {

        ResponseEntity<Boolean> response;
        HabitsRepo.save(habit);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }

}
*/