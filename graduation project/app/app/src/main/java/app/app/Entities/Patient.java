package app.app.Entities;
//import com.fasterxml.jackson.annotation.JsonManagedReference;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String FName;
    @Column
    private String MName;
    @Column
    private String LName;
    @Column
    private String Sex;
    @Column
    private Integer Age;
    @Column
    private Integer PNumber;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column
    private Integer DoctorID;
    @Column
    private String Education;
    @Column
    private String Occupation;
    @Column
    private String Maritalstatus ;
    @Column
    private Boolean Activedriving;
    @Column
    private Boolean FamilyConsanguinity ;
    @Column
    private Integer MenarcheAge ;
    @Column
    private Integer prepreg ;
    @Column
    private Boolean seekpreg ;
    @Column
    private String Seizurefreedom ;
    @Column
    private String Regularity ;
    @Column
    private Integer PrepregAED  ;
    @Column
    private String Drugfertility ;
    @Column
    private String FolicAcid ;
    @Column
    private String ComplianceAED;
    @Column
    private String Contraception ;
    @Column
    private String CurrentPregnant ;
    @Column
    private String ChangeAED ;
    @Column
    private String CatamEpilepsy ;
    @Column
    private String Menopause ;
    @Column
    private String Lactating ;
    @Column
    private String ThreeD  ;










    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Test> tests;

    public Set<Test> getTests() {
        return tests;
    }
    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<EEG> EEG;

    public Set<EEG> getEEG() {
        return EEG;
    }
    public void setEEG(Set<EEG> EEG) {
        this.EEG = EEG;
    }

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<NeuroScore> NeuroScore;

    public Set<NeuroScore> getNeuroScore() {
        return NeuroScore;
    }
    public void setNeuroScore(Set<NeuroScore> neuroScore) {
        NeuroScore = neuroScore;
    }


    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Seizure> seizure;

    public Set<Seizure> getSeizure() {
        return seizure;
    }
    public void setSeizure(List<Seizure> seizure) {
        seizure = seizure;
    }

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private Set<Imaging> Imaging;

    public Set<Imaging> getImaging() {
        return Imaging;
    }
    public void setImaging(Set<Imaging> imaging) {
        Imaging = imaging;
    }

    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
    private History History;

    public History getHistory() {
        return History;
    }
    public void setHistory(History history) {
        History = history;
    }

    @OneToMany(mappedBy = "patient")
    private Set<FollowUp> followup ;

    public Set<FollowUp> getFollowup() {
        return followup;
    }
    public void setFollowup(Set<FollowUp> followup) {
        this.followup = followup;
    }


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private List<Comorbidities>  como= new ArrayList<>();

    public List<Comorbidities> getComo() {
        return como;
    }
    public void setComo(List<Comorbidities> como) {
        this.como = como;
    }


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private List<SpecialHabits> specialhabits = new ArrayList<>();

    public List<SpecialHabits> getSpecialhabits() {
        return specialhabits;
    }
    public void setSpecialhabits(List<SpecialHabits> specialhabits) {
        this.specialhabits = specialhabits;
    }

    @ManyToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private Set<AED>  AED;

    public Set<AED> getAED() {
        return AED;
    }
    public void setAED(Set<AED> AED) {
        this.AED = AED;
    }


    @ManyToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private Set<SurgicalProcedures>  SurgicalProcedures;

    public Set<SurgicalProcedures> getSurgicalProcedures() {
        return SurgicalProcedures;
    }
    public void setSurgicalProcedures(Set<SurgicalProcedures> surgicalProcedures) {
        SurgicalProcedures = surgicalProcedures;
    }

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private Set<Dependent> Dependent;

    public Set<Dependent> getDependent() {
        return Dependent;
    }
    public void setDependent(Set<Dependent> dependent) {
        Dependent = dependent;
    }





    public Patient() {
         super();
    }



    public Patient(String FName,String MName, String LName,List<SpecialHabits> specialhabits, List<Comorbidities>  como,String sex, Integer age,Integer Doctorid,
                   Integer PNumber, String education, String occupation,
                   String maritalstatus, Boolean activedriving, Boolean familyConsanguinity, Integer menarcheAge
            , Integer prepreg, Boolean seekpreg, String seizurefreedom, String regularity
            , Integer prepregAED, String drugfertility, String folicAcid, String complianceAED,
                   String contraception, String currentPregnant, String changeAED, String catamEpilepsy,
                   String menopause, String lactating, String threeD) {
        this.FName = FName;
        this.MName = MName;
        this.LName = LName;
        DoctorID=Doctorid;
        this.como=como;
        this.specialhabits=specialhabits;
        Sex = sex;
        Age = age;
        this.PNumber = PNumber;
        Education = education;
        Occupation = occupation;
        Maritalstatus = maritalstatus;
        Activedriving = activedriving;
        FamilyConsanguinity = familyConsanguinity;
        MenarcheAge = menarcheAge;
        this.prepreg = prepreg;
        this.seekpreg = seekpreg;
        Seizurefreedom = seizurefreedom;
        Regularity = regularity;
        PrepregAED = prepregAED;
        Drugfertility = drugfertility;
        FolicAcid = folicAcid;
        ComplianceAED = complianceAED;
        Contraception = contraception;
        CurrentPregnant = currentPregnant;
        ChangeAED = changeAED;
        CatamEpilepsy = catamEpilepsy;
        Menopause = menopause;
        Lactating = lactating;
        ThreeD = threeD;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getPNumber() {
        return PNumber;
    }

    public void setPNumber(Integer PNumber) {
        this.PNumber = PNumber;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public String getMaritalstatus() {
        return Maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        Maritalstatus = maritalstatus;
    }

    public Boolean getActivedriving() {
        return Activedriving;
    }

    public void setActivedriving(Boolean activedriving) {
        Activedriving = activedriving;
    }

    public Boolean getFamilyConsanguinity() {
        return FamilyConsanguinity;
    }

    public void setFamilyConsanguinity(Boolean familyConsanguinity) {
        FamilyConsanguinity = familyConsanguinity;
    }

    public Integer getMenarcheAge() {
        return MenarcheAge;
    }

    public void setMenarcheAge(Integer menarcheAge) {
        MenarcheAge = menarcheAge;
    }

    public Integer getPrepreg() {
        return prepreg;
    }

    public void setPrepreg(Integer prepreg) {
        this.prepreg = prepreg;
    }

    public Boolean getSeekpreg() {
        return seekpreg;
    }

    public void setSeekpreg(Boolean seekpreg) {
        this.seekpreg = seekpreg;
    }

    public String getSeizurefreedom() {
        return Seizurefreedom;
    }

    public void setSeizurefreedom(String seizurefreedom) {
        Seizurefreedom = seizurefreedom;
    }

    public String getRegularity() {
        return Regularity;
    }

    public void setRegularity(String regularity) {
        Regularity = regularity;
    }

    public Integer getPrepregAED() {
        return PrepregAED;
    }

    public void setPrepregAED(Integer prepregAED) {
        PrepregAED = prepregAED;
    }

    public String getDrugfertility() {
        return Drugfertility;
    }

    public void setDrugfertility(String drugfertility) {
        Drugfertility = drugfertility;
    }

    public String getFolicAcid() {
        return FolicAcid;
    }

    public void setFolicAcid(String folicAcid) {
        FolicAcid = folicAcid;
    }

    public String getComplianceAED() {
        return ComplianceAED;
    }

    public void setComplianceAED(String complianceAED) {
        ComplianceAED = complianceAED;
    }

    public String getContraception() {
        return Contraception;
    }

    public void setContraception(String contraception) {
        Contraception = contraception;
    }

    public String getCurrentPregnant() {
        return CurrentPregnant;
    }

    public void setCurrentPregnant(String currentPregnant) {
        CurrentPregnant = currentPregnant;
    }

    public String getChangeAED() {
        return ChangeAED;
    }

    public void setChangeAED(String changeAED) {
        ChangeAED = changeAED;
    }

    public String getCatamEpilepsy() {
        return CatamEpilepsy;
    }

    public void setCatamEpilepsy(String catamEpilepsy) {
        CatamEpilepsy = catamEpilepsy;
    }

    public String getMenopause() {
        return Menopause;
    }

    public void setMenopause(String menopause) {
        Menopause = menopause;
    }

    public String getLactating() {
        return Lactating;
    }


    public void setLactating(String lactating) {
        Lactating = lactating;
    }

    public String getThreeD() {
        return ThreeD;
    }

    public void setThreeD(String threeD) {
        ThreeD = threeD;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(Integer doctorID) {
        DoctorID = doctorID;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Patient[id=" + id + ",DoctorID=" + DoctorID + ", FName=" + FName + ", MName=" + MName + ", LName=" + LName
                + " , Sex=" + Sex + ", Age=" + Age + ", PNumber=" + PNumber + ", createdAt=" + createdAt + "" +
                ", updatedAt=" + updatedAt + ", Education=" + Education + ", Occupation=" + Occupation + ", Maritalstatus=" + Maritalstatus + "" +
                ", Activedriving=" + Activedriving + ", FamilyConsanguinity=" + FamilyConsanguinity + ", MenarcheAge=" + MenarcheAge + "" +
                ", seekpreg=" + seekpreg + ", prepreg=" + prepreg + ", Seizurefreedom=" + Seizurefreedom + "" +
                ", Regularity=" + Regularity + ", PrepregAED=" + PrepregAED + ", Drugfertility=" + Drugfertility + "" +
                ", FolicAcid=" + FolicAcid + ", ComplianceAED=" + ComplianceAED + ", Contraception=" + Contraception + "" +
                ", CurrentPregnant=" + CurrentPregnant + ", ChangeAED=" + ChangeAED + ", CatamEpilepsy=" + CatamEpilepsy + "" +
                ", Menopause=" + Menopause + ", Lactating=" + Lactating + ", ThreeD=" + ThreeD + "]";
    }

    @PrePersist
    public void onPrePersist() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    @PreUpdate
    public void onPreUpdate() {
        this.updatedAt = new Date();
    }


}
