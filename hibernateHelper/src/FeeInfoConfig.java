// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FeeInfoConfig entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FEE_INFO_CONFIG", schema = "PARTY")
public class FeeInfoConfig implements java.io.Serializable {

	// Fields

	private String userId;
	private String orgCode;
	private String userType;
	private Double userIncome;
	private String userDerateType;
	private String isDerate;
	private Double userMonFee;
	private Double derateFee;
	private Double derateScale;
	private Double replenishmentFee;
	private Timestamp feeStartTime;
	private Timestamp lastPayTime;
	private Timestamp derateStartTime;
	private Timestamp derateEndTime;
	private String derateType;

	// Constructors

	/** default constructor */
	public FeeInfoConfig() {
	}

	/** minimal constructor */
	public FeeInfoConfig(String userId, String orgCode) {
		this.userId = userId;
		this.orgCode = orgCode;
	}

	/** full constructor */
	public FeeInfoConfig(String userId, String orgCode, String userType,
			Double userIncome, String userDerateType, String isDerate,
			Double userMonFee, Double derateFee, Double derateScale,
			Double replenishmentFee, Timestamp feeStartTime,
			Timestamp lastPayTime, Timestamp derateStartTime,
			Timestamp derateEndTime, String derateType) {
		this.userId = userId;
		this.orgCode = orgCode;
		this.userType = userType;
		this.userIncome = userIncome;
		this.userDerateType = userDerateType;
		this.isDerate = isDerate;
		this.userMonFee = userMonFee;
		this.derateFee = derateFee;
		this.derateScale = derateScale;
		this.replenishmentFee = replenishmentFee;
		this.feeStartTime = feeStartTime;
		this.lastPayTime = lastPayTime;
		this.derateStartTime = derateStartTime;
		this.derateEndTime = derateEndTime;
		this.derateType = derateType;
	}

	// Property accessors
	@Id
	@Column(name = "USER_ID", unique = true, nullable = false, length = 16)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "ORG_CODE", nullable = false, length = 30)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Column(name = "USER_TYPE", length = 1)
	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Column(name = "USER_INCOME", precision = 20)
	public Double getUserIncome() {
		return this.userIncome;
	}

	public void setUserIncome(Double userIncome) {
		this.userIncome = userIncome;
	}

	@Column(name = "USER_DERATE_TYPE", length = 1)
	public String getUserDerateType() {
		return this.userDerateType;
	}

	public void setUserDerateType(String userDerateType) {
		this.userDerateType = userDerateType;
	}

	@Column(name = "IS_DERATE", length = 1)
	public String getIsDerate() {
		return this.isDerate;
	}

	public void setIsDerate(String isDerate) {
		this.isDerate = isDerate;
	}

	@Column(name = "USER_MON_FEE", precision = 20)
	public Double getUserMonFee() {
		return this.userMonFee;
	}

	public void setUserMonFee(Double userMonFee) {
		this.userMonFee = userMonFee;
	}

	@Column(name = "DERATE_FEE", precision = 20)
	public Double getDerateFee() {
		return this.derateFee;
	}

	public void setDerateFee(Double derateFee) {
		this.derateFee = derateFee;
	}

	@Column(name = "DERATE_SCALE", precision = 20)
	public Double getDerateScale() {
		return this.derateScale;
	}

	public void setDerateScale(Double derateScale) {
		this.derateScale = derateScale;
	}

	@Column(name = "REPLENISHMENT_FEE", precision = 20)
	public Double getReplenishmentFee() {
		return this.replenishmentFee;
	}

	public void setReplenishmentFee(Double replenishmentFee) {
		this.replenishmentFee = replenishmentFee;
	}

	@Column(name = "FEE_START_TIME", length = 7)
	public Timestamp getFeeStartTime() {
		return this.feeStartTime;
	}

	public void setFeeStartTime(Timestamp feeStartTime) {
		this.feeStartTime = feeStartTime;
	}

	@Column(name = "LAST_PAY_TIME", length = 7)
	public Timestamp getLastPayTime() {
		return this.lastPayTime;
	}

	public void setLastPayTime(Timestamp lastPayTime) {
		this.lastPayTime = lastPayTime;
	}

	@Column(name = "DERATE_START_TIME", length = 7)
	public Timestamp getDerateStartTime() {
		return this.derateStartTime;
	}

	public void setDerateStartTime(Timestamp derateStartTime) {
		this.derateStartTime = derateStartTime;
	}

	@Column(name = "DERATE_END_TIME", length = 7)
	public Timestamp getDerateEndTime() {
		return this.derateEndTime;
	}

	public void setDerateEndTime(Timestamp derateEndTime) {
		this.derateEndTime = derateEndTime;
	}

	@Column(name = "DERATE_TYPE", length = 1)
	public String getDerateType() {
		return this.derateType;
	}

	public void setDerateType(String derateType) {
		this.derateType = derateType;
	}

}