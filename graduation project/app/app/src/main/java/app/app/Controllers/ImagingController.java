package app.app.Controllers;

import app.app.Entities.Imaging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import app.app.Services.ImagingService;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class ImagingController {
    @Autowired
    ImagingService ImagingService;
    @PostMapping("/loadimg")
    public  ResponseEntity<Boolean> loaddata(@RequestParam("file") MultipartFile file, @RequestParam("imgid") Integer imgid ) throws IOException {
        return ImagingService.uploadimgfile(imgid,file);
    }
    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addimaging",method = RequestMethod.POST)
    public ResponseEntity<Boolean> Addimaging(@RequestBody Imaging imaging) {
        return  ImagingService.addimaging(imaging);
    }
}
