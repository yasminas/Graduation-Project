package app.app.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ASSFeatures {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ASSFeaturesid;
    @Column
    private String afname;


    @ManyToMany(mappedBy = "assfeatures")
    private List<Seizure> Seizure = new ArrayList<>();


    public ASSFeatures() {
        super();
    }

    public ASSFeatures(String name) {
        afname = name;
    }

    public String getafname() {
        return afname;
    }

    public void setafname(String asfname) {
       afname = asfname;
    }

    public List<Seizure> getSeizure() {
        return Seizure;
    }

    public void setSeizure(List<Seizure> seizure) {
        Seizure = seizure;
    }
}

