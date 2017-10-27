// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PubOrganize entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_ORGANIZE")
public class PubOrganize implements java.io.Serializable {

	// Fields

	private String orgCode;
	private String orgName;
	private String orgCategory;
	private String orgRegion;
	private Date foundedDate;
	private Integer memberCount;
	private String secretary;
	private String deputySecretary;
	private String standingMember;
	private String orgLogo;
	private String qq;
	private String weChat;
	private String publicNumber;
	private String orgLocation;
	private String unitName;
	private String contactor;
	private String contactPhone;
	private String orgRemark;
	private String postcode;
	private String accessOrg;
	private String orgStatus;
	private String fax;
	private String orgType;
	private String isFloating;
	private String orgServiceLevel;
	private String isUnited;
	private String orgSeal;
	private Integer linkCount;
	private String orgNumber;
	private String orgPossRelation;
	private String unitIndustry;
	private String unitPossRelation;
	private String unitType;
	private String isMajorUnit;
	private String unitScale;
	private String unitEconType;
	private String legalPersonOrg;
	private String govDeptOrg;
	private String streetCommu;
	private String agencyType;
	private String hasVolunteerTeam;
	private String isInstrConn;
	private String sendInstr;
	private Integer instrCount;
	private String isRestructUnit;
	private String isLegalPersonParty;
	private String isLegalPersonSecr;
	private String floatingArea;
	private String orgProp;
	private String geoHash;
	private String orgSecr;
	private String unitInfo;
	private String unitSameToParent;
	private String unitCreateOrg;
	private String unitCode;
	private String orgCodeGuangdong;
	private String orgCodeNew;
	private String orgJuris;
	private String isCommunity;
	private String hasUnitCode;
	private String orgCategoryNew;
	private String unitCodeReson;
	private String orgProof;
	private String orgProofResult;
	private String isVirtualNode;
	private String isExpedite;

	// Constructors

	/** default constructor */
	public PubOrganize() {
	}

	/** minimal constructor */
	public PubOrganize(String orgCode) {
		this.orgCode = orgCode;
	}

	/** full constructor */
	public PubOrganize(String orgCode, String orgName, String orgCategory,
			String orgRegion, Date foundedDate, Integer memberCount,
			String secretary, String deputySecretary, String standingMember,
			String orgLogo, String qq, String weChat, String publicNumber,
			String orgLocation, String unitName, String contactor,
			String contactPhone, String orgRemark, String postcode,
			String accessOrg, String orgStatus, String fax, String orgType,
			String isFloating, String orgServiceLevel, String isUnited,
			String orgSeal, Integer linkCount, String orgNumber,
			String orgPossRelation, String unitIndustry,
			String unitPossRelation, String unitType, String isMajorUnit,
			String unitScale, String unitEconType, String legalPersonOrg,
			String govDeptOrg, String streetCommu, String agencyType,
			String hasVolunteerTeam, String isInstrConn, String sendInstr,
			Integer instrCount, String isRestructUnit,
			String isLegalPersonParty, String isLegalPersonSecr,
			String floatingArea, String orgProp, String geoHash,
			String orgSecr, String unitInfo, String unitSameToParent,
			String unitCreateOrg, String unitCode, String orgCodeGuangdong,
			String orgCodeNew, String orgJuris, String isCommunity,
			String hasUnitCode, String orgCategoryNew, String unitCodeReson,
			String orgProof, String orgProofResult, String isVirtualNode,
			String isExpedite) {
		this.orgCode = orgCode;
		this.orgName = orgName;
		this.orgCategory = orgCategory;
		this.orgRegion = orgRegion;
		this.foundedDate = foundedDate;
		this.memberCount = memberCount;
		this.secretary = secretary;
		this.deputySecretary = deputySecretary;
		this.standingMember = standingMember;
		this.orgLogo = orgLogo;
		this.qq = qq;
		this.weChat = weChat;
		this.publicNumber = publicNumber;
		this.orgLocation = orgLocation;
		this.unitName = unitName;
		this.contactor = contactor;
		this.contactPhone = contactPhone;
		this.orgRemark = orgRemark;
		this.postcode = postcode;
		this.accessOrg = accessOrg;
		this.orgStatus = orgStatus;
		this.fax = fax;
		this.orgType = orgType;
		this.isFloating = isFloating;
		this.orgServiceLevel = orgServiceLevel;
		this.isUnited = isUnited;
		this.orgSeal = orgSeal;
		this.linkCount = linkCount;
		this.orgNumber = orgNumber;
		this.orgPossRelation = orgPossRelation;
		this.unitIndustry = unitIndustry;
		this.unitPossRelation = unitPossRelation;
		this.unitType = unitType;
		this.isMajorUnit = isMajorUnit;
		this.unitScale = unitScale;
		this.unitEconType = unitEconType;
		this.legalPersonOrg = legalPersonOrg;
		this.govDeptOrg = govDeptOrg;
		this.streetCommu = streetCommu;
		this.agencyType = agencyType;
		this.hasVolunteerTeam = hasVolunteerTeam;
		this.isInstrConn = isInstrConn;
		this.sendInstr = sendInstr;
		this.instrCount = instrCount;
		this.isRestructUnit = isRestructUnit;
		this.isLegalPersonParty = isLegalPersonParty;
		this.isLegalPersonSecr = isLegalPersonSecr;
		this.floatingArea = floatingArea;
		this.orgProp = orgProp;
		this.geoHash = geoHash;
		this.orgSecr = orgSecr;
		this.unitInfo = unitInfo;
		this.unitSameToParent = unitSameToParent;
		this.unitCreateOrg = unitCreateOrg;
		this.unitCode = unitCode;
		this.orgCodeGuangdong = orgCodeGuangdong;
		this.orgCodeNew = orgCodeNew;
		this.orgJuris = orgJuris;
		this.isCommunity = isCommunity;
		this.hasUnitCode = hasUnitCode;
		this.orgCategoryNew = orgCategoryNew;
		this.unitCodeReson = unitCodeReson;
		this.orgProof = orgProof;
		this.orgProofResult = orgProofResult;
		this.isVirtualNode = isVirtualNode;
		this.isExpedite = isExpedite;
	}

	// Property accessors
	@Id
	@Column(name = "ORG_CODE", unique = true, nullable = false, length = 30)
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

	@Column(name = "ORG_CATEGORY", length = 2)
	public String getOrgCategory() {
		return this.orgCategory;
	}

	public void setOrgCategory(String orgCategory) {
		this.orgCategory = orgCategory;
	}

	@Column(name = "ORG_REGION", length = 6)
	public String getOrgRegion() {
		return this.orgRegion;
	}

	public void setOrgRegion(String orgRegion) {
		this.orgRegion = orgRegion;
	}

	@Column(name = "FOUNDED_DATE", length = 7)
	public Date getFoundedDate() {
		return this.foundedDate;
	}

	public void setFoundedDate(Date foundedDate) {
		this.foundedDate = foundedDate;
	}

	@Column(name = "MEMBER_COUNT", precision = 9, scale = 0)
	public Integer getMemberCount() {
		return this.memberCount;
	}

	public void setMemberCount(Integer memberCount) {
		this.memberCount = memberCount;
	}

	@Column(name = "SECRETARY", length = 16)
	public String getSecretary() {
		return this.secretary;
	}

	public void setSecretary(String secretary) {
		this.secretary = secretary;
	}

	@Column(name = "DEPUTY_SECRETARY", length = 64)
	public String getDeputySecretary() {
		return this.deputySecretary;
	}

	public void setDeputySecretary(String deputySecretary) {
		this.deputySecretary = deputySecretary;
	}

	@Column(name = "STANDING_MEMBER")
	public String getStandingMember() {
		return this.standingMember;
	}

	public void setStandingMember(String standingMember) {
		this.standingMember = standingMember;
	}

	@Column(name = "ORG_LOGO", length = 16)
	public String getOrgLogo() {
		return this.orgLogo;
	}

	public void setOrgLogo(String orgLogo) {
		this.orgLogo = orgLogo;
	}

	@Column(name = "QQ")
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "WE_CHAT")
	public String getWeChat() {
		return this.weChat;
	}

	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}

	@Column(name = "PUBLIC_NUMBER", length = 64)
	public String getPublicNumber() {
		return this.publicNumber;
	}

	public void setPublicNumber(String publicNumber) {
		this.publicNumber = publicNumber;
	}

	@Column(name = "ORG_LOCATION", length = 512)
	public String getOrgLocation() {
		return this.orgLocation;
	}

	public void setOrgLocation(String orgLocation) {
		this.orgLocation = orgLocation;
	}

	@Column(name = "UNIT_NAME")
	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Column(name = "CONTACTOR", length = 32)
	public String getContactor() {
		return this.contactor;
	}

	public void setContactor(String contactor) {
		this.contactor = contactor;
	}

	@Column(name = "CONTACT_PHONE", length = 128)
	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	@Column(name = "ORG_REMARK", length = 2000)
	public String getOrgRemark() {
		return this.orgRemark;
	}

	public void setOrgRemark(String orgRemark) {
		this.orgRemark = orgRemark;
	}

	@Column(name = "POSTCODE", length = 6)
	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Column(name = "ACCESS_ORG", length = 30)
	public String getAccessOrg() {
		return this.accessOrg;
	}

	public void setAccessOrg(String accessOrg) {
		this.accessOrg = accessOrg;
	}

	@Column(name = "ORG_STATUS", length = 1)
	public String getOrgStatus() {
		return this.orgStatus;
	}

	public void setOrgStatus(String orgStatus) {
		this.orgStatus = orgStatus;
	}

	@Column(name = "FAX", length = 32)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "ORG_TYPE", length = 8)
	public String getOrgType() {
		return this.orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	@Column(name = "IS_FLOATING", length = 1)
	public String getIsFloating() {
		return this.isFloating;
	}

	public void setIsFloating(String isFloating) {
		this.isFloating = isFloating;
	}

	@Column(name = "ORG_SERVICE_LEVEL", length = 2)
	public String getOrgServiceLevel() {
		return this.orgServiceLevel;
	}

	public void setOrgServiceLevel(String orgServiceLevel) {
		this.orgServiceLevel = orgServiceLevel;
	}

	@Column(name = "IS_UNITED", length = 1)
	public String getIsUnited() {
		return this.isUnited;
	}

	public void setIsUnited(String isUnited) {
		this.isUnited = isUnited;
	}

	@Column(name = "ORG_SEAL", length = 16)
	public String getOrgSeal() {
		return this.orgSeal;
	}

	public void setOrgSeal(String orgSeal) {
		this.orgSeal = orgSeal;
	}

	@Column(name = "LINK_COUNT", precision = 9, scale = 0)
	public Integer getLinkCount() {
		return this.linkCount;
	}

	public void setLinkCount(Integer linkCount) {
		this.linkCount = linkCount;
	}

	@Column(name = "ORG_NUMBER", length = 128)
	public String getOrgNumber() {
		return this.orgNumber;
	}

	public void setOrgNumber(String orgNumber) {
		this.orgNumber = orgNumber;
	}

	@Column(name = "ORG_POSS_RELATION", length = 128)
	public String getOrgPossRelation() {
		return this.orgPossRelation;
	}

	public void setOrgPossRelation(String orgPossRelation) {
		this.orgPossRelation = orgPossRelation;
	}

	@Column(name = "UNIT_INDUSTRY", length = 128)
	public String getUnitIndustry() {
		return this.unitIndustry;
	}

	public void setUnitIndustry(String unitIndustry) {
		this.unitIndustry = unitIndustry;
	}

	@Column(name = "UNIT_POSS_RELATION", length = 128)
	public String getUnitPossRelation() {
		return this.unitPossRelation;
	}

	public void setUnitPossRelation(String unitPossRelation) {
		this.unitPossRelation = unitPossRelation;
	}

	@Column(name = "UNIT_TYPE", length = 128)
	public String getUnitType() {
		return this.unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	@Column(name = "IS_MAJOR_UNIT", length = 128)
	public String getIsMajorUnit() {
		return this.isMajorUnit;
	}

	public void setIsMajorUnit(String isMajorUnit) {
		this.isMajorUnit = isMajorUnit;
	}

	@Column(name = "UNIT_SCALE", length = 128)
	public String getUnitScale() {
		return this.unitScale;
	}

	public void setUnitScale(String unitScale) {
		this.unitScale = unitScale;
	}

	@Column(name = "UNIT_ECON_TYPE", length = 128)
	public String getUnitEconType() {
		return this.unitEconType;
	}

	public void setUnitEconType(String unitEconType) {
		this.unitEconType = unitEconType;
	}

	@Column(name = "LEGAL_PERSON_ORG", length = 128)
	public String getLegalPersonOrg() {
		return this.legalPersonOrg;
	}

	public void setLegalPersonOrg(String legalPersonOrg) {
		this.legalPersonOrg = legalPersonOrg;
	}

	@Column(name = "GOV_DEPT_ORG", length = 128)
	public String getGovDeptOrg() {
		return this.govDeptOrg;
	}

	public void setGovDeptOrg(String govDeptOrg) {
		this.govDeptOrg = govDeptOrg;
	}

	@Column(name = "STREET_COMMU", length = 128)
	public String getStreetCommu() {
		return this.streetCommu;
	}

	public void setStreetCommu(String streetCommu) {
		this.streetCommu = streetCommu;
	}

	@Column(name = "AGENCY_TYPE", length = 128)
	public String getAgencyType() {
		return this.agencyType;
	}

	public void setAgencyType(String agencyType) {
		this.agencyType = agencyType;
	}

	@Column(name = "HAS_VOLUNTEER_TEAM", length = 128)
	public String getHasVolunteerTeam() {
		return this.hasVolunteerTeam;
	}

	public void setHasVolunteerTeam(String hasVolunteerTeam) {
		this.hasVolunteerTeam = hasVolunteerTeam;
	}

	@Column(name = "IS_INSTR_CONN", length = 128)
	public String getIsInstrConn() {
		return this.isInstrConn;
	}

	public void setIsInstrConn(String isInstrConn) {
		this.isInstrConn = isInstrConn;
	}

	@Column(name = "SEND_INSTR", length = 128)
	public String getSendInstr() {
		return this.sendInstr;
	}

	public void setSendInstr(String sendInstr) {
		this.sendInstr = sendInstr;
	}

	@Column(name = "INSTR_COUNT", precision = 9, scale = 0)
	public Integer getInstrCount() {
		return this.instrCount;
	}

	public void setInstrCount(Integer instrCount) {
		this.instrCount = instrCount;
	}

	@Column(name = "IS_RESTRUCT_UNIT", length = 128)
	public String getIsRestructUnit() {
		return this.isRestructUnit;
	}

	public void setIsRestructUnit(String isRestructUnit) {
		this.isRestructUnit = isRestructUnit;
	}

	@Column(name = "IS_LEGAL_PERSON_PARTY", length = 128)
	public String getIsLegalPersonParty() {
		return this.isLegalPersonParty;
	}

	public void setIsLegalPersonParty(String isLegalPersonParty) {
		this.isLegalPersonParty = isLegalPersonParty;
	}

	@Column(name = "IS_LEGAL_PERSON_SECR", length = 128)
	public String getIsLegalPersonSecr() {
		return this.isLegalPersonSecr;
	}

	public void setIsLegalPersonSecr(String isLegalPersonSecr) {
		this.isLegalPersonSecr = isLegalPersonSecr;
	}

	@Column(name = "FLOATING_AREA", length = 6)
	public String getFloatingArea() {
		return this.floatingArea;
	}

	public void setFloatingArea(String floatingArea) {
		this.floatingArea = floatingArea;
	}

	@Column(name = "ORG_PROP", length = 1)
	public String getOrgProp() {
		return this.orgProp;
	}

	public void setOrgProp(String orgProp) {
		this.orgProp = orgProp;
	}

	@Column(name = "GEO_HASH", length = 16)
	public String getGeoHash() {
		return this.geoHash;
	}

	public void setGeoHash(String geoHash) {
		this.geoHash = geoHash;
	}

	@Column(name = "ORG_SECR", length = 128)
	public String getOrgSecr() {
		return this.orgSecr;
	}

	public void setOrgSecr(String orgSecr) {
		this.orgSecr = orgSecr;
	}

	@Column(name = "UNIT_INFO", length = 1)
	public String getUnitInfo() {
		return this.unitInfo;
	}

	public void setUnitInfo(String unitInfo) {
		this.unitInfo = unitInfo;
	}

	@Column(name = "UNIT_SAME_TO_PARENT", length = 1)
	public String getUnitSameToParent() {
		return this.unitSameToParent;
	}

	public void setUnitSameToParent(String unitSameToParent) {
		this.unitSameToParent = unitSameToParent;
	}

	@Column(name = "UNIT_CREATE_ORG", length = 6)
	public String getUnitCreateOrg() {
		return this.unitCreateOrg;
	}

	public void setUnitCreateOrg(String unitCreateOrg) {
		this.unitCreateOrg = unitCreateOrg;
	}

	@Column(name = "UNIT_CODE", length = 100)
	public String getUnitCode() {
		return this.unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	@Column(name = "ORG_CODE_GUANGDONG", length = 128)
	public String getOrgCodeGuangdong() {
		return this.orgCodeGuangdong;
	}

	public void setOrgCodeGuangdong(String orgCodeGuangdong) {
		this.orgCodeGuangdong = orgCodeGuangdong;
	}

	@Column(name = "ORG_CODE_NEW", length = 128)
	public String getOrgCodeNew() {
		return this.orgCodeNew;
	}

	public void setOrgCodeNew(String orgCodeNew) {
		this.orgCodeNew = orgCodeNew;
	}

	@Column(name = "ORG_JURIS")
	public String getOrgJuris() {
		return this.orgJuris;
	}

	public void setOrgJuris(String orgJuris) {
		this.orgJuris = orgJuris;
	}

	@Column(name = "IS_COMMUNITY", length = 1)
	public String getIsCommunity() {
		return this.isCommunity;
	}

	public void setIsCommunity(String isCommunity) {
		this.isCommunity = isCommunity;
	}

	@Column(name = "HAS_UNIT_CODE", length = 1)
	public String getHasUnitCode() {
		return this.hasUnitCode;
	}

	public void setHasUnitCode(String hasUnitCode) {
		this.hasUnitCode = hasUnitCode;
	}

	@Column(name = "ORG_CATEGORY_NEW", length = 6)
	public String getOrgCategoryNew() {
		return this.orgCategoryNew;
	}

	public void setOrgCategoryNew(String orgCategoryNew) {
		this.orgCategoryNew = orgCategoryNew;
	}

	@Column(name = "UNIT_CODE_RESON", length = 4000)
	public String getUnitCodeReson() {
		return this.unitCodeReson;
	}

	public void setUnitCodeReson(String unitCodeReson) {
		this.unitCodeReson = unitCodeReson;
	}

	@Column(name = "ORG_PROOF", length = 1)
	public String getOrgProof() {
		return this.orgProof;
	}

	public void setOrgProof(String orgProof) {
		this.orgProof = orgProof;
	}

	@Column(name = "ORG_PROOF_RESULT", length = 1000)
	public String getOrgProofResult() {
		return this.orgProofResult;
	}

	public void setOrgProofResult(String orgProofResult) {
		this.orgProofResult = orgProofResult;
	}

	@Column(name = "IS_VIRTUAL_NODE", length = 1)
	public String getIsVirtualNode() {
		return this.isVirtualNode;
	}

	public void setIsVirtualNode(String isVirtualNode) {
		this.isVirtualNode = isVirtualNode;
	}

	@Column(name = "IS_EXPEDITE", length = 1)
	public String getIsExpedite() {
		return this.isExpedite;
	}

	public void setIsExpedite(String isExpedite) {
		this.isExpedite = isExpedite;
	}

}