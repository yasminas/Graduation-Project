package app.app.Entities;

import javax.persistence.*;

@Entity(name="Dependent")
public class Dependent {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer dependentid;
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
    @ManyToOne
    @JoinColumn
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


    public Dependent(Integer preDeliv, String outcome,String mode, String anesth, String AED, String complications, Integer freq) {
        PreDeliv = preDeliv;
        this.outcome = outcome;
        this.mode = mode;
        this.anesth = anesth;
        this.AED = AED;
        this.complications = complications;
        this.freq = freq;
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
}

