package ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtil {
	
	private DateUtil() {
		
	}
		
	/** FORMAT_DDMMYYYY_HHMMSS : String */
	public static final String FORMAT_DDMMYYYY_HHMMSS = "dd/MM/yyyy HH:mm:ss";
	
	/** Retourne une date sur le format renseigné
	 * @param dateFinComptage
	 * @param format
	 * @return Date
	 */
	public static Date format(String dateFinComptage, String format) {
		SimpleDateFormat ff = new SimpleDateFormat(format);
		if (dateFinComptage!=null){
			try {
				return ff.parse(dateFinComptage);
			} catch (ParseException e) {
				return null;
			}
		}
		return null;
	}
	
	/** Retourne une chaîne de caractères d'une date
	 * @param date
	 * @return String
	 */
	public static String toString(Date date, String format) {
		SimpleDateFormat f = new SimpleDateFormat(format);
		return f.format(date);
	}

}
