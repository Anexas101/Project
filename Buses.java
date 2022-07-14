n/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author user
 */
public class Buses 
{
    private int Bus_No;
    private int Capacity;
    private int Available_Seats;
    private int Reserved_Seats;
    
    public int getBus_No()
    {
        return Bus_No;
    }
    
    public void setBus_No(int Bus_No)
    {
        this.Bus_No = Bus_No;
    }
    
  
    
    public int getCapacity()
    {
        return Capacity;
    }
    
    public void setCapacity (int Capacity)
    {
        this.Capacity = Capacity;
    }
    
    
    
    public int getAvailable_Seats()
    {
        return Available_Seats;
    }
    
    public void setAvailable_Seats(int Available_Seats)
    {
        this.Available_Seats = Available_Seats;
    }
    
  
    
    public int getReserved_Seats()
    {
        return Reserved_Seats;
    }
    
    public void setReserved_Seats (int Reserved_Seats)
    {
        this.Reserved_Seats = Reserved_Seats;
    }
}
