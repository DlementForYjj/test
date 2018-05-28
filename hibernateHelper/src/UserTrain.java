// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserTrain entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "USER_TRAIN")
public class UserTrain implements java.io.Serializable {

	// Fields

	private String dataId;
	private Date trainStartTime;
	private Date trainEndTime;
	private Integer period;
	private String trainAddress;
	private String trainOrg;
	private String trainName;
	private String trainType;
	private String trainContent;
	private Integer score;
	private String userId;
	private String agentUser;
	private String applyReason;
	private String orgCode;

	// Constructors

	/** default constructor */
	public UserTrain() {
	}

	/** minimal constructor */
	public UserTrain(String dataId) {
		this.dataId = dataId;
	}

	/** full constructor */
	public UserTrain(String dataId, Date trainStartTime,
			Date trainEndTime, Integer period, String trainAddress,
			String trainOrg, String trainName, String trainType,
			String trainContent, Integer score, String userId, String agentUser,
			String applyReason, String orgCode) {
		this.dataId = dataId;
		this.trainStartTime = trainStartTime;
		this.trainEndTime = trainEndTime;
		this.period = period;
		this.trainAddress = trainAddress;
		this.trainOrg = trainOrg;
		this.trainName = trainName;
		this.trainType = trainType;
		this.trainContent = trainContent;
		this.score = score;
		this.userId = userId;
		this.agentUser = agentUser;
		this.applyReason = applyReason;
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

	@Column(name = "TRAIN_START_TIME", length = 7)
	public Date getTrainStartTime() {
		return this.trainStartTime;
	}

	public void setTrainStartTime(Date trainStartTime) {
		this.trainStartTime = trainStartTime;
	}

	@Column(name = "TRAIN_END_TIME", length = 7)
	public Date getTrainEndTime() {
		return this.trainEndTime;
	}

	public void setTrainEndTime(Date trainEndTime) {
		this.trainEndTime = trainEndTime;
	}

	@Column(name = "PERIOD", precision = 0)
	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	@Column(name = "TRAIN_ADDRESS", length = 512)
	public String getTrainAddress() {
		return this.trainAddress;
	}

	public void setTrainAddress(String trainAddress) {
		this.trainAddress = trainAddress;
	}

	@Column(name = "TRAIN_ORG", length = 512)
	public String getTrainOrg() {
		return this.trainOrg;
	}

	public void setTrainOrg(String trainOrg) {
		this.trainOrg = trainOrg;
	}

	@Column(name = "TRAIN_NAME", length = 512)
	public String getTrainName() {
		return this.trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	@Column(name = "TRAIN_TYPE", length = 16)
	public String getTrainType() {
		return this.trainType;
	}

	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}

	@Column(name = "TRAIN_CONTENT", length = 16)
	public String getTrainContent() {
		return this.trainContent;
	}

	public void setTrainContent(String trainContent) {
		this.trainContent = trainContent;
	}

	@Column(name = "SCORE", precision = 0)
	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
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

	@Column(name = "APPLY_REASON", length = 4000)
	public String getApplyReason() {
		return this.applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	@Column(name = "ORG_CODE", length = 128)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

}