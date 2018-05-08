
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

public class DataHandlerTest{


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
/*
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

*/


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

















}
