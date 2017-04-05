package hibernateHelper;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FlowOrgLinkRevoke entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FLOW_ORG_LINK_REVOKE")
public class FlowOrgLinkRevoke implements java.io.Serializable {

	// Fields

	private String dataId;
	private String userId;
	private String orgCode;
	private String linkOrg;
	private String applyReason;
	private Date applyTime;
	private String dataStatus;
	private String flowCode;
	private String flowNode;
	private String flowOrgCode;
	private String approveUser;

	// Constructors

	/** default constructor */
	public FlowOrgLinkRevoke() {
	}

	/** minimal constructor */
	public FlowOrgLinkRevoke(String dataId) {
		this.dataId = dataId;
	}

	/** full constructor */
	public FlowOrgLinkRevoke(String dataId, String userId, String orgCode,
			String linkOrg, String applyReason, Date applyTime,
			String dataStatus, String flowCode, String flowNode,
			String flowOrgCode, String approveUser) {
		this.dataId = dataId;
		this.userId = userId;
		this.orgCode = orgCode;
		this.linkOrg = linkOrg;
		this.applyReason = applyReason;
		this.applyTime = applyTime;
		this.dataStatus = dataStatus;
		this.flowCode = flowCode;
		this.flowNode = flowNode;
		this.flowOrgCode = flowOrgCode;
		this.approveUser = approveUser;
	}

	// Property accessors
	@Id
	@Column(name = "DATA_ID", unique = true, nullable = false, length = 16)
	public String getDataId() {
		return this.dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
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

	@Column(name = "LINK_ORG", length = 30)
	public String getLinkOrg() {
		return this.linkOrg;
	}

	public void setLinkOrg(String linkOrg) {
		this.linkOrg = linkOrg;
	}

	@Column(name = "APPLY_REASON", length = 2000)
	public String getApplyReason() {
		return this.applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	@Column(name = "APPLY_TIME", length = 7)
	public Date getApplyTime() {
		return this.applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	@Column(name = "DATA_STATUS", length = 1)
	public String getDataStatus() {
		return this.dataStatus;
	}

	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus;
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

	@Column(name = "APPROVE_USER", length = 16)
	public String getApproveUser() {
		return this.approveUser;
	}

	public void setApproveUser(String approveUser) {
		this.approveUser = approveUser;
	}

}