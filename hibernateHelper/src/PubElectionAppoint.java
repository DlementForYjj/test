// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PubElectionAppoint entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_ELECTION_APPOINT")
public class PubElectionAppoint implements java.io.Serializable {

	// Fields

	private String appointId;
	private String userId;
	private String orgCode;
	private String appointTitle;
	private String isClassMember;
	private String appointType;
	private Date appointTime;
	private String appointYears;
	private Date leaveTime;
	private String titleOrder;
	private Integer electionTerm;
	private String appointStatus;

	// Constructors

	/** default constructor */
	public PubElectionAppoint() {
	}

	/** minimal constructor */
	public PubElectionAppoint(String appointId) {
		this.appointId = appointId;
	}

	/** full constructor */
	public PubElectionAppoint(String appointId, String userId, String orgCode,
			String appointTitle, String isClassMember, String appointType,
			Date appointTime, String appointYears, Date leaveTime,
			String titleOrder, Integer electionTerm, String appointStatus) {
		this.appointId = appointId;
		this.userId = userId;
		this.orgCode = orgCode;
		this.appointTitle = appointTitle;
		this.isClassMember = isClassMember;
		this.appointType = appointType;
		this.appointTime = appointTime;
		this.appointYears = appointYears;
		this.leaveTime = leaveTime;
		this.titleOrder = titleOrder;
		this.electionTerm = electionTerm;
		this.appointStatus = appointStatus;
	}

	// Property accessors
	@Id
	@Column(name = "APPOINT_ID", unique = true, nullable = false, length = 16)
	public String getAppointId() {
		return this.appointId;
	}

	public void setAppointId(String appointId) {
		this.appointId = appointId;
	}

	@Column(name = "USER_ID", length = 16)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "ORG_CODE", length = 30)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Column(name = "APPOINT_TITLE", length = 50)
	public String getAppointTitle() {
		return this.appointTitle;
	}

	public void setAppointTitle(String appointTitle) {
		this.appointTitle = appointTitle;
	}

	@Column(name = "IS_CLASS_MEMBER", length = 4)
	public String getIsClassMember() {
		return this.isClassMember;
	}

	public void setIsClassMember(String isClassMember) {
		this.isClassMember = isClassMember;
	}

	@Column(name = "APPOINT_TYPE", length = 10)
	public String getAppointType() {
		return this.appointType;
	}

	public void setAppointType(String appointType) {
		this.appointType = appointType;
	}

	@Column(name = "APPOINT_TIME", length = 7)
	public Date getAppointTime() {
		return this.appointTime;
	}

	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}

	@Column(name = "APPOINT_YEARS", length = 10)
	public String getAppointYears() {
		return this.appointYears;
	}

	public void setAppointYears(String appointYears) {
		this.appointYears = appointYears;
	}

	@Column(name = "LEAVE_TIME", length = 7)
	public Date getLeaveTime() {
		return this.leaveTime;
	}

	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}

	@Column(name = "TITLE_ORDER", length = 10)
	public String getTitleOrder() {
		return this.titleOrder;
	}

	public void setTitleOrder(String titleOrder) {
		this.titleOrder = titleOrder;
	}

	@Column(name = "ELECTION_TERM", precision = 9, scale = 0)
	public Integer getElectionTerm() {
		return this.electionTerm;
	}

	public void setElectionTerm(Integer electionTerm) {
		this.electionTerm = electionTerm;
	}

	@Column(name = "APPOINT_STATUS", length = 1)
	public String getAppointStatus() {
		return this.appointStatus;
	}

	public void setAppointStatus(String appointStatus) {
		this.appointStatus = appointStatus;
	}

}