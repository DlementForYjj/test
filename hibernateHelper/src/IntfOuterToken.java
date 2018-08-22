// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * IntfOuterToken entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "INTF_OUTER_TOKEN")
public class IntfOuterToken implements java.io.Serializable {

	// Fields

	private String ip;
	private String token;
	private Date createDate;
	private String orgCode;
	private String keyWord;

	// Constructors

	/** default constructor */
	public IntfOuterToken() {
	}

	/** minimal constructor */
	public IntfOuterToken(String ip) {
		this.ip = ip;
	}

	/** full constructor */
	public IntfOuterToken(String ip, String token, Date createDate,
			String orgCode, String keyWord) {
		this.ip = ip;
		this.token = token;
		this.createDate = createDate;
		this.orgCode = orgCode;
		this.keyWord = keyWord;
	}

	// Property accessors
	@Id
	@Column(name = "IP", unique = true, nullable = false, length = 50)
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "TOKEN", length = 100)
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Column(name = "CREATE_DATE", length = 7)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "ORG_CODE", length = 30)
	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Column(name = "KEY_WORD", length = 200)
	public String getKeyWord() {
		return this.keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

}