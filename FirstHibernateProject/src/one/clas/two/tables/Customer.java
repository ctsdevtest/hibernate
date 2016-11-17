package one.clas.two.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
@SecondaryTable(name="CustomerDetails")
public class Customer {

	private int customerId;
	private String customerName;
	private String customerAddress;
	private int creditScore;
	private int rewardsPoints;
	
	/**
	 * @return the customerId
	 */
	@Id
	@GeneratedValue
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerAddress
	 */
	@Column(table="CustomerDetails")
	public String getCustomerAddress() {
		return customerAddress;
	}
	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	/**
	 * @return the creditScore
	 */
	@Column(table="CustomerDetails")
	public int getCreditScore() {
		return creditScore;
	}
	/**
	 * @param creditScore the creditScore to set
	 */
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	/**
	 * @return the rewardsPoints
	 */
	@Column(table="CustomerDetails")
	public int getRewardsPoints() {
		return rewardsPoints;
	}
	/**
	 * @param rewardsPoints the rewardsPoints to set
	 */
	public void setRewardsPoints(int rewardsPoints) {
		this.rewardsPoints = rewardsPoints;
	}
	
	
	
}
