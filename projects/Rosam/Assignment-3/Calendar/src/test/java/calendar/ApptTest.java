/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

	@Test(timeout = 4000)
	public void  test02()
	{
	
	int min = 0, hour = 0, day = 0, month = 0, year = 0;
	        String title = "will it work?";//integer.tostring(startday);
                String description = "testing validness of day, month, and year";
                String emailaddress = "will it blend?";
		Appt appt3 = new Appt( min, hour, day, month, year, title, description,emailaddress);
			
			assertEquals("the start minute has been modified", min,appt3.getStartMinute());		

		}

/*
//testing the hour of appt
	 @Test(timeout = 4000)
        public void  test03()
        {

        int min = 5, hour = 3, day = 0, month = 0, year = 0;
                String title = "will it work?";//integer.tostring(startday);
                String description = "testing validness of day, month, and year";
                String emailaddress = "will it blend?";
                Appt appt4 = new Appt( min, hour, day, month, year, title, description,emailaddress);

                        assertEquals("the start hour has been modified", hour,appt4.getStartHour());

                }
//testing to see what happens to appt set on day 0.
           @Test(timeout = 4000)
        public void  test04()
        {

        int min = 5, hour = 3, day = 0, month = 0, year = 0;
                String title = "will it work?";//integer.tostring(startday);
                String description = "testing validness of day, month, and year";
                String emailaddress = "will it blend?";
                Appt appt5 = new Appt( min, hour, day, month, year, title, description,emailaddress);

		String day1 = Integer.toString(day); 
		String statement = "failed to convert" + day1 + " to a non-zero day";
                       if( day == appt5.getStartDay())
		       {
			fail(statement);
			}
                }


*/


//testing the appt hour
	   @Test(timeout = 4000)
        public void  test05()
        {

        int min = 5, hour = 3, day = 3, month = 0, year = 0;
                String title = "will it work?";//integer.tostring(startday);
                String description = "testing validness of day, month, and year";
                String emailaddress = "will it blend?";
                Appt appt6 = new Appt( min, hour, day, month, year, title, description,emailaddress);

                        assertEquals("the start day has been modified", day ,appt6.getStartDay());

                }
	//testing what happens to a day 0 appt
        @Test(timeout = 4000)
        public void  test05_5()
        {

        int min = 5, hour = 3, day = 3, month = 0, year = 0;
                String title = "will it work?";//integer.tostring(startday);
                String description = "testing validness of day, month, and year";
                String emailaddress = "will it blend?";
                Appt appt6 = new Appt( min, hour, day, month, year, title, description,emailaddress);

                        assertEquals("the start day has been modified", day ,appt6.getStartDay());

                }



/*
  //testing time set
        @Test(timeout = 4000)
        public void  test06()
        {

        int min = 0, hour = -1, day = 3, month = 0, year = 0;
                String title = "will it work?";//integer.tostring(startday);
                String description = "testing validness of day, month, and year";
                String emailaddress = "will it blend?";
                Appt appt7 = new Appt( day, month, year, title, description,emailaddress);

                        assertEquals( "currently cant handle a non-starting hour" ,-1 , appt7.hasTimeSet());

                }

//testing time set functionality
        @Test(timeout = 4000)
        public void  test07()
        {

        int min = 5, hour = 3, day = 3, month = 0, year = 0;
                String title = "will it work?";//integer.tostring(startday);
                String description = "testing validness of day, month, and year";
                String emailaddress = "will it blend?";
                Appt appt8 = new Appt( day, month, year, title, description,emailaddress);

                        assertTrue( appt8.hasTimeSet());

                }

*/


  //testing description
        @Test(timeout = 4000)
        public void  test08()
        {

        int min = 5, hour = 3, day = 3, month = 0, year = 0;
                String title = "will it work?";//integer.tostring(startday);
                String description = "testing validness of day, month, and year";
                String emailaddress = "will it blend?";
                Appt appt9 = new Appt( day, month, year, title, description,emailaddress);

                        assertEquals( "currently cant handle a non-starting hour" , description , appt9.getDescription());

                }

//testing emailaddress
        @Test(timeout = 4000)
        public void  test09()
        {

        int min = 5, hour = 3, day = 3, month = 0, year = 0;
                String title = "will it work?";//integer.tostring(startday);
                String description = "testing validness of day, month, and year";
                String emailaddress = "will it blend?";
                Appt appt10 = new Appt( day, month, year, title, description,emailaddress);


			 assertEquals( "bug in email address" , emailaddress , appt10.getEmailAddress());


                }






  //testing description
        @Test(timeout = 4000)
        public void  test11()
        {

        int min = 5, hour = 3, day = 3, month = 0, year = 0;
                String title = "will it work?";//integer.tostring(startday);
//                String description = "testing validness of day, month, and year"

		String description = null;
                String emailaddress = "will it blend?";
                Appt appt12 = new Appt( day, month, year, title, description,emailaddress);

                        assertEquals( "currently cant handle a non-description", "" , appt12.getDescription());

                }

//testing emailaddress
        @Test(timeout = 4000)
        public void  test12()
        {

        int min = 5, hour = 3, day = 3, month = 0, year = 0;
                String title = "will it work?";//integer.tostring(startday);
                String description = "testing validness of day, month, and year";
//                String emailaddress = "will it blend?";
                String emailaddress = null;
                Appt appt13 = new Appt( day, month, year, title, description, emailaddress);


                         assertEquals( "bug in email address", "" , appt13.getEmailAddress());


                }
/*
//testing representationApp
        @Test(timeout = 4000)
        public void  test13()
        {

        int min = 30, hour = 0, day = 14, month = 9, year = 2018;
                String title = "Birthday Party?";//integer.tostring(startday);
                String description = "This is my birthday party";
//                String emailaddress = "will it blend?";
                String emailaddress = null;
                Appt appt14 = new Appt( day, month, year, title, description, emailaddress);
		String string4 = appt14.toString();
		assertEquals("\t14/9/2018 at 2:30pm ,Birthday Party, This is my birthday party\n", string4);


                }


//testing recurrance
        @Test(timeout = 4000)
        public void  test14()
        {

        int min = 30, hour = 0, day = 14, month = 9, year = 2018;
                String title = "Birthday Party?";//integer.tostring(startday);
                String description = "This is my birthday party";
//                String emailaddress = "will it blend?";
                String emailaddress = null;
                Appt appt15 = new Appt( day, month, year, title, description, emailaddress);
                appt15.setRecurrence( null, 2, 1, 0);
                assertEquals( "Cant handle beginning recuring events" ,null, appt15.getRecurDays());


                }



 
 //testing recurrance
        @Test(timeout = 4000)
        public void  test15()
        {

        int min = -1, hour = -5, day = 14, month = 9, year = 2018;
                String title = "Birthday Party?";//integer.tostring(startday);
                String description = "This is my birthday party";
//                String emailaddress = "will it blend?";
                String emailaddress = "xyz@gmail.com";
                Appt appt16 = new Appt( hour, min, day, month, year, title, description, emailaddress);
                appt16.setValid();
		String string0 = appt16.toString();
                assertNull( string0 ,appt16.getStartHour()); 


                }

*/
 
   // public Appt(int startHour, int startMinute, 
     //       int startDay, int startMonth, int startYear,
       //      String title, String description, String emailAddress ) 
 
 
 
 
 
        @Test(timeout = 4000)
        public void  test16()
        {

        int min = -1, hour = 9, day = 14, month = 9, year = 2018;
                String title = "Birthday Party?";//integer.tostring(startday);
                String description = "This is my birthday party";
//                String emailaddress = "will it blend?";
                String emailaddress = "xyz@gmail.com";
                Appt appt16 = new Appt( hour, min, day, month, year, title, description, emailaddress);
                appt16.setValid();
                String string0 = appt16.toString();
                assertNotNull( string0 ,appt16.getStartHour());


                }
 
 
 
 
        @Test(timeout = 4000)
        public void  test17()
        {

        int min = 35, hour = 9, day = 14, month = 9, year = -2018;
                String title = "Birthday Party?";//integer.tostring(startday);
                String description = "This is my birthday party";
//                String emailaddress = "will it blend?";
                String emailaddress = "xyz@gmail.com";
                Appt appt16 = new Appt( hour, min, day, month, year, title, description, emailaddress);
                appt16.setValid();
                String string0 = appt16.toString();
                assertNotNull( string0 ,appt16.isOn(day, month, year));


                }

 
 
        @Test(timeout = 4000)
        public void  test18()
        {

        int min = 35, hour = 9, day = 14, month = 9, year = 2018;
                String title = "Birthday Party?";//integer.tostring(startday);
                String description = "This is my birthday party";
//                String emailaddress = "will it blend?";
                String emailaddress = "xyz@gmail.com";
                Appt appt16 = new Appt( hour, min, day, month, year, title, description, emailaddress);
                appt16.setValid();
                String string0 = appt16.toString();
                assertNotNull( string0 ,appt16.isOn(day, month, year));


                }


 
     @Test(timeout = 4000)
        public void  test19()
        {

        int min = 35, hour = 9, day = 0, month = 9, year = 2018;
                String title = "Birthday Party?";//integer.tostring(startday);
                String description = "This is my birthday party";
//                String emailaddress = "will it blend?";
                String emailaddress = "xyz@gmail.com";
                Appt appt16 = new Appt( hour, min, day, month, year, title, description, emailaddress);
                appt16.setValid();
                String string0 = appt16.toString();
                assertNotNull( string0 ,appt16.isOn(day, month, year));


                }



 @Test(timeout = 4000)
        public void  test20()
        {

        int min = 35, hour = 9, day = 0, month = 9, year = 2018;
                String title = "" ;//integer.tostring(startday);
                String description = "This is my birthday party";
//                String emailaddress = "will it blend?";
                String emailaddress = "xyz@gmail.com";
                Appt appt16 = new Appt( hour, min, day, month, year, title, description, emailaddress);
                appt16.setTitle(null);
                String string0 = appt16.toString();
                assertNotNull( string0 ,appt16.isOn(day, month, year));


                }




 @Test(timeout = 4000)
        public void  test21()
        {

        int min = 35, hour = 9, day = 0, month = 9, year = 2018;
                String title = "" ;//integer.tostring(startday);
                String description = "This is my birthday party";
//                String emailaddress = "will it blend?";
                String emailaddress = "xyz@gmail.com";
                Appt appt16 = new Appt( hour, min, day, month, year, title, description, emailaddress);
                appt16.setTitle(null);
		appt16.setValid();
		appt16.valid = false;


                String string0 = appt16.toString();
                assertNotNull( string0 ,appt16.isOn(day, month, year));


                }


 
 
 }







