package hibernateHelper;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FeeNormalPayBak entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FEE_NORMAL_PAY_BAK")
public class FeeNormalPayBak implements java.io.Serializable {

	// Fields

	private String normalPayId;
	private String feeOrgCode;
	private String feeUserId;
	private Double feeUserIncome;
	private Double feeUserOwe;
	private Double userMonFee;
	private String preparePayStartdate;
	private Double paymentTotalSum;
	private Date paymentDate;
	private String paymentStatus;
	private String preparePayEnddate;
	private String operUserId;
	private String operOrgCode;
	private String partnerOrgCode;
	private String paymentMethod;
	private String isDerate;
	private Date bakTime;

	// Constructors

	/** default constructor */
	public FeeNormalPayBak() {
	}

	/** minimal constructor */
	public FeeNormalPayBak(String normalPayId, String feeOrgCode,
			String feeUserId, Double feeUserOwe, Double paymentTotalSum,
			Date paymentDate, String paymentStatus, String paymentMethod) {
		this.normalPayId = normalPayId;
		this.feeOrgCode = feeOrgCode;
		this.feeUserId = feeUserId;
		this.feeUserOwe = feeUserOwe;
		this.paymentTotalSum = paymentTotalSum;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
		this.paymentMethod = paymentMethod;
	}

	/** full constructor */
	public FeeNormalPayBak(String normalPayId, String feeOrgCode,
			String feeUserId, Double feeUserIncome, Double feeUserOwe,
			Double userMonFee, String preparePayStartdate,
			Double paymentTotalSum, Date paymentDate,
			String paymentStatus, String preparePayEnddate, String operUserId,
			String operOrgCode, String partnerOrgCode, String paymentMethod,
			String isDerate, Date bakTime) {
		this.normalPayId = normalPayId;
		this.feeOrgCode = feeOrgCode;
		this.feeUserId = feeUserId;
		this.feeUserIncome = feeUserIncome;
		this.feeUserOwe = feeUserOwe;
		this.userMonFee = userMonFee;
		this.preparePayStartdate = preparePayStartdate;
		this.paymentTotalSum = paymentTotalSum;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
		this.preparePayEnddate = preparePayEnddate;
		this.operUserId = operUserId;
		this.operOrgCode = operOrgCode;
		this.partnerOrgCode = partnerOrgCode;
		this.paymentMethod = paymentMethod;
		this.isDerate = isDerate;
		this.bakTime = bakTime;
	}

	// Property accessors
	@Id
	@Column(name = "NORMAL_PAY_ID", unique = true, nullable = false, length = 16)
	public String getNormalPayId() {
		return this.normalPayId;
	}

	public void setNormalPayId(String normalPayId) {
		this.normalPayId = normalPayId;
	}

	@Column(name = "FEE_ORG_CODE", nullable = false, length = 30)
	public String getFeeOrgCode() {
		return this.feeOrgCode;
	}

	public void setFeeOrgCode(String feeOrgCode) {
		this.feeOrgCode = feeOrgCode;
	}

	@Column(name = "FEE_USER_ID", nullable = false, length = 16)
	public String getFeeUserId() {
		return this.feeUserId;
	}

	public void setFeeUserId(String feeUserId) {
		this.feeUserId = feeUserId;
	}

	@Column(name = "FEE_USER_INCOME", precision = 20)
	public Double getFeeUserIncome() {
		return this.feeUserIncome;
	}

	public void setFeeUserIncome(Double feeUserIncome) {
		this.feeUserIncome = feeUserIncome;
	}

	@Column(name = "FEE_USER_OWE", nullable = false, precision = 20)
	public Double getFeeUserOwe() {
		return this.feeUserOwe;
	}

	public void setFeeUserOwe(Double feeUserOwe) {
		this.feeUserOwe = feeUserOwe;
	}

	@Column(name = "USER_MON_FEE", precision = 20)
	public Double getUserMonFee() {
		return this.userMonFee;
	}

	public void setUserMonFee(Double userMonFee) {
		this.userMonFee = userMonFee;
	}

	@Column(name = "PREPARE_PAY_STARTDATE", length = 10)
	public String getPreparePayStartdate() {
		return this.preparePayStartdate;
	}

	public void setPreparePayStartdate(String preparePayStartdate) {
		this.preparePayStartdate = preparePayStartdate;
	}

	@Column(name = "PAYMENT_TOTAL_SUM", nullable = false, precision = 20)
	public Double getPaymentTotalSum() {
		return this.paymentTotalSum;
	}

	public void setPaymentTotalSum(Double paymentTotalSum) {
		this.paymentTotalSum = paymentTotalSum;
	}

	@Column(name = "PAYMENT_DATE", nullable = false, length = 7)
	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Column(name = "PAYMENT_STATUS", nullable = false, length = 1)
	public String getPaymentStatus() {
		return this.paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Column(name = "PREPARE_PAY_ENDDATE", length = 10)
	public String getPreparePayEnddate() {
		return this.preparePayEnddate;
	}

	public void setPreparePayEnddate(String preparePayEnddate) {
		this.preparePayEnddate = preparePayEnddate;
	}

	@Column(name = "OPER_USER_ID", length = 16)
	public String getOperUserId() {
		return this.operUserId;
	}

	public void setOperUserId(String operUserId) {
		this.operUserId = operUserId;
	}

	@Column(name = "OPER_ORG_CODE", length = 30)
	public String getOperOrgCode() {
		return this.operOrgCode;
	}

	public void setOperOrgCode(String operOrgCode) {
		this.operOrgCode = operOrgCode;
	}

	@Column(name = "PARTNER_ORG_CODE", length = 30)
	public String getPartnerOrgCode() {
		return this.partnerOrgCode;
	}

	public void setPartnerOrgCode(String partnerOrgCode) {
		this.partnerOrgCode = partnerOrgCode;
	}

	@Column(name = "PAYMENT_METHOD", nullable = false, length = 2)
	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Column(name = "IS_DERATE", length = 1)
	public String getIsDerate() {
		return this.isDerate;
	}

	public void setIsDerate(String isDerate) {
		this.isDerate = isDerate;
	}

	@Column(name = "BAK_TIME", length = 7)
	public Date getBakTime() {
		return this.bakTime;
	}

	public void setBakTime(Date bakTime) {
		this.bakTime = bakTime;
	}

}