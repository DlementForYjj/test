// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PubOrgUnit entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_ORG_UNIT", schema = "PARTY")
public class PubOrgUnit implements java.io.Serializable {

	// Fields

	private String unitId;
	private String unitName;
	private String unitType;
	private String unitCreateOrg;
	private String hasUnitCode;
	private String unitCode;
	private String unitCodeReson;
	private String orgCode;
	private String isMain;

	// Constructors

	/** default constructor */
	public PubOrgUnit() {
	}

	/** minimal constructor */
	public PubOrgUnit(String unitId) {
		this.unitId = unitId;
	}

	/** full constructor */
	public PubOrgUnit(String unitId, String unitName, String unitType,
			String unitCreateOrg, String hasUnitCode, String unitCode,
			String unitCodeReson, String orgCode, String isMain) {
		this.unitId = unitId;
		this.unitName = unitName;
		this.unitType = unitType;
		this.unitCreateOrg = unitCreateOrg;
		this.hasUnitCode = hasUnitCode;
		this.unitCode = unitCode;
		this.unitCodeReson = unitCodeReson;
		this.orgCode = orgCode;
		this.isMain = isMain;
	}

	// Property accessors
	@Id
	@Column(name = "UNIT_ID", unique = true, nullable = false, length = 16)
	public String getUnitId() {
		return this.unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	@Column(name = "UNIT_NAME")
	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Column(name = "UNIT_TYPE", length = 128)
	public String getUnitType() {
		return this.unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	@Column(name = "UNIT_CREATE_ORG", length = 6)
	public String getUnitCreateOrg() {
		return this.unitCreateOrg;
	}

	public void setUnitCreateOrg(String unitCreateOrg) {
		this.unitCreateOrg = unitCreateOrg;
	}

	@Column(name = "HAS_UNIT_CODE", length = 1)
	public String getHasUnitCode() {
		return this.hasUnitCode;
	}

	public void setHasUnitCode(String hasUnitCode) {
		this.hasUnitCode = hasUnitCode;
	}

	@Column(name = "UNIT_CODE", length = 128)
	public String getUnitCode() {
		return this.unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	@Column(name = "UNIT_CODE_RESON", length = 4000)
	public String getUnitCodeReson() {
		return this.unitCodeReson;
	}

	public void setUnitCodeReson(String unitCodeReson) {
		this.unitCodeReson = unitCodeReson;
	}

	@Column(name = "ORG_CODE", length = 30)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Column(name = "IS_MAIN", length = 1)
	public String getIsMain() {
		return this.isMain;
	}

	public void setIsMain(String isMain) {
		this.isMain = isMain;
	}

}