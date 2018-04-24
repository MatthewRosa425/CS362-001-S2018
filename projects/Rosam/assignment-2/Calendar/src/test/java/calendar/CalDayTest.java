/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
//So I need to be able to test multiple features of Calday. And a parameter that is required for Calday is Gregorian Calendar...The only place Gregorian Calendar is mentioned is within main, which it looks like it is a package type from java...
import java.util.GregorianCalendar;
import java.util.Calendar;






public class CalDayTest{
//generating global variables to be refenced in indivigual test cases.
//I need to be able to test the gregorian calendar...
//get todays date
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
  Appt Ap_test = new Appt (14, 9, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com" );

  Appt some_bs = new Appt(16, 40, 20, 4, 2020, "snoop Dog Day", "Today is snoop dog day", "xyz@gmail.com");




	
	//testing null case first
  @Test(timeout = 4000)
  public void test_1()  throws Throwable  {

  CalDay test_1 = new CalDay();
  	assertEquals("trying to manage a null day as an app", "", test_1.toString());
  }




 //testing the validness of gregorian calendar given an accurate date.
  @Test(timeout = 4000)
  public void test_2()  throws Throwable  {
  	CalDay test_2 = new CalDay( calendar );
	test_2.addAppt(Ap_test);	
        assertEquals("The program failed to create an appt", 2018 ,test_2.getYear());
  }

 //testing the validness of gregorian calendar given an accurate date.
  @Test(timeout = 4000)
  public void test_3()  throws Throwable  {
        CalDay test_3 = new CalDay( calendar );
        test_3.addAppt(Ap_test);
        assertEquals("The program failed to create an appt", 9 ,test_3.getMonth());
  }

 //testing the validness of gregorian calendar given an accurate date.
  @Test(timeout = 4000)
  public void test_4()  throws Throwable  {
        CalDay test_4 = new CalDay( calendar );
        test_4.addAppt(Ap_test);
        assertEquals("The program failed to create an appt", 14 ,test_4.getDay());
  }


 //testing the validness of gregorian calendar given an accurate date.
  @Test(timeout = 4000)
  public void test_5()  throws Throwable  {
        CalDay test_5 = new CalDay( calendar );
        test_5.addAppt(Ap_test);
        assertEquals("The program failed to record an appt", 1 ,test_5.getSizeAppts());
  }


   //testing the validness of gregorian calendar given an accurate date.
  @Test(timeout = 4000)
  public void test_6()  throws Throwable  {
        CalDay test_6 = new CalDay( calendar );
        test_6.addAppt(Ap_test);
        String string0 = test_6.toString();
	assertNotNull("The program failed to update an appt in calendar", string0);
  }

 //testing the validness of gregorian calendar given an accurate date.
  @Test(timeout = 4000)
  public void test_7()  throws Throwable  {
        CalDay test_7 = new CalDay( calendar );
        test_7.addAppt(Ap_test);
        String string1 = test_7.getFullInfomrationApp(test_7);
	assertNotNull("The program failed to update an appt in calendar", string1);

  }

 //testing the validness of gregorian calendar given an accurate date.
  @Test(timeout = 4000)
	public void test_8()  throws Throwable  {
        CalDay test_8 = new CalDay( calendar );
        //for setting the min and hour, addAppt looks like: hour, min, day,month, year,title,description,emailaddress
	
	
	test_8.addAppt( some_bs);
       String string1 = test_8.getFullInfomrationApp(test_8);
        
	assertNotNull("The program failed to update an appt in calendar", string1);

	}

 //testing the validness of gregorian calendar given an accurate date.
  @Test(timeout = 4000)
        public void test_9()  throws Throwable  {
        CalDay test_9 = new CalDay( calendar );
        //for setting the min and hour, addAppt looks like: hour, min, day,month, year,title,description,emailaddress


	Appt some_bs2 = new Appt(0, 40, 20, 4, 2020, "snoop Dog Day", "Today is snoop dog day", "xyz@gmail.com");

        test_9.addAppt( some_bs2);
       String string1 = test_9.getFullInfomrationApp(test_9);

        assertNotNull("The program failed to update an appt in calendar", string1);

        }




 //testing the validness of gregorian calendar given an accurate date.
  @Test(timeout = 4000)
        public void test_10()  throws Throwable  {
        CalDay test_10 = new CalDay( calendar );
        //for setting the min and hour, addAppt looks like: hour, min, day,month, year,title,description,emailaddress
	test_10.addAppt(Ap_test);

        Appt some_bs2 = new Appt(0,0 , 20, 4, 2020, "snoop Dog Day", "Today is snoop dog day", "xyz@gmail.com");

        test_10.addAppt( some_bs2);
       String string1 = test_10.getFullInfomrationApp(test_10);

        assertNotNull("The program failed to update an appt in calendar", string1);

        }




 //testing the validness of gregorian calendar given an accurate date.
  @Test(timeout = 4000)
        public void test_11()  throws Throwable  {
        CalDay test_10 = new CalDay( calendar );
        //for setting the min and hour, addAppt looks like: hour, min, day,month, year,title,description,emailaddress



       String string1 = test_10.getFullInfomrationApp(test_10);
	test_10.iterator();
	test_10.setAppts(null);	

        assertNotNull("The program failed to update an appt in calendar", string1);

        }







}
