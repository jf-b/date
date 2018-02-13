package fr.humanbooster.algo.dateTest;

import java.util.Calendar;
import java.util.Date;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    java.sql.Date sqlDate = new java.sql.Date(new Date().getTime());
    System.out.println(sqlDate);
    Date date = convertSqlDateToUtilDate(sqlDate);
    System.out.println(date);
	}
private static java.util.Date convertSqlDateToUtilDate (java.sql.Date sqlDate) {
 Calendar cal = Calendar.getInstance();	
 cal.setTime(sqlDate);
 return cal.getTime();
}
}