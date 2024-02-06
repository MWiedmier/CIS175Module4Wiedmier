/**
 * @author Mandy Wiedmier - mwiedmier2
 * CIS175 - Spring 2024
 * Feb 6, 2024
 */
package model;

import java.text.DecimalFormat;

/**
 * 
 */
public class Register {
	private double orderCost;
	private double customerPayment;
	private String changeBack;
	private String amountOwed;
	
	
	/**
	 * 
	 */
	public Register() {
		super();
		this.orderCost = 0;
		this.customerPayment = 0;
		orderPayment(orderCost, customerPayment);
	}

	/**
	 * @param orderCost
	 * @param customerPayment
	 */
	public Register(double orderCost, double customerPayment) {
		super();
		this.orderCost = orderCost;
		this.customerPayment = customerPayment;
		orderPayment(orderCost, customerPayment);
	}
	
	//Getters and Setters
	/**
	 * @return the orderCost
	 */
	public double getOrderCost() {
		return orderCost;
	}
	/**
	 * @param orderCost the orderCost to set
	 */
	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}
	/**
	 * @return the customerPayment
	 */
	public double getCustomerPayment() {
		return customerPayment;
	}
	/**
	 * @param customerPayment the customerPayment to set
	 */
	public void setCustomerPayment(double customerPayment) {
		this.customerPayment = customerPayment;
	}
	/**
	 * @return the changeBack
	 */
	public String getChangeBack() {
		return changeBack;
	}
	/**
	 * @param changeBack the changeBack to set
	 */
	private void setChangeBack(String changeBack) {
		this.changeBack = changeBack;
	}
	/**
	 * @return the amountOwed
	 */
	public String getAmountOwed() {
		return amountOwed;
	}
	/**
	 * @param amountOwed the amountOwed to set
	 */
	private void setAmountOwed(String amountOwed) {
		this.amountOwed = amountOwed;
	}
	
	//Methods
	/**
	 * @param cost the cost of the order
	 * @param givenAmount the amount given to pay
	 * determines what to set for the amount owed and change back
	 */
	public void orderPayment(double cost, double givenAmount) {
		DecimalFormat df = new DecimalFormat("###.00");
		
		if(cost == givenAmount) { //No change back and nothing owed
			setAmountOwed("$" + df.format(0).toString());
			setChangeBack("$" + df.format(0).toString());
		}
		else if (cost < givenAmount) { //Change is owed
			double difference = givenAmount - cost;
			setAmountOwed("$" + df.format(0).toString());
			setChangeBack("$" + df.format(difference).toString());
		}
		else { //Not enough to cover cost
			double difference = cost - givenAmount;
			setAmountOwed("$" + df.format(difference).toString());
			setChangeBack("$" + df.format(0).toString());
		}
	}
	
	
	@Override
	public String toString() {
		return "Register [orderCost=" + orderCost + ", customerPayment=" + customerPayment + ", changeBack="
				+ changeBack + ", amountOwed=" + amountOwed + "]";
	}
}
