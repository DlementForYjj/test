package hibernateHelper;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DwRole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "DW_ROLE")
public class DwRole implements java.io.Serializable {

	// Fields

	private String recordId;
	private BigDecimal recordVersion;
	private Timestamp recordTime;
	private String recordFrom;
	private String recordCreator;
	private String userId;
	private String orgCode;
	private String roleId;

	// Constructors

	/** default constructor */
	public DwRole() {
	}

	/** minimal constructor */
	public DwRole(String recordId, String userId, String orgCode, String roleId) {
		this.recordId = recordId;
		this.userId = userId;
		this.orgCode = orgCode;
		this.roleId = roleId;
	}

	/** full constructor */
	public DwRole(String recordId, BigDecimal recordVersion,
			Timestamp recordTime, String recordFrom, String recordCreator,
			String userId, String orgCode, String roleId) {
		this.recordId = recordId;
		this.recordVersion = recordVersion;
		this.recordTime = recordTime;
		this.recordFrom = recordFrom;
		this.recordCreator = recordCreator;
		this.userId = userId;
		this.orgCode = orgCode;
		this.roleId = roleId;
	}

	// Property accessors
	@Id
	@Column(name = "RECORD_ID", unique = true, nullable = false, length = 16)
	public String getRecordId() {
		return this.recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	@Column(name = "RECORD_VERSION", scale = 0)
	public BigDecimal getRecordVersion() {
		return this.recordVersion;
	}

	public void setRecordVersion(BigDecimal recordVersion) {
		this.recordVersion = recordVersion;
	}

	@Column(name = "RECORD_TIME", length = 7)
	public Timestamp getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(Timestamp recordTime) {
		this.recordTime = recordTime;
	}

	@Column(name = "RECORD_FROM", length = 16)
	public String getRecordFrom() {
		return this.recordFrom;
	}

	public void setRecordFrom(String recordFrom) {
		this.recordFrom = recordFrom;
	}

	@Column(name = "RECORD_CREATOR", length = 16)
	public String getRecordCreator() {
		return this.recordCreator;
	}

	public void setRecordCreator(String recordCreator) {
		this.recordCreator = recordCreator;
	}

	@Column(name = "USER_ID", nullable = false, length = 16)
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

	@Column(name = "ROLE_ID", nullable = false, length = 16)
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}