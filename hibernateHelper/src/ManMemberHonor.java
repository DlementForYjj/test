// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ManMemberHonor entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "MAN_MEMBER_HONOR")
public class ManMemberHonor implements java.io.Serializable {

	// Fields

	private String honorId;
	private String orgCode;
	private String userId;
	private String grantUnit;
	private Date grantTime;
	private String honorAward;
	private String honorName;
	private String honorLevel;
	private String applyRemarks;
	private Date applyDate;
	private String writterId;
	private String honorState;
	private String flowCode;
	private String flowNode;
	private String flowOrgCode;
	private String grantOrg;
	private String isPosh;
	private String applyContent;
	private String applyReason;

	// Constructors

	/** default constructor */
	public ManMemberHonor() {
	}

	/** minimal constructor */
	public ManMemberHonor(String honorId) {
		this.honorId = honorId;
	}

	/** full constructor */
	public ManMemberHonor(String honorId, String orgCode, String userId,
			String grantUnit, Date grantTime, String honorAward,
			String honorName, String honorLevel, String applyRemarks,
			Date applyDate, String writterId, String honorState,
			String flowCode, String flowNode, String flowOrgCode,
			String grantOrg, String isPosh, String applyContent,
			String applyReason) {
		this.honorId = honorId;
		this.orgCode = orgCode;
		this.userId = userId;
		this.grantUnit = grantUnit;
		this.grantTime = grantTime;
		this.honorAward = honorAward;
		this.honorName = honorName;
		this.honorLevel = honorLevel;
		this.applyRemarks = applyRemarks;
		this.applyDate = applyDate;
		this.writterId = writterId;
		this.honorState = honorState;
		this.flowCode = flowCode;
		this.flowNode = flowNode;
		this.flowOrgCode = flowOrgCode;
		this.grantOrg = grantOrg;
		this.isPosh = isPosh;
		this.applyContent = applyContent;
		this.applyReason = applyReason;
	}

	// Property accessors
	@Id
	@Column(name = "HONOR_ID", unique = true, nullable = false, length = 16)
	public String getHonorId() {
		return this.honorId;
	}

	public void setHonorId(String honorId) {
		this.honorId = honorId;
	}

	@Column(name = "ORG_CODE", length = 30)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Column(name = "USER_ID", length = 16)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "GRANT_UNIT")
	public String getGrantUnit() {
		return this.grantUnit;
	}

	public void setGrantUnit(String grantUnit) {
		this.grantUnit = grantUnit;
	}

	@Column(name = "GRANT_TIME", length = 7)
	public Date getGrantTime() {
		return this.grantTime;
	}

	public void setGrantTime(Date grantTime) {
		this.grantTime = grantTime;
	}

	@Column(name = "HONOR_AWARD", length = 50)
	public String getHonorAward() {
		return this.honorAward;
	}

	public void setHonorAward(String honorAward) {
		this.honorAward = honorAward;
	}

	@Column(name = "HONOR_NAME", length = 50)
	public String getHonorName() {
		return this.honorName;
	}

	public void setHonorName(String honorName) {
		this.honorName = honorName;
	}

	@Column(name = "HONOR_LEVEL", length = 4)
	public String getHonorLevel() {
		return this.honorLevel;
	}

	public void setHonorLevel(String honorLevel) {
		this.honorLevel = honorLevel;
	}

	@Column(name = "APPLY_REMARKS", length = 2000)
	public String getApplyRemarks() {
		return this.applyRemarks;
	}

	public void setApplyRemarks(String applyRemarks) {
		this.applyRemarks = applyRemarks;
	}

	@Column(name = "APPLY_DATE", length = 7)
	public Date getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	@Column(name = "WRITTER_ID", length = 50)
	public String getWritterId() {
		return this.writterId;
	}

	public void setWritterId(String writterId) {
		this.writterId = writterId;
	}

	@Column(name = "HONOR_STATE", length = 1)
	public String getHonorState() {
		return this.honorState;
	}

	public void setHonorState(String honorState) {
		this.honorState = honorState;
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

	@Column(name = "GRANT_ORG", length = 30)
	public String getGrantOrg() {
		return this.grantOrg;
	}

	public void setGrantOrg(String grantOrg) {
		this.grantOrg = grantOrg;
	}

	@Column(name = "IS_POSH", length = 1)
	public String getIsPosh() {
		return this.isPosh;
	}

	public void setIsPosh(String isPosh) {
		this.isPosh = isPosh;
	}

	@Column(name = "APPLY_CONTENT", length = 2000)
	public String getApplyContent() {
		return this.applyContent;
	}

	public void setApplyContent(String applyContent) {
		this.applyContent = applyContent;
	}

	@Column(name = "APPLY_REASON", length = 2000)
	public String getApplyReason() {
		return this.applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

}