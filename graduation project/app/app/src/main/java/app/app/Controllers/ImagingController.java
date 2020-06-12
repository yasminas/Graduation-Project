/*
package app.app.Controllers;

import app.app.Services.ImagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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

}
*/