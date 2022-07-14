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
public class Route
{
    private String Starting_Point;
    private String Ending_Point;
    private int Distance;
    private int Time;
    
     public String getStarting_Point()
    {
        return Starting_Point;
    }
    
    public void setStarting_Point(String Starting_Point)
    {
        this.Starting_Point = Starting_Point;
    }
    
  
    
    public String getEnding_Point()
    {
        return Ending_Point;
    }
    
    public void setEnding_Point (String Ending_Point)
    {
        this.Ending_Point = Ending_Point;
    }
    
    
    
    public int getDistance()
    {
        return Distance;
    }
    
    public void setDistance(int Distance)
    {
        this.Distance = Distance;
    }
    
  
    
    public int getTime()
    {
        return Time;
    }
    
    public void setTime (int Time)
    {
        this.Time = Time;
    }
}
