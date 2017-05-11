package hibernateHelper;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * F11In entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "F11_IN", schema = "PAM")
public class F11In implements java.io.Serializable {

	// Fields

	private String f1100;
	private String a0100;
	private Timestamp f1101;
	private String f1102;
	private String f1103;
	private String f1104;
	private Timestamp f1105;
	private String f1106;
	private String f1107;
	private String f1109;
	private String f1110;
	private String f1111;
	private String f1112;
	private String f1114;
	private String f1115;
	private String f1116;
	private Timestamp f1117;
	private String f1119;
	private String f1127;
	private String d0100;
	private String isMain;
	private String f1108;
	private String f1120;
	private String d0101;
	private String f1121;

	// Constructors

	/** default constructor */
	public F11In() {
	}

	/** minimal constructor */
	public F11In(String f1100) {
		this.f1100 = f1100;
	}

	/** full constructor */
	public F11In(String f1100, String a0100, Timestamp f1101, String f1102,
			String f1103, String f1104, Timestamp f1105, String f1106,
			String f1107, String f1109, String f1110, String f1111,
			String f1112, String f1114, String f1115, String f1116,
			Timestamp f1117, String f1119, String f1127, String d0100,
			String isMain, String f1108, String f1120, String d0101,
			String f1121) {
		this.f1100 = f1100;
		this.a0100 = a0100;
		this.f1101 = f1101;
		this.f1102 = f1102;
		this.f1103 = f1103;
		this.f1104 = f1104;
		this.f1105 = f1105;
		this.f1106 = f1106;
		this.f1107 = f1107;
		this.f1109 = f1109;
		this.f1110 = f1110;
		this.f1111 = f1111;
		this.f1112 = f1112;
		this.f1114 = f1114;
		this.f1115 = f1115;
		this.f1116 = f1116;
		this.f1117 = f1117;
		this.f1119 = f1119;
		this.f1127 = f1127;
		this.d0100 = d0100;
		this.isMain = isMain;
		this.f1108 = f1108;
		this.f1120 = f1120;
		this.d0101 = d0101;
		this.f1121 = f1121;
	}

	// Property accessors
	@Id
	@Column(name = "F1100", unique = true, nullable = false, length = 32)
	public String getF1100() {
		return this.f1100;
	}

	public void setF1100(String f1100) {
		this.f1100 = f1100;
	}

	@Column(name = "A0100", length = 32)
	public String getA0100() {
		return this.a0100;
	}

	public void setA0100(String a0100) {
		this.a0100 = a0100;
	}

	@Column(name = "F1101", length = 7)
	public Timestamp getF1101() {
		return this.f1101;
	}

	public void setF1101(Timestamp f1101) {
		this.f1101 = f1101;
	}

	@Column(name = "F1102", length = 20)
	public String getF1102() {
		return this.f1102;
	}

	public void setF1102(String f1102) {
		this.f1102 = f1102;
	}

	@Column(name = "F1103", length = 20)
	public String getF1103() {
		return this.f1103;
	}

	public void setF1103(String f1103) {
		this.f1103 = f1103;
	}

	@Column(name = "F1104", length = 20)
	public String getF1104() {
		return this.f1104;
	}

	public void setF1104(String f1104) {
		this.f1104 = f1104;
	}

	@Column(name = "F1105", length = 7)
	public Timestamp getF1105() {
		return this.f1105;
	}

	public void setF1105(Timestamp f1105) {
		this.f1105 = f1105;
	}

	@Column(name = "F1106")
	public String getF1106() {
		return this.f1106;
	}

	public void setF1106(String f1106) {
		this.f1106 = f1106;
	}

	@Column(name = "F1107", length = 40)
	public String getF1107() {
		return this.f1107;
	}

	public void setF1107(String f1107) {
		this.f1107 = f1107;
	}

	@Column(name = "F1109", length = 512)
	public String getF1109() {
		return this.f1109;
	}

	public void setF1109(String f1109) {
		this.f1109 = f1109;
	}

	@Column(name = "F1110", length = 6)
	public String getF1110() {
		return this.f1110;
	}

	public void setF1110(String f1110) {
		this.f1110 = f1110;
	}

	@Column(name = "F1111", length = 40)
	public String getF1111() {
		return this.f1111;
	}

	public void setF1111(String f1111) {
		this.f1111 = f1111;
	}

	@Column(name = "F1112", length = 50)
	public String getF1112() {
		return this.f1112;
	}

	public void setF1112(String f1112) {
		this.f1112 = f1112;
	}

	@Column(name = "F1114")
	public String getF1114() {
		return this.f1114;
	}

	public void setF1114(String f1114) {
		this.f1114 = f1114;
	}

	@Column(name = "F1115", length = 20)
	public String getF1115() {
		return this.f1115;
	}

	public void setF1115(String f1115) {
		this.f1115 = f1115;
	}

	@Column(name = "F1116", length = 32)
	public String getF1116() {
		return this.f1116;
	}

	public void setF1116(String f1116) {
		this.f1116 = f1116;
	}

	@Column(name = "F1117", length = 7)
	public Timestamp getF1117() {
		return this.f1117;
	}

	public void setF1117(Timestamp f1117) {
		this.f1117 = f1117;
	}

	@Column(name = "F1119", length = 20)
	public String getF1119() {
		return this.f1119;
	}

	public void setF1119(String f1119) {
		this.f1119 = f1119;
	}

	@Column(name = "F1127", length = 20)
	public String getF1127() {
		return this.f1127;
	}

	public void setF1127(String f1127) {
		this.f1127 = f1127;
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

	@Column(name = "F1108", length = 4000)
	public String getF1108() {
		return this.f1108;
	}

	public void setF1108(String f1108) {
		this.f1108 = f1108;
	}

	@Column(name = "F1120", length = 6)
	public String getF1120() {
		return this.f1120;
	}

	public void setF1120(String f1120) {
		this.f1120 = f1120;
	}

	@Column(name = "D0101")
	public String getD0101() {
		return this.d0101;
	}

	public void setD0101(String d0101) {
		this.d0101 = d0101;
	}

	@Column(name = "F1121")
	public String getF1121() {
		return this.f1121;
	}

	public void setF1121(String f1121) {
		this.f1121 = f1121;
	}

}