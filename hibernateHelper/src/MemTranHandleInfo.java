// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MemTranHandleInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "MEM_TRAN_HANDLE_INFO")
public class MemTranHandleInfo implements java.io.Serializable {

	// Fields

	private String taskId;
	private String dataId;
	private String userName;
	private String orgCode;
	private String handleResult;
	private String handleContent;
	private Date endTime;
	private String nextOrgCode;

	// Constructors

	/** default constructor */
	public MemTranHandleInfo() {
	}

	/** minimal constructor */
	public MemTranHandleInfo(String taskId) {
		this.taskId = taskId;
	}

	/** full constructor */
	public MemTranHandleInfo(String taskId, String dataId, String userName,
			String orgCode, String handleResult, String handleContent,
			Date endTime, String nextOrgCode) {
		this.taskId = taskId;
		this.dataId = dataId;
		this.userName = userName;
		this.orgCode = orgCode;
		this.handleResult = handleResult;
		this.handleContent = handleContent;
		this.endTime = endTime;
		this.nextOrgCode = nextOrgCode;
	}

	// Property accessors
	@Id
	@Column(name = "TASK_ID", unique = true, nullable = false, length = 16)
	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

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
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Column(name = "NEXT_ORG_CODE", length = 30)
	public String getNextOrgCode() {
		return this.nextOrgCode;
	}

	public void setNextOrgCode(String nextOrgCode) {
		this.nextOrgCode = nextOrgCode;
	}

}