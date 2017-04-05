package hibernateHelper;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * E37 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "E37")
public class E37 implements java.io.Serializable {

	// Fields

	private String e3700;
	private String d0100;
	private String e3701;
	private String e3702;
	private Date e3703;
	private String e3704;
	private String e3706;
	private Date e3707;
	private String e3710;
	private String e3711;
	private String isMain;
	private String e3705;
	private String e3708;
	private String e3709;
	private Date e3712;

	// Constructors

	/** default constructor */
	public E37() {
	}

	/** minimal constructor */
	public E37(String e3700) {
		this.e3700 = e3700;
	}

	/** full constructor */
	public E37(String e3700, String d0100, String e3701, String e3702,
			Date e3703, String e3704, String e3706, Date e3707,
			String e3710, String e3711, String isMain, String e3705,
			String e3708, String e3709, Date e3712) {
		this.e3700 = e3700;
		this.d0100 = d0100;
		this.e3701 = e3701;
		this.e3702 = e3702;
		this.e3703 = e3703;
		this.e3704 = e3704;
		this.e3706 = e3706;
		this.e3707 = e3707;
		this.e3710 = e3710;
		this.e3711 = e3711;
		this.isMain = isMain;
		this.e3705 = e3705;
		this.e3708 = e3708;
		this.e3709 = e3709;
		this.e3712 = e3712;
	}

	// Property accessors
	@Id
	@Column(name = "E3700", unique = true, nullable = false, length = 32)
	public String getE3700() {
		return this.e3700;
	}

	public void setE3700(String e3700) {
		this.e3700 = e3700;
	}

	@Column(name = "D0100", length = 32)
	public String getD0100() {
		return this.d0100;
	}

	public void setD0100(String d0100) {
		this.d0100 = d0100;
	}

	@Column(name = "E3701", length = 20)
	public String getE3701() {
		return this.e3701;
	}

	public void setE3701(String e3701) {
		this.e3701 = e3701;
	}

	@Column(name = "E3702", length = 4)
	public String getE3702() {
		return this.e3702;
	}

	public void setE3702(String e3702) {
		this.e3702 = e3702;
	}

	@Column(name = "E3703", length = 7)
	public Date getE3703() {
		return this.e3703;
	}

	public void setE3703(Date e3703) {
		this.e3703 = e3703;
	}

	@Column(name = "E3704")
	public String getE3704() {
		return this.e3704;
	}

	public void setE3704(String e3704) {
		this.e3704 = e3704;
	}

	@Column(name = "E3706", length = 32)
	public String getE3706() {
		return this.e3706;
	}

	public void setE3706(String e3706) {
		this.e3706 = e3706;
	}

	@Column(name = "E3707", length = 7)
	public Date getE3707() {
		return this.e3707;
	}

	public void setE3707(Date e3707) {
		this.e3707 = e3707;
	}

	@Column(name = "E3710", length = 2000)
	public String getE3710() {
		return this.e3710;
	}

	public void setE3710(String e3710) {
		this.e3710 = e3710;
	}

	@Column(name = "E3711", length = 2000)
	public String getE3711() {
		return this.e3711;
	}

	public void setE3711(String e3711) {
		this.e3711 = e3711;
	}

	@Column(name = "IS_MAIN", length = 1)
	public String getIsMain() {
		return this.isMain;
	}

	public void setIsMain(String isMain) {
		this.isMain = isMain;
	}

	@Column(name = "E3705", length = 4000)
	public String getE3705() {
		return this.e3705;
	}

	public void setE3705(String e3705) {
		this.e3705 = e3705;
	}

	@Column(name = "E3708", length = 4000)
	public String getE3708() {
		return this.e3708;
	}

	public void setE3708(String e3708) {
		this.e3708 = e3708;
	}

	@Column(name = "E3709", length = 4000)
	public String getE3709() {
		return this.e3709;
	}

	public void setE3709(String e3709) {
		this.e3709 = e3709;
	}

	@Column(name = "E3712", length = 7)
	public Date getE3712() {
		return this.e3712;
	}

	public void setE3712(Date e3712) {
		this.e3712 = e3712;
	}

}