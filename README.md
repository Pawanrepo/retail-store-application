# Retail Store Application Coding

- The application is a prototype of Retail Store Application.
-- This application developed on Spring Boot.
-- Input realised over the REST-API
# Notes:
- Many Module tests are added.
-- Tests are developed on Junit.
-- 1) Test (employeeDiscountTest), if the user get 30% discount as an employee and $5 on $100  sale
-- 2) Test (storeDiscountTest), if the user affiliate to Store get 10 % discount and $5 on $100 sale
-- 3) Test (twoYearDiscountTest), if the User has been customer for over 2 year get 5% discount and $5 on $100
-- 4) Test (SaleDiscountTest), if the user get $5 on $100
-- 5) Test (groceryDiscountTest) if the user has  grocery product then no percent discount and $5 on $100
-- 6) Test (employeeAffiliateDiscount), if the user is employee and affiliate with store and $5 on $100
-- 7) Test (employeeAffiliateTwoYearSaleDiscount), if the user ie employee, affiliate and customer for over 	  2 year and $5 on $100 
# Execution Test Cases
-- Install Maven and JDK and setup path
-- On Command Prompt, go to project folder
-- Execute command "mvn test"
-- Check output on console and success of test case

