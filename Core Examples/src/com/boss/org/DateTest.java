package com.boss.org;

import java.text.SimpleDateFormat;

public class DateTest {

	public static void main(String[] args) {
		// SimpleDateFormat can be used to control the date/time display format:
	      //   E (day of week): 3E or fewer (in text xxx), >3E (in full text)
	      //   M (month): M (in number), MM (in number with leading zero)
	      //              3M: (in text xxx), >3M: (in full text full)
	      //   h (hour): h, hh (with leading zero)
	      //   m (minute)
	      //   s (second)
	      //   a (AM/PM)
	      //   H (hour in 0 to 23)
	      //   z (time zone)
		/*Date now=new Date();
		System.out.println(now); // dow mon dd hh:mm:ss zzz yyyy
*/		
		String input="Monday, February 19, 2018";
		System.out.println(input.toString());
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("E, y-M-d");
		System.out.println(dateFormat.format(input));
		
		
		/*SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
	      System.out.println("Format 1:   " + dateFormatter.format(now));
		
		SimpleDateFormat dateFormatter1 = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
	      System.out.println("Format 1:   " + dateFormatter1.format(now));

	      dateFormatter1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      System.out.println("Format 2:   " + dateFormatter1.format(now));
	      
	      dateFormatter1 = new SimpleDateFormat("EEEE, MMMM d, yyyy");
	      System.out.println("Format 3:   " + dateFormatter1.format(now));*/
	}

}
