// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FlowMemPunish entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FLOW_MEM_PUNISH", schema = "PARTY")
public class FlowMemPunish implements java.io.Serializable {

	// Fields

	private String dataId;
	private String punishLevel;
	private Timestamp punishTime;
	private String punishResult;
	private String punishPerformance;
	private String punishHandle;
	private String punishReason;
	private String punishRemark;
	private String userId;
	private String punishOrg;
	private Timestamp punishRevokeTime;
	private String orgCode;

	// Constructors

	/** default constructor */
	public FlowMemPunish() {
	}

	/** minimal constructor */
	public FlowMemPunish(String dataId) {
		this.dataId = dataId;
	}

	/** full constructor */
	public FlowMemPunish(String dataId, String punishLevel,
			Timestamp punishTime, String punishResult,
			String punishPerformance, String punishHandle, String punishReason,
			String punishRemark, String userId, String punishOrg,
			Timestamp punishRevokeTime, String orgCode) {
		this.dataId = dataId;
		this.punishLevel = punishLevel;
		this.punishTime = punishTime;
		this.punishResult = punishResult;
		this.punishPerformance = punishPerformance;
		this.punishHandle = punishHandle;
		this.punishReason = punishReason;
		this.punishRemark = punishRemark;
		this.userId = userId;
		this.punishOrg = punishOrg;
		this.punishRevokeTime = punishRevokeTime;
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

	@Column(name = "PUNISH_RESULT", length = 16)
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

	@Column(name = "PUNISH_REASON", length = 16)
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

	@Column(name = "USER_ID", length = 16)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "PUNISH_ORG", length = 512)
	public String getPunishOrg() {
		return this.punishOrg;
	}

	public void setPunishOrg(String punishOrg) {
		this.punishOrg = punishOrg;
	}

	@Column(name = "PUNISH_REVOKE_TIME", length = 7)
	public Timestamp getPunishRevokeTime() {
		return this.punishRevokeTime;
	}

	public void setPunishRevokeTime(Timestamp punishRevokeTime) {
		this.punishRevokeTime = punishRevokeTime;
	}

	@Column(name = "ORG_CODE", length = 30)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

}