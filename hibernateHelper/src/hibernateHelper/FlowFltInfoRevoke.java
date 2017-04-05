package hibernateHelper;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FlowFltInfoRevoke entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FLOW_FLT_INFO_REVOKE")
public class FlowFltInfoRevoke implements java.io.Serializable {

	// Fields

	private String dataId;
	private String userId;
	private String orgCode;
	private String fltToOrg;
	private String fltToName;
	private String fltStatus;
	private String fltType;
	private Date fltBeginTime;
	private Date fltEndTime;
	private String fltReason;
	private String approveUser;

	// Constructors

	/** default constructor */
	public FlowFltInfoRevoke() {
	}

	/** minimal constructor */
	public FlowFltInfoRevoke(String dataId) {
		this.dataId = dataId;
	}

	/** full constructor */
	public FlowFltInfoRevoke(String dataId, String userId, String orgCode,
			String fltToOrg, String fltToName, String fltStatus,
			String fltType, Date fltBeginTime, Date fltEndTime,
			String fltReason, String approveUser) {
		this.dataId = dataId;
		this.userId = userId;
		this.orgCode = orgCode;
		this.fltToOrg = fltToOrg;
		this.fltToName = fltToName;
		this.fltStatus = fltStatus;
		this.fltType = fltType;
		this.fltBeginTime = fltBeginTime;
		this.fltEndTime = fltEndTime;
		this.fltReason = fltReason;
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

	@Column(name = "FLT_TO_ORG", length = 30)
	public String getFltToOrg() {
		return this.fltToOrg;
	}

	public void setFltToOrg(String fltToOrg) {
		this.fltToOrg = fltToOrg;
	}

	@Column(name = "FLT_TO_NAME")
	public String getFltToName() {
		return this.fltToName;
	}

	public void setFltToName(String fltToName) {
		this.fltToName = fltToName;
	}

	@Column(name = "FLT_STATUS", length = 1)
	public String getFltStatus() {
		return this.fltStatus;
	}

	public void setFltStatus(String fltStatus) {
		this.fltStatus = fltStatus;
	}

	@Column(name = "FLT_TYPE", length = 2)
	public String getFltType() {
		return this.fltType;
	}

	public void setFltType(String fltType) {
		this.fltType = fltType;
	}

	@Column(name = "FLT_BEGIN_TIME", length = 7)
	public Date getFltBeginTime() {
		return this.fltBeginTime;
	}

	public void setFltBeginTime(Date fltBeginTime) {
		this.fltBeginTime = fltBeginTime;
	}

	@Column(name = "FLT_END_TIME", length = 7)
	public Date getFltEndTime() {
		return this.fltEndTime;
	}

	public void setFltEndTime(Date fltEndTime) {
		this.fltEndTime = fltEndTime;
	}

	@Column(name = "FLT_REASON", length = 8)
	public String getFltReason() {
		return this.fltReason;
	}

	public void setFltReason(String fltReason) {
		this.fltReason = fltReason;
	}

	@Column(name = "APPROVE_USER", length = 16)
	public String getApproveUser() {
		return this.approveUser;
	}

	public void setApproveUser(String approveUser) {
		this.approveUser = approveUser;
	}

}