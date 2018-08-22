// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PubUserValidatorConfig entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_USER_VALIDATOR_CONFIG")
public class PubUserValidatorConfig implements java.io.Serializable {

	// Fields

	private String errorType;
	private String errorRemark;
	private String isAble;

	// Constructors

	/** default constructor */
	public PubUserValidatorConfig() {
	}

	/** minimal constructor */
	public PubUserValidatorConfig(String errorType) {
		this.errorType = errorType;
	}

	/** full constructor */
	public PubUserValidatorConfig(String errorType, String errorRemark,
			String isAble) {
		this.errorType = errorType;
		this.errorRemark = errorRemark;
		this.isAble = isAble;
	}

	// Property accessors
	@Id
	@Column(name = "ERROR_TYPE", unique = true, nullable = false, length = 32)
	public String getErrorType() {
		return this.errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	@Column(name = "ERROR_REMARK", length = 1000)
	public String getErrorRemark() {
		return this.errorRemark;
	}

	public void setErrorRemark(String errorRemark) {
		this.errorRemark = errorRemark;
	}

	@Column(name = "IS_ABLE", length = 1)
	public String getIsAble() {
		return this.isAble;
	}

	public void setIsAble(String isAble) {
		this.isAble = isAble;
	}

}