package app.app.Controllers;

import app.app.Entities.EEG;
import app.app.Services.EEGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class EEGController {
    @Autowired
    EEGService EEGService;
    @PostMapping("/loaddata")
    public  ResponseEntity<Boolean> loaddata(@RequestParam("file") MultipartFile file,@RequestParam("eegid") Integer eegid ) throws IOException{
       return EEGService.uploadeegfile(eegid,file);
    }
    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addeeg",method = RequestMethod.POST)
    public ResponseEntity<Integer> Addeeg(EEG eeg) {
        return  EEGService.addeeg(eeg);
    }
}
