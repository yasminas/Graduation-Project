package app.app;

import app.app.exception.RecordNotFoundException;
import app.app.property.FileStorageProperties;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.io.IOException;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class AppApplication {

    public static void main(String[] args) throws IOException, InvalidFormatException, RecordNotFoundException {
        SpringApplication.run(AppApplication.class, args);




    }

}
