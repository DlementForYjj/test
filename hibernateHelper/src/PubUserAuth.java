// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PubUserAuth entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_USER_AUTH")
public class PubUserAuth implements java.io.Serializable {

	// Fields

	private String userId;
	private String userPwd;
	private String dfishUserId;
	private String pwdStatus;
	private String isActivation;
	private String isValid;

	// Constructors

	/** default constructor */
	public PubUserAuth() {
	}

	/** minimal constructor */
	public PubUserAuth(String userId) {
		this.userId = userId;
	}

	/** full constructor */
	public PubUserAuth(String userId, String userPwd, String dfishUserId,
			String pwdStatus, String isActivation, String isValid) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.dfishUserId = dfishUserId;
		this.pwdStatus = pwdStatus;
		this.isActivation = isActivation;
		this.isValid = isValid;
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

	@Column(name = "USER_PWD")
	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	@Column(name = "DFISH_USER_ID", length = 16)
	public String getDfishUserId() {
		return this.dfishUserId;
	}

	public void setDfishUserId(String dfishUserId) {
		this.dfishUserId = dfishUserId;
	}

	@Column(name = "PWD_STATUS", length = 1)
	public String getPwdStatus() {
		return this.pwdStatus;
	}

	public void setPwdStatus(String pwdStatus) {
		this.pwdStatus = pwdStatus;
	}

	@Column(name = "IS_ACTIVATION", length = 1)
	public String getIsActivation() {
		return this.isActivation;
	}

	public void setIsActivation(String isActivation) {
		this.isActivation = isActivation;
	}

	@Column(name = "IS_VALID", length = 1)
	public String getIsValid() {
		return this.isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

}