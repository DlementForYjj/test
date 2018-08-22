// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MemTranHandleInfoId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class MemTranHandleInfoId implements java.io.Serializable {

	// Fields

	private String dataId;
	private String userName;
	private String orgCode;
	private String handleResult;
	private String handleContent;
	private Timestamp endTime;
	private String nextOrgCode;

	// Constructors

	/** default constructor */
	public MemTranHandleInfoId() {
	}

	/** full constructor */
	public MemTranHandleInfoId(String dataId, String userName, String orgCode,
			String handleResult, String handleContent, Timestamp endTime,
			String nextOrgCode) {
		this.dataId = dataId;
		this.userName = userName;
		this.orgCode = orgCode;
		this.handleResult = handleResult;
		this.handleContent = handleContent;
		this.endTime = endTime;
		this.nextOrgCode = nextOrgCode;
	}

	// Property accessors

	@Column(name = "DATA_ID", length = 16)
	public String getDataId() {
		return this.dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	@Column(name = "USER_NAME", length = 30)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "ORG_CODE", length = 30)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Column(name = "HANDLE_RESULT", length = 2)
	public String getHandleResult() {
		return this.handleResult;
	}

	public void setHandleResult(String handleResult) {
		this.handleResult = handleResult;
	}

	@Column(name = "HANDLE_CONTENT", length = 4000)
	public String getHandleContent() {
		return this.handleContent;
	}

	public void setHandleContent(String handleContent) {
		this.handleContent = handleContent;
	}

	@Column(name = "END_TIME", length = 7)
	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	@Column(name = "NEXT_ORG_CODE", length = 30)
	public String getNextOrgCode() {
		return this.nextOrgCode;
	}

	public void setNextOrgCode(String nextOrgCode) {
		this.nextOrgCode = nextOrgCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MemTranHandleInfoId))
			return false;
		MemTranHandleInfoId castOther = (MemTranHandleInfoId) other;

		return ((this.getDataId() == castOther.getDataId()) || (this
				.getDataId() != null && castOther.getDataId() != null && this
				.getDataId().equals(castOther.getDataId())))
				&& ((this.getUserName() == castOther.getUserName()) || (this
						.getUserName() != null
						&& castOther.getUserName() != null && this
						.getUserName().equals(castOther.getUserName())))
				&& ((this.getOrgCode() == castOther.getOrgCode()) || (this
						.getOrgCode() != null && castOther.getOrgCode() != null && this
						.getOrgCode().equals(castOther.getOrgCode())))
				&& ((this.getHandleResult() == castOther.getHandleResult()) || (this
						.getHandleResult() != null
						&& castOther.getHandleResult() != null && this
						.getHandleResult().equals(castOther.getHandleResult())))
				&& ((this.getHandleContent() == castOther.getHandleContent()) || (this
						.getHandleContent() != null
						&& castOther.getHandleContent() != null && this
						.getHandleContent()
						.equals(castOther.getHandleContent())))
				&& ((this.getEndTime() == castOther.getEndTime()) || (this
						.getEndTime() != null && castOther.getEndTime() != null && this
						.getEndTime().equals(castOther.getEndTime())))
				&& ((this.getNextOrgCode() == castOther.getNextOrgCode()) || (this
						.getNextOrgCode() != null
						&& castOther.getNextOrgCode() != null && this
						.getNextOrgCode().equals(castOther.getNextOrgCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDataId() == null ? 0 : this.getDataId().hashCode());
		result = 37 * result
				+ (getUserName() == null ? 0 : this.getUserName().hashCode());
		result = 37 * result
				+ (getOrgCode() == null ? 0 : this.getOrgCode().hashCode());
		result = 37
				* result
				+ (getHandleResult() == null ? 0 : this.getHandleResult()
						.hashCode());
		result = 37
				* result
				+ (getHandleContent() == null ? 0 : this.getHandleContent()
						.hashCode());
		result = 37 * result
				+ (getEndTime() == null ? 0 : this.getEndTime().hashCode());
		result = 37
				* result
				+ (getNextOrgCode() == null ? 0 : this.getNextOrgCode()
						.hashCode());
		return result;
	}

}