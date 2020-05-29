package app.app.Entities;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Ticket{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ticket_id")
    private int ticketId;
    @Column(name="source_tool_id")
    private String sourceToolId;
    @Column(name="defect_status")
    private String defectDtatus;
    @Column(name="defect_severity")
    private String defectSeverity;
    @Column(name="defect_priority")
    private String defectPriority;
    @Column(name="testing_phase")
    private String testingPhase;
    @Column(name="fixed_in_build")
    private String fixedInBuild;
    @Column(name="closed_in_build")
    private String closedInBuild;
    @Column(name="detected_on_date")
    private Date detectedOnDate;
    @Column(name="closed_on_date")
    private Date closedOnDate;
    @Column(name="last_modified_date")
    private Date lastModifiedDate;
    @Column(name="closing_reason")
    private String closingReason;
    @Column(name="category")
    private String category;
    @Column(name="detected_in_build")
    private String detectedInBuild;
    @Column(name="detected_in_cycle")
    private String detectedInCycle;
    @Column(name="detected_in_release")
    private String detectedInRelease;
    @Column(name="environment")
    private String environment;
    private String module;
    @Column(name="device_type")
    private String deviceType;
    @Column(name="root_cause")
    private String rootCause;
    @Column(name="defect_age")
    private String defectAge;
    @Column(name="reopen")
    private String reopen;

    /** Default constructor. */
    public Ticket() {
        super();
    }

    public Ticket(int ticketId, String sourceToolId, String defectDtatus, String defectSeverity, String defectPriority, String testingPhase, String fixedInBuild, String closedInBuild,Date detectedOnDate, Date closedOnDate, Date lastModifiedDate, String closingReason, String category, String detectedInBuild, String detectedInCycle, String detectedInRelease, String environment, String module, String deviceType, String rootCause, String defectAge, String reopen) {
        this.ticketId = ticketId;
        this.sourceToolId = sourceToolId;
        this.defectDtatus = defectDtatus;
        this.defectSeverity = defectSeverity;
        this.defectPriority = defectPriority;
        this.testingPhase = testingPhase;
        this.fixedInBuild = fixedInBuild;
        this.closedInBuild = closedInBuild;
        this.detectedOnDate = detectedOnDate;
        this.closedOnDate = closedOnDate;
        this.lastModifiedDate = lastModifiedDate;
        this.closingReason = closingReason;
        this.category = category;
        this.detectedInBuild = detectedInBuild;
        this.detectedInCycle = detectedInCycle;
        this.detectedInRelease = detectedInRelease;
        this.environment = environment;
        this.module = module;
        this.deviceType = deviceType;
        this.rootCause = rootCause;
        this.defectAge = defectAge;
        this.reopen = reopen;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getSourceToolId() {
        return sourceToolId;
    }

    public void setSourceToolId(String sourceToolId) {
        this.sourceToolId = sourceToolId;
    }

    public String getDefectDtatus() {
        return defectDtatus;
    }

    public void setDefectDtatus(String defectDtatus) {
        this.defectDtatus = defectDtatus;
    }

    public String getDefectSeverity() {
        return defectSeverity;
    }

    public void setDefectSeverity(String defectSeverity) {
        this.defectSeverity = defectSeverity;
    }

    public String getDefectPriority() {
        return defectPriority;
    }

    public void setDefectPriority(String defectPriority) {
        this.defectPriority = defectPriority;
    }

    public String getTestingPhase() {
        return testingPhase;
    }

    public void setTestingPhase(String testingPhase) {
        this.testingPhase = testingPhase;
    }

    public String getFixedInBuild() {
        return fixedInBuild;
    }

    public void setFixedInBuild(String fixedInBuild) {
        this.fixedInBuild = fixedInBuild;
    }

    public String getClosedInBuild() {
        return closedInBuild;
    }

    public void setClosedInBuild(String closedInBuild) {
        this.closedInBuild = closedInBuild;
    }

    public Date getDetectedOnDate() {
        return detectedOnDate;
    }

    public void setDetectedOnDate(Date detectedOnDate) {
        this.detectedOnDate = detectedOnDate;
    }

    public Date getClosedOnDate() {
        return closedOnDate;
    }

    public void setClosedOnDate(Date closedOnDate) {
        this.closedOnDate = closedOnDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getClosingReason() {
        return closingReason;
    }

    public void setClosingReason(String closingReason) {
        this.closingReason = closingReason;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDetectedInBuild() {
        return detectedInBuild;
    }

    public void setDetectedInBuild(String detectedInBuild) {
        this.detectedInBuild = detectedInBuild;
    }

    public String getDetectedInCycle() {
        return detectedInCycle;
    }

    public void setDetectedInCycle(String detectedInCycle) {
        this.detectedInCycle = detectedInCycle;
    }

    public String getDetectedInRelease() {
        return detectedInRelease;
    }

    public void setDetectedInRelease(String detectedInRelease) {
        this.detectedInRelease = detectedInRelease;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getRootCause() {
        return rootCause;
    }

    public void setRootCause(String rootCause) {
        this.rootCause = rootCause;
    }

    public String getDefectAge() {
        return defectAge;
    }

    public void setDefectAge(String defectAge) {
        this.defectAge = defectAge;
    }

    public String getReopen() {
        return reopen;
    }

    public void setReopen(String reopen) {
        this.reopen = reopen;
    }

}
