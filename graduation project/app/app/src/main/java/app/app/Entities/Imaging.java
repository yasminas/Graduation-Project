package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Imaging {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column
    private String Date;
    @Column
    private String Sequences;
    @Column
    private String Contrast_enhancement;
    @Column
    private String Results;
    @Column
    private String Lateralization;
    @Column
    private String Distribution;
    @Column
    private String Location_cortical;
    @Column
    private String Location_subcortical;
    @Column
    private String Details;
    @Column
    private String Report;

    @Column
    private String  diagnosis;
    @Column
    private String  ageofonset;
    @Column
    private String  etiology;
    @Column
    private String  classification;
    @Column
    private String  syndrome;
    @Column
    private String  finaldiagnosis;
    @Column
    private String  comments;
    @Column
    private String  counselling;














    @ManyToMany(cascade = CascadeType.ALL)
    private List<Features> features ;

    public List<Features> getFeatures() {
        return features;
    }

    public void setFeatures(List<Features> features) {
        this.features = features;
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


    public Imaging() {
        super();
    }


    public Imaging(String result,String  diagnosis, String counselling,String comments, String  syndrome,String finaldiagnosis,String classification,String etiology,String ageofonset,List<Features> features, String date, String sequences, String contrast_enhancement, String lateralization, String distribution, String location_cortical, String location_subcortical, String details, String report,int p_id) {
        super();
       this.diagnosis=diagnosis;
       this.syndrome=syndrome;
       this.etiology=etiology;
       this.ageofonset=ageofonset;
       this.finaldiagnosis=finaldiagnosis;
       this.classification=classification;
       this.comments=comments;
       this.counselling=counselling;
        Results=result;
        Date = date;
       this.features=features;
        Sequences = sequences;
        Contrast_enhancement = contrast_enhancement;
        Lateralization = lateralization;
        Distribution = distribution;
        Location_cortical = location_cortical;
        Location_subcortical = location_subcortical;
        Details = details;
        Report = report;
        this.patient=new Patient(p_id);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getSequences() {
        return Sequences;
    }

    public void setSequences(String sequences) {
        Sequences = sequences;
    }

    public String getContrast_enhancement() {
        return Contrast_enhancement;
    }

    public void setContrast_enhancement(String contrast_enhancement) {
        Contrast_enhancement = contrast_enhancement;
    }

    public String getResults() {
        return Results;
    }

    public void setResults(String results) {
        Results = results;
    }

    public String getLateralization() {
        return Lateralization;
    }

    public void setLateralization(String lateralization) {
        Lateralization = lateralization;
    }

    public String getDistribution() {
        return Distribution;
    }

    public void setDistribution(String distribution) {
        Distribution = distribution;
    }

    public String getLocation_cortical() {
        return Location_cortical;
    }

    public void setLocation_cortical(String location_cortical) {
        Location_cortical = location_cortical;
    }

    public String getLocation_subcortical() {
        return Location_subcortical;
    }

    public void setLocation_subcortical(String location_subcortical) {
        Location_subcortical = location_subcortical;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public String getReport() {
        return Report;
    }

    public void setReport(String report) {
        Report = report;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getAgeofonset() {
        return ageofonset;
    }

    public void setAgeofonset(String ageofonset) {
        this.ageofonset = ageofonset;
    }

    public String getEtiology() {
        return etiology;
    }

    public void setEtiology(String etiology) {
        this.etiology = etiology;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getSyndrome() {
        return syndrome;
    }

    public void setSyndrome(String syndrome) {
        this.syndrome = syndrome;
    }

    public String getFinaldiagnosis() {
        return finaldiagnosis;
    }

    public void setFinaldiagnosis(String finaldiagnosis) {
        this.finaldiagnosis = finaldiagnosis;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCounselling() {
        return counselling;
    }

    public void setCounselling(String counselling) {
        this.counselling = counselling;
    }
}
