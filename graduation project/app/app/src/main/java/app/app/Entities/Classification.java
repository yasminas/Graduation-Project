package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Classification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String cname;


    @ManyToMany(mappedBy = "classification",fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Seizure> Seizure ;

    public List<Seizure> getSeizure() {
        return Seizure;
    }
    public void setSeizure(List<Seizure> seizure) {
        Seizure = seizure;
    }




    public Classification() {
        super();
    }
    public Classification(String cname,List<Seizure> Seizure ) {

        this.cname=cname;
        this.Seizure=Seizure;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
