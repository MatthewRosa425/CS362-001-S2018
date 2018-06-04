/*package calendar;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;


import java.util.Calendar;


import static org.junit.Assert.*;

import java.util.GregorianCalendar; //need this for cal test

*/

/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;
//trying to set up generic statments to use in following tessts. 
import java.io.*;

import java.awt.*;
import java.awt.event.*;
//So I need to be able to test multiple features of Calday. And a parameter that is required for Calday is Gregorian Calendar...The only place Gregorian Calendar is mentioned is within main, which it looks like it is a package type from java...
import java.util.Calendar;
import java.util.Random;


public class DataHandlerRandomTest{
	Calendar rightnow = Calendar.getInstance();
        //current month/year/date is today
        /** the month the user is currently viewing **/
        int thisMonth = rightnow.get(Calendar.MONTH);
        /** todays date **/
        int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
        /** the year the user is currently viewing **/
   	int thisYear = rightnow.get(Calendar.YEAR);

//              // Get a calendar which is set to a specified date.
    GregorianCalendar calendar = new GregorianCalendar(thisYear, thisMonth, thisDay);
 
    GregorianCalendar work = new GregorianCalendar();
	


	
	String help = "I have no idea what I'm doing";
	String welp = "Will it blend?";
	
 Appt AP_test = new Appt (14, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com" );
 Appt genearlbs = new Appt(23, 5, 2018, "random", "why does everything need a description", "xyz@gmail.com");

	 
	//the below line is too long, I need to shorten it to 10Seconds
	//private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=500;

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
     * Generate Random Tests that tests DataHandler Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
GregorianCalendar cal = new GregorianCalendar();
GregorianCalendar work2 = new GregorianCalendar(2020, 1, 25);
CalDay calday_temp = new CalDay(cal);
 DataHandler  DataHandler_temp	= new DataHandler();
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
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
						 appt.setValid();
	for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = DataHandlerRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
						}
					   else if (methodName.equals("setRecurrence")){
						   int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						   int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
						   int recur=DataHandlerRandomTest.RandomSelectRecur(random);
						   int recurIncrement = ValuesGenerator.RandInt(random);
						   int recurNumber=DataHandlerRandomTest.RandomSelectRecurForEverNever(random);
						   appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
						
						
						}				
					
					//calday_temp.addAppt(appt);
					
						
					
					
					
					
					}



				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
	
		}
		catch(NullPointerException e){
			
		}
	}
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {


 DataHandler DH2 = new DataHandler (welp, false);
	assertTrue("Critcal mis function",DH2.saveAppt(AP_test));


  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {

  DataHandler DH2 = new DataHandler (help);
assertTrue("Somewhat critical mis function", DH2.saveAppt(AP_test));
  
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {

  DataHandler DH2 = new DataHandler (welp);
  DH2.saveAppt(AP_test);
  assertTrue("failed to delete appt", DH2.deleteAppt(AP_test));
  }


  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
  DataHandler DH2 = new DataHandler (welp);
  assertFalse(DH2.deleteAppt(AP_test));

  }
// So i tried to get the following test to work for over an two hours now... The last thing that is 
// interfering with progress is that its a private method... For this assignment I'm going to 
// change it to public

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GregorianCalendar work2 = new GregorianCalendar();
	
 GregorianCalendar nextDay = (GregorianCalendar)work.clone();

	  DataHandler DH2 = new DataHandler(welp);


	
 assertNotNull( DH2.getNextApptOccurrence(AP_test, nextDay ));
	}




  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GregorianCalendar work2 = new GregorianCalendar();

 GregorianCalendar nextDay = (GregorianCalendar)work.clone();

          DataHandler DH2 = new DataHandler(welp);
	int [] alpha;
	alpha = new int [20];
	AP_test.setRecurrence(alpha , 1, 1, 1);
 Appt BS = new Appt ( 5, 6,2018, "BS", "Will this work", "xyz@gmail.com" );


	BS.setRecurrence(alpha , 6, 3, 4);

 assertNotNull( DH2.getNextApptOccurrence(AP_test, nextDay ));
        }


  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GregorianCalendar work2 = new GregorianCalendar();

 GregorianCalendar nextDay = (GregorianCalendar)work.clone();

// GregorianCalendar firstDay = (GregorianCalendar)work2.DAY_OF_WEEK;
          DataHandler DH2 = new DataHandler(welp);
        int [] alpha;
        alpha = new int [20];
        AP_test.setRecurrence(alpha , 1, 1, 1);
 Appt BS = new Appt ( 5, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
 CalDay holyshit = new CalDay (calendar);

        BS.setRecurrence(alpha , 6, 3, 4);

	holyshit.addAppt(BS);


 assertNotNull( DH2.getApptOccurences( BS,nextDay, calendar));
        }




  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianCalendar work2 = new GregorianCalendar(2019, 1, 25);

 GregorianCalendar nextDay = (GregorianCalendar)work.clone();

// GregorianCalendar firstDay = (GregorianCalendar)work2.DAY_OF_WEEK;
          DataHandler DH2 = new DataHandler(welp);
        int [] alpha;
        alpha = new int [20];
        AP_test.setRecurrence(alpha , 1, 1, 1);
 Appt BS = new Appt ( 5, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
 CalDay holyshit = new CalDay (calendar);

        BS.setRecurrence(alpha , 6, 3, 4);

 assertNotNull( DH2.getApptOccurences( BS, calendar ,nextDay));
        }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GregorianCalendar work2 = new GregorianCalendar(2019, 1, 25);

 GregorianCalendar nextDay = (GregorianCalendar)work.clone();

// GregorianCalendar firstDay = (GregorianCalendar)work2.DAY_OF_WEEK;
          DataHandler DH2 = new DataHandler(welp);
        int [] alpha;
        alpha = new int [20];
        AP_test.setRecurrence(alpha , 1, 1, 1);
        Appt BS = new Appt ( 5, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        
        CalDay holyshit = new CalDay (calendar);

        BS.setRecurrence(alpha , 6, 3, 4);

 assertNotNull( DH2.getApptOccurences( BS, work ,work2));
        }


  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GregorianCalendar work2 = new GregorianCalendar(2019, 1, 25);

 GregorianCalendar nextDay = (GregorianCalendar)work.clone();

// GregorianCalendar firstDay = (GregorianCalendar)work2.DAY_OF_WEEK;
          DataHandler DH2 = new DataHandler(welp);
        int [] alpha;
        alpha = new int [20];
        AP_test.setRecurrence(alpha , 1, 1, 1);
        Appt BS = new Appt ( 5, 6,2018, "BS", "Will this work", "xyz@gmail.com" );

        CalDay holyshit = new CalDay (calendar);

        BS.setRecurrence(alpha , 30, 30, 0);

 assertNotNull( DH2.getApptOccurences( BS, work ,work2));
        }
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GregorianCalendar work2 = new GregorianCalendar(2020, 1, 25);

 GregorianCalendar nextDay = (GregorianCalendar)work.clone();

// GregorianCalendar firstDay = (GregorianCalendar)work2.DAY_OF_WEEK;
          DataHandler DH2 = new DataHandler(welp);
        int [] alpha;
        alpha = new int [30];
        Appt BS = new Appt ( 5, 6,2018, "BS", "Will this work", "xyz@gmail.com" );

        CalDay holyshit = new CalDay (calendar);

        BS.setRecurrence(alpha , 30, 100, 5);
	holyshit.addAppt(BS);
	holyshit.addAppt(AP_test);
	holyshit.addAppt(genearlbs);

 assertNotNull( DH2.getApptRange( work ,work2));
        }


  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GregorianCalendar work2 = new GregorianCalendar(2020, 1, 25);
DataHandler DH2 = new DataHandler();
DH2.valid = false;

 GregorianCalendar nextDay = (GregorianCalendar)work.clone();
 assertNull( DH2.getApptRange( work , work ));
        }




  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GregorianCalendar work2 = new GregorianCalendar(2020, 1, 25);

 GregorianCalendar nextDay = (GregorianCalendar)work.clone();

// GregorianCalendar firstDay = (GregorianCalendar)work2.DAY_OF_WEEK;
          DataHandler DH2 = new DataHandler(help);
        int [] alpha;
        alpha = new int [30];
        Appt BS = new Appt ( 5, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS1 = new Appt ( 6, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS2 = new Appt ( 7, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS3 = new Appt ( 8, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS4 = new Appt ( 9, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS5 = new Appt ( 10, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS6 = new Appt ( 11, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        CalDay holyshit = new CalDay (work);






        holyshit.addAppt(BS);
        holyshit.addAppt(BS1);
        holyshit.addAppt(BS2);
        holyshit.addAppt(BS3);
        holyshit.addAppt(BS4);
        holyshit.addAppt(BS5);
        holyshit.addAppt(BS6);


 assertNotNull( DH2.getApptRange( work ,work2));
        }




  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GregorianCalendar work2 = new GregorianCalendar(2020, 1, 25);

 GregorianCalendar nextDay = (GregorianCalendar)work.clone();

// GregorianCalendar firstDay = (GregorianCalendar)work2.DAY_OF_WEEK;
          DataHandler DH2 = new DataHandler(help);
        int [] alpha;
        alpha = new int [30];
        Appt BS = new Appt ( 5, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS1 = new Appt ( 6, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS2 = new Appt ( 7, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS3 = new Appt ( 8, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS4 = new Appt ( 9, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS5 = new Appt ( 10, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS6 = new Appt ( 11, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        CalDay holyshit = new CalDay (work);






        holyshit.addAppt(BS);
        holyshit.addAppt(BS1);
        holyshit.addAppt(BS2);
        holyshit.addAppt(BS3);
        holyshit.addAppt(BS4);
        holyshit.addAppt(BS5);
        holyshit.addAppt(BS6);

	DH2.diagnose = true;
 assertNotNull( DH2.getApptRange( work ,work2));
        }
/*
@Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GregorianCalendar work2 = new GregorianCalendar(1750, 1, 25);

 GregorianCalendar nextDay = (GregorianCalendar)work.clone();

// GregorianCalendar firstDay = (GregorianCalendar)work2.DAY_OF_WEEK;
          DataHandler DH2 = new DataHandler(help);
        int [] alpha;
        alpha = new int [30];
        Appt BS = new Appt ( 5, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS1 = new Appt ( 6, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS2 = new Appt ( 7, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS3 = new Appt ( 8, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS4 = new Appt ( 9, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS5 = new Appt ( 10, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS6 = new Appt ( 11, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        CalDay holyshit = new CalDay (work);

		




        holyshit.addAppt(BS);
        holyshit.addAppt(BS1);
        holyshit.addAppt(BS2);
        holyshit.addAppt(BS3);
        holyshit.addAppt(BS4);
        holyshit.addAppt(BS5);
        holyshit.addAppt(BS6);

	DH2.diagnose = true;
	DH2.autoSave = false;
	BS.valid = false;
	
	DH2.deleteAppt(BS);
	DH2.deleteAppt(BS);
	DH2.diagnose = false;
	DH2.autoSave = false;
	DH2.deleteAppt(BS1);
	DH2.deleteAppt(BS2);
	DH2.deleteAppt(BS3);
	DH2.deleteAppt(BS4);
	
	DH2.deleteAppt(BS5);
        DH2.deleteAppt(BS6);
 assertNotNull( DH2.getApptRange( work ,work2));
        
		
		
		
		}
@Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GregorianCalendar work2 = new GregorianCalendar(2020, 1, 25);

 GregorianCalendar nextDay = (GregorianCalendar)work.clone();

// GregorianCalendar firstDay = (GregorianCalendar)work2.DAY_OF_WEEK;
          DataHandler DH2 = new DataHandler(help);
        int [] alpha;
        alpha = new int [30];
        Appt BS = new Appt ( 5, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS1 = new Appt ( 6, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS2 = new Appt ( 7, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS3 = new Appt ( 8, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS4 = new Appt ( 9, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS5 = new Appt ( 10, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        Appt BS6 = new Appt ( 11, 6,2018, "BS", "Will this work", "xyz@gmail.com" );
        CalDay holyshit = new CalDay (work);

		




        holyshit.addAppt(BS);
        holyshit.addAppt(BS1);
        holyshit.addAppt(BS2);
        holyshit.addAppt(BS3);
        holyshit.addAppt(BS4);
        holyshit.addAppt(BS5);
        holyshit.addAppt(BS6);

	DH2.diagnose = true;
	DH2.autoSave = true;
	BS.valid = true;
	
	DH2.deleteAppt(BS);
	DH2.deleteAppt(BS);
	DH2.diagnose = false;
	DH2.autoSave = true;
	DH2.deleteAppt(BS1);
	DH2.deleteAppt(BS2);
	DH2.deleteAppt(BS3);
	DH2.deleteAppt(BS4);
	
	DH2.deleteAppt(BS5);
        DH2.deleteAppt(BS6);
 assertNotNull( DH2.getApptRange( work ,work2));
        
		
		
		
		}
*/








}