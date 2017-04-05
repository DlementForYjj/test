package hibernateHelper;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CareDiffMember entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "CARE_DIFF_MEMBER", schema = "PARTY")
public class CareDiffMember implements java.io.Serializable {

	// Fields

	private String diffId;
	private String userId;
	private String orgCode;
	private Timestamp createTime;
	private String createId;
	private String familyIncome;
	private Short familyMembers;
	private String isZeroEmployment;
	private String enjoyLow;
	private String lowNum;
	private String povertyReason;
	private String firstContact;
	private String firstContactPhone;
	private String approveStatus;
	private String remark;
	private String flowCode;
	private String flowNode;
	private String flowOrgCode;
	private String report;
	private Short reportNumber;
	private String diffLevel;
	private String postedId;
	private String addMaterials;

	// Constructors

	/** default constructor */
	public CareDiffMember() {
	}

	/** minimal constructor */
	public CareDiffMember(String diffId) {
		this.diffId = diffId;
	}

	/** full constructor */
	public CareDiffMember(String diffId, String userId, String orgCode,
			Timestamp createTime, String createId, String familyIncome,
			Short familyMembers, String isZeroEmployment, String enjoyLow,
			String lowNum, String povertyReason, String firstContact,
			String firstContactPhone, String approveStatus, String remark,
			String flowCode, String flowNode, String flowOrgCode,
			String report, Short reportNumber, String diffLevel,
			String postedId, String addMaterials) {
		this.diffId = diffId;
		this.userId = userId;
		this.orgCode = orgCode;
		this.createTime = createTime;
		this.createId = createId;
		this.familyIncome = familyIncome;
		this.familyMembers = familyMembers;
		this.isZeroEmployment = isZeroEmployment;
		this.enjoyLow = enjoyLow;
		this.lowNum = lowNum;
		this.povertyReason = povertyReason;
		this.firstContact = firstContact;
		this.firstContactPhone = firstContactPhone;
		this.approveStatus = approveStatus;
		this.remark = remark;
		this.flowCode = flowCode;
		this.flowNode = flowNode;
		this.flowOrgCode = flowOrgCode;
		this.report = report;
		this.reportNumber = reportNumber;
		this.diffLevel = diffLevel;
		this.postedId = postedId;
		this.addMaterials = addMaterials;
	}

	// Property accessors
	@Id
	@Column(name = "DIFF_ID", unique = true, nullable = false, length = 16)
	public String getDiffId() {
		return this.diffId;
	}

	public void setDiffId(String diffId) {
		this.diffId = diffId;
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

	@Column(name = "CREATE_TIME", length = 7)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Column(name = "CREATE_ID", length = 16)
	public String getCreateId() {
		return this.createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	@Column(name = "FAMILY_INCOME")
	public String getFamilyIncome() {
		return this.familyIncome;
	}

	public void setFamilyIncome(String familyIncome) {
		this.familyIncome = familyIncome;
	}

	@Column(name = "FAMILY_MEMBERS", precision = 4, scale = 0)
	public Short getFamilyMembers() {
		return this.familyMembers;
	}

	public void setFamilyMembers(Short familyMembers) {
		this.familyMembers = familyMembers;
	}

	@Column(name = "IS_ZERO_EMPLOYMENT", length = 1)
	public String getIsZeroEmployment() {
		return this.isZeroEmployment;
	}

	public void setIsZeroEmployment(String isZeroEmployment) {
		this.isZeroEmployment = isZeroEmployment;
	}

	@Column(name = "ENJOY_LOW", length = 1)
	public String getEnjoyLow() {
		return this.enjoyLow;
	}

	public void setEnjoyLow(String enjoyLow) {
		this.enjoyLow = enjoyLow;
	}

	@Column(name = "LOW_NUM")
	public String getLowNum() {
		return this.lowNum;
	}

	public void setLowNum(String lowNum) {
		this.lowNum = lowNum;
	}

	@Column(name = "POVERTY_REASON", length = 2000)
	public String getPovertyReason() {
		return this.povertyReason;
	}

	public void setPovertyReason(String povertyReason) {
		this.povertyReason = povertyReason;
	}

	@Column(name = "FIRST_CONTACT", length = 30)
	public String getFirstContact() {
		return this.firstContact;
	}

	public void setFirstContact(String firstContact) {
		this.firstContact = firstContact;
	}

	@Column(name = "FIRST_CONTACT_PHONE")
	public String getFirstContactPhone() {
		return this.firstContactPhone;
	}

	public void setFirstContactPhone(String firstContactPhone) {
		this.firstContactPhone = firstContactPhone;
	}

	@Column(name = "APPROVE_STATUS", length = 1)
	public String getApproveStatus() {
		return this.approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	@Column(name = "REMARK", length = 1000)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "FLOW_CODE", length = 32)
	public String getFlowCode() {
		return this.flowCode;
	}

	public void setFlowCode(String flowCode) {
		this.flowCode = flowCode;
	}

	@Column(name = "FLOW_NODE", length = 32)
	public String getFlowNode() {
		return this.flowNode;
	}

	public void setFlowNode(String flowNode) {
		this.flowNode = flowNode;
	}

	@Column(name = "FLOW_ORG_CODE", length = 64)
	public String getFlowOrgCode() {
		return this.flowOrgCode;
	}

	public void setFlowOrgCode(String flowOrgCode) {
		this.flowOrgCode = flowOrgCode;
	}

	@Column(name = "REPORT", length = 1)
	public String getReport() {
		return this.report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	@Column(name = "REPORT_NUMBER", precision = 4, scale = 0)
	public Short getReportNumber() {
		return this.reportNumber;
	}

	public void setReportNumber(Short reportNumber) {
		this.reportNumber = reportNumber;
	}

	@Column(name = "DIFF_LEVEL", length = 1)
	public String getDiffLevel() {
		return this.diffLevel;
	}

	public void setDiffLevel(String diffLevel) {
		this.diffLevel = diffLevel;
	}

	@Column(name = "POSTED_ID", length = 16)
	public String getPostedId() {
		return this.postedId;
	}

	public void setPostedId(String postedId) {
		this.postedId = postedId;
	}

	@Column(name = "ADD_MATERIALS", length = 2000)
	public String getAddMaterials() {
		return this.addMaterials;
	}

	public void setAddMaterials(String addMaterials) {
		this.addMaterials = addMaterials;
	}

}