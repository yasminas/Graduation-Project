package app.app.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository
public class Tic {
/*
    @Query(nativeQuery =true,value = " SELECT `defect_severity` FROM `ticket` WHERE `detected_in_release` IN (:releases) AND `detected_on_date` BETWEEN '0019-01-04' AND '0019-04-04' and`defect_status`= 'Closed'GROUP BY (`defect_severity`)")
    List<String> countByTicketDefectSeverity(@Param("releases") String[] releases );
*/
        @Autowired
        @PersistenceContext
        private EntityManager entityManager;

    public List<Object[]> Severity(@Param("releases") List<String>releases )
    {
        System.out.println("hnaaaaaaaaaaaaaaaaaaa");
        for(int i=0;i<releases.size();i++) {
            System.out.println(releases.get(i));
        }
        Query q = entityManager.createNativeQuery("SELECT `defect_severity`, COUNT(`defect_severity`) as  severity FROM `ticket` WHERE `detected_in_release` IN (:releases) AND `detected_on_date` BETWEEN '0019-01-04' AND '0019-04-04' and`defect_status`= 'Closed'GROUP BY (`defect_severity`)");
        q.setParameter("releases", releases);
        List<Object[]> resultList = q.getResultList();
      return resultList;
    }
    public List<Object[]> Labs(@Param("releases") List<String>releases )
    {
        System.out.println("hnaaaaaaaaaaaaaaaaaaa");
        for(int i=0;i<releases.size();i++) {
            System.out.println(releases.get(i));
        }
        Query q = entityManager.createNativeQuery("SELECT `defect_severity`, COUNT(`defect_severity`) as  severity FROM `ticket` WHERE `detected_in_release` IN (:releases) AND `detected_on_date` BETWEEN '0019-01-04' AND '0019-04-04' and`defect_status`= 'Closed'GROUP BY (`defect_severity`)");
        q.setParameter("releases", releases);
        List<Object[]> resultList = q.getResultList();
        return resultList;
    }

}
