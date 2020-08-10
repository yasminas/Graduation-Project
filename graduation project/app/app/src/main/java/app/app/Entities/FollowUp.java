
package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
 public class FollowUp{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column
    private String last_visit;
    @Column
    private Integer frequency_per_month;
    @Column
    private String last_visit_seizure;
    @Column
    private String compliant_on_AED;
    @Column
    private String same_seizure_type;
    @Column
    private String triggering_factors;
    @Column
    private String AED_modifing;
    @Column
    private String typeArea;
    @Column
    private String aedM;




    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn

    private Doc doctor;

    public Doc getDoctor() {
        return doctor;
    }
    public void setDoctor(Doc doctor) {
        this.doctor = doctor;
    }



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    @JsonBackReference
    private Patient patient;
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


    public FollowUp() {
        super();
    }

    public FollowUp(String last_visit,  Integer frequency_per_month,String aedM,String typeArea, String last_visit_seizure, String compliant_on_AED, String same_seizure_type, String triggering_factors, String AED_modifing,Integer d_id,int p_id) {
        super();
        this.typeArea = typeArea;
        this.aedM = aedM;

        this.last_visit = last_visit;
        this.frequency_per_month = frequency_per_month;
        this.last_visit_seizure = last_visit_seizure;
        this.compliant_on_AED = compliant_on_AED;
        this.same_seizure_type = same_seizure_type;
        this.triggering_factors = triggering_factors;
        this.AED_modifing = AED_modifing;
        this.patient=new Patient(p_id);
        this.doctor=new Doc(d_id);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast_visit() {
        return last_visit;
    }

    public void setLast_visit(String last_visit) {
        this.last_visit = last_visit;
    }

    public Integer getFrequency_per_month() {
        return frequency_per_month;
    }

    public void setFrequency_per_month(Integer frequency_per_month) {
        this.frequency_per_month = frequency_per_month;
    }

    public String getLast_visit_seizure() {
        return last_visit_seizure;
    }

    public void setLast_visit_seizure(String last_visit_seizure) {
        this.last_visit_seizure = last_visit_seizure;
    }

    public String getCompliant_on_AED() {
        return compliant_on_AED;
    }

    public void setCompliant_on_AED(String compliant_on_AED) {
        this.compliant_on_AED = compliant_on_AED;
    }

    public String getSame_seizure_type() {
        return same_seizure_type;
    }

    public void setSame_seizure_type(String same_seizure_type) {
        this.same_seizure_type = same_seizure_type;
    }

    public String getTriggering_factors() {
        return triggering_factors;
    }

    public void setTriggering_factors(String triggering_factors) {
        this.triggering_factors = triggering_factors;
    }

    public String getAED_modifing() {
        return AED_modifing;
    }

    public void setAED_modifing(String AED_modifing) {
        this.AED_modifing = AED_modifing;
    }

    public String getTypeArea() {
        return typeArea;
    }

    public void setTypeArea(String typeArea) {
        this.typeArea = typeArea;
    }

    public String getAedM() {
        return aedM;
    }

    public void setAedM(String aedM) {
        this.aedM = aedM;
    }


}
