package hibernateHelper;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * D18 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "D18")
public class D18 implements java.io.Serializable {

	// Fields

	private String d1800;
	private String d1801;
	private String d1802;
	private Date d1803;
	private String d1804;
	private String d1805;
	private String d1806;
	private String d1807;
	private String d0100;
	private String isMain;
	private Date d1808;

	// Constructors

	/** default constructor */
	public D18() {
	}

	/** minimal constructor */
	public D18(String d1800) {
		this.d1800 = d1800;
	}

	/** full constructor */
	public D18(String d1800, String d1801, String d1802, Date d1803,
			String d1804, String d1805, String d1806, String d1807,
			String d0100, String isMain, Date d1808) {
		this.d1800 = d1800;
		this.d1801 = d1801;
		this.d1802 = d1802;
		this.d1803 = d1803;
		this.d1804 = d1804;
		this.d1805 = d1805;
		this.d1806 = d1806;
		this.d1807 = d1807;
		this.d0100 = d0100;
		this.isMain = isMain;
		this.d1808 = d1808;
	}

	// Property accessors
	@Id
	@Column(name = "D1800", unique = true, nullable = false, length = 32)
	public String getD1800() {
		return this.d1800;
	}

	public void setD1800(String d1800) {
		this.d1800 = d1800;
	}

	@Column(name = "D1801", length = 32)
	public String getD1801() {
		return this.d1801;
	}

	public void setD1801(String d1801) {
		this.d1801 = d1801;
	}

	@Column(name = "D1802", length = 6)
	public String getD1802() {
		return this.d1802;
	}

	public void setD1802(String d1802) {
		this.d1802 = d1802;
	}

	@Column(name = "D1803", length = 7)
	public Date getD1803() {
		return this.d1803;
	}

	public void setD1803(Date d1803) {
		this.d1803 = d1803;
	}

	@Column(name = "D1804", length = 4000)
	public String getD1804() {
		return this.d1804;
	}

	public void setD1804(String d1804) {
		this.d1804 = d1804;
	}

	@Column(name = "D1805", length = 4000)
	public String getD1805() {
		return this.d1805;
	}

	public void setD1805(String d1805) {
		this.d1805 = d1805;
	}

	@Column(name = "D1806", length = 4000)
	public String getD1806() {
		return this.d1806;
	}

	public void setD1806(String d1806) {
		this.d1806 = d1806;
	}

	@Column(name = "D1807", length = 4000)
	public String getD1807() {
		return this.d1807;
	}

	public void setD1807(String d1807) {
		this.d1807 = d1807;
	}

	@Column(name = "D0100", length = 32)
	public String getD0100() {
		return this.d0100;
	}

	public void setD0100(String d0100) {
		this.d0100 = d0100;
	}

	@Column(name = "IS_MAIN", length = 1)
	public String getIsMain() {
		return this.isMain;
	}

	public void setIsMain(String isMain) {
		this.isMain = isMain;
	}

	@Column(name = "D1808", length = 7)
	public Date getD1808() {
		return this.d1808;
	}

	public void setD1808(Date d1808) {
		this.d1808 = d1808;
	}

}