package app.app;

import app.app.property.FileStorageProperties;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class AppApplication {

    public static void main(String[] args) throws IOException, InvalidFormatException {
        SpringApplication.run(AppApplication.class, args);




    }

}
