package hibernateHelper;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * F11InId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class F11InId implements java.io.Serializable {

	// Fields

	private String a0100;
	private String f1100;
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

	// Constructors

	/** default constructor */
	public F11InId() {
	}

	/** minimal constructor */
	public F11InId(String f1100) {
		this.f1100 = f1100;
	}

	/** full constructor */
	public F11InId(String a0100, String f1100, Timestamp f1101, String f1102,
			String f1103, String f1104, Timestamp f1105, String f1106,
			String f1107, String f1109, String f1110, String f1111,
			String f1112, String f1114, String f1115, String f1116,
			Timestamp f1117, String f1119, String f1127, String d0100,
			String isMain, String f1108, String f1120) {
		this.a0100 = a0100;
		this.f1100 = f1100;
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
	}

	// Property accessors

	@Column(name = "A0100", length = 32)
	public String getA0100() {
		return this.a0100;
	}

	public void setA0100(String a0100) {
		this.a0100 = a0100;
	}

	@Column(name = "F1100", nullable = false, length = 32)
	public String getF1100() {
		return this.f1100;
	}

	public void setF1100(String f1100) {
		this.f1100 = f1100;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof F11InId))
			return false;
		F11InId castOther = (F11InId) other;

		return ((this.getA0100() == castOther.getA0100()) || (this.getA0100() != null
				&& castOther.getA0100() != null && this.getA0100().equals(
				castOther.getA0100())))
				&& ((this.getF1100() == castOther.getF1100()) || (this
						.getF1100() != null && castOther.getF1100() != null && this
						.getF1100().equals(castOther.getF1100())))
				&& ((this.getF1101() == castOther.getF1101()) || (this
						.getF1101() != null && castOther.getF1101() != null && this
						.getF1101().equals(castOther.getF1101())))
				&& ((this.getF1102() == castOther.getF1102()) || (this
						.getF1102() != null && castOther.getF1102() != null && this
						.getF1102().equals(castOther.getF1102())))
				&& ((this.getF1103() == castOther.getF1103()) || (this
						.getF1103() != null && castOther.getF1103() != null && this
						.getF1103().equals(castOther.getF1103())))
				&& ((this.getF1104() == castOther.getF1104()) || (this
						.getF1104() != null && castOther.getF1104() != null && this
						.getF1104().equals(castOther.getF1104())))
				&& ((this.getF1105() == castOther.getF1105()) || (this
						.getF1105() != null && castOther.getF1105() != null && this
						.getF1105().equals(castOther.getF1105())))
				&& ((this.getF1106() == castOther.getF1106()) || (this
						.getF1106() != null && castOther.getF1106() != null && this
						.getF1106().equals(castOther.getF1106())))
				&& ((this.getF1107() == castOther.getF1107()) || (this
						.getF1107() != null && castOther.getF1107() != null && this
						.getF1107().equals(castOther.getF1107())))
				&& ((this.getF1109() == castOther.getF1109()) || (this
						.getF1109() != null && castOther.getF1109() != null && this
						.getF1109().equals(castOther.getF1109())))
				&& ((this.getF1110() == castOther.getF1110()) || (this
						.getF1110() != null && castOther.getF1110() != null && this
						.getF1110().equals(castOther.getF1110())))
				&& ((this.getF1111() == castOther.getF1111()) || (this
						.getF1111() != null && castOther.getF1111() != null && this
						.getF1111().equals(castOther.getF1111())))
				&& ((this.getF1112() == castOther.getF1112()) || (this
						.getF1112() != null && castOther.getF1112() != null && this
						.getF1112().equals(castOther.getF1112())))
				&& ((this.getF1114() == castOther.getF1114()) || (this
						.getF1114() != null && castOther.getF1114() != null && this
						.getF1114().equals(castOther.getF1114())))
				&& ((this.getF1115() == castOther.getF1115()) || (this
						.getF1115() != null && castOther.getF1115() != null && this
						.getF1115().equals(castOther.getF1115())))
				&& ((this.getF1116() == castOther.getF1116()) || (this
						.getF1116() != null && castOther.getF1116() != null && this
						.getF1116().equals(castOther.getF1116())))
				&& ((this.getF1117() == castOther.getF1117()) || (this
						.getF1117() != null && castOther.getF1117() != null && this
						.getF1117().equals(castOther.getF1117())))
				&& ((this.getF1119() == castOther.getF1119()) || (this
						.getF1119() != null && castOther.getF1119() != null && this
						.getF1119().equals(castOther.getF1119())))
				&& ((this.getF1127() == castOther.getF1127()) || (this
						.getF1127() != null && castOther.getF1127() != null && this
						.getF1127().equals(castOther.getF1127())))
				&& ((this.getD0100() == castOther.getD0100()) || (this
						.getD0100() != null && castOther.getD0100() != null && this
						.getD0100().equals(castOther.getD0100())))
				&& ((this.getIsMain() == castOther.getIsMain()) || (this
						.getIsMain() != null && castOther.getIsMain() != null && this
						.getIsMain().equals(castOther.getIsMain())))
				&& ((this.getF1108() == castOther.getF1108()) || (this
						.getF1108() != null && castOther.getF1108() != null && this
						.getF1108().equals(castOther.getF1108())))
				&& ((this.getF1120() == castOther.getF1120()) || (this
						.getF1120() != null && castOther.getF1120() != null && this
						.getF1120().equals(castOther.getF1120())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getA0100() == null ? 0 : this.getA0100().hashCode());
		result = 37 * result
				+ (getF1100() == null ? 0 : this.getF1100().hashCode());
		result = 37 * result
				+ (getF1101() == null ? 0 : this.getF1101().hashCode());
		result = 37 * result
				+ (getF1102() == null ? 0 : this.getF1102().hashCode());
		result = 37 * result
				+ (getF1103() == null ? 0 : this.getF1103().hashCode());
		result = 37 * result
				+ (getF1104() == null ? 0 : this.getF1104().hashCode());
		result = 37 * result
				+ (getF1105() == null ? 0 : this.getF1105().hashCode());
		result = 37 * result
				+ (getF1106() == null ? 0 : this.getF1106().hashCode());
		result = 37 * result
				+ (getF1107() == null ? 0 : this.getF1107().hashCode());
		result = 37 * result
				+ (getF1109() == null ? 0 : this.getF1109().hashCode());
		result = 37 * result
				+ (getF1110() == null ? 0 : this.getF1110().hashCode());
		result = 37 * result
				+ (getF1111() == null ? 0 : this.getF1111().hashCode());
		result = 37 * result
				+ (getF1112() == null ? 0 : this.getF1112().hashCode());
		result = 37 * result
				+ (getF1114() == null ? 0 : this.getF1114().hashCode());
		result = 37 * result
				+ (getF1115() == null ? 0 : this.getF1115().hashCode());
		result = 37 * result
				+ (getF1116() == null ? 0 : this.getF1116().hashCode());
		result = 37 * result
				+ (getF1117() == null ? 0 : this.getF1117().hashCode());
		result = 37 * result
				+ (getF1119() == null ? 0 : this.getF1119().hashCode());
		result = 37 * result
				+ (getF1127() == null ? 0 : this.getF1127().hashCode());
		result = 37 * result
				+ (getD0100() == null ? 0 : this.getD0100().hashCode());
		result = 37 * result
				+ (getIsMain() == null ? 0 : this.getIsMain().hashCode());
		result = 37 * result
				+ (getF1108() == null ? 0 : this.getF1108().hashCode());
		result = 37 * result
				+ (getF1120() == null ? 0 : this.getF1120().hashCode());
		return result;
	}

}