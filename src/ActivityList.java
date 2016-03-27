/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quon Shen B1400601
 */

//A container class for Activity list
public class ActivityList {
    
        private final int SIZE = 50;
	private Activity[] actList;
	private int numOfActivity;
	
        // constructor which sets to default size
	public ActivityList()
	{
		actList = new Activity[SIZE];
		numOfActivity = 0;
	}
	
        // constructor which sets to size passed in
	public ActivityList(int size)
	{
		if (size <0)
			actList = new Activity[SIZE];
		else
			actList = new Activity[size];
		numOfActivity = 0;
	}
	
        // method to add an activity to the array and returns null if full
	public boolean addActivity(Activity acti)
	{
		if (numOfActivity == actList.length)
		return false;
                
                else
		actList [numOfActivity++] = acti;
		return true;
	}
	
	// a method to search for an activity name and returns null if not found
	public Activity findActivity(String activityName)
	{
		for (int i = 0; i < numOfActivity; i++)
                {
			if (actList[i].getActivityName().equalsIgnoreCase(activityName))
				return actList[i];
                }
		return null;
	}
	
        // a method to calculate the average MET
	public double averageMET()
	{
		double sum = 0.0;
		for (int i = 0; i < numOfActivity; i++)
                {
                    sum += actList[i].getMET();
                }
                double average = sum / numOfActivity;
                
                return average;
		
	}
	
        //compare the total costs and return the activity name with the highest total cost
	public static String HighTotalCost(String activity, double total)
	{
            double highest = 0;
            String newActivity = "";
        
            highest = total;
            if (total > highest)
            {
                highest = total;
                newActivity = activity;
            }
        
        return newActivity;  
	}
    
}
