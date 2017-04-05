package hibernateHelper;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PubUserExtraInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_USER_EXTRA_INFO")
public class PubUserExtraInfo implements java.io.Serializable {

	// Fields

	private String userId;
	private String orgCode;
	private String orgName;
	private String floatingFrom;
	private String flowTo;
	private String flowToOrg;
	private String floatingCardNo;
	private Date floatingTime;
	private String floatingType;
	private String floatingReason;
	private String isCheck;

	// Constructors

	/** default constructor */
	public PubUserExtraInfo() {
	}

	/** minimal constructor */
	public PubUserExtraInfo(String userId) {
		this.userId = userId;
	}

	/** full constructor */
	public PubUserExtraInfo(String userId, String orgCode, String orgName,
			String floatingFrom, String flowTo, String flowToOrg,
			String floatingCardNo, Date floatingTime, String floatingType,
			String floatingReason, String isCheck) {
		this.userId = userId;
		this.orgCode = orgCode;
		this.orgName = orgName;
		this.floatingFrom = floatingFrom;
		this.flowTo = flowTo;
		this.flowToOrg = flowToOrg;
		this.floatingCardNo = floatingCardNo;
		this.floatingTime = floatingTime;
		this.floatingType = floatingType;
		this.floatingReason = floatingReason;
		this.isCheck = isCheck;
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

	@Column(name = "ORG_CODE", length = 30)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Column(name = "ORG_NAME", length = 256)
	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	@Column(name = "FLOATING_FROM", length = 6)
	public String getFloatingFrom() {
		return this.floatingFrom;
	}

	public void setFloatingFrom(String floatingFrom) {
		this.floatingFrom = floatingFrom;
	}

	@Column(name = "FLOW_TO", length = 6)
	public String getFlowTo() {
		return this.flowTo;
	}

	public void setFlowTo(String flowTo) {
		this.flowTo = flowTo;
	}

	@Column(name = "FLOW_TO_ORG", length = 30)
	public String getFlowToOrg() {
		return this.flowToOrg;
	}

	public void setFlowToOrg(String flowToOrg) {
		this.flowToOrg = flowToOrg;
	}

	@Column(name = "FLOATING_CARD_NO", length = 128)
	public String getFloatingCardNo() {
		return this.floatingCardNo;
	}

	public void setFloatingCardNo(String floatingCardNo) {
		this.floatingCardNo = floatingCardNo;
	}

	@Column(name = "FLOATING_TIME", length = 7)
	public Date getFloatingTime() {
		return this.floatingTime;
	}

	public void setFloatingTime(Date floatingTime) {
		this.floatingTime = floatingTime;
	}

	@Column(name = "FLOATING_TYPE", length = 2)
	public String getFloatingType() {
		return this.floatingType;
	}

	public void setFloatingType(String floatingType) {
		this.floatingType = floatingType;
	}

	@Column(name = "FLOATING_REASON", length = 8)
	public String getFloatingReason() {
		return this.floatingReason;
	}

	public void setFloatingReason(String floatingReason) {
		this.floatingReason = floatingReason;
	}

	@Column(name = "IS_CHECK", length = 1)
	public String getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}

}