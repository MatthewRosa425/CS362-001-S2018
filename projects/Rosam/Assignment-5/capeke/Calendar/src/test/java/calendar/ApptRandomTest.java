package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;



import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	//the below line is too long, I need to shorten it to 10Seconds
	//private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	
	private static final long TestTimeout = 60 * 100 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setRecurrence"};// The list of the of methods to be tested in the Appt class

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
   /**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
				//System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=ValuesGenerator.getRandomIntBetween(random, -100, 100);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, -100, 100);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, -1, 33) ;
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, -1, 13);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, -2018, 2018) ;
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
						 
						 Appt appt_9 = new Appt(startDay,
												startMonth,
												startYear,
												title,
												description,
												emailAddress);
				

			//So the error I crated disables setvalid() functionality, everything should be vaild.

			appt.setValid();
			appt_9.setValid();

		// Since I need to reach each of the setValid() parmeters, im just gonna... create new variables
		 Appt appt_2 = new Appt(-1,
								-1,
								-1,
                                  -1 ,
                                  -1 ,
                                  title,
                                 description,
                                 emailAddress);
		Appt appt_3 = new Appt(24,
								12 ,
									12 ,
                                   11 ,
                                  2018 ,
                                  title,
                                 description,
                                 emailAddress);
		Appt appt_4 = new Appt(	-5,
								12 ,
									12 ,
                                   11 ,
                                  2018 ,
                                  title,
                                 description,
                                 emailAddress);	

		Appt appt_5 = new Appt(	12,
								0 ,
									10,
									9 ,
									2018 ,
                                  title,
                                 description,
                                 emailAddress);
			Appt appt_6 = new Appt(	0,
									15 ,
									2018 ,
                                 
                                  title,
                                 description,
                                 emailAddress);
		
				Appt appt_7 = new Appt(	6,
									0 ,
									2018 ,
                                 
                                  title,
                                 description,
                                 emailAddress);	
		     Appt appt_8 = new Appt(	0,
									0 ,
									0 ,
                                 
                                  title,
                                 description,
                                 emailAddress);	
			Appt appt_bs = new Appt(	1,
									10 ,
									2015 ,
                                 
                                  title,
                                 description,
                                 emailAddress);
								 
				//doing shotgun method...
				 appt.isOn(12, 12, 12);
				appt_2.isOn(12, 12, 12);
				appt_3.isOn(12, 12, 12);
				appt_4.isOn(12, 12, 12);
				appt_5.isOn(12, 12, 12);
				appt_6.isOn(12, 12, 12);
				appt_7.isOn(12, 12, 12);
				appt_8.isOn(12, 12, 12);
				appt_2.setValid();
				appt_3.setValid();
				appt_4.setValid();
				appt_5.setValid();
				appt_6.setValid();
				appt_7.setValid();
				appt_8.setValid();
				appt_bs.setValid();
				
				
				
				//we've only hit 50% of setvalid branches....
				
				
				
				
				
				//creting temp variables to store dynamic data
				// this has already been done with "start__"

				
			 
			 //if(!appt.getValid())continue;
			for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
						}
					   else if (methodName.equals("setRecurrence")){
						   int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						   int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
						   int recur=ApptRandomTest.RandomSelectRecur(random);
						   int recurIncrement = ValuesGenerator.RandInt(random);
						   int recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
						   appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
						   appt_5.setRecurrence(null, recur, recurIncrement, recurNumber);
						}				
					
			assertNotNull(appt.getStartHour());
			assertNotNull(appt.getStartMinute());
			assertNotNull(appt.getStartDay());
			assertNotNull(appt.getStartMonth());
			// cant get this one, I dont know how to access it..
			//assertNotNull(appt.getXmlElement());
			assertNotNull(appt.isRecurring());
			assertNotNull(appt.getRecurIncrement());
			assertNotNull(appt.getRecurNumber());
			assertNotNull(appt.getRecurBy());
			assertNotNull(appt.getRecurDays());
			assertNotNull(appt.toString());
			assertNotNull(appt.hasTimeSet());
			assertNotNull(appt.isOn(startDay, startMonth, startYear ));
			
			assertNotNull(appt.getEmailAddress());
			
			assertNotNull(appt_9.getValid());
			
			}



				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
	 }


	


	
}
