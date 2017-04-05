package hibernateHelper;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * E07Id entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class OrgGeneralId implements java.io.Serializable {

	// Fields

	private String orgId;
	private Long term;

	// Constructors

	/** default constructor */
	public OrgGeneralId() {
	}

	/** full constructor */
	public OrgGeneralId(String orgId, Long term) {
		this.orgId = orgId;
		this.term = term;
	}

	// Property accessors

	@Column(name = "D0100", nullable = false, length = 32)
	public String getD0100() {
		return this.orgId;
	}

	public void setD0100(String orgId) {
		this.orgId = orgId;
	}

	@Column(name = "E0702", nullable = false, precision = 0)
	public Long getE0702() {
		return this.term;
	}

	public void setE0702(Long term) {
		this.term = term;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrgGeneralId))
			return false;
		OrgGeneralId castOther = (OrgGeneralId) other;

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