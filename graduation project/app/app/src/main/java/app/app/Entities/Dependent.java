package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity(name="Dependent")
public class Dependent {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
    @Column
   private Integer PreDeliv;
    @Column
   private String mode;
    @Column
    private String outcome;
    @Column
    private  String anesth;
    @Column
    private String AED;
    @Column
    private String complications;
    @Column
    private Integer freq;
    @Column
    private String dose;
    @Column
    private String seizure;
    @Column
    private String nicu;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    @JsonBackReference
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient= patient;
    }

    public Dependent() {
        super();
    }


    public Dependent(Integer preDeliv,String dose,String seizure,String nicu, String outcome,String mode, String anesth, String AED, String complications, Integer freq,int p_id) {
        super();
        PreDeliv = preDeliv;
        this.outcome = outcome;
        this.dose=dose;
        this.seizure=seizure;
        this.nicu=nicu;
        this.mode = mode;
        this.anesth = anesth;
        this.AED = AED;
        this.complications = complications;
        this.freq = freq;
        this.patient=new Patient(p_id);

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPreDeliv() {
        return PreDeliv;
    }

    public void setPreDeliv(Integer preDeliv) {
        PreDeliv = preDeliv;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public String getAnesth() {
        return anesth;
    }

    public void setAnesth(String anesth) {
        this.anesth = anesth;
    }

    public String getAED() {
        return AED;
    }

    public void setAED(String AED) {
        this.AED = AED;
    }

    public String getComplications() {
        return complications;
    }

    public void setComplications(String complications) {
        this.complications = complications;
    }

    public Integer getFreq() {
        return freq;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getSeizure() {
        return seizure;
    }

    public void setSeizure(String seizure) {
        this.seizure = seizure;
    }

    public String getNicu() {
        return nicu;
    }

    public void setNicu(String nicu) {
        this.nicu = nicu;
    }
}

