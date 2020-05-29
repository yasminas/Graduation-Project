package app.app.Services;

import app.app.Entities.Features;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import app.app.Repositories.FeaturesRepo;

@Service
public class FeaturesService {
    @Autowired
    FeaturesRepo FeaturesRepo;
    public ResponseEntity<Boolean> addfeature(Features feature)
    {

        ResponseEntity<Boolean> response;
        FeaturesRepo.save(feature);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}
