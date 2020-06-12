/*
package app.app.Services;


import app.app.Entities.EEG;
import app.app.Repositories.EEGRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EEGService {
    @Autowired
    EEGRepo EEGRepo;
    @Autowired
    private FileStorageService fileStorageService;
    public ResponseEntity<Boolean> uploadeegfile(Integer eegid, MultipartFile file)
    {
        ResponseEntity<Boolean> response;
        EEG eeg;
        String fileName = fileStorageService.storeFile(file);
        eeg=EEGRepo.findEEGByEEG_ID(eegid);
        System.out.println("eeeeeeeeeeeeeeeeeeeeeeeg"+eeg);

        eeg.setReport(fileName);
        EEGRepo.save(eeg);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
    public ResponseEntity<Integer> addeeg(EEG eeg)
    {
        ResponseEntity<Integer> response;
        EEGRepo.save(eeg);
        Integer eegid=eeg.getEEG_ID();
        response = new ResponseEntity<>( eegid,HttpStatus.OK);
        return response;
    }

}
*/