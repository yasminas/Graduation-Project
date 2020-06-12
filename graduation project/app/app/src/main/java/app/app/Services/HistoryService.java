/*
package app.app.Services;

import app.app.Entities.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import app.app.Repositories.HistoryRepo;

@Service
public class HistoryService {
    @Autowired
    HistoryRepo HistoryRepo;
    public ResponseEntity<Boolean> addhistory(History history)
    {

        ResponseEntity<Boolean> response;
        HistoryRepo.save(history);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}
*/

