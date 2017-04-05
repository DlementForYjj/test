package hibernateHelper;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D22Id entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class D22Id implements java.io.Serializable {

	// Fields

	private String a0100;
	private String d1600;

	// Constructors

	/** default constructor */
	public D22Id() {
	}

	/** full constructor */
	public D22Id(String a0100, String d1600) {
		this.a0100 = a0100;
		this.d1600 = d1600;
	}

	// Property accessors

	@Column(name = "A0100", nullable = false, length = 32)
	public String getA0100() {
		return this.a0100;
	}

	public void setA0100(String a0100) {
		this.a0100 = a0100;
	}

	@Column(name = "D1600", nullable = false, length = 32)
	public String getD1600() {
		return this.d1600;
	}

	public void setD1600(String d1600) {
		this.d1600 = d1600;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D22Id))
			return false;
		D22Id castOther = (D22Id) other;

		return ((this.getA0100() == castOther.getA0100()) || (this.getA0100() != null
				&& castOther.getA0100() != null && this.getA0100().equals(
				castOther.getA0100())))
				&& ((this.getD1600() == castOther.getD1600()) || (this
						.getD1600() != null && castOther.getD1600() != null && this
						.getD1600().equals(castOther.getD1600())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getA0100() == null ? 0 : this.getA0100().hashCode());
		result = 37 * result
				+ (getD1600() == null ? 0 : this.getD1600().hashCode());
		return result;
	}

}