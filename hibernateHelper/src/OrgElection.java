// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OrgElection entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ORG_ELECTION")
public class OrgElection implements java.io.Serializable {

	// Fields

	private String electionId;
	private Integer electionTerm;
	private String orgCode;
	private Date electionTime;
	private String electionType;
	private Integer needArrive;
	private Integer actualArrvie;
	private String operUserId;
	private Date operTime;
	private String isPublicElection;
	private String isPermanentElection;
	private String isAnnualElection;
	private String isConvened;
	private String isEstablishConnectOrg;
	private String electionSituation;
	private String isDispatch;
	private Date beforeElectionDeadline;
	private String electionDeadline;
	private String electionYears;

	// Constructors

	/** default constructor */
	public OrgElection() {
	}

	/** minimal constructor */
	public OrgElection(String electionId) {
		this.electionId = electionId;
	}

	/** full constructor */
	public OrgElection(String electionId, Integer electionTerm, String orgCode,
			Date electionTime, String electionType, Integer needArrive,
			Integer actualArrvie, String operUserId, Date operTime,
			String isPublicElection, String isPermanentElection,
			String isAnnualElection, String isConvened,
			String isEstablishConnectOrg, String electionSituation,
			String isDispatch, Date beforeElectionDeadline,
			String electionDeadline, String electionYears) {
		this.electionId = electionId;
		this.electionTerm = electionTerm;
		this.orgCode = orgCode;
		this.electionTime = electionTime;
		this.electionType = electionType;
		this.needArrive = needArrive;
		this.actualArrvie = actualArrvie;
		this.operUserId = operUserId;
		this.operTime = operTime;
		this.isPublicElection = isPublicElection;
		this.isPermanentElection = isPermanentElection;
		this.isAnnualElection = isAnnualElection;
		this.isConvened = isConvened;
		this.isEstablishConnectOrg = isEstablishConnectOrg;
		this.electionSituation = electionSituation;
		this.isDispatch = isDispatch;
		this.beforeElectionDeadline = beforeElectionDeadline;
		this.electionDeadline = electionDeadline;
		this.electionYears = electionYears;
	}

	// Property accessors
	@Id
	@Column(name = "ELECTION_ID", unique = true, nullable = false, length = 16)
	public String getElectionId() {
		return this.electionId;
	}

	public void setElectionId(String electionId) {
		this.electionId = electionId;
	}

	@Column(name = "ELECTION_TERM", precision = 9, scale = 0)
	public Integer getElectionTerm() {
		return this.electionTerm;
	}

	public void setElectionTerm(Integer electionTerm) {
		this.electionTerm = electionTerm;
	}

	@Column(name = "ORG_CODE", length = 30)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Column(name = "ELECTION_TIME", length = 7)
	public Date getElectionTime() {
		return this.electionTime;
	}

	public void setElectionTime(Date electionTime) {
		this.electionTime = electionTime;
	}

	@Column(name = "ELECTION_TYPE", length = 6)
	public String getElectionType() {
		return this.electionType;
	}

	public void setElectionType(String electionType) {
		this.electionType = electionType;
	}

	@Column(name = "NEED_ARRIVE", precision = 9, scale = 0)
	public Integer getNeedArrive() {
		return this.needArrive;
	}

	public void setNeedArrive(Integer needArrive) {
		this.needArrive = needArrive;
	}

	@Column(name = "ACTUAL_ARRVIE", precision = 9, scale = 0)
	public Integer getActualArrvie() {
		return this.actualArrvie;
	}

	public void setActualArrvie(Integer actualArrvie) {
		this.actualArrvie = actualArrvie;
	}

	@Column(name = "OPER_USER_ID", length = 16)
	public String getOperUserId() {
		return this.operUserId;
	}

	public void setOperUserId(String operUserId) {
		this.operUserId = operUserId;
	}

	@Column(name = "OPER_TIME", length = 7)
	public Date getOperTime() {
		return this.operTime;
	}

	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}

	@Column(name = "IS_PUBLIC_ELECTION", length = 1)
	public String getIsPublicElection() {
		return this.isPublicElection;
	}

	public void setIsPublicElection(String isPublicElection) {
		this.isPublicElection = isPublicElection;
	}

	@Column(name = "IS_PERMANENT_ELECTION", length = 1)
	public String getIsPermanentElection() {
		return this.isPermanentElection;
	}

	public void setIsPermanentElection(String isPermanentElection) {
		this.isPermanentElection = isPermanentElection;
	}

	@Column(name = "IS_ANNUAL_ELECTION", length = 1)
	public String getIsAnnualElection() {
		return this.isAnnualElection;
	}

	public void setIsAnnualElection(String isAnnualElection) {
		this.isAnnualElection = isAnnualElection;
	}

	@Column(name = "IS_CONVENED", length = 1)
	public String getIsConvened() {
		return this.isConvened;
	}

	public void setIsConvened(String isConvened) {
		this.isConvened = isConvened;
	}

	@Column(name = "IS_ESTABLISH_CONNECT_ORG", length = 1)
	public String getIsEstablishConnectOrg() {
		return this.isEstablishConnectOrg;
	}

	public void setIsEstablishConnectOrg(String isEstablishConnectOrg) {
		this.isEstablishConnectOrg = isEstablishConnectOrg;
	}

	@Column(name = "ELECTION_SITUATION", length = 4000)
	public String getElectionSituation() {
		return this.electionSituation;
	}

	public void setElectionSituation(String electionSituation) {
		this.electionSituation = electionSituation;
	}

	@Column(name = "IS_DISPATCH", length = 1)
	public String getIsDispatch() {
		return this.isDispatch;
	}

	public void setIsDispatch(String isDispatch) {
		this.isDispatch = isDispatch;
	}

	@Column(name = "BEFORE_ELECTION_DEADLINE", length = 7)
	public Date getBeforeElectionDeadline() {
		return this.beforeElectionDeadline;
	}

	public void setBeforeElectionDeadline(Date beforeElectionDeadline) {
		this.beforeElectionDeadline = beforeElectionDeadline;
	}

	@Column(name = "ELECTION_DEADLINE", length = 6)
	public String getElectionDeadline() {
		return this.electionDeadline;
	}

	public void setElectionDeadline(String electionDeadline) {
		this.electionDeadline = electionDeadline;
	}

	@Column(name = "ELECTION_YEARS", length = 6)
	public String getElectionYears() {
		return this.electionYears;
	}

	public void setElectionYears(String electionYears) {
		this.electionYears = electionYears;
	}

}