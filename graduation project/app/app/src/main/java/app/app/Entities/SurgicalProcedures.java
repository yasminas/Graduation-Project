package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class SurgicalProcedures {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String Type;
    @Column
    private Date Date;
    @Column
    private String Side;
    @Column
    private String Intraoperative_EcoG;
    @Column
    private String Pathology;


    @ManyToMany(  mappedBy = "procedures", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Patient> patient;

    public List<Patient> getPatient() {
        return patient;
    }

    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }



    public SurgicalProcedures() {
        super();
    }

    public SurgicalProcedures(String type, Date date, String side, String intraoperative_EcoG, String pathology, List<Patient> patient) {
        Type = type;
        Date = date;
        Side = side;
        Intraoperative_EcoG = intraoperative_EcoG;
        Pathology = pathology;
        this.patient = patient;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public java.sql.Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        Date = date;
    }

    public String getSide() {
        return Side;
    }

    public void setSide(String side) {
        Side = side;
    }

    public String getIntraoperative_EcoG() {
        return Intraoperative_EcoG;
    }

    public void setIntraoperative_EcoG(String intraoperative_EcoG) {
        Intraoperative_EcoG = intraoperative_EcoG;
    }

    public String getPathology() {
        return Pathology;
    }

    public void setPathology(String pathology) {
        Pathology = pathology;
    }
}
