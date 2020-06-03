package app.app.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AED {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer AED_ID;
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

    @ManyToMany
    @JoinColumn
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


    public AED(Integer  dose,String currentAED, String drug_formulation, String effectiveness, String sideeffect) {
        CurrentAED = currentAED;
        Dose_mg=dose;
        Drug_formulation = drug_formulation;
        Effectiveness = effectiveness;
        Sideeffect = sideeffect;
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
