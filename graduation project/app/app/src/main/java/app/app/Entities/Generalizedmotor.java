package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Generalizedmotor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String gmname;


    @ManyToMany(mappedBy = "generalizedMotors",fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Seizure> Seizure ;

    public List<Seizure> getSeizure() {
        return Seizure;
    }

    public void setSeizure(List<Seizure> seizure) {
        Seizure = seizure;
    }


    public Generalizedmotor() {
        super();
    }
    public Generalizedmotor(String Gname,List<Seizure> Seizure) {
        gmname=Gname;
        this.Seizure=Seizure;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGmname() {
        return gmname;
    }

    public void setGmname(String gmname) {
        this.gmname = gmname;
    }
}
