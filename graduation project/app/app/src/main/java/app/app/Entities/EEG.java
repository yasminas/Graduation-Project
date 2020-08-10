package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class EEG {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String Result;
    @Column
    private String Date;
    @Column
    private String ScalpEEG;
    @Column
    private String Type ;
    @Column
    private String Reason ;
    @Column
    private String Frequency_of_PDR ;
    @Column
    private String Posteriorrhythm ;
    @Column
    private String Source_of_EEG;
    @Column
    private String Behavioral_recorded ;
    @Column
    private String ReasonProvocative_measures ;
    @Column
    private String number_of_seizures ;

    @Column
    private String Dischargelocation;
    @Column
    private String Localizedside ;


    @Column
    private String Interictal_Circumstances;
    @Column
    private String Interictal_frequency ;
    @Column
    private String Interictal_special_pattern;
    @Column
    private String Ictal_abnormalities ;
    @Column
    private String same_icatal_features;
    @Column
    private String ictal_location ;
    @Column
    private String Ictal_pattern;
    @Column
    private String Ictal_with ;
    @Column
    private String Focal_slowing;
    @Column
    private String Attenuation ;
    @Column
    private String EEG_slowing;
    @Column
    private String Report ;
    @Column
    private String localizedlobe ;
    @Column
    private String location ;
    @Column
    private String side ;
    @Column
    private String generalisedslowing ;
    @Column
    private String lobe ;
    @Column
    private String specify ;
    @Column
    private String comments ;

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

    public EEG() {
        super();
    }


    public EEG(String result,String type,String lobe,String comments,String specify ,String generalisedslowing,String side ,String location,String localizedlobe, String date, String scalpEEG, String reason, String frequency_of_PDR, String posteriorrhythm, String source_of_EEG, String behavioral_recorded, String reasonProvocative_measures, String number_of_seizures, String dischargelocation, String localizedside, String interictal_Circumstances, String interictal_frequency, String interictal_special_pattern, String ictal_abnormalities, String same_icatal_features, String ictal_location, String ictal_pattern, String ictal_with, String focal_slowing, String attenuation, String EEG_slowing, String report,int p_id) {
        super();
        Result = result;
        this.localizedlobe=localizedlobe;
        this.location=location;
        this.side=side;
        this.generalisedslowing=generalisedslowing;
        this.lobe=lobe;
        this.specify=specify;
        this.comments=comments;
        Type=type;
        Date = date;
        ScalpEEG = scalpEEG;
        Reason = reason;
        Frequency_of_PDR = frequency_of_PDR;
        Posteriorrhythm = posteriorrhythm;
        Source_of_EEG = source_of_EEG;
        Behavioral_recorded = behavioral_recorded;
        ReasonProvocative_measures = reasonProvocative_measures;
        this.number_of_seizures = number_of_seizures;
        Dischargelocation = dischargelocation;
        Localizedside = localizedside;
        Interictal_Circumstances = interictal_Circumstances;
        Interictal_frequency = interictal_frequency;
        Interictal_special_pattern = interictal_special_pattern;
        Ictal_abnormalities = ictal_abnormalities;
        this.same_icatal_features = same_icatal_features;
        this.ictal_location = ictal_location;
        Ictal_pattern = ictal_pattern;
        Ictal_with = ictal_with;
        Focal_slowing = focal_slowing;
        Attenuation = attenuation;
        this.EEG_slowing = EEG_slowing;
        Report = report;
        this.patient=new Patient(p_id);
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getScalpEEG() {
        return ScalpEEG;
    }

    public void setScalpEEG(String scalpEEG) {
        ScalpEEG = scalpEEG;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public String getFrequency_of_PDR() {
        return Frequency_of_PDR;
    }

    public void setFrequency_of_PDR(String frequency_of_PDR) {
        Frequency_of_PDR = frequency_of_PDR;
    }

    public String getPosteriorrhythm() {
        return Posteriorrhythm;
    }

    public void setPosteriorrhythm(String posteriorrhythm) {
        Posteriorrhythm = posteriorrhythm;
    }

    public String getSource_of_EEG() {
        return Source_of_EEG;
    }

    public void setSource_of_EEG(String source_of_EEG) {
        Source_of_EEG = source_of_EEG;
    }

    public String getBehavioral_recorded() {
        return Behavioral_recorded;
    }

    public void setBehavioral_recorded(String behavioral_recorded) {
        Behavioral_recorded = behavioral_recorded;
    }

    public String getReasonProvocative_measures() {
        return ReasonProvocative_measures;
    }

    public void setReasonProvocative_measures(String reasonProvocative_measures) {
        ReasonProvocative_measures = reasonProvocative_measures;
    }

    public String getNumber_of_seizures() {
        return number_of_seizures;
    }

    public void setNumber_of_seizures(String number_of_seizures) {
        this.number_of_seizures = number_of_seizures;
    }

    public String getDischargelocation() {
        return Dischargelocation;
    }

    public void setDischargelocation(String dischargelocation) {
        Dischargelocation = dischargelocation;
    }

    public String getLocalizedside() {
        return Localizedside;
    }

    public void setLocalizedside(String localizedside) {
        Localizedside = localizedside;
    }

    public String getInterictal_Circumstances() {
        return Interictal_Circumstances;
    }

    public void setInterictal_Circumstances(String interictal_Circumstances) {
        Interictal_Circumstances = interictal_Circumstances;
    }

    public String getInterictal_frequency() {
        return Interictal_frequency;
    }

    public void setInterictal_frequency(String interictal_frequency) {
        Interictal_frequency = interictal_frequency;
    }

    public String getInterictal_special_pattern() {
        return Interictal_special_pattern;
    }

    public void setInterictal_special_pattern(String interictal_special_pattern) {
        Interictal_special_pattern = interictal_special_pattern;
    }

    public String getIctal_abnormalities() {
        return Ictal_abnormalities;
    }

    public void setIctal_abnormalities(String ictal_abnormalities) {
        Ictal_abnormalities = ictal_abnormalities;
    }

    public String getSame_icatal_features() {
        return same_icatal_features;
    }

    public void setSame_icatal_features(String same_icatal_features) {
        this.same_icatal_features = same_icatal_features;
    }

    public String getIctal_location() {
        return ictal_location;
    }

    public void setIctal_location(String ictal_location) {
        this.ictal_location = ictal_location;
    }

    public String getIctal_pattern() {
        return Ictal_pattern;
    }

    public void setIctal_pattern(String ictal_pattern) {
        Ictal_pattern = ictal_pattern;
    }

    public String getIctal_with() {
        return Ictal_with;
    }

    public void setIctal_with(String ictal_with) {
        Ictal_with = ictal_with;
    }

    public String getFocal_slowing() {
        return Focal_slowing;
    }

    public void setFocal_slowing(String focal_slowing) {
        Focal_slowing = focal_slowing;
    }

    public String getAttenuation() {
        return Attenuation;
    }

    public void setAttenuation(String attenuation) {
        Attenuation = attenuation;
    }

    public String getEEG_slowing() {
        return EEG_slowing;
    }

    public void setEEG_slowing(String EEG_slowing) {
        this.EEG_slowing = EEG_slowing;
    }

    public String getReport() {
        return Report;
    }

    public void setReport(String report) {
        Report = report;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getLocalizedlobe() {
        return localizedlobe;
    }

    public void setLocalizedlobe(String localizedlobe) {
        this.localizedlobe = localizedlobe;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getGeneralisedslowing() {
        return generalisedslowing;
    }

    public void setGeneralisedslowing(String generalisedslowing) {
        this.generalisedslowing = generalisedslowing;
    }

    public String getLobe() {
        return lobe;
    }

    public void setLobe(String lobe) {
        this.lobe = lobe;
    }

    public String getSpecify() {
        return specify;
    }

    public void setSpecify(String specify) {
        this.specify = specify;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
