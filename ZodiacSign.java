package v1;

import java.util.Calendar;
import java.util.Date;
/**
 * @author Tyler Fung
 *
 * models sign that includes the name, start, and end date of each zodiac sign
 * 
 * 09/23/16
 */
public class ZodiacSign {
	private String zodiacSignName;
	private Date startPeriod;
	private Date endPeriod;
	/**
	 * 3-argument constructor takes a String and 2 Dates 
	 * @param zodiacSignName
	 * @param startPeriod
	 * @param endPeriod
	 */
	public ZodiacSign(String zodiacSignName, Date startPeriod, Date endPeriod){
		this.zodiacSignName = zodiacSignName;
		this.startPeriod = startPeriod;
		this.endPeriod = endPeriod;
	}
	/**
	 * returns the zodiacSignName
	 * @return
	 */
	public String getZodiacSignName() {
		return zodiacSignName;
	}
	/**
	 * sets the zodiacSignName with the given parameter.
	 * 
	 * @param zodiacSignName
	 */
	public void setZodiacSignName(String zodiacSignName) {
		this.zodiacSignName = zodiacSignName;
	}
	/**
	 * returns the date of the specific Zodiac
	 * @return
	 */
	public Date getZodiacStartDate() {
		return startPeriod;
	}
	/**
	 * sets the date with the given parameter
	 * @param startPeriod
	 */
	public void setZodiacStartDate(Date startPeriod) {
		this.startPeriod = startPeriod;
	}
	/**
	 * returns the ending date of the specific zodiac. 
	 * @return
	 */
	public Date getZodiacEndDate() {
		return endPeriod;
	}
	/**
	 * sets the ending date with the given parameter
	 * @param endPeriod
	 */
	public void setZodiacEndDate(Date endPeriod) {
		this.endPeriod = endPeriod;
	}
	/** 
	 * A toString method that displays the name and dates of each zodiac.
	 */
	public String toString(){
		Calendar start = Calendar.getInstance();
		start.setTime(startPeriod);
		
		Calendar end = Calendar.getInstance();
		end.setTime(endPeriod);
		
		return "Sign: " + zodiacSignName + "\n" + " " + " Date Range: " + 
		(start.get(Calendar.MONTH)+1) + "/" + 
		start.get(Calendar.DATE) + "/"  +  
		(end.get(Calendar.MONTH)+1) + "/" +
		end.get(Calendar.DATE); 
		
	}	
}

