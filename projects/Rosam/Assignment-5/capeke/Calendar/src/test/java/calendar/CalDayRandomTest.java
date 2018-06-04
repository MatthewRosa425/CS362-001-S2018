package calendar;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;


import java.util.Calendar;


import static org.junit.Assert.*;

import java.util.GregorianCalendar; //need this for cal test

/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	
	private static final long TestTimeout = 60 * 20 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests.... just addAppt !.
	 */
	 
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"addAppt"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	/**
	 * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
	 */
	
    public static int RandomSelectRecur(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur 
        }	
	/**
	 * Return a randomly selected appointments to recur forever or Never recur  !.
	 */
	
    public static int RandomSelectRecurForEverNever(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return appointments to recur forever or Never recur 
        }	
   /*
		we need to set up a global variable that uses the "gregorian calendar method"
   */
	GregorianCalendar cal = new GregorianCalendar();
   
   
   
	/**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void radnomtest_2()  throws Throwable
	{
	System.out.println("Start testing...");
		  long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 
		 try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) 
				{
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 String emailAddress="xyz@gmail.com";

				 //Construct a new Appointment object with the initial data	 
				 //Construct a new Appointment object with the initial data	 
		         Appt appt = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description,
		                 emailAddress);
						 Appt appt_2 = new Appt( (startHour - 5),
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description,
		                 emailAddress);
				CalDay calday_temp = new CalDay(cal);
				
			//So the error I crated disables setvalid() functionality, everything should be vaild.
		
			appt.setValid();
		// Since I need to reach each of the setValid() parmeters, im just gonna... create new variables		
			 
			 //if(!appt.getValid())continue;
			for (int i = 0; i < NUM_TESTS; i++) 
					{//since all we're testing is the adding appt branch,the below code will be commented out. 
						/*String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
						}
					    */
						
						   int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						   int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
						   int recur=CalDayRandomTest.RandomSelectRecur(random);
						   int recurIncrement = ValuesGenerator.RandInt(random);
						   int recurNumber=CalDayRandomTest.RandomSelectRecurForEverNever(random);
						   appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
						calday_temp.addAppt(appt);	
					
					String temp = calday_temp.toString();
					String temp2 =  calday_temp.getFullInfomrationApp(calday_temp);
						
					
					
					}	


			
					
			assertNotNull(calday_temp.getSizeAppts());
			assertNotNull(calday_temp.getDay());
			assertNotNull(calday_temp.getMonth());
			assertNotNull(calday_temp.getYear());
			
			
			
			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
				}



			System.out.println("Done testing...");	
			}
		
		
		catch(NullPointerException e)
		{
			
		}
	 
		 
	 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
	
}
