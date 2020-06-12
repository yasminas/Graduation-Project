package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Features {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String fname;



    @ManyToMany(mappedBy = "features",fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Imaging> Imaging ;
    public List<Imaging> getImaging() {
        return Imaging;
    }

    public void setImaging(List<Imaging> imaging) {
        Imaging = imaging;
    }


    public Features() {
        super();
    }

    public Features(String fname, List<Imaging> imaging) {
        this.fname = fname;
        Imaging = imaging;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
