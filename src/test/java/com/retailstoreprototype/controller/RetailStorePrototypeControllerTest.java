package com.retailstoreprototype.controller;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.retailstoreprototype.model.Amount;
import com.retailstoreprototype.model.Customer;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RetailStorePrototypeControllerTest
{
    @Autowired
    private TestRestTemplate template;
    @Test
    public void employeeDiscountTest() 
    {
        Amount amount = new Amount();
        amount.setPaybleAmount(650.0);
        Customer customer = new Customer();
        customer.setIsEmployee(true);
        customer.setIsGrocery(false);
        customer.setIsAffiliate(false);
        customer.setIsTwoYearsOld(false);
        customer.setPaybleAmount(1000.0);
        HttpEntity<Object> CustomerEntity = getHttpEntity(customer);
        ResponseEntity<Amount> resultAsset = template.postForEntity("/discount", CustomerEntity, Amount.class);
        Assert.assertEquals(resultAsset.getBody().getPaybleAmount(), amount.getPaybleAmount());
    }
    @Test
    public void storeDiscountTest() 
    {
    	Amount amount = new Amount();
    	amount.setPaybleAmount(850.0);
        Customer customer = new Customer();
        customer.setIsEmployee(false);
        customer.setIsGrocery(false);
        customer.setIsAffiliate(true);
        customer.setIsTwoYearsOld(false);
        customer.setPaybleAmount(1000.0);
        HttpEntity<Object> CustomerEntity = getHttpEntity(customer);
        ResponseEntity<Amount> resultAsset = template.postForEntity("/discount", CustomerEntity, Amount.class);
        Assert.assertEquals(resultAsset.getBody().getPaybleAmount(), amount.getPaybleAmount());
    }
    @Test
    public void twoYearDiscountTest() 
    {
    	Amount amount = new Amount();
    	amount.setPaybleAmount(900.0);
        Customer customer = new Customer();
        customer.setIsEmployee(false);
        customer.setIsGrocery(false);
        customer.setIsAffiliate(false);
        customer.setIsTwoYearsOld(true);
        customer.setPaybleAmount(1000.0);
        HttpEntity<Object> CustomerEntity = getHttpEntity(customer);
        ResponseEntity<Amount> resultAsset = template.postForEntity("/discount", CustomerEntity, Amount.class);
        Assert.assertEquals(resultAsset.getBody().getPaybleAmount(), amount.getPaybleAmount());
    }
    @Test
    public void SaleDiscountTest() 
    {
    	Amount amount = new Amount();
    	amount.setPaybleAmount(950.0);
        Customer customer = new Customer();
        customer.setIsEmployee(false);
        customer.setIsGrocery(false);
        customer.setIsAffiliate(false);
        customer.setIsTwoYearsOld(false);
        customer.setPaybleAmount(1000.0);
        HttpEntity<Object> CustomerEntity = getHttpEntity(customer);
        ResponseEntity<Amount> resultAsset = template.postForEntity("/discount", CustomerEntity, Amount.class);
        Assert.assertEquals(resultAsset.getBody().getPaybleAmount(), amount.getPaybleAmount());
    }
    @Test
    public void  groceryDiscountTest()
    {
    	Amount amount = new Amount();
    	amount.setPaybleAmount(950.0);
        Customer customer = new Customer();
        customer.setIsEmployee(false);
        customer.setIsGrocery(true);
        customer.setIsAffiliate(false);
        customer.setIsTwoYearsOld(false);
        customer.setPaybleAmount(1000.0);
        HttpEntity<Object> CustomerEntity = getHttpEntity(customer);
        ResponseEntity<Amount> resultAsset = template.postForEntity("/discount", CustomerEntity, Amount.class);
        Assert.assertEquals(resultAsset.getBody().getPaybleAmount(), amount.getPaybleAmount());	
    }
    @Test
    public void employeeAffiliateDiscount()
    {
    	Amount amount = new Amount();
    	amount.setPaybleAmount(650.0);
        Customer customer = new Customer();
        customer.setIsEmployee(true);
        customer.setIsGrocery(false);
        customer.setIsAffiliate(true);
        customer.setIsTwoYearsOld(false);
        customer.setPaybleAmount(1000.0);
        HttpEntity<Object> CustomerEntity = getHttpEntity(customer);
        ResponseEntity<Amount> resultAsset = template.postForEntity("/discount", CustomerEntity, Amount.class);
        Assert.assertEquals(resultAsset.getBody().getPaybleAmount(), amount.getPaybleAmount());
    }
    @Test
    public void employeeAffiliateTwoYearSaleDiscount()
    {
    	Amount amount = new Amount();
    	amount.setPaybleAmount(650.0);
        Customer customer = new Customer();
        customer.setIsEmployee(true);
        customer.setIsGrocery(false);
        customer.setIsAffiliate(true);
        customer.setIsTwoYearsOld(true);
        customer.setPaybleAmount(1000.0);
        HttpEntity<Object> CustomerEntity = getHttpEntity(customer);
        ResponseEntity<Amount> resultAsset = template.postForEntity("/discount", CustomerEntity, Amount.class);
        Assert.assertEquals(resultAsset.getBody().getPaybleAmount(), amount.getPaybleAmount());
    }
    private HttpEntity<Object> getHttpEntity(Object body) 
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<>(body, headers);
    }
}