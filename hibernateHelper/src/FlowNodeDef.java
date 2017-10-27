// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FlowNodeDef entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FLOW_NODE_DEF")
public class FlowNodeDef implements java.io.Serializable {

	// Fields

	private String defId;
	private String flowCode;
	private String orgCode;
	private String flowNode;
	private Integer nodeOrder;
	private String nodeName;
	private String needRepeat;

	// Constructors

	/** default constructor */
	public FlowNodeDef() {
	}

	/** minimal constructor */
	public FlowNodeDef(String defId, String flowCode, String orgCode,
			String flowNode) {
		this.defId = defId;
		this.flowCode = flowCode;
		this.orgCode = orgCode;
		this.flowNode = flowNode;
	}

	/** full constructor */
	public FlowNodeDef(String defId, String flowCode, String orgCode,
			String flowNode, Integer nodeOrder, String nodeName,
			String needRepeat) {
		this.defId = defId;
		this.flowCode = flowCode;
		this.orgCode = orgCode;
		this.flowNode = flowNode;
		this.nodeOrder = nodeOrder;
		this.nodeName = nodeName;
		this.needRepeat = needRepeat;
	}

	// Property accessors
	@Id
	@Column(name = "DEF_ID", unique = true, nullable = false, length = 16)
	public String getDefId() {
		return this.defId;
	}

	public void setDefId(String defId) {
		this.defId = defId;
	}

	@Column(name = "FLOW_CODE", nullable = false, length = 32)
	public String getFlowCode() {
		return this.flowCode;
	}

	public void setFlowCode(String flowCode) {
		this.flowCode = flowCode;
	}

	@Column(name = "ORG_CODE", nullable = false, length = 12)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Column(name = "FLOW_NODE", nullable = false, length = 32)
	public String getFlowNode() {
		return this.flowNode;
	}

	public void setFlowNode(String flowNode) {
		this.flowNode = flowNode;
	}

	@Column(name = "NODE_ORDER", precision = 9, scale = 0)
	public Integer getNodeOrder() {
		return this.nodeOrder;
	}

	public void setNodeOrder(Integer nodeOrder) {
		this.nodeOrder = nodeOrder;
	}

	@Column(name = "NODE_NAME", length = 256)
	public String getNodeName() {
		return this.nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	@Column(name = "NEED_REPEAT", length = 1)
	public String getNeedRepeat() {
		return this.needRepeat;
	}

	public void setNeedRepeat(String needRepeat) {
		this.needRepeat = needRepeat;
	}

}