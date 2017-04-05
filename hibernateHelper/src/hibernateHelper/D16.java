package hibernateHelper;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * D16 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "D16")
public class D16 implements java.io.Serializable {

	// Fields
	//d
	private String d1600;
	private String d0100;
	private String d1601;
	private String d1601a;
	private String d1624;
	private String d1631;
	private String d1634;
	private String d1660;
	private String d1661;
	private String d1664;
	private String d1671;
	private String d1674;
	private String d1677;
	private String d1681;
	private String d1684;
	private String d1687;
	private String d1689;
	private Integer d1691;
	private Integer d1692;
	private Integer d1694;
	private Integer d1697;
	private String d1699;
	private String d16a1;
	private String d16a2;
	private String d16a3;
	private Timestamp d16a4;
	private String d16b1;
	private String d16b2;
	private String d16b3;
	private Integer d16b4;
	private String d16b5;
	private String d16b6;
	private String d16b7;
	private Integer sortid;
	private Integer d16b8;
	private Integer d16b9;
	private Integer d16b10;
	private String d16b11;
	private String d16b12;
	private String d16b13;
	private String d16b14;
	private Integer d16b15;
	private String d16b16;
	private String d16b17;
	private String d16b18;
	private Integer d16b19;
	private Double d16b20;

	// Constructors

	/** default constructor */
	public D16() {
	}

	/** minimal constructor */
	public D16(String d1600) {
		this.d1600 = d1600;
	}

	/** full constructor */
	public D16(String d1600, String d0100, String d1601, String d1601a,
			String d1624, String d1631, String d1634, String d1660,
			String d1661, String d1664, String d1671, String d1674,
			String d1677, String d1681, String d1684, String d1687,
			String d1689, Integer d1691, Integer d1692, Integer d1694,
			Integer d1697, String d1699, String d16a1, String d16a2,
			String d16a3, Timestamp d16a4, String d16b1, String d16b2,
			String d16b3, Integer d16b4, String d16b5, String d16b6,
			String d16b7, Integer sortid, Integer d16b8, Integer d16b9,
			Integer d16b10, String d16b11, String d16b12, String d16b13,
			String d16b14, Integer d16b15, String d16b16, String d16b17,
			String d16b18, Integer d16b19, Double d16b20) {
		this.d1600 = d1600;
		this.d0100 = d0100;
		this.d1601 = d1601;
		this.d1601a = d1601a;
		this.d1624 = d1624;
		this.d1631 = d1631;
		this.d1634 = d1634;
		this.d1660 = d1660;
		this.d1661 = d1661;
		this.d1664 = d1664;
		this.d1671 = d1671;
		this.d1674 = d1674;
		this.d1677 = d1677;
		this.d1681 = d1681;
		this.d1684 = d1684;
		this.d1687 = d1687;
		this.d1689 = d1689;
		this.d1691 = d1691;
		this.d1692 = d1692;
		this.d1694 = d1694;
		this.d1697 = d1697;
		this.d1699 = d1699;
		this.d16a1 = d16a1;
		this.d16a2 = d16a2;
		this.d16a3 = d16a3;
		this.d16a4 = d16a4;
		this.d16b1 = d16b1;
		this.d16b2 = d16b2;
		this.d16b3 = d16b3;
		this.d16b4 = d16b4;
		this.d16b5 = d16b5;
		this.d16b6 = d16b6;
		this.d16b7 = d16b7;
		this.sortid = sortid;
		this.d16b8 = d16b8;
		this.d16b9 = d16b9;
		this.d16b10 = d16b10;
		this.d16b11 = d16b11;
		this.d16b12 = d16b12;
		this.d16b13 = d16b13;
		this.d16b14 = d16b14;
		this.d16b15 = d16b15;
		this.d16b16 = d16b16;
		this.d16b17 = d16b17;
		this.d16b18 = d16b18;
		this.d16b19 = d16b19;
		this.d16b20 = d16b20;
	}

	// Property accessors
	@Id
	@Column(name = "D1600", unique = true, nullable = false, length = 32)
	public String getD1600() {
		return this.d1600;
	}

	public void setD1600(String d1600) {
		this.d1600 = d1600;
	}

	@Column(name = "D0100", length = 32)
	public String getD0100() {
		return this.d0100;
	}

	public void setD0100(String d0100) {
		this.d0100 = d0100;
	}

	@Column(name = "D1601", length = 50)
	public String getD1601() {
		return this.d1601;
	}

	public void setD1601(String d1601) {
		this.d1601 = d1601;
	}

	@Column(name = "D1601A")
	public String getD1601a() {
		return this.d1601a;
	}

	public void setD1601a(String d1601a) {
		this.d1601a = d1601a;
	}

	@Column(name = "D1624", length = 20)
	public String getD1624() {
		return this.d1624;
	}

	public void setD1624(String d1624) {
		this.d1624 = d1624;
	}

	@Column(name = "D1631", length = 20)
	public String getD1631() {
		return this.d1631;
	}

	public void setD1631(String d1631) {
		this.d1631 = d1631;
	}

	@Column(name = "D1634", length = 20)
	public String getD1634() {
		return this.d1634;
	}

	public void setD1634(String d1634) {
		this.d1634 = d1634;
	}

	@Column(name = "D1660", length = 20)
	public String getD1660() {
		return this.d1660;
	}

	public void setD1660(String d1660) {
		this.d1660 = d1660;
	}

	@Column(name = "D1661", length = 20)
	public String getD1661() {
		return this.d1661;
	}

	public void setD1661(String d1661) {
		this.d1661 = d1661;
	}

	@Column(name = "D1664", length = 20)
	public String getD1664() {
		return this.d1664;
	}

	public void setD1664(String d1664) {
		this.d1664 = d1664;
	}

	@Column(name = "D1671", length = 20)
	public String getD1671() {
		return this.d1671;
	}

	public void setD1671(String d1671) {
		this.d1671 = d1671;
	}

	@Column(name = "D1674", length = 20)
	public String getD1674() {
		return this.d1674;
	}

	public void setD1674(String d1674) {
		this.d1674 = d1674;
	}

	@Column(name = "D1677", length = 20)
	public String getD1677() {
		return this.d1677;
	}

	public void setD1677(String d1677) {
		this.d1677 = d1677;
	}

	@Column(name = "D1681", length = 20)
	public String getD1681() {
		return this.d1681;
	}

	public void setD1681(String d1681) {
		this.d1681 = d1681;
	}

	@Column(name = "D1684", length = 20)
	public String getD1684() {
		return this.d1684;
	}

	public void setD1684(String d1684) {
		this.d1684 = d1684;
	}

	@Column(name = "D1687", length = 20)
	public String getD1687() {
		return this.d1687;
	}

	public void setD1687(String d1687) {
		this.d1687 = d1687;
	}

	@Column(name = "D1689", length = 20)
	public String getD1689() {
		return this.d1689;
	}

	public void setD1689(String d1689) {
		this.d1689 = d1689;
	}

	@Column(name = "D1691", precision = 5, scale = 0)
	public Integer getD1691() {
		return this.d1691;
	}

	public void setD1691(Integer d1691) {
		this.d1691 = d1691;
	}

	@Column(name = "D1692", precision = 5, scale = 0)
	public Integer getD1692() {
		return this.d1692;
	}

	public void setD1692(Integer d1692) {
		this.d1692 = d1692;
	}

	@Column(name = "D1694", precision = 5, scale = 0)
	public Integer getD1694() {
		return this.d1694;
	}

	public void setD1694(Integer d1694) {
		this.d1694 = d1694;
	}

	@Column(name = "D1697", precision = 5, scale = 0)
	public Integer getD1697() {
		return this.d1697;
	}

	public void setD1697(Integer d1697) {
		this.d1697 = d1697;
	}

	@Column(name = "D1699", length = 20)
	public String getD1699() {
		return this.d1699;
	}

	public void setD1699(String d1699) {
		this.d1699 = d1699;
	}

	@Column(name = "D16A1", length = 10)
	public String getD16a1() {
		return this.d16a1;
	}

	public void setD16a1(String d16a1) {
		this.d16a1 = d16a1;
	}

	@Column(name = "D16A2", length = 20)
	public String getD16a2() {
		return this.d16a2;
	}

	public void setD16a2(String d16a2) {
		this.d16a2 = d16a2;
	}

	@Column(name = "D16A3", length = 32)
	public String getD16a3() {
		return this.d16a3;
	}

	public void setD16a3(String d16a3) {
		this.d16a3 = d16a3;
	}

	@Column(name = "D16A4", length = 7)
	public Timestamp getD16a4() {
		return this.d16a4;
	}

	public void setD16a4(Timestamp d16a4) {
		this.d16a4 = d16a4;
	}

	@Column(name = "D16B1", length = 20)
	public String getD16b1() {
		return this.d16b1;
	}

	public void setD16b1(String d16b1) {
		this.d16b1 = d16b1;
	}

	@Column(name = "D16B2", length = 20)
	public String getD16b2() {
		return this.d16b2;
	}

	public void setD16b2(String d16b2) {
		this.d16b2 = d16b2;
	}

	@Column(name = "D16B3", length = 20)
	public String getD16b3() {
		return this.d16b3;
	}

	public void setD16b3(String d16b3) {
		this.d16b3 = d16b3;
	}

	@Column(name = "D16B4", precision = 9, scale = 0)
	public Integer getD16b4() {
		return this.d16b4;
	}

	public void setD16b4(Integer d16b4) {
		this.d16b4 = d16b4;
	}

	@Column(name = "D16B5", length = 20)
	public String getD16b5() {
		return this.d16b5;
	}

	public void setD16b5(String d16b5) {
		this.d16b5 = d16b5;
	}

	@Column(name = "D16B6", length = 20)
	public String getD16b6() {
		return this.d16b6;
	}

	public void setD16b6(String d16b6) {
		this.d16b6 = d16b6;
	}

	@Column(name = "D16B7", length = 20)
	public String getD16b7() {
		return this.d16b7;
	}

	public void setD16b7(String d16b7) {
		this.d16b7 = d16b7;
	}

	@Column(name = "SORTID", precision = 5, scale = 0)
	public Integer getSortid() {
		return this.sortid;
	}

	public void setSortid(Integer sortid) {
		this.sortid = sortid;
	}

	@Column(name = "D16B8", precision = 5, scale = 0)
	public Integer getD16b8() {
		return this.d16b8;
	}

	public void setD16b8(Integer d16b8) {
		this.d16b8 = d16b8;
	}

	@Column(name = "D16B9", precision = 5, scale = 0)
	public Integer getD16b9() {
		return this.d16b9;
	}

	public void setD16b9(Integer d16b9) {
		this.d16b9 = d16b9;
	}

	@Column(name = "D16B10", precision = 5, scale = 0)
	public Integer getD16b10() {
		return this.d16b10;
	}

	public void setD16b10(Integer d16b10) {
		this.d16b10 = d16b10;
	}

	@Column(name = "D16B11", length = 20)
	public String getD16b11() {
		return this.d16b11;
	}

	public void setD16b11(String d16b11) {
		this.d16b11 = d16b11;
	}

	@Column(name = "D16B12", length = 20)
	public String getD16b12() {
		return this.d16b12;
	}

	public void setD16b12(String d16b12) {
		this.d16b12 = d16b12;
	}

	@Column(name = "D16B13", length = 4000)
	public String getD16b13() {
		return this.d16b13;
	}

	public void setD16b13(String d16b13) {
		this.d16b13 = d16b13;
	}

	@Column(name = "D16B14", length = 1)
	public String getD16b14() {
		return this.d16b14;
	}

	public void setD16b14(String d16b14) {
		this.d16b14 = d16b14;
	}

	@Column(name = "D16B15", precision = 9, scale = 0)
	public Integer getD16b15() {
		return this.d16b15;
	}

	public void setD16b15(Integer d16b15) {
		this.d16b15 = d16b15;
	}

	@Column(name = "D16B16", length = 20)
	public String getD16b16() {
		return this.d16b16;
	}

	public void setD16b16(String d16b16) {
		this.d16b16 = d16b16;
	}

	@Column(name = "D16B17", length = 1)
	public String getD16b17() {
		return this.d16b17;
	}

	public void setD16b17(String d16b17) {
		this.d16b17 = d16b17;
	}

	@Column(name = "D16B18", length = 128)
	public String getD16b18() {
		return this.d16b18;
	}

	public void setD16b18(String d16b18) {
		this.d16b18 = d16b18;
	}

	@Column(name = "D16B19", precision = 9, scale = 0)
	public Integer getD16b19() {
		return this.d16b19;
	}

	public void setD16b19(Integer d16b19) {
		this.d16b19 = d16b19;
	}

	@Column(name = "D16B20", precision = 0)
	public Double getD16b20() {
		return this.d16b20;
	}

	public void setD16b20(Double d16b20) {
		this.d16b20 = d16b20;
	}

}