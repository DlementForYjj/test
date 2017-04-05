package hibernateHelper;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A51 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "A51")
public class A51 implements java.io.Serializable {

	// Fields

	private String a5100;
	private String a5101;
	private String d0100;
	private String a5103;
	private String a5104;
	private String a5105;
	private Date a5106;
	private String a5107;
	private Date a5108;
	private String a5109;
	private String a0100;
	private Integer e0702;
	private String isMain;

	// Constructors

	/** default constructor */
	public A51() {
	}

	/** minimal constructor */
	public A51(String a5100) {
		this.a5100 = a5100;
	}

	/** full constructor */
	public A51(String a5100, String a5101, String d0100, String a5103,
			String a5104, String a5105, Date a5106, String a5107,
			Date a5108, String a5109, String a0100, Integer e0702,
			String isMain) {
		this.a5100 = a5100;
		this.a5101 = a5101;
		this.d0100 = d0100;
		this.a5103 = a5103;
		this.a5104 = a5104;
		this.a5105 = a5105;
		this.a5106 = a5106;
		this.a5107 = a5107;
		this.a5108 = a5108;
		this.a5109 = a5109;
		this.a0100 = a0100;
		this.e0702 = e0702;
		this.isMain = isMain;
	}

	// Property accessors
	@Id
	@Column(name = "A5100", unique = true, nullable = false, length = 32)
	public String getA5100() {
		return this.a5100;
	}

	public void setA5100(String a5100) {
		this.a5100 = a5100;
	}

	@Column(name = "A5101", length = 50)
	public String getA5101() {
		return this.a5101;
	}

	public void setA5101(String a5101) {
		this.a5101 = a5101;
	}

	@Column(name = "D0100", length = 32)
	public String getD0100() {
		return this.d0100;
	}

	public void setD0100(String d0100) {
		this.d0100 = d0100;
	}

	@Column(name = "A5103", length = 50)
	public String getA5103() {
		return this.a5103;
	}

	public void setA5103(String a5103) {
		this.a5103 = a5103;
	}

	@Column(name = "A5104", length = 4)
	public String getA5104() {
		return this.a5104;
	}

	public void setA5104(String a5104) {
		this.a5104 = a5104;
	}

	@Column(name = "A5105", length = 10)
	public String getA5105() {
		return this.a5105;
	}

	public void setA5105(String a5105) {
		this.a5105 = a5105;
	}

	@Column(name = "A5106", length = 7)
	public Date getA5106() {
		return this.a5106;
	}

	public void setA5106(Date a5106) {
		this.a5106 = a5106;
	}

	@Column(name = "A5107", length = 10)
	public String getA5107() {
		return this.a5107;
	}

	public void setA5107(String a5107) {
		this.a5107 = a5107;
	}

	@Column(name = "A5108", length = 7)
	public Date getA5108() {
		return this.a5108;
	}

	public void setA5108(Date a5108) {
		this.a5108 = a5108;
	}

	@Column(name = "A5109", length = 10)
	public String getA5109() {
		return this.a5109;
	}

	public void setA5109(String a5109) {
		this.a5109 = a5109;
	}

	@Column(name = "A0100", length = 32)
	public String getA0100() {
		return this.a0100;
	}

	public void setA0100(String a0100) {
		this.a0100 = a0100;
	}

	@Column(name = "E0702", precision = 9, scale = 0)
	public Integer getE0702() {
		return this.e0702;
	}

	public void setE0702(Integer e0702) {
		this.e0702 = e0702;
	}

	@Column(name = "IS_MAIN", length = 1)
	public String getIsMain() {
		return this.isMain;
	}

	public void setIsMain(String isMain) {
		this.isMain = isMain;
	}

}