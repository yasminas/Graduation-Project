package app.app.Repositories;

import app.app.Entities.EEG;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EEGRepo  extends CrudRepository<EEG, String>
{
    @Query("SELECT u FROM EEG u WHERE u.EEG_ID = ?1")
    EEG findEEGByEEG_ID(Integer EEG_ID);
}
