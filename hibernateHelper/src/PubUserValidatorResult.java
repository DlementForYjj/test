// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PubUserValidatorResult entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_USER_VALIDATOR_RESULT", schema = "PARTY")
public class PubUserValidatorResult implements java.io.Serializable {

	// Fields

	private String dataId;
	private String userId;
	private Timestamp calDate;
	private String orgCode;
	private String errorTypes;
	private String proofResult;
	private Timestamp calTime;
	private String userCategory;

	// Constructors

	/** default constructor */
	public PubUserValidatorResult() {
	}

	/** minimal constructor */
	public PubUserValidatorResult(String dataId) {
		this.dataId = dataId;
	}

	/** full constructor */
	public PubUserValidatorResult(String dataId, String userId,
			Timestamp calDate, String orgCode, String errorTypes,
			String proofResult, Timestamp calTime, String userCategory) {
		this.dataId = dataId;
		this.userId = userId;
		this.calDate = calDate;
		this.orgCode = orgCode;
		this.errorTypes = errorTypes;
		this.proofResult = proofResult;
		this.calTime = calTime;
		this.userCategory = userCategory;
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

	@Column(name = "CAL_DATE", length = 7)
	public Timestamp getCalDate() {
		return this.calDate;
	}

	public void setCalDate(Timestamp calDate) {
		this.calDate = calDate;
	}

	@Column(name = "ORG_CODE", length = 30)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Column(name = "ERROR_TYPES", length = 1000)
	public String getErrorTypes() {
		return this.errorTypes;
	}

	public void setErrorTypes(String errorTypes) {
		this.errorTypes = errorTypes;
	}

	@Column(name = "PROOF_RESULT", length = 4000)
	public String getProofResult() {
		return this.proofResult;
	}

	public void setProofResult(String proofResult) {
		this.proofResult = proofResult;
	}

	@Column(name = "CAL_TIME", length = 7)
	public Timestamp getCalTime() {
		return this.calTime;
	}

	public void setCalTime(Timestamp calTime) {
		this.calTime = calTime;
	}

	@Column(name = "USER_CATEGORY", length = 2)
	public String getUserCategory() {
		return this.userCategory;
	}

	public void setUserCategory(String userCategory) {
		this.userCategory = userCategory;
	}

}