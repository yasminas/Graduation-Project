package app.app.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Classification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer classid;
    @Column
    private String cname;


    @ManyToMany(mappedBy = "classification")
    private List<Seizure> Seizure = new ArrayList<>();


    public String getCname() {
        return cname;
    }

    public void setCname(String classname) {
        cname = classname;
    }

    public List<Seizure> getSeizure() {
        return Seizure;
    }

    public void setSeizure(List<Seizure> seizure) {
        Seizure = seizure;
    }

    public Classification() {
        super();
    }
    public Classification(String CName ) {
        cname=CName;
    }
}
