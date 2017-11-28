// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FlowOrgPunish entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FLOW_ORG_PUNISH", schema = "PARTY")
public class FlowOrgPunish implements java.io.Serializable {

	// Fields

	private String dataId;
	private String punishLevel;
	private Timestamp punishTime;
	private String punishResult;
	private String punishPerformance;
	private String punishHandle;
	private String punishReason;
	private String punishRemark;
	private String punishOrg;

	// Constructors

	/** default constructor */
	public FlowOrgPunish() {
	}

	/** minimal constructor */
	public FlowOrgPunish(String dataId) {
		this.dataId = dataId;
	}

	/** full constructor */
	public FlowOrgPunish(String dataId, String punishLevel,
			Timestamp punishTime, String punishResult,
			String punishPerformance, String punishHandle, String punishReason,
			String punishRemark, String punishOrg) {
		this.dataId = dataId;
		this.punishLevel = punishLevel;
		this.punishTime = punishTime;
		this.punishResult = punishResult;
		this.punishPerformance = punishPerformance;
		this.punishHandle = punishHandle;
		this.punishReason = punishReason;
		this.punishRemark = punishRemark;
		this.punishOrg = punishOrg;
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

	@Column(name = "PUNISH_LEVEL", length = 16)
	public String getPunishLevel() {
		return this.punishLevel;
	}

	public void setPunishLevel(String punishLevel) {
		this.punishLevel = punishLevel;
	}

	@Column(name = "PUNISH_TIME", length = 7)
	public Timestamp getPunishTime() {
		return this.punishTime;
	}

	public void setPunishTime(Timestamp punishTime) {
		this.punishTime = punishTime;
	}

	@Column(name = "PUNISH_RESULT", length = 4000)
	public String getPunishResult() {
		return this.punishResult;
	}

	public void setPunishResult(String punishResult) {
		this.punishResult = punishResult;
	}

	@Column(name = "PUNISH_PERFORMANCE", length = 4000)
	public String getPunishPerformance() {
		return this.punishPerformance;
	}

	public void setPunishPerformance(String punishPerformance) {
		this.punishPerformance = punishPerformance;
	}

	@Column(name = "PUNISH_HANDLE", length = 4000)
	public String getPunishHandle() {
		return this.punishHandle;
	}

	public void setPunishHandle(String punishHandle) {
		this.punishHandle = punishHandle;
	}

	@Column(name = "PUNISH_REASON", length = 4000)
	public String getPunishReason() {
		return this.punishReason;
	}

	public void setPunishReason(String punishReason) {
		this.punishReason = punishReason;
	}

	@Column(name = "PUNISH_REMARK", length = 4000)
	public String getPunishRemark() {
		return this.punishRemark;
	}

	public void setPunishRemark(String punishRemark) {
		this.punishRemark = punishRemark;
	}

	@Column(name = "PUNISH_ORG", length = 30)
	public String getPunishOrg() {
		return this.punishOrg;
	}

	public void setPunishOrg(String punishOrg) {
		this.punishOrg = punishOrg;
	}

}