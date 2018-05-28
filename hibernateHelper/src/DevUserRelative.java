// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DevUserRelative entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "DEV_USER_RELATIVE", schema = "PARTY")
public class DevUserRelative implements java.io.Serializable {

	// Fields

	private String relativeId;
	private String userId;
	private String relativeRelation;
	private String relativeName;
	private String relativeNation;
	private Timestamp relativeBirthday;
	private String relativeNativePlace;
	private String relativeEducation;
	private Timestamp relativeWorktime;
	private String relativePolitical;
	private String relativeCompany;
	private Integer relativeOrder;
	private String relativeType;
	private String relativeJob;
	private String relativeGender;

	// Constructors

	/** default constructor */
	public DevUserRelative() {
	}

	/** minimal constructor */
	public DevUserRelative(String relativeId) {
		this.relativeId = relativeId;
	}

	/** full constructor */
	public DevUserRelative(String relativeId, String userId,
			String relativeRelation, String relativeName,
			String relativeNation, Timestamp relativeBirthday,
			String relativeNativePlace, String relativeEducation,
			Timestamp relativeWorktime, String relativePolitical,
			String relativeCompany, Integer relativeOrder, String relativeType,
			String relativeJob, String relativeGender) {
		this.relativeId = relativeId;
		this.userId = userId;
		this.relativeRelation = relativeRelation;
		this.relativeName = relativeName;
		this.relativeNation = relativeNation;
		this.relativeBirthday = relativeBirthday;
		this.relativeNativePlace = relativeNativePlace;
		this.relativeEducation = relativeEducation;
		this.relativeWorktime = relativeWorktime;
		this.relativePolitical = relativePolitical;
		this.relativeCompany = relativeCompany;
		this.relativeOrder = relativeOrder;
		this.relativeType = relativeType;
		this.relativeJob = relativeJob;
		this.relativeGender = relativeGender;
	}

	// Property accessors
	@Id
	@Column(name = "RELATIVE_ID", unique = true, nullable = false, length = 16)
	public String getRelativeId() {
		return this.relativeId;
	}

	public void setRelativeId(String relativeId) {
		this.relativeId = relativeId;
	}

	@Column(name = "USER_ID", length = 16)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "RELATIVE_RELATION", length = 20)
	public String getRelativeRelation() {
		return this.relativeRelation;
	}

	public void setRelativeRelation(String relativeRelation) {
		this.relativeRelation = relativeRelation;
	}

	@Column(name = "RELATIVE_NAME")
	public String getRelativeName() {
		return this.relativeName;
	}

	public void setRelativeName(String relativeName) {
		this.relativeName = relativeName;
	}

	@Column(name = "RELATIVE_NATION", length = 20)
	public String getRelativeNation() {
		return this.relativeNation;
	}

	public void setRelativeNation(String relativeNation) {
		this.relativeNation = relativeNation;
	}

	@Column(name = "RELATIVE_BIRTHDAY", length = 7)
	public Timestamp getRelativeBirthday() {
		return this.relativeBirthday;
	}

	public void setRelativeBirthday(Timestamp relativeBirthday) {
		this.relativeBirthday = relativeBirthday;
	}

	@Column(name = "RELATIVE_NATIVE_PLACE")
	public String getRelativeNativePlace() {
		return this.relativeNativePlace;
	}

	public void setRelativeNativePlace(String relativeNativePlace) {
		this.relativeNativePlace = relativeNativePlace;
	}

	@Column(name = "RELATIVE_EDUCATION", length = 20)
	public String getRelativeEducation() {
		return this.relativeEducation;
	}

	public void setRelativeEducation(String relativeEducation) {
		this.relativeEducation = relativeEducation;
	}

	@Column(name = "RELATIVE_WORKTIME", length = 7)
	public Timestamp getRelativeWorktime() {
		return this.relativeWorktime;
	}

	public void setRelativeWorktime(Timestamp relativeWorktime) {
		this.relativeWorktime = relativeWorktime;
	}

	@Column(name = "RELATIVE_POLITICAL", length = 20)
	public String getRelativePolitical() {
		return this.relativePolitical;
	}

	public void setRelativePolitical(String relativePolitical) {
		this.relativePolitical = relativePolitical;
	}

	@Column(name = "RELATIVE_COMPANY", length = 600)
	public String getRelativeCompany() {
		return this.relativeCompany;
	}

	public void setRelativeCompany(String relativeCompany) {
		this.relativeCompany = relativeCompany;
	}

	@Column(name = "RELATIVE_ORDER", precision = 8, scale = 0)
	public Integer getRelativeOrder() {
		return this.relativeOrder;
	}

	public void setRelativeOrder(Integer relativeOrder) {
		this.relativeOrder = relativeOrder;
	}

	@Column(name = "RELATIVE_TYPE", length = 1)
	public String getRelativeType() {
		return this.relativeType;
	}

	public void setRelativeType(String relativeType) {
		this.relativeType = relativeType;
	}

	@Column(name = "RELATIVE_JOB")
	public String getRelativeJob() {
		return this.relativeJob;
	}

	public void setRelativeJob(String relativeJob) {
		this.relativeJob = relativeJob;
	}

	@Column(name = "RELATIVE_GENDER", length = 1)
	public String getRelativeGender() {
		return this.relativeGender;
	}

	public void setRelativeGender(String relativeGender) {
		this.relativeGender = relativeGender;
	}

}