/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quon Shen
 */
public class Member {
   //variables
   private String name;
   private double weightInKg;
   private double heightInM;
   
   //no argument constructor
   public Member()
   {
    
    name = "not set";
    weightInKg = 0.0;
    heightInM = 0.0;
    
   }
   
   //constructor with arguments
   public Member(String inName, double inWeightInKg, double inHeightInM)
   {
       if (inName.equals(""))
           name = "not set";
       else
           name = inName;
       
       if (inWeightInKg >= 0)
           weightInKg = inWeightInKg;
       else
           weightInKg = 0.0;
       
       if (inHeightInM >= 0)
           heightInM = inHeightInM;
       else
           heightInM = 0.0;
   }
   
   //getter
   public String getName()
   {
       return name;
   }
   
   public double getWeightInKg()
   {
       return weightInKg;
   }
   
   public double getHeightInM()
   {
       return heightInM;
   }
   
   //setter
   public void setName(String inName)
   {
       if(inName != "")
        name = inName;
   }
   
   public void setWeightInKg(double inWeightInKg)
   {
       if (inWeightInKg >= 0)
        weightInKg = inWeightInKg;
   }
   
   public void setHeightInM(double inHeightInM)
   {
       if (inHeightInM >=0)
        heightInM = inHeightInM;
   }
   
   //toString
   public String toString()
   {
       return name + " has a weight of " + weightInKg + " and a height of " + heightInM;
   }
   
   //get BMI method
   public double getBMI(double weightInKg, double heightInM)
   {
       return weightInKg / (heightInM * heightInM);
   }
}
