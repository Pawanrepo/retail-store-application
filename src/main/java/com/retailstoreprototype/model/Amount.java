package com.retailstoreprototype.model;
public class Amount {
	private Double paybleAmount;
	
	public Amount() {
    }
	
	public Amount(double paybleAmount) {
        this.paybleAmount = paybleAmount;
    }

		public Double getPaybleAmount() {
		return paybleAmount;
	}

	public void setPaybleAmount(Double paybleAmount) {
		this.paybleAmount = paybleAmount;
	}
	
}
