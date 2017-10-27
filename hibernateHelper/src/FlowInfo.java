// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FlowInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FLOW_INFO")
public class FlowInfo implements java.io.Serializable {

	// Fields

	private String dataId;
	private String flowCode;
	private String flowName;
	private String isPersonal;
	private String orgCode;

	// Constructors

	/** default constructor */
	public FlowInfo() {
	}

	/** minimal constructor */
	public FlowInfo(String dataId) {
		this.dataId = dataId;
	}

	/** full constructor */
	public FlowInfo(String dataId, String flowCode, String flowName,
			String isPersonal, String orgCode) {
		this.dataId = dataId;
		this.flowCode = flowCode;
		this.flowName = flowName;
		this.isPersonal = isPersonal;
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

}