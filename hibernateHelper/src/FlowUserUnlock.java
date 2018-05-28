// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FlowUserUnlock entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FLOW_USER_UNLOCK")
public class FlowUserUnlock implements java.io.Serializable {

	// Fields

	private String dataId;
	private String userId;
	private String agentUser;
	private String reason;
	private String orgCode;

	// Constructors

	/** default constructor */
	public FlowUserUnlock() {
	}

	/** minimal constructor */
	public FlowUserUnlock(String dataId) {
		this.dataId = dataId;
	}

	/** full constructor */
	public FlowUserUnlock(String dataId, String userId, String agentUser,
			String reason, String orgCode) {
		this.dataId = dataId;
		this.userId = userId;
		this.agentUser = agentUser;
		this.reason = reason;
		this.orgCode = orgCode;
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

	@Column(name = "AGENT_USER", length = 16)
	public String getAgentUser() {
		return this.agentUser;
	}

	public void setAgentUser(String agentUser) {
		this.agentUser = agentUser;
	}

	@Column(name = "REASON", length = 4000)
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Column(name = "ORG_CODE", length = 30)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

}