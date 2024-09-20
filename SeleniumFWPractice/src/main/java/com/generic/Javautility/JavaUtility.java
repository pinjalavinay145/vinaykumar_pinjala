package com.generic.Javautility;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	
	public int RandomNumber() 			
	{  
		Random rn= new Random();
		 int random =rn.nextInt(5000);
		return random;
		
	}
	
public String GetSystemDate(String pattern) {
	Date da= new Date();
	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	   String date= sdf.format(da);
	   return date;
	  }

public String requireddate(int num, String pattern) {
	
	Calendar ca = Calendar.getInstance();	
	  
	ca.add(Calendar.DAY_OF_MONTH, num);
	Date da= ca.getTime();
	SimpleDateFormat sdf= new SimpleDateFormat(pattern);
	String reqdate=sdf.format(da);
	return reqdate;
	
	
	
}




}