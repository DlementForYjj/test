package hibernateHelper;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FloatingInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FLOATING_INFO")
public class FloatingInfo implements java.io.Serializable {

	// Fields

	private String floatingId;
	private String userId;
	private String orgCode;
	private String orgName;
	private String userName;
	private String idCard;
	private String gender;
	private String nation;
	private Date birthday;
	private String birthplace;
	private String mobilePhone;
	private String linkOrgCode;
	private String floatingCardNo;
	private String floatingFrom;
	private String floatingTo;
	private String floatingReason;
	private String floatingType;
	private Date floatingTime;
	private String floatingStatus;
	private String approveStatus;
	private String approveUser;
	private Date registTime;
	private Date cancelTime;
	private String flowCode;
	private String flowNode;
	private String flowOrgCode;

	// Constructors

	/** default constructor */
	public FloatingInfo() {
	}

	/** minimal constructor */
	public FloatingInfo(String floatingId) {
		this.floatingId = floatingId;
	}

	/** full constructor */
	public FloatingInfo(String floatingId, String userId, String orgCode,
			String orgName, String userName, String idCard, String gender,
			String nation, Date birthday, String birthplace,
			String mobilePhone, String linkOrgCode, String floatingCardNo,
			String floatingFrom, String floatingTo, String floatingReason,
			String floatingType, Date floatingTime, String floatingStatus,
			String approveStatus, String approveUser, Date registTime,
			Date cancelTime, String flowCode, String flowNode,
			String flowOrgCode) {
		this.floatingId = floatingId;
		this.userId = userId;
		this.orgCode = orgCode;
		this.orgName = orgName;
		this.userName = userName;
		this.idCard = idCard;
		this.gender = gender;
		this.nation = nation;
		this.birthday = birthday;
		this.birthplace = birthplace;
		this.mobilePhone = mobilePhone;
		this.linkOrgCode = linkOrgCode;
		this.floatingCardNo = floatingCardNo;
		this.floatingFrom = floatingFrom;
		this.floatingTo = floatingTo;
		this.floatingReason = floatingReason;
		this.floatingType = floatingType;
		this.floatingTime = floatingTime;
		this.floatingStatus = floatingStatus;
		this.approveStatus = approveStatus;
		this.approveUser = approveUser;
		this.registTime = registTime;
		this.cancelTime = cancelTime;
		this.flowCode = flowCode;
		this.flowNode = flowNode;
		this.flowOrgCode = flowOrgCode;
	}

	// Property accessors
	@Id
	@Column(name = "FLOATING_ID", unique = true, nullable = false, length = 16)
	public String getFloatingId() {
		return this.floatingId;
	}

	public void setFloatingId(String floatingId) {
		this.floatingId = floatingId;
	}

	@Column(name = "USER_ID", length = 16)
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

	@Column(name = "ORG_NAME")
	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	@Column(name = "USER_NAME", length = 128)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "ID_CARD", length = 128)
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Column(name = "GENDER", length = 1)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "NATION", length = 2)
	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Column(name = "BIRTHDAY", length = 7)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "BIRTHPLACE", length = 6)
	public String getBirthplace() {
		return this.birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	@Column(name = "MOBILE_PHONE", length = 128)
	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	@Column(name = "LINK_ORG_CODE", length = 30)
	public String getLinkOrgCode() {
		return this.linkOrgCode;
	}

	public void setLinkOrgCode(String linkOrgCode) {
		this.linkOrgCode = linkOrgCode;
	}

	@Column(name = "FLOATING_CARD_NO", length = 128)
	public String getFloatingCardNo() {
		return this.floatingCardNo;
	}

	public void setFloatingCardNo(String floatingCardNo) {
		this.floatingCardNo = floatingCardNo;
	}

	@Column(name = "FLOATING_FROM", length = 6)
	public String getFloatingFrom() {
		return this.floatingFrom;
	}

	public void setFloatingFrom(String floatingFrom) {
		this.floatingFrom = floatingFrom;
	}

	@Column(name = "FLOATING_TO", length = 6)
	public String getFloatingTo() {
		return this.floatingTo;
	}

	public void setFloatingTo(String floatingTo) {
		this.floatingTo = floatingTo;
	}

	@Column(name = "FLOATING_REASON", length = 8)
	public String getFloatingReason() {
		return this.floatingReason;
	}

	public void setFloatingReason(String floatingReason) {
		this.floatingReason = floatingReason;
	}

	@Column(name = "FLOATING_TYPE", length = 2)
	public String getFloatingType() {
		return this.floatingType;
	}

	public void setFloatingType(String floatingType) {
		this.floatingType = floatingType;
	}

	@Column(name = "FLOATING_TIME", length = 7)
	public Date getFloatingTime() {
		return this.floatingTime;
	}

	public void setFloatingTime(Date floatingTime) {
		this.floatingTime = floatingTime;
	}

	@Column(name = "FLOATING_STATUS", length = 1)
	public String getFloatingStatus() {
		return this.floatingStatus;
	}

	public void setFloatingStatus(String floatingStatus) {
		this.floatingStatus = floatingStatus;
	}

	@Column(name = "APPROVE_STATUS", length = 1)
	public String getApproveStatus() {
		return this.approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	@Column(name = "APPROVE_USER", length = 16)
	public String getApproveUser() {
		return this.approveUser;
	}

	public void setApproveUser(String approveUser) {
		this.approveUser = approveUser;
	}

	@Column(name = "REGIST_TIME", length = 7)
	public Date getRegistTime() {
		return this.registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	@Column(name = "CANCEL_TIME", length = 7)
	public Date getCancelTime() {
		return this.cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	@Column(name = "FLOW_CODE", length = 32)
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

	@Column(name = "FLOW_ORG_CODE", length = 64)
	public String getFlowOrgCode() {
		return this.flowOrgCode;
	}

	public void setFlowOrgCode(String flowOrgCode) {
		this.flowOrgCode = flowOrgCode;
	}

}