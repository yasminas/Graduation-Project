/*
package app.app.Services;


import app.app.Entities.Imaging;
import app.app.Repositories.ImagingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImagingService {
    @Autowired
    ImagingRepo  ImagingRepo;
    @Autowired
    private FileStorageService fileStorageService;
    public ResponseEntity<Boolean> uploadimgfile(Integer imgid, MultipartFile file)
    {
        ResponseEntity<Boolean> response;
        Imaging imaging ;
        String fileName = fileStorageService.storeFile(file);
        imaging=ImagingRepo.findImagingByImaging_ID(imgid);
        System.out.println("eeeeeeeeeeeeeeeeeeeeeeeg"+imaging);

        imaging.setReport(fileName);
        ImagingRepo.save(imaging);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
    public ResponseEntity<Boolean> addimaging( Imaging imaging)
    {

        ResponseEntity<Boolean> response;
        ImagingRepo.save(imaging);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}
*/