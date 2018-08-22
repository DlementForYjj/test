// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MemTran entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "MEM_TRAN")
public class MemTran implements java.io.Serializable {

	// Fields

	private String dataId;
	private String letterNumber;
	private String userId;
	private String agentUser;
	private String originalOrg;
	private String receiveOrg;
	private Date applyTime;
	private Date sendTime;
	private String applyStatus;
	private String applyReason;
	private String flowCode;
	private String flowNode;
	private String flowOrgCode;
	private String originalOrgName;
	private String receiveOrgName;
	private String userName;
	private String userGender;
	private Integer userAge;
	private String userNation;
	private String userCategory;
	private String paidDuesTime;
	private Integer validDays;
	private String userContact;
	private String originalOrgAddress;
	private String originalOrgContact;
	private String originalOrgFax;
	private String receiveUser;
	private String receiveUserContact;
	private Date reportTime;
	private String reportContent;
	private String originalPostCode;
	private String receiveMostOrgName;
	private String originalMostOrgName;
	private String idCard;
	private String receipt;
	private Date receiveTime;
	private boolean remindNum;
	private String oldRecOrg;
	private String orgRegion;
	private String transferId;
	private String reportWay;
	private String remarks;
	private String confirmMan;
	private String handleInfo;

	// Constructors

	/** default constructor */
	public MemTran() {
	}

	/** minimal constructor */
	public MemTran(String dataId, String userId) {
		this.dataId = dataId;
		this.userId = userId;
	}

	/** full constructor */
	public MemTran(String dataId, String letterNumber, String userId,
			String agentUser, String originalOrg, String receiveOrg,
			Date applyTime, Date sendTime, String applyStatus,
			String applyReason, String flowCode, String flowNode,
			String flowOrgCode, String originalOrgName, String receiveOrgName,
			String userName, String userGender, Integer userAge,
			String userNation, String userCategory, String paidDuesTime,
			Integer validDays, String userContact, String originalOrgAddress,
			String originalOrgContact, String originalOrgFax,
			String receiveUser, String receiveUserContact,
			Date reportTime, String reportContent,
			String originalPostCode, String receiveMostOrgName,
			String originalMostOrgName, String idCard, String receipt,
			Date receiveTime, Boolean remindNum, String oldRecOrg,
			String orgRegion, String transferId, String reportWay,
			String remarks, String confirmMan, String handleInfo) {
		this.dataId = dataId;
		this.letterNumber = letterNumber;
		this.userId = userId;
		this.agentUser = agentUser;
		this.originalOrg = originalOrg;
		this.receiveOrg = receiveOrg;
		this.applyTime = applyTime;
		this.sendTime = sendTime;
		this.applyStatus = applyStatus;
		this.applyReason = applyReason;
		this.flowCode = flowCode;
		this.flowNode = flowNode;
		this.flowOrgCode = flowOrgCode;
		this.originalOrgName = originalOrgName;
		this.receiveOrgName = receiveOrgName;
		this.userName = userName;
		this.userGender = userGender;
		this.userAge = userAge;
		this.userNation = userNation;
		this.userCategory = userCategory;
		this.paidDuesTime = paidDuesTime;
		this.validDays = validDays;
		this.userContact = userContact;
		this.originalOrgAddress = originalOrgAddress;
		this.originalOrgContact = originalOrgContact;
		this.originalOrgFax = originalOrgFax;
		this.receiveUser = receiveUser;
		this.receiveUserContact = receiveUserContact;
		this.reportTime = reportTime;
		this.reportContent = reportContent;
		this.originalPostCode = originalPostCode;
		this.receiveMostOrgName = receiveMostOrgName;
		this.originalMostOrgName = originalMostOrgName;
		this.idCard = idCard;
		this.receipt = receipt;
		this.receiveTime = receiveTime;
		this.remindNum = remindNum;
		this.oldRecOrg = oldRecOrg;
		this.orgRegion = orgRegion;
		this.transferId = transferId;
		this.reportWay = reportWay;
		this.remarks = remarks;
		this.confirmMan = confirmMan;
		this.handleInfo = handleInfo;
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

	@Column(name = "LETTER_NUMBER", length = 50)
	public String getLetterNumber() {
		return this.letterNumber;
	}

	public void setLetterNumber(String letterNumber) {
		this.letterNumber = letterNumber;
	}

	@Column(name = "USER_ID", nullable = false, length = 16)
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

	@Column(name = "ORIGINAL_ORG", length = 30)
	public String getOriginalOrg() {
		return this.originalOrg;
	}

	public void setOriginalOrg(String originalOrg) {
		this.originalOrg = originalOrg;
	}

	@Column(name = "RECEIVE_ORG", length = 30)
	public String getReceiveOrg() {
		return this.receiveOrg;
	}

	public void setReceiveOrg(String receiveOrg) {
		this.receiveOrg = receiveOrg;
	}

	@Column(name = "APPLY_TIME", length = 7)
	public Date getApplyTime() {
		return this.applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	@Column(name = "SEND_TIME", length = 7)
	public Date getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	@Column(name = "APPLY_STATUS", length = 1)
	public String getApplyStatus() {
		return this.applyStatus;
	}

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	@Column(name = "APPLY_REASON", length = 2000)
	public String getApplyReason() {
		return this.applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	@Column(name = "FLOW_CODE")
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

	@Column(name = "FLOW_ORG_CODE", length = 32)
	public String getFlowOrgCode() {
		return this.flowOrgCode;
	}

	public void setFlowOrgCode(String flowOrgCode) {
		this.flowOrgCode = flowOrgCode;
	}

	@Column(name = "ORIGINAL_ORG_NAME")
	public String getOriginalOrgName() {
		return this.originalOrgName;
	}

	public void setOriginalOrgName(String originalOrgName) {
		this.originalOrgName = originalOrgName;
	}

	@Column(name = "RECEIVE_ORG_NAME")
	public String getReceiveOrgName() {
		return this.receiveOrgName;
	}

	public void setReceiveOrgName(String receiveOrgName) {
		this.receiveOrgName = receiveOrgName;
	}

	@Column(name = "USER_NAME")
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_GENDER", length = 2)
	public String getUserGender() {
		return this.userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	@Column(name = "USER_AGE", precision = 9, scale = 0)
	public Integer getUserAge() {
		return this.userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	@Column(name = "USER_NATION", length = 16)
	public String getUserNation() {
		return this.userNation;
	}

	public void setUserNation(String userNation) {
		this.userNation = userNation;
	}

	@Column(name = "USER_CATEGORY", length = 16)
	public String getUserCategory() {
		return this.userCategory;
	}

	public void setUserCategory(String userCategory) {
		this.userCategory = userCategory;
	}

	@Column(name = "PAID_DUES_TIME", length = 32)
	public String getPaidDuesTime() {
		return this.paidDuesTime;
	}

	public void setPaidDuesTime(String paidDuesTime) {
		this.paidDuesTime = paidDuesTime;
	}

	@Column(name = "VALID_DAYS", precision = 9, scale = 0)
	public Integer getValidDays() {
		return this.validDays;
	}

	public void setValidDays(Integer validDays) {
		this.validDays = validDays;
	}

	@Column(name = "USER_CONTACT")
	public String getUserContact() {
		return this.userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	@Column(name = "ORIGINAL_ORG_ADDRESS")
	public String getOriginalOrgAddress() {
		return this.originalOrgAddress;
	}

	public void setOriginalOrgAddress(String originalOrgAddress) {
		this.originalOrgAddress = originalOrgAddress;
	}

	@Column(name = "ORIGINAL_ORG_CONTACT", length = 128)
	public String getOriginalOrgContact() {
		return this.originalOrgContact;
	}

	public void setOriginalOrgContact(String originalOrgContact) {
		this.originalOrgContact = originalOrgContact;
	}

	@Column(name = "ORIGINAL_ORG_FAX", length = 64)
	public String getOriginalOrgFax() {
		return this.originalOrgFax;
	}

	public void setOriginalOrgFax(String originalOrgFax) {
		this.originalOrgFax = originalOrgFax;
	}

	@Column(name = "RECEIVE_USER")
	public String getReceiveUser() {
		return this.receiveUser;
	}

	public void setReceiveUser(String receiveUser) {
		this.receiveUser = receiveUser;
	}

	@Column(name = "RECEIVE_USER_CONTACT")
	public String getReceiveUserContact() {
		return this.receiveUserContact;
	}

	public void setReceiveUserContact(String receiveUserContact) {
		this.receiveUserContact = receiveUserContact;
	}

	@Column(name = "REPORT_TIME", length = 7)
	public Date getReportTime() {
		return this.reportTime;
	}

	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	@Column(name = "REPORT_CONTENT", length = 2000)
	public String getReportContent() {
		return this.reportContent;
	}

	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}

	@Column(name = "ORIGINAL_POST_CODE", length = 16)
	public String getOriginalPostCode() {
		return this.originalPostCode;
	}

	public void setOriginalPostCode(String originalPostCode) {
		this.originalPostCode = originalPostCode;
	}

	@Column(name = "RECEIVE_MOST_ORG_NAME")
	public String getReceiveMostOrgName() {
		return this.receiveMostOrgName;
	}

	public void setReceiveMostOrgName(String receiveMostOrgName) {
		this.receiveMostOrgName = receiveMostOrgName;
	}

	@Column(name = "ORIGINAL_MOST_ORG_NAME")
	public String getOriginalMostOrgName() {
		return this.originalMostOrgName;
	}

	public void setOriginalMostOrgName(String originalMostOrgName) {
		this.originalMostOrgName = originalMostOrgName;
	}

	@Column(name = "ID_CARD", length = 128)
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Column(name = "RECEIPT", length = 1)
	public String getReceipt() {
		return this.receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	@Column(name = "RECEIVE_TIME", length = 7)
	public Date getReceiveTime() {
		return this.receiveTime;
	}

	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	@Column(name = "REMIND_NUM", precision = 1, scale = 0)
	public Boolean getRemindNum() {
		return this.remindNum;
	}

	public void setRemindNum(Boolean remindNum) {
		this.remindNum = remindNum;
	}

	@Column(name = "OLD_REC_ORG", length = 30)
	public String getOldRecOrg() {
		return this.oldRecOrg;
	}

	public void setOldRecOrg(String oldRecOrg) {
		this.oldRecOrg = oldRecOrg;
	}

	@Column(name = "ORG_REGION", length = 6)
	public String getOrgRegion() {
		return this.orgRegion;
	}

	public void setOrgRegion(String orgRegion) {
		this.orgRegion = orgRegion;
	}

	@Column(name = "TRANSFER_ID", length = 128)
	public String getTransferId() {
		return this.transferId;
	}

	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}

	@Column(name = "REPORT_WAY", length = 1)
	public String getReportWay() {
		return this.reportWay;
	}

	public void setReportWay(String reportWay) {
		this.reportWay = reportWay;
	}

	@Column(name = "REMARKS", length = 2000)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "CONFIRM_MAN", length = 16)
	public String getConfirmMan() {
		return this.confirmMan;
	}

	public void setConfirmMan(String confirmMan) {
		this.confirmMan = confirmMan;
	}

	@Column(name = "HANDLE_INFO", length = 4000)
	public String getHandleInfo() {
		return this.handleInfo;
	}

	public void setHandleInfo(String handleInfo) {
		this.handleInfo = handleInfo;
	}

}