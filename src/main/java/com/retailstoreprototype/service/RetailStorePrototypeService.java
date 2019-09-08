package com.retailstoreprototype.service;
import org.springframework.stereotype.Service;
import com.retailstoreprototype.model.Amount;
import com.retailstoreprototype.model.Customer;
@Service
public class RetailStorePrototypeService {
    public Amount start(Customer customer) {
    	Amount amount = new Amount();
    	double netPaybleAmount = 0.0;
    	double employeeDiscount = 0.0;
    	double affiliateDiscount = 0.0;
    	double twoYearDiscount = 0.0;
    	double saleDiscount = 0.0;
    	double employeeDiscountMultiple = 0.30;
    	double AffiliateDiscountMultiple = 0.10;
    	double twoYearDiscountMultiple = 0.05;
    	double saleAmountDiscountMultiple = 5;
    	Boolean isGetDiscount = false;		
    	double paybleAmount = customer.getPaybleAmount();
    	if(paybleAmount >100)
    	{
    		int saleDiscountMultiple = (int)paybleAmount/100;
    		saleDiscount = saleAmountDiscountMultiple*saleDiscountMultiple;
    	}
    	if(!customer.getIsGrocery())
    	{
    		if(customer.getIsEmployee() && isGetDiscount.equals(false))
    		{
    			employeeDiscount = paybleAmount * employeeDiscountMultiple;
    			isGetDiscount = true;
    		}
    		if(customer.getIsAffiliate() && isGetDiscount.equals(false))
    		{
    			affiliateDiscount = paybleAmount * AffiliateDiscountMultiple;
    			isGetDiscount = true;
    		}
    		if(customer.getIsTwoYearsOld() && isGetDiscount.equals(false))
    		{
    			twoYearDiscount = paybleAmount * twoYearDiscountMultiple;
    			isGetDiscount = true;
    		}
    		double totalDiscount = employeeDiscount + affiliateDiscount + twoYearDiscount + saleDiscount;
    		netPaybleAmount = paybleAmount - totalDiscount;
    		amount.setPaybleAmount(netPaybleAmount);
    	}
    	else
    	{
    		double grocerysalediscount  = paybleAmount - saleDiscount;
    		amount.setPaybleAmount(grocerysalediscount);
    	}
    	return amount;
    }
}