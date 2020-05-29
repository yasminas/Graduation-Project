/*package app.app.Repositories;

import app.app.Entities.lab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class LabRepo {
    @Autowired
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public void insertlab(lab lab) {
        entityManager.createNativeQuery("INSERT INTO lab (Name, Address)  VALUES (?,?)")
                .setParameter(1, lab.getName())
                .setParameter(2, lab.getAddress())
                .executeUpdate();
    }
}*/
