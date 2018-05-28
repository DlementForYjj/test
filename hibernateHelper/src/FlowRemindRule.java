// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FlowRemindRule entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FLOW_REMIND_RULE")
public class FlowRemindRule implements java.io.Serializable {

	// Fields

	private String ruleKey;
	private String flowCode;
	private String flowNode;
	private String ruleRemark;
	private Integer rulePriority;
	private String remindStartTime;
	private String remindIntervalTime;

	// Constructors

	/** default constructor */
	public FlowRemindRule() {
	}

	/** minimal constructor */
	public FlowRemindRule(String ruleKey) {
		this.ruleKey = ruleKey;
	}

	/** full constructor */
	public FlowRemindRule(String ruleKey, String flowCode, String flowNode,
			String ruleRemark, Integer rulePriority, String remindStartTime,
			String remindIntervalTime) {
		this.ruleKey = ruleKey;
		this.flowCode = flowCode;
		this.flowNode = flowNode;
		this.ruleRemark = ruleRemark;
		this.rulePriority = rulePriority;
		this.remindStartTime = remindStartTime;
		this.remindIntervalTime = remindIntervalTime;
	}

	// Property accessors
	@Id
	@Column(name = "RULE_KEY", unique = true, nullable = false, length = 32)
	public String getRuleKey() {
		return this.ruleKey;
	}

	public void setRuleKey(String ruleKey) {
		this.ruleKey = ruleKey;
	}

	@Column(name = "FLOW_CODE", length = 16)
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

	@Column(name = "RULE_REMARK", length = 256)
	public String getRuleRemark() {
		return this.ruleRemark;
	}

	public void setRuleRemark(String ruleRemark) {
		this.ruleRemark = ruleRemark;
	}

	@Column(name = "RULE_PRIORITY", precision = 9, scale = 0)
	public Integer getRulePriority() {
		return this.rulePriority;
	}

	public void setRulePriority(Integer rulePriority) {
		this.rulePriority = rulePriority;
	}

	@Column(name = "REMIND_START_TIME", length = 1)
	public String getRemindStartTime() {
		return this.remindStartTime;
	}

	public void setRemindStartTime(String remindStartTime) {
		this.remindStartTime = remindStartTime;
	}

	@Column(name = "REMIND_INTERVAL_TIME", length = 1000)
	public String getRemindIntervalTime() {
		return this.remindIntervalTime;
	}

	public void setRemindIntervalTime(String remindIntervalTime) {
		this.remindIntervalTime = remindIntervalTime;
	}

}