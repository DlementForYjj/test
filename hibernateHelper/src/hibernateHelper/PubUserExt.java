package hibernateHelper;

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

	// Constructors

	/** default constructor */
	public PubUserExt() {
	}

	/** minimal constructor */
	public PubUserExt(String userId) {
		this.userId = userId;
	}

	/** full constructor */
	public PubUserExt(String userId, String fltPaperNum) {
		this.userId = userId;
		this.fltPaperNum = fltPaperNum;
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

}