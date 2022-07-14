/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author user
 */
public class Customer 
{
    private String Customer_Name;
    private int Customer_CNIC;
    private int Customer_No;
    private String Customer_Email;
    
    
    
    public String getCustomer_Name()
    {
        return Customer_Name;
    }
    
    public void setCustomer_Name (String Customer_Name)
    {
        this.Customer_Name = Customer_Name;
    }
    
  
    
    public int getCustomer_CNIC()
    {
        return Customer_CNIC;
    }
    
    public void setCustomer_CNIC (int Customer_CNIC)
    {
        this.Customer_CNIC = Customer_CNIC;
    }
    
     
    
    public int getCustomer_No()
    {
        return Customer_No;
    }
    
    public void setCustomer_No (int Customer_No)
    {
        this.Customer_No = Customer_No;
    }
    
    
    
    public String getCustomer_Email()
    {
        return Customer_Email;
    }
    
    public void setCustomer_Email (String Customer_Email)
    {
        this.Customer_Email = Customer_Email;
    }
}
