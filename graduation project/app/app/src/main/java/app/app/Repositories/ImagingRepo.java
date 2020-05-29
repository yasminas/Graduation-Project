package app.app.Repositories;

import app.app.Entities.Imaging;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagingRepo extends CrudRepository<Imaging, String> {
    @Query("SELECT u FROM Imaging u WHERE u.Imaging_ID = ?1")
    Imaging findImagingByImaging_ID(Integer Imaging_ID);
}
