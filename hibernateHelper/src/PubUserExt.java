// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PubUserExt entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_USER_EXT")
public class PubUserExt implements java.io.Serializable {

	// Fields

	private String userId;
	private String fltPaperNum;
	private String isRepresent;
	private Integer representTerm;
	private String representLevel;
	private Date representStart;
	private Date representEnd;
	private String oldName;
	private String birthPlace;
	private String education;
	private Date joinYouthTime;
	private Date firstSendApply;
	private Date workTime;
	private String specialty;
	private String youth;
	private String otherparty;
	private String political;
	private String reward;
	private String punish;
	private String archiveList;
	private String archivePerson;
	private Date applyerTime;
	private Date activeTime;
	private Date deveMemberTime;
	private Date archiveTime;
	private Date preCheckTime;
	private String preCheckUserId;
	private Date finalCheckTime;
	private String finalCheckUserId;
	private String checkUserId;
	private String finalCheckReason;
	private String probReason;

	// Constructors

	/** default constructor */
	public PubUserExt() {
	}

	/** minimal constructor */
	public PubUserExt(String userId) {
		this.userId = userId;
	}

	/** full constructor */
	public PubUserExt(String userId, String fltPaperNum, String isRepresent,
			Integer representTerm, String representLevel,
			Date representStart, Date representEnd, String oldName,
			String birthPlace, String education, Date joinYouthTime,
			Date firstSendApply, Date workTime, String specialty,
			String youth, String otherparty, String political, String reward,
			String punish, String archiveList, String archivePerson,
			Date applyerTime, Date activeTime,
			Date deveMemberTime, Date archiveTime,
			Date preCheckTime, String preCheckUserId,
			Date finalCheckTime, String finalCheckUserId,
			String checkUserId, String finalCheckReason, String probReason) {
		this.userId = userId;
		this.fltPaperNum = fltPaperNum;
		this.isRepresent = isRepresent;
		this.representTerm = representTerm;
		this.representLevel = representLevel;
		this.representStart = representStart;
		this.representEnd = representEnd;
		this.oldName = oldName;
		this.birthPlace = birthPlace;
		this.education = education;
		this.joinYouthTime = joinYouthTime;
		this.firstSendApply = firstSendApply;
		this.workTime = workTime;
		this.specialty = specialty;
		this.youth = youth;
		this.otherparty = otherparty;
		this.political = political;
		this.reward = reward;
		this.punish = punish;
		this.archiveList = archiveList;
		this.archivePerson = archivePerson;
		this.applyerTime = applyerTime;
		this.activeTime = activeTime;
		this.deveMemberTime = deveMemberTime;
		this.archiveTime = archiveTime;
		this.preCheckTime = preCheckTime;
		this.preCheckUserId = preCheckUserId;
		this.finalCheckTime = finalCheckTime;
		this.finalCheckUserId = finalCheckUserId;
		this.checkUserId = checkUserId;
		this.finalCheckReason = finalCheckReason;
		this.probReason = probReason;
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

	@Column(name = "FLT_PAPER_NUM", length = 128)
	public String getFltPaperNum() {
		return this.fltPaperNum;
	}

	public void setFltPaperNum(String fltPaperNum) {
		this.fltPaperNum = fltPaperNum;
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

	@Column(name = "REPRESENT_LEVEL", length = 16)
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

	@Column(name = "OLD_NAME")
	public String getOldName() {
		return this.oldName;
	}

	public void setOldName(String oldName) {
		this.oldName = oldName;
	}

	@Column(name = "BIRTH_PLACE")
	public String getBirthPlace() {
		return this.birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	@Column(name = "EDUCATION", length = 20)
	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Column(name = "JOIN_YOUTH_TIME", length = 7)
	public Date getJoinYouthTime() {
		return this.joinYouthTime;
	}

	public void setJoinYouthTime(Date joinYouthTime) {
		this.joinYouthTime = joinYouthTime;
	}

	@Column(name = "FIRST_SEND_APPLY", length = 7)
	public Date getFirstSendApply() {
		return this.firstSendApply;
	}

	public void setFirstSendApply(Date firstSendApply) {
		this.firstSendApply = firstSendApply;
	}

	@Column(name = "WORK_TIME", length = 7)
	public Date getWorkTime() {
		return this.workTime;
	}

	public void setWorkTime(Date workTime) {
		this.workTime = workTime;
	}

	@Column(name = "SPECIALTY", length = 400)
	public String getSpecialty() {
		return this.specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	@Column(name = "YOUTH", length = 2000)
	public String getYouth() {
		return this.youth;
	}

	public void setYouth(String youth) {
		this.youth = youth;
	}

	@Column(name = "OTHERPARTY", length = 2000)
	public String getOtherparty() {
		return this.otherparty;
	}

	public void setOtherparty(String otherparty) {
		this.otherparty = otherparty;
	}

	@Column(name = "POLITICAL", length = 2000)
	public String getPolitical() {
		return this.political;
	}

	public void setPolitical(String political) {
		this.political = political;
	}

	@Column(name = "REWARD", length = 2000)
	public String getReward() {
		return this.reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	@Column(name = "PUNISH", length = 2000)
	public String getPunish() {
		return this.punish;
	}

	public void setPunish(String punish) {
		this.punish = punish;
	}

	@Column(name = "ARCHIVE_LIST", length = 50)
	public String getArchiveList() {
		return this.archiveList;
	}

	public void setArchiveList(String archiveList) {
		this.archiveList = archiveList;
	}

	@Column(name = "ARCHIVE_PERSON", length = 1)
	public String getArchivePerson() {
		return this.archivePerson;
	}

	public void setArchivePerson(String archivePerson) {
		this.archivePerson = archivePerson;
	}

	@Column(name = "APPLYER_TIME", length = 7)
	public Date getApplyerTime() {
		return this.applyerTime;
	}

	public void setApplyerTime(Date applyerTime) {
		this.applyerTime = applyerTime;
	}

	@Column(name = "ACTIVE_TIME", length = 7)
	public Date getActiveTime() {
		return this.activeTime;
	}

	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	@Column(name = "DEVE_MEMBER_TIME", length = 7)
	public Date getDeveMemberTime() {
		return this.deveMemberTime;
	}

	public void setDeveMemberTime(Date deveMemberTime) {
		this.deveMemberTime = deveMemberTime;
	}

	@Column(name = "ARCHIVE_TIME", length = 7)
	public Date getArchiveTime() {
		return this.archiveTime;
	}

	public void setArchiveTime(Date archiveTime) {
		this.archiveTime = archiveTime;
	}

	@Column(name = "PRE_CHECK_TIME", length = 7)
	public Date getPreCheckTime() {
		return this.preCheckTime;
	}

	public void setPreCheckTime(Date preCheckTime) {
		this.preCheckTime = preCheckTime;
	}

	@Column(name = "PRE_CHECK_USER_ID", length = 16)
	public String getPreCheckUserId() {
		return this.preCheckUserId;
	}

	public void setPreCheckUserId(String preCheckUserId) {
		this.preCheckUserId = preCheckUserId;
	}

	@Column(name = "FINAL_CHECK_TIME", length = 7)
	public Date getFinalCheckTime() {
		return this.finalCheckTime;
	}

	public void setFinalCheckTime(Date finalCheckTime) {
		this.finalCheckTime = finalCheckTime;
	}

	@Column(name = "FINAL_CHECK_USER_ID", length = 16)
	public String getFinalCheckUserId() {
		return this.finalCheckUserId;
	}

	public void setFinalCheckUserId(String finalCheckUserId) {
		this.finalCheckUserId = finalCheckUserId;
	}

	@Column(name = "CHECK_USER_ID", length = 16)
	public String getCheckUserId() {
		return this.checkUserId;
	}

	public void setCheckUserId(String checkUserId) {
		this.checkUserId = checkUserId;
	}

	@Column(name = "FINAL_CHECK_REASON", length = 4000)
	public String getFinalCheckReason() {
		return this.finalCheckReason;
	}

	public void setFinalCheckReason(String finalCheckReason) {
		this.finalCheckReason = finalCheckReason;
	}

	@Column(name = "PROB_REASON", length = 2000)
	public String getProbReason() {
		return this.probReason;
	}

	public void setProbReason(String probReason) {
		this.probReason = probReason;
	}

}