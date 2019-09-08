package com.retailstoreprototype.model;
public class Customer {
	private Boolean isEmployee;
	private Boolean isAffiliate;
	private Boolean isTwoYearsOld;
	private Boolean isGrocery;
	private Double paybleAmount;
	
	public Customer() {
    }
	
	public Customer(Boolean isEmployee, Boolean isAffiliate, Boolean isTwoYearOld,Boolean isGrocery,Double paybleAmount) {
        this.isEmployee = isEmployee;
        this.isAffiliate = isAffiliate;
        this.isTwoYearsOld = isTwoYearOld;
        this.isGrocery = isGrocery;
        this.paybleAmount = paybleAmount;
    }

	public Boolean getIsEmployee() {
		return isEmployee;
	}

	public void setIsEmployee(Boolean isEmployee) {
		this.isEmployee = isEmployee;
	}

	public Boolean getIsAffiliate() {
		return isAffiliate;
	}

	public void setIsAffiliate(Boolean isAffiliate) {
		this.isAffiliate = isAffiliate;
	}

	public Boolean getIsTwoYearsOld() {
		return isTwoYearsOld;
	}

	public void setIsTwoYearsOld(Boolean isTwoYearsOld) {
		this.isTwoYearsOld = isTwoYearsOld;
	}

	public Boolean getIsGrocery() {
		return isGrocery;
	}

	public void setIsGrocery(Boolean isGrocery) {
		this.isGrocery = isGrocery;
	}

	public Double getPaybleAmount() {
		return paybleAmount;
	}

	public void setPaybleAmount(Double paybleAmount) {
		this.paybleAmount = paybleAmount;
	}
	
}
