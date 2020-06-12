package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AED {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private Integer Dose_mg;
    @Column
    private String CurrentAED;
    @Column
    private String Drug_formulation;
    @Column
    private String Effectiveness;
    @Column
    private String Sideeffect;



    @ManyToMany(mappedBy = "aed",fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Patient> patient;

    public Set<Patient> getPatient() {
        return patient;
    }

    public void setPatient(Set<Patient> patient) {
        this.patient = patient;
    }

    public AED() {
        super();
    }

    public AED(Integer dose_mg, String currentAED, String drug_formulation, String effectiveness, String sideeffect, Set<Patient> patient) {
        Dose_mg = dose_mg;
        CurrentAED = currentAED;
        Drug_formulation = drug_formulation;
        Effectiveness = effectiveness;
        Sideeffect = sideeffect;
        this.patient = patient;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDose_mg() {
        return Dose_mg;
    }

    public void setDose_mg(Integer dose_mg) {
        Dose_mg = dose_mg;
    }

    public String getCurrentAED() {
        return CurrentAED;
    }

    public void setCurrentAED(String currentAED) {
        CurrentAED = currentAED;
    }

    public String getDrug_formulation() {
        return Drug_formulation;
    }

    public void setDrug_formulation(String drug_formulation) {
        Drug_formulation = drug_formulation;
    }

    public String getEffectiveness() {
        return Effectiveness;
    }

    public void setEffectiveness(String effectiveness) {
        Effectiveness = effectiveness;
    }

    public String getSideeffect() {
        return Sideeffect;
    }

    public void setSideeffect(String sideeffect) {
        Sideeffect = sideeffect;
    }
}
