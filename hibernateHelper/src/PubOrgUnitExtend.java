// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PubOrgUnitExtend entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_ORG_UNIT_EXTEND", schema = "PARTY")
public class PubOrgUnitExtend implements java.io.Serializable {

	// Fields

	private String orgCode;
	private String orgCodeExtend;

	// Constructors

	/** default constructor */
	public PubOrgUnitExtend() {
	}

	/** minimal constructor */
	public PubOrgUnitExtend(String orgCode) {
		this.orgCode = orgCode;
	}

	/** full constructor */
	public PubOrgUnitExtend(String orgCode, String orgCodeExtend) {
		this.orgCode = orgCode;
		this.orgCodeExtend = orgCodeExtend;
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

	@Column(name = "ORG_CODE_EXTEND", length = 30)
	public String getOrgCodeExtend() {
		return this.orgCodeExtend;
	}

	public void setOrgCodeExtend(String orgCodeExtend) {
		this.orgCodeExtend = orgCodeExtend;
	}

}