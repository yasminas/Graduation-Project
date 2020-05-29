package app.app.Entities;

import javax.persistence.*;

@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer History_ID;
    @Column
    private String Etiology;
    @Column
    private Boolean seizures_greater_5min;
    @Column
    private Boolean admition_to_hospital;
    @Column
    private String type_of_seizure;
    @Column
    private String AED_on_discharge;
    @Column
    private String pasthistory;
    @Column
    private String fabrilehistory;
    @Column
    private Integer brainlesionAge;


    @OneToOne
    @JoinColumn
    private Patient patient7;

    public Patient getPatient() {
        return patient7;
    }

    public void setPatient(Patient patient) {
        this.patient7 = patient;
    }



    public History() {
        super();
    }


    public History(String etiology,Boolean seizures_greater_5min, Boolean admition_to_hospital, String type_of_seizure, String AED_on_discharge, String pasthistory, String fabrilehistory, Integer brainlesionAge) {
        this.seizures_greater_5min = seizures_greater_5min;
        Etiology=etiology;
        this.admition_to_hospital = admition_to_hospital;
        this.type_of_seizure = type_of_seizure;
        this.AED_on_discharge = AED_on_discharge;
        this.pasthistory = pasthistory;
        this.fabrilehistory = fabrilehistory;
        this.brainlesionAge = brainlesionAge;
    }

    public String getEtiology() {
        return Etiology;
    }

    public void setEtiology(String etiology) {
        Etiology = etiology;
    }

    public Boolean getSeizures_greater_5min() {
        return seizures_greater_5min;
    }

    public void setSeizures_greater_5min(Boolean seizures_greater_5min) {
        this.seizures_greater_5min = seizures_greater_5min;
    }

    public Boolean getAdmition_to_hospital() {
        return admition_to_hospital;
    }

    public void setAdmition_to_hospital(Boolean admition_to_hospital) {
        this.admition_to_hospital = admition_to_hospital;
    }

    public String getType_of_seizure() {
        return type_of_seizure;
    }

    public void setType_of_seizure(String type_of_seizure) {
        this.type_of_seizure = type_of_seizure;
    }

    public String getAED_on_discharge() {
        return AED_on_discharge;
    }

    public void setAED_on_discharge(String AED_on_discharge) {
        this.AED_on_discharge = AED_on_discharge;
    }

    public String getPasthistory() {
        return pasthistory;
    }

    public void setPasthistory(String pasthistory) {
        this.pasthistory = pasthistory;
    }

    public String getFabrilehistory() {
        return fabrilehistory;
    }

    public void setFabrilehistory(String fabrilehistory) {
        this.fabrilehistory = fabrilehistory;
    }

    public Integer getBrainlesionAge() {
        return brainlesionAge;
    }

    public void setBrainlesionAge(Integer brainlesionAge) {
        this.brainlesionAge = brainlesionAge;
    }
}
