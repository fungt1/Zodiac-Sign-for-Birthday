package v1;

import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author Tyler Fung
 *
 * This class contains the Zodiac signs and enables the program to read your input 
 * and produce an output. 
 * 
 * 09/23/16
 */
public class ZodiacTable {
	/**
	 * Creates the ArrayList to be called upon from the driver. 
	 */
	/**
	 * New ArrayList called zoSigns is created. 
	 */
	private ArrayList<ZodiacSign> zoSigns = new ArrayList<ZodiacSign>();
	
	
	public void addZodiacs(ZodiacSign sign){
		
	}
		
	/**
	 * returns the ArrayList of zoSigns. 
	 * @return
	 */
	public ArrayList<ZodiacSign> getSigns() {
		return zoSigns;
	}
	/**
	 * This switch method determines the sign that 
	 * should be displayed to the user by accordance to 
	 * the date you put down. 
	 * @param birthdate
	 */
	public String determineSign(Date birthdate)
	{
			String theMonth = birthdate.toString().substring(4,7);
			String theDay = birthdate.toString().substring(8,10).trim();
			int checkDay = Integer.parseInt(theDay); 
			switch(theMonth){
			case "Jan":
				if(checkDay >= 1 || checkDay <= 20){
					return "Capricorn";
				}
				else if(checkDay >= 21 || checkDay <= 31){
					return "Aquarius";
				} 
				break;
			case "Feb":
				if(checkDay >= 1 || checkDay <= 19){
					return "Aquarius";
				}
				else if(checkDay >= 20 || checkDay <= 29){
					return "Pisces";
				}
				break;
			case "Mar":
				if(checkDay >= 1 || checkDay <= 20){
					return "Pisces";
				}
				else if(checkDay >= 21 || checkDay <= 31){
					return "Aries";
				}
				break;
			case "Apr":
				if(checkDay >= 1 || checkDay <= 21){
					return "Aries";
				}
				else if(checkDay >= 22 || checkDay <= 30){
					return "Taurus";
				}
				break;
			case "May":
				if(checkDay >= 1 || checkDay <= 20){
					return "Taurus";
				}
				else if(checkDay >= 21 || checkDay <= 31){
					return "Gemini";
				}
				break;
			case "Jun":
				if(checkDay >= 1 || checkDay <= 21){
					return "Gemini";
				}
				else if(checkDay >= 22 || checkDay <= 30){
					return "Cancer";
				}
				break;
			case "Jul":
				if(checkDay >= 1 || checkDay <= 22){
					return "Cancer";
				}
				else if(checkDay >= 23 || checkDay <= 30){
					return "Leo";
				}
				break;
			case "Aug":
				if(checkDay >= 1 || checkDay <= 23){
					return "Leo";
				}
				else if(checkDay >= 24 || checkDay <= 31){
					return "Virgo";
				}
				break;
			case "Sep":
				if(checkDay >= 1 || checkDay <= 23){
					return "Virgo";
				}
				else if(checkDay >= 24 || checkDay <= 30){
					return "Libra";
				}
				break;
			case "Oct":
				if(checkDay >= 1 || checkDay <= 23){
					return "Libra";
				}
				else if(checkDay >= 24 || checkDay <= 31){
					return "Scorpio";
				}
				break;
			case "Nov":
				if(checkDay >= 1 || checkDay <= 22){
					return "Scorpio";
				}
				else if(checkDay >= 23 || checkDay <= 30){ 
					return "Sagittatius";
				}
				break;
			case "Dec":
				if(checkDay >= 1 || checkDay <= 21){
					return "Sagittatius";
				}
				else if(checkDay >= 22 || checkDay <= 31){
					return "Capicorn";
				}
				break;
			default:
				return "Invalid Date";
				
	
				
			}
			return theDay;
			
		
	}
}
