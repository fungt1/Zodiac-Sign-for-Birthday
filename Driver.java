package v1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 * 
 * @author Tyler Fung
 *
 * This is the main driver's class that will run the program. 
 * 
 * 09/23/16
 */
public class Driver {
	public static void main(String[] args) throws ParseException {
	
		Date birthdate = getBirthdate();
		ZodiacTable zodiac = createZodiacTable();
		System.out.println(zodiac.determineSign(birthdate));	
		System.out.println();
		display();
	
	}
	/**
	 * All Zodiacs are created here as a String and are listed within
	 * their date ranges. 
	 * @return
	 * @throws ParseException
	 */
	public static ZodiacTable createZodiacTable() throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		String signName = "Aries";
		Date startPeriod = format.parse("03/21/1900");
		Date endPeriod = format.parse("04/20/2016");
		ZodiacSign aries = new ZodiacSign(signName, startPeriod, endPeriod);
		ZodiacTable zoSigns = new ZodiacTable(); 
		zoSigns.addZodiacs(aries);
		
		signName = "Taurus";
		startPeriod = format.parse("04/21/1900");
		endPeriod = format.parse("05/20/2016");
		ZodiacSign taurus = new ZodiacSign(signName, startPeriod, endPeriod);
		zoSigns.addZodiacs(taurus);
		
		signName = "Gemini";
		startPeriod = format.parse("05/21/1900");
		endPeriod = format.parse("06/21/2016");
		ZodiacSign gemini = new ZodiacSign(signName, startPeriod, endPeriod);
		zoSigns.addZodiacs(gemini);
		
		signName = "Cancer";
		startPeriod = format.parse("06/22/1900");
		endPeriod = format.parse("07/22/2016");
		ZodiacSign cancer = new ZodiacSign(signName, startPeriod, endPeriod);
		zoSigns.addZodiacs(cancer);

		
		signName = "Capicorn";
	    startPeriod = format.parse("01/01/1900");
	    endPeriod = format.parse("01/20/2016");
	    ZodiacSign capicorn = new ZodiacSign(signName, startPeriod, endPeriod);
		zoSigns.addZodiacs(capicorn);
		
		signName = "Leo";
		startPeriod = format.parse("07/23/1900");
		endPeriod = format.parse("08/23/2016");
		ZodiacSign leo = new ZodiacSign(signName, startPeriod, endPeriod);
		zoSigns.addZodiacs(leo);

		signName = "Virgo";
		startPeriod = format.parse("08/24/1900");
		endPeriod = format.parse("09/23/2016");
		ZodiacSign virgo = new ZodiacSign(signName, startPeriod, endPeriod);
		zoSigns.addZodiacs(virgo);

		signName = "Libra";
		startPeriod = format.parse("09/24/1900");
		endPeriod = format.parse("10/23/2016");
		ZodiacSign libra = new ZodiacSign(signName, startPeriod, endPeriod);
		zoSigns.addZodiacs(libra);

		signName = "Scorpio";
		startPeriod = format.parse("10/24/1900");
		endPeriod = format.parse("11/22/2016");
		ZodiacSign scorpio = new ZodiacSign(signName, startPeriod, endPeriod);
		zoSigns.addZodiacs(scorpio);

		signName = "Sagittatius";
		startPeriod = format.parse("11/23/1900");
		endPeriod = format.parse("12/21/2016");
		ZodiacSign sagittatius = new ZodiacSign(signName, startPeriod, endPeriod);
		zoSigns.addZodiacs(sagittatius);

		signName = "Capicorn";
		startPeriod = format.parse("12/22/1900");
		endPeriod = format.parse("12/31/2016");
		ZodiacSign capicornone = new ZodiacSign(signName, startPeriod, endPeriod);
		zoSigns.addZodiacs(capicornone);
		
		signName = "Aquarius";
		startPeriod = format.parse("01/21/1900");
		endPeriod = format.parse("02/19/2016");
		ZodiacSign aquarius = new ZodiacSign(signName, startPeriod, endPeriod);
		zoSigns.addZodiacs(aquarius);

		signName = "Pisces";
		startPeriod = format.parse("02/20/1900");
		endPeriod = format.parse("03/20/2016");
		ZodiacSign pisces = new ZodiacSign(signName, startPeriod, endPeriod);
		zoSigns.addZodiacs(pisces);
		return zoSigns;
		
	
	}
		
	/**
	 * Allows you to enter your information for the program to read what Zodiac
	 * sign you are in simple format of dates.	
	 * @return
	 * @throws ParseException
	 */
	public static Date getBirthdate() throws ParseException{
		do{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your birthdate (format like '11/25/1995'):");
		String birthdateString = sc.nextLine();
		sc.close();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date birthdate = format.parse(birthdateString);
		return birthdate;
		}while(true);
	}
	/**
	 * Method that calls the ArrayList from ZodiacTable class to have
	 * the signs and dates printed out. 
	 * 
	 * @throws ParseException
	 */
	public static void display() throws ParseException{
		ZodiacTable zodiac = new ZodiacTable();
		ArrayList<ZodiacSign> list = zodiac.getSigns(); 
		for (ZodiacSign sign: list)
		{
			System.out.println(sign);
			System.out.println();
		}
	
}
}

