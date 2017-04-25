package hibernateHelper;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * E07 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "E07")
public class E07 implements java.io.Serializable {

	// Fields

	private E07Id id;
	private Integer e0701;
	private String e0703;
	private Date e0704;
	private String e0705;
	private Integer e0706;
	private Integer e0707;
	private String e0712;
	private Date e0713;
	private String e07b1;
	private String e07b2;
	private String e07b3;
	private String e07b4;
	private String e07b5;
	private String e0708;
	private String e0709;
	private String e0710;
	private String e0711;
	private Date e0714;
	private String e07b6;
	private Date e0715;

	// Constructors

	/** default constructor */
	public E07() {
	}

	/** minimal constructor */
	public E07(E07Id id) {
		this.id = id;
	}

	/** full constructor */
	public E07(E07Id id, Integer e0701, String e0703, Date e0704,
			String e0705, Integer e0706, Integer e0707, String e0712,
			Date e0713, String e07b1, String e07b2, String e07b3,
			String e07b4, String e07b5, String e0708, String e0709,
			String e0710, String e0711, Date e0714, String e07b6,
			Date e0715) {
		this.id = id;
		this.e0701 = e0701;
		this.e0703 = e0703;
		this.e0704 = e0704;
		this.e0705 = e0705;
		this.e0706 = e0706;
		this.e0707 = e0707;
		this.e0712 = e0712;
		this.e0713 = e0713;
		this.e07b1 = e07b1;
		this.e07b2 = e07b2;
		this.e07b3 = e07b3;
		this.e07b4 = e07b4;
		this.e07b5 = e07b5;
		this.e0708 = e0708;
		this.e0709 = e0709;
		this.e0710 = e0710;
		this.e0711 = e0711;
		this.e0714 = e0714;
		this.e07b6 = e07b6;
		this.e0715 = e0715;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "d0100", column = @Column(name = "D0100", nullable = false, length = 32)),
			@AttributeOverride(name = "e0702", column = @Column(name = "E0702", nullable = false, precision = 9, scale = 0)) })
	public E07Id getId() {
		return this.id;
	}

	public void setId(E07Id id) {
		this.id = id;
	}

	@Column(name = "E0701", precision = 9, scale = 0)
	public Integer getE0701() {
		return this.e0701;
	}

	public void setE0701(Integer e0701) {
		this.e0701 = e0701;
	}

	@Column(name = "E0703", length = 6)
	public String getE0703() {
		return this.e0703;
	}

	public void setE0703(String e0703) {
		this.e0703 = e0703;
	}

	@Column(name = "E0704", length = 7)
	public Date getE0704() {
		return this.e0704;
	}

	public void setE0704(Date e0704) {
		this.e0704 = e0704;
	}

	@Column(name = "E0705", length = 20)
	public String getE0705() {
		return this.e0705;
	}

	public void setE0705(String e0705) {
		this.e0705 = e0705;
	}

	@Column(name = "E0706", precision = 9, scale = 0)
	public Integer getE0706() {
		return this.e0706;
	}

	public void setE0706(Integer e0706) {
		this.e0706 = e0706;
	}

	@Column(name = "E0707", precision = 9, scale = 0)
	public Integer getE0707() {
		return this.e0707;
	}

	public void setE0707(Integer e0707) {
		this.e0707 = e0707;
	}

	@Column(name = "E0712", length = 32)
	public String getE0712() {
		return this.e0712;
	}

	public void setE0712(String e0712) {
		this.e0712 = e0712;
	}

	@Column(name = "E0713", length = 7)
	public Date getE0713() {
		return this.e0713;
	}

	public void setE0713(Date e0713) {
		this.e0713 = e0713;
	}

	@Column(name = "E07B1", length = 1)
	public String getE07b1() {
		return this.e07b1;
	}

	public void setE07b1(String e07b1) {
		this.e07b1 = e07b1;
	}

	@Column(name = "E07B2", length = 1)
	public String getE07b2() {
		return this.e07b2;
	}

	public void setE07b2(String e07b2) {
		this.e07b2 = e07b2;
	}

	@Column(name = "E07B3", length = 1)
	public String getE07b3() {
		return this.e07b3;
	}

	public void setE07b3(String e07b3) {
		this.e07b3 = e07b3;
	}

	@Column(name = "E07B4", length = 1)
	public String getE07b4() {
		return this.e07b4;
	}

	public void setE07b4(String e07b4) {
		this.e07b4 = e07b4;
	}

	@Column(name = "E07B5", length = 1)
	public String getE07b5() {
		return this.e07b5;
	}

	public void setE07b5(String e07b5) {
		this.e07b5 = e07b5;
	}

	@Column(name = "E0708", length = 4000)
	public String getE0708() {
		return this.e0708;
	}

	public void setE0708(String e0708) {
		this.e0708 = e0708;
	}

	@Column(name = "E0709", length = 4000)
	public String getE0709() {
		return this.e0709;
	}

	public void setE0709(String e0709) {
		this.e0709 = e0709;
	}

	@Column(name = "E0710", length = 4000)
	public String getE0710() {
		return this.e0710;
	}

	public void setE0710(String e0710) {
		this.e0710 = e0710;
	}

	@Column(name = "E0711", length = 4000)
	public String getE0711() {
		return this.e0711;
	}

	public void setE0711(String e0711) {
		this.e0711 = e0711;
	}

	@Column(name = "E0714", length = 7)
	public Date getE0714() {
		return this.e0714;
	}

	public void setE0714(Date e0714) {
		this.e0714 = e0714;
	}

	@Column(name = "E07B6", length = 1)
	public String getE07b6() {
		return this.e07b6;
	}

	public void setE07b6(String e07b6) {
		this.e07b6 = e07b6;
	}

	@Column(name = "E0715", length = 7)
	public Date getE0715() {
		return this.e0715;
	}

	public void setE0715(Date e0715) {
		this.e0715 = e0715;
	}

}