package app.app.Entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
public class SurgicalProcedures {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Procedure_ID;
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
    @ManyToMany
    @JoinColumn
    private Set<Patient> patient;

    public Set<Patient> getPatient() {
        return patient;
    }

    public void setPatient(Set<Patient> patient) {
        this.patient = patient;
    }

    public SurgicalProcedures(String type, Date date, String side, String intraoperative_EcoG, String pathology) {
        Type = type;
        Date = date;
        Side = side;
        Intraoperative_EcoG = intraoperative_EcoG;
        Pathology = pathology;
    }

    public SurgicalProcedures() {
        super();
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Date getDate() {
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
