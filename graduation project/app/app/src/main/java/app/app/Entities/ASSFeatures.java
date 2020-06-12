package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class ASSFeatures {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String afname;

    @ManyToMany(mappedBy = "assfeatures",fetch = FetchType.LAZY)
    @JsonIgnore

    private List<Seizure> Seizure ;

    public List<Seizure> getSeizure() {
        return Seizure;
    }
    public void setSeizure(List<Seizure> seizure) {
        Seizure = seizure;
    }



    public ASSFeatures() {
        super();
    }

    public ASSFeatures(String name,List<Seizure> Seizure) {
        afname = name;
        this.Seizure=Seizure;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAfname() {
        return afname;
    }

    public void setAfname(String afname) {
        this.afname = afname;
    }
}

