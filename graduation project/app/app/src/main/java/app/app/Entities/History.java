package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String seizures_greater_5min;
    @Column
    private String admition_to_hospital;
    @Column
    private String type_of_seizure;
    @Column
    private String AED_on_discharge;
    @Column
    private String seizurecontrol;
    @Column
    private String precipitated;
    @Column
    private String durationofstay;

    @Column
    private String intubation;
    @Column
    private String Etiology;
    @Column
    private String structural;
    @Column
    private String brainlesionAge;



    @OneToOne(mappedBy = "history")
    @JoinColumn
    @JsonBackReference
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient= patient;
    }



    public History() {
        super();
    }


    public History(String etiology,String intubation,String seizurecontrol,String precipitated,String durationofstay,String structural,String seizures_greater_5min, String admition_to_hospital, String type_of_seizure, String AED_on_discharge,  String brainlesionAge,int p_id) {
        super();
        this.seizures_greater_5min = seizures_greater_5min;
        this.structural=structural;
        this.intubation=intubation;
        this.precipitated=precipitated;
        this.seizurecontrol=seizurecontrol;
        this.durationofstay=durationofstay;
        Etiology=etiology;
        this.admition_to_hospital = admition_to_hospital;
        this.type_of_seizure = type_of_seizure;
        this.AED_on_discharge = AED_on_discharge;

        this.brainlesionAge = brainlesionAge;
        this.patient=new Patient(p_id);
    }

    public String getEtiology() {
        return Etiology;
    }

    public void setEtiology(String etiology) {
        Etiology = etiology;
    }

    public String getSeizures_greater_5min() {
        return seizures_greater_5min;
    }

    public void setSeizures_greater_5min(String seizures_greater_5min) {
        this.seizures_greater_5min = seizures_greater_5min;
    }

    public String getAdmition_to_hospital() {
        return admition_to_hospital;
    }

    public void setAdmition_to_hospital(String admition_to_hospital) {
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



    public String getBrainlesionAge() {
        return brainlesionAge;
    }

    public void setBrainlesionAge(String brainlesionAge) {
        this.brainlesionAge = brainlesionAge;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeizurecontrol() {
        return seizurecontrol;
    }

    public void setSeizurecontrol(String seizurecontrol) {
        this.seizurecontrol = seizurecontrol;
    }

    public String getPrecipitated() {
        return precipitated;
    }

    public void setPrecipitated(String precipitated) {
        this.precipitated = precipitated;
    }

    public String getDurationofstay() {
        return durationofstay;
    }

    public void setDurationofstay(String durationofstay) {
        this.durationofstay = durationofstay;
    }

    public String getIntubation() {
        return intubation;
    }

    public void setIntubation(String intubation) {
        this.intubation = intubation;
    }

    public String getStructural() {
        return structural;
    }

    public void setStructural(String structural) {
        this.structural = structural;
    }
}
