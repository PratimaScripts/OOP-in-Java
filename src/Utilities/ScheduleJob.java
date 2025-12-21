package Utilities;

/**
 * The class is used to schedule the job to be executed as per time set. 	
 */

import scheduler.ExecutableRunner;

import java.util.Calendar;
import java.util.Timer;
class ScheduleJob{

  public static void main(String[] args) {
  	
  }
  
   public void expireStatus()  
	{
		System.out.println("Scheduled Job");
    Timer timer = new Timer();
    Calendar date = Calendar.getInstance();
    date.set(
      Calendar.DAY_OF_WEEK,
      Calendar.PM
    );
    date.set(Calendar.HOUR, 0);
    date.set(Calendar.MINUTE, 0);
    date.set(Calendar.SECOND, 0);
    date.set(Calendar.MILLISECOND, 0);

    System.out.println("date.getTime"+date.getTime());

	//timer.schedule is used to schedule the job. i.e. the ExecutableRunner's run()
	// execute in every 5 min.
    timer.schedule(
      new ExecutableRunner(),
      date.getTime(),
//      1000 * 60 * 5			// For Live
      1000 * 60 * 5 * 60		// For Test Purpose
    );
	}
	

/* Added By PMishra May 23, 2007 ----- For scheduling the Members 
	and non members report generatio */
public void expireStatusNew()  
	{
		System.out.println("Scheduled Job");
    Timer timer = new Timer();
    Calendar date = Calendar.getInstance();
    date.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
    date.set(Calendar.HOUR_OF_DAY, 0);
    date.set(Calendar.MINUTE, 0);
    date.set(Calendar.SECOND, 0);
    date.set(Calendar.MILLISECOND, 0);

    Calendar now=Calendar.getInstance();
	if(now.after(date)/*(now.get(Calendar.DATE)>=date.get(Calendar.DATE))&&(now.get(Calendar.HOUR_OF_DAY)>date.get(Calendar.HOUR_OF_DAY))*/){
		date.set(Calendar.DATE,date.get(Calendar.DATE)+7);
	}
    System.out.println("date.getTime"+date.getTime());

	//timer.schedule is used to schedule the job. i.e. the ExecutableRunner's run()
	// execute in every 5 min.
   
    
    timer.schedule(
				new MembersReport(),    // Test pankaj Test Pankaj comment
				date.getTime(),
			//	1000 * 60 * 2			// This will run every two minute on a specied day
				//1000 * 60 * 60 * 24				   // This will run on every Sunday at 24 hrs
				//1000 * 60 * 5
				1000 * 60 * 60*24*7
				    			);
	}



	/*** Code Added Soniya 18 July 07
	 * Method to send mail to all members as a reminder for rent.
	 * 
	 */
	
	
	public void checkMonthly()
	
	{	
		System.out.println("-------- Schedule Job ------- ");
		
		System.out.println("--------- Calling method checkMonthly -------- ");
		
		
		Timer timer = new Timer();
		
		Calendar date = Calendar.getInstance();
		
		date.set(Calendar.MONTH , Calendar.getInstance().get(Calendar.MONTH));    //setting current month
		//date.set(Calendar.MONTH,2);
		
		date.set(Calendar.DATE , 1);			// setting date for 1st.
		
		date.set(Calendar.HOUR_OF_DAY, 0);
    	date.set(Calendar.MINUTE, 0);
    	date.set(Calendar.SECOND, 0);
   		date.set(Calendar.MILLISECOND, 0);
   		
   		Calendar rightnow = Calendar.getInstance();
   		
   		System.out.println("******* Current Date is ******** " +rightnow.get(Calendar.DATE));
   		
   		if(rightnow.after(date))
   			
   			
   			{
   				System.out.println("--------- inside if condition -------- ");
   				
   				date.add(Calendar.MONTH,1);
   				
   				//date.add(Calendar.DATE,31);
   				
   				System.out.println("month:"+date.get(Calendar.MONTH));
				System.out.println("date:"+date.get(Calendar.DATE));
   			}
   			
   			
    timer.schedule(
				new RentReport(),    
				date.getTime(),
			//	1000 * 60 * 2			
				1000 * 60 * 60 * 24				   // This will run on every Sunday at 24 hrs
				//1000 * 60 * 5
				//1000 * 60 * 60 * 17 * 2
				//1000 * 60 * 60* 5 
					);     		//For test purpose
				
				//1000*60*60*24*30); 			//This will run on 1st of every month.
		
	}
	


}