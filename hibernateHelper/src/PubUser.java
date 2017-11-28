// default package

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * PubUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_USER")
public class PubUser implements java.io.Serializable {

	// Fields

	private String userId;
	private String orgCode;
	private String loginName;
	private String userName;
	private String userPassword;
	private String email;
	private String mobilePhone;
	private String isValid;
	private String userLevel;
	private String userCode;
	private String idCard;
	private String nation;
	private Date birthday;
	private String birthplace;
	private String address;
	private String qq;
	private String weChat;
	private String graduateCollege;
	private String education;
	private String major;
	private String userCategory;
	private Date probationaryDate;
	private Date officialDate;
	private Date enterDate;
	private String photo;
	private String firstContactor;
	private String firstContactPhone;
	private String userResume;
	private String innerJob;
	private String outerJob;
	private String linkOrg;
	private String linkType;
	private String postcode;
	private String isFloating;
	private String isCertified;
	private String hasFlowCert;
	private String flowTo;
	private String flowToName;
	private String orgUnit;
	private String domicilePlace;
	private String nativePlace;
	private String recUnitType;
	private Double taxWage;
	private String isActivation;
	private String hasOrg;
	private String certifyWays;
	private String isInfoEnough;
	private String eduDegree;
	private String gender;
	private String taxWageStatus;
	private String unitName;
	private String unitAddress;
	private Date probDateBak;
	private Date updateTime;
	private String job;
	private String partyStatus;
	private String addressPre;
	private String isDisconnect;
	private Date disconnectTime;
	private String combinedOrg;
	private String telephone;
	private String isCombined;
	private Date eduStart;
	private Date eduEnd;
	private Date jobStart;
	private Date jobEnd;
	private String flowCard;
	private String careInfo;
	private String proof;
	private String proofResult;
	private String secretType;
	private String cadreType;
	private String userTitle;
	private Integer userNum;
	private String isSetFee;
	private String isRepresent;
	private Integer representTerm;
	private String representLevel;
	private Date representStart;
	private Date representEnd;

	// 额外添加的字段 在新生成的实体类中要记得补上
	boolean fromDw;
	
	// Constructors

	/** default constructor */
	public PubUser() {
	}

	/** minimal constructor */
	public PubUser(String userId, String orgCode, String loginName,
			String userName) {
		this.userId = userId;
		this.orgCode = orgCode;
		this.loginName = loginName;
		this.userName = userName;
	}

	/** full constructor */
	public PubUser(String userId, String orgCode, String loginName,
			String userName, String userPassword, String email,
			String mobilePhone, String isValid, String userLevel,
			String userCode, String idCard, String nation, Date birthday,
			String birthplace, String address, String qq, String weChat,
			String graduateCollege, String education, String major,
			String userCategory, Date probationaryDate,
			Date officialDate, Date enterDate, String photo,
			String firstContactor, String firstContactPhone, String userResume,
			String innerJob, String outerJob, String linkOrg, String linkType,
			String postcode, String isFloating, String isCertified,
			String hasFlowCert, String flowTo, String flowToName,
			String orgUnit, String domicilePlace, String nativePlace,
			String recUnitType, Double taxWage, String isActivation,
			String hasOrg, String certifyWays, String isInfoEnough,
			String eduDegree, String gender, String taxWageStatus,
			String unitName, String unitAddress, Date probDateBak,
			Date updateTime, String job, String partyStatus,
			String addressPre, String isDisconnect, Date disconnectTime,
			String combinedOrg, String telephone, String isCombined,
			Date eduStart, Date eduEnd, Date jobStart,
			Date jobEnd, String flowCard, String careInfo, String proof,
			String proofResult, String secretType, String cadreType,
			String userTitle, Integer userNum, String isSetFee,
			String isRepresent, Integer representTerm, String representLevel,
			Date representStart, Date representEnd) {
		this.userId = userId;
		this.orgCode = orgCode;
		this.loginName = loginName;
		this.userName = userName;
		this.userPassword = userPassword;
		this.email = email;
		this.mobilePhone = mobilePhone;
		this.isValid = isValid;
		this.userLevel = userLevel;
		this.userCode = userCode;
		this.idCard = idCard;
		this.nation = nation;
		this.birthday = birthday;
		this.birthplace = birthplace;
		this.address = address;
		this.qq = qq;
		this.weChat = weChat;
		this.graduateCollege = graduateCollege;
		this.education = education;
		this.major = major;
		this.userCategory = userCategory;
		this.probationaryDate = probationaryDate;
		this.officialDate = officialDate;
		this.enterDate = enterDate;
		this.photo = photo;
		this.firstContactor = firstContactor;
		this.firstContactPhone = firstContactPhone;
		this.userResume = userResume;
		this.innerJob = innerJob;
		this.outerJob = outerJob;
		this.linkOrg = linkOrg;
		this.linkType = linkType;
		this.postcode = postcode;
		this.isFloating = isFloating;
		this.isCertified = isCertified;
		this.hasFlowCert = hasFlowCert;
		this.flowTo = flowTo;
		this.flowToName = flowToName;
		this.orgUnit = orgUnit;
		this.domicilePlace = domicilePlace;
		this.nativePlace = nativePlace;
		this.recUnitType = recUnitType;
		this.taxWage = taxWage;
		this.isActivation = isActivation;
		this.hasOrg = hasOrg;
		this.certifyWays = certifyWays;
		this.isInfoEnough = isInfoEnough;
		this.eduDegree = eduDegree;
		this.gender = gender;
		this.taxWageStatus = taxWageStatus;
		this.unitName = unitName;
		this.unitAddress = unitAddress;
		this.probDateBak = probDateBak;
		this.updateTime = updateTime;
		this.job = job;
		this.partyStatus = partyStatus;
		this.addressPre = addressPre;
		this.isDisconnect = isDisconnect;
		this.disconnectTime = disconnectTime;
		this.combinedOrg = combinedOrg;
		this.telephone = telephone;
		this.isCombined = isCombined;
		this.eduStart = eduStart;
		this.eduEnd = eduEnd;
		this.jobStart = jobStart;
		this.jobEnd = jobEnd;
		this.flowCard = flowCard;
		this.careInfo = careInfo;
		this.proof = proof;
		this.proofResult = proofResult;
		this.secretType = secretType;
		this.cadreType = cadreType;
		this.userTitle = userTitle;
		this.userNum = userNum;
		this.isSetFee = isSetFee;
		this.isRepresent = isRepresent;
		this.representTerm = representTerm;
		this.representLevel = representLevel;
		this.representStart = representStart;
		this.representEnd = representEnd;
		
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

	@Column(name = "LOGIN_NAME", nullable = false, length = 64)
	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Column(name = "USER_NAME", nullable = false)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_PASSWORD")
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "MOBILE_PHONE")
	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	@Column(name = "IS_VALID", length = 1)
	public String getIsValid() {
		return this.isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	@Column(name = "USER_LEVEL", length = 2)
	public String getUserLevel() {
		return this.userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

	@Column(name = "USER_CODE", length = 64)
	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	@Column(name = "ID_CARD", length = 18)
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
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

	@Column(name = "ADDRESS")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "QQ", length = 16)
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "WE_CHAT", length = 64)
	public String getWeChat() {
		return this.weChat;
	}

	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}

	@Column(name = "GRADUATE_COLLEGE")
	public String getGraduateCollege() {
		return this.graduateCollege;
	}

	public void setGraduateCollege(String graduateCollege) {
		this.graduateCollege = graduateCollege;
	}

	@Column(name = "EDUCATION", length = 2)
	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Column(name = "MAJOR")
	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Column(name = "USER_CATEGORY", length = 2)
	public String getUserCategory() {
		return this.userCategory;
	}

	public void setUserCategory(String userCategory) {
		this.userCategory = userCategory;
	}

	@Column(name = "PROBATIONARY_DATE", length = 7)
	public Date getProbationaryDate() {
		return this.probationaryDate;
	}

	public void setProbationaryDate(Date probationaryDate) {
		this.probationaryDate = probationaryDate;
	}

	@Column(name = "OFFICIAL_DATE", length = 7)
	public Date getOfficialDate() {
		return this.officialDate;
	}

	public void setOfficialDate(Date officialDate) {
		this.officialDate = officialDate;
	}

	@Column(name = "ENTER_DATE", length = 7)
	public Date getEnterDate() {
		return this.enterDate;
	}

	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}

	@Column(name = "PHOTO", length = 16)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "FIRST_CONTACTOR", length = 32)
	public String getFirstContactor() {
		return this.firstContactor;
	}

	public void setFirstContactor(String firstContactor) {
		this.firstContactor = firstContactor;
	}

	@Column(name = "FIRST_CONTACT_PHONE")
	public String getFirstContactPhone() {
		return this.firstContactPhone;
	}

	public void setFirstContactPhone(String firstContactPhone) {
		this.firstContactPhone = firstContactPhone;
	}

	@Column(name = "USER_RESUME", length = 2000)
	public String getUserResume() {
		return this.userResume;
	}

	public void setUserResume(String userResume) {
		this.userResume = userResume;
	}

	@Column(name = "INNER_JOB")
	public String getInnerJob() {
		return this.innerJob;
	}

	public void setInnerJob(String innerJob) {
		this.innerJob = innerJob;
	}

	@Column(name = "OUTER_JOB")
	public String getOuterJob() {
		return this.outerJob;
	}

	public void setOuterJob(String outerJob) {
		this.outerJob = outerJob;
	}

	@Column(name = "LINK_ORG", length = 30)
	public String getLinkOrg() {
		return this.linkOrg;
	}

	public void setLinkOrg(String linkOrg) {
		this.linkOrg = linkOrg;
	}

	@Column(name = "LINK_TYPE", length = 2)
	public String getLinkType() {
		return this.linkType;
	}

	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

	@Column(name = "POSTCODE", length = 6)
	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Column(name = "IS_FLOATING", length = 1)
	public String getIsFloating() {
		return this.isFloating;
	}

	public void setIsFloating(String isFloating) {
		this.isFloating = isFloating;
	}

	@Column(name = "IS_CERTIFIED", length = 1)
	public String getIsCertified() {
		return this.isCertified;
	}

	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}

	@Column(name = "HAS_FLOW_CERT", length = 1)
	public String getHasFlowCert() {
		return this.hasFlowCert;
	}

	public void setHasFlowCert(String hasFlowCert) {
		this.hasFlowCert = hasFlowCert;
	}

	@Column(name = "FLOW_TO", length = 16)
	public String getFlowTo() {
		return this.flowTo;
	}

	public void setFlowTo(String flowTo) {
		this.flowTo = flowTo;
	}

	@Column(name = "FLOW_TO_NAME")
	public String getFlowToName() {
		return this.flowToName;
	}

	public void setFlowToName(String flowToName) {
		this.flowToName = flowToName;
	}

	@Column(name = "ORG_UNIT")
	public String getOrgUnit() {
		return this.orgUnit;
	}

	public void setOrgUnit(String orgUnit) {
		this.orgUnit = orgUnit;
	}

	@Column(name = "DOMICILE_PLACE")
	public String getDomicilePlace() {
		return this.domicilePlace;
	}

	public void setDomicilePlace(String domicilePlace) {
		this.domicilePlace = domicilePlace;
	}

	@Column(name = "NATIVE_PLACE")
	public String getNativePlace() {
		return this.nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	@Column(name = "REC_UNIT_TYPE", length = 16)
	public String getRecUnitType() {
		return this.recUnitType;
	}

	public void setRecUnitType(String recUnitType) {
		this.recUnitType = recUnitType;
	}

	@Column(name = "TAX_WAGE", precision = 20)
	public Double getTaxWage() {
		return this.taxWage;
	}

	public void setTaxWage(Double taxWage) {
		this.taxWage = taxWage;
	}

	@Column(name = "IS_ACTIVATION", length = 1)
	public String getIsActivation() {
		return this.isActivation;
	}

	public void setIsActivation(String isActivation) {
		this.isActivation = isActivation;
	}

	@Column(name = "HAS_ORG", length = 1)
	public String getHasOrg() {
		return this.hasOrg;
	}

	public void setHasOrg(String hasOrg) {
		this.hasOrg = hasOrg;
	}

	@Column(name = "CERTIFY_WAYS", length = 8)
	public String getCertifyWays() {
		return this.certifyWays;
	}

	public void setCertifyWays(String certifyWays) {
		this.certifyWays = certifyWays;
	}

	@Column(name = "IS_INFO_ENOUGH", length = 1)
	public String getIsInfoEnough() {
		return this.isInfoEnough;
	}

	public void setIsInfoEnough(String isInfoEnough) {
		this.isInfoEnough = isInfoEnough;
	}

	@Column(name = "EDU_DEGREE")
	public String getEduDegree() {
		return this.eduDegree;
	}

	public void setEduDegree(String eduDegree) {
		this.eduDegree = eduDegree;
	}

	@Column(name = "GENDER", length = 1)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "TAX_WAGE_STATUS", length = 1)
	public String getTaxWageStatus() {
		return this.taxWageStatus;
	}

	public void setTaxWageStatus(String taxWageStatus) {
		this.taxWageStatus = taxWageStatus;
	}

	@Column(name = "UNIT_NAME")
	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Column(name = "UNIT_ADDRESS")
	public String getUnitAddress() {
		return this.unitAddress;
	}

	public void setUnitAddress(String unitAddress) {
		this.unitAddress = unitAddress;
	}

	@Column(name = "PROB_DATE_BAK", length = 7)
	public Date getProbDateBak() {
		return this.probDateBak;
	}

	public void setProbDateBak(Date probDateBak) {
		this.probDateBak = probDateBak;
	}

	@Column(name = "UPDATE_TIME", length = 7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "JOB", length = 6)
	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Column(name = "PARTY_STATUS", length = 1)
	public String getPartyStatus() {
		return this.partyStatus;
	}

	public void setPartyStatus(String partyStatus) {
		this.partyStatus = partyStatus;
	}

	@Column(name = "ADDRESS_PRE", length = 6)
	public String getAddressPre() {
		return this.addressPre;
	}

	public void setAddressPre(String addressPre) {
		this.addressPre = addressPre;
	}

	@Column(name = "IS_DISCONNECT", length = 1)
	public String getIsDisconnect() {
		return this.isDisconnect;
	}

	public void setIsDisconnect(String isDisconnect) {
		this.isDisconnect = isDisconnect;
	}

	@Column(name = "DISCONNECT_TIME", length = 7)
	public Date getDisconnectTime() {
		return this.disconnectTime;
	}

	public void setDisconnectTime(Date disconnectTime) {
		this.disconnectTime = disconnectTime;
	}

	@Column(name = "COMBINED_ORG", length = 256)
	public String getCombinedOrg() {
		return this.combinedOrg;
	}

	public void setCombinedOrg(String combinedOrg) {
		this.combinedOrg = combinedOrg;
	}

	@Column(name = "TELEPHONE", length = 32)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "IS_COMBINED", length = 1)
	public String getIsCombined() {
		return this.isCombined;
	}

	public void setIsCombined(String isCombined) {
		this.isCombined = isCombined;
	}

	@Column(name = "EDU_START", length = 7)
	public Date getEduStart() {
		return this.eduStart;
	}

	public void setEduStart(Date eduStart) {
		this.eduStart = eduStart;
	}

	@Column(name = "EDU_END", length = 7)
	public Date getEduEnd() {
		return this.eduEnd;
	}

	public void setEduEnd(Date eduEnd) {
		this.eduEnd = eduEnd;
	}

	@Column(name = "JOB_START", length = 7)
	public Date getJobStart() {
		return this.jobStart;
	}

	public void setJobStart(Date jobStart) {
		this.jobStart = jobStart;
	}

	@Column(name = "JOB_END", length = 7)
	public Date getJobEnd() {
		return this.jobEnd;
	}

	public void setJobEnd(Date jobEnd) {
		this.jobEnd = jobEnd;
	}

	@Column(name = "FLOW_CARD", length = 32)
	public String getFlowCard() {
		return this.flowCard;
	}

	public void setFlowCard(String flowCard) {
		this.flowCard = flowCard;
	}

	@Column(name = "CARE_INFO", length = 6)
	public String getCareInfo() {
		return this.careInfo;
	}

	public void setCareInfo(String careInfo) {
		this.careInfo = careInfo;
	}

	@Column(name = "PROOF", length = 1)
	public String getProof() {
		return this.proof;
	}

	public void setProof(String proof) {
		this.proof = proof;
	}

	@Column(name = "PROOF_RESULT", length = 1000)
	public String getProofResult() {
		return this.proofResult;
	}

	public void setProofResult(String proofResult) {
		this.proofResult = proofResult;
	}

	@Column(name = "SECRET_TYPE", length = 1)
	public String getSecretType() {
		return this.secretType;
	}

	public void setSecretType(String secretType) {
		this.secretType = secretType;
	}

	@Column(name = "CADRE_TYPE", length = 256)
	public String getCadreType() {
		return this.cadreType;
	}

	public void setCadreType(String cadreType) {
		this.cadreType = cadreType;
	}

	@Column(name = "USER_TITLE")
	public String getUserTitle() {
		return this.userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	@Column(name = "USER_NUM", precision = 8, scale = 0)
	public Integer getUserNum() {
		return this.userNum;
	}

	public void setUserNum(Integer userNum) {
		this.userNum = userNum;
	}

	@Column(name = "IS_SET_FEE", length = 1)
	public String getIsSetFee() {
		return this.isSetFee;
	}

	public void setIsSetFee(String isSetFee) {
		this.isSetFee = isSetFee;
	}

	@Column(name = "IS_REPRESENT", length = 1)
	public String getIsRepresent() {
		return this.isRepresent;
	}

	public void setIsRepresent(String isRepresent) {
		this.isRepresent = isRepresent;
	}

	@Column(name = "REPRESENT_TERM", precision = 9, scale = 0)
	public Integer getRepresentTerm() {
		return this.representTerm;
	}

	public void setRepresentTerm(Integer representTerm) {
		this.representTerm = representTerm;
	}

	@Column(name = "REPRESENT_LEVEL", length = 8)
	public String getRepresentLevel() {
		return this.representLevel;
	}

	public void setRepresentLevel(String representLevel) {
		this.representLevel = representLevel;
	}

	@Column(name = "REPRESENT_START", length = 7)
	public Date getRepresentStart() {
		return this.representStart;
	}

	public void setRepresentStart(Date representStart) {
		this.representStart = representStart;
	}

	@Column(name = "REPRESENT_END", length = 7)
	public Date getRepresentEnd() {
		return this.representEnd;
	}

	public void setRepresentEnd(Date representEnd) {
		this.representEnd = representEnd;
	}
	@Transient
	public boolean isFromDw() {
		return fromDw;
	}

	public void setFromDw(boolean fromDw) {
		this.fromDw = fromDw;
	}
}