package hibernateHelper;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * E07Id entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class E07Id implements java.io.Serializable {

	// Fields

	private String d0100;
	private Integer e0702;

	// Constructors

	/** default constructor */
	public E07Id() {
	}

	/** full constructor */
	public E07Id(String d0100, Integer e0702) {
		this.d0100 = d0100;
		this.e0702 = e0702;
	}

	// Property accessors

	@Column(name = "D0100", nullable = false, length = 32)
	public String getD0100() {
		return this.d0100;
	}

	public void setD0100(String d0100) {
		this.d0100 = d0100;
	}

	@Column(name = "E0702", nullable = false, precision = 9, scale = 0)
	public Integer getE0702() {
		return this.e0702;
	}

	public void setE0702(Integer e0702) {
		this.e0702 = e0702;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof E07Id))
			return false;
		E07Id castOther = (E07Id) other;

		return ((this.getD0100() == castOther.getD0100()) || (this.getD0100() != null
				&& castOther.getD0100() != null && this.getD0100().equals(
				castOther.getD0100())))
				&& ((this.getE0702() == castOther.getE0702()) || (this
						.getE0702() != null && castOther.getE0702() != null && this
						.getE0702().equals(castOther.getE0702())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getD0100() == null ? 0 : this.getD0100().hashCode());
		result = 37 * result
				+ (getE0702() == null ? 0 : this.getE0702().hashCode());
		return result;
	}

}