// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FlowInfoConfig entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FLOW_INFO_CONFIG")
public class FlowInfoConfig implements java.io.Serializable {

	// Fields

	private String dataId;
	private String flowCode;
	private String flowName;
	private String isPersonal;
	private String orgCode;
	private String tranRoles;
	private String flowRemind;
	private String isRemind;

	// Constructors

	/** default constructor */
	public FlowInfoConfig() {
	}

	/** minimal constructor */
	public FlowInfoConfig(String dataId) {
		this.dataId = dataId;
	}

	/** full constructor */
	public FlowInfoConfig(String dataId, String flowCode, String flowName,
			String isPersonal, String orgCode, String tranRoles,
			String flowRemind, String isRemind) {
		this.dataId = dataId;
		this.flowCode = flowCode;
		this.flowName = flowName;
		this.isPersonal = isPersonal;
		this.orgCode = orgCode;
		this.tranRoles = tranRoles;
		this.flowRemind = flowRemind;
		this.isRemind = isRemind;
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

	@Column(name = "FLOW_CODE", length = 32)
	public String getFlowCode() {
		return this.flowCode;
	}

	public void setFlowCode(String flowCode) {
		this.flowCode = flowCode;
	}

	@Column(name = "FLOW_NAME", length = 256)
	public String getFlowName() {
		return this.flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	@Column(name = "IS_PERSONAL", length = 1)
	public String getIsPersonal() {
		return this.isPersonal;
	}

	public void setIsPersonal(String isPersonal) {
		this.isPersonal = isPersonal;
	}

	@Column(name = "ORG_CODE", length = 16)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Column(name = "TRAN_ROLES", length = 512)
	public String getTranRoles() {
		return this.tranRoles;
	}

	public void setTranRoles(String tranRoles) {
		this.tranRoles = tranRoles;
	}

	@Column(name = "FLOW_REMIND", length = 512)
	public String getFlowRemind() {
		return this.flowRemind;
	}

	public void setFlowRemind(String flowRemind) {
		this.flowRemind = flowRemind;
	}

	@Column(name = "IS_REMIND", length = 1)
	public String getIsRemind() {
		return this.isRemind;
	}

	public void setIsRemind(String isRemind) {
		this.isRemind = isRemind;
	}

}