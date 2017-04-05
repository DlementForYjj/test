package hibernateHelper;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * D22 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "D22", schema = "PAM")
public class D22 implements java.io.Serializable {

	// Fields

	private D22Id id;
	private String isMain;

	// Constructors

	/** default constructor */
	public D22() {
	}

	/** minimal constructor */
	public D22(D22Id id) {
		this.id = id;
	}

	/** full constructor */
	public D22(D22Id id, String isMain) {
		this.id = id;
		this.isMain = isMain;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "a0100", column = @Column(name = "A0100", nullable = false, length = 32)),
			@AttributeOverride(name = "d1600", column = @Column(name = "D1600", nullable = false, length = 32)) })
	public D22Id getId() {
		return this.id;
	}

	public void setId(D22Id id) {
		this.id = id;
	}

	@Column(name = "IS_MAIN", length = 1)
	public String getIsMain() {
		return this.isMain;
	}

	public void setIsMain(String isMain) {
		this.isMain = isMain;
	}

}