package app.app.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Features {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer featuresid;
    @Column
    private String featurename;



    @ManyToMany(mappedBy = "features")
    private List<Imaging> Imaging = new ArrayList<>();

    public Features() {
        super();
    }
    public Features(String featurename) {
       this.featurename=featurename;
    }

    public String getfeaturename() {
        return featurename;
    }

    public void setfeaturename(String featurename) {
        this.featurename = featurename;
    }

    public List<Imaging> getImaging() {
        return Imaging;
    }

    public void setImaging(List<Imaging> imaging) {
        Imaging = imaging;
    }

}
