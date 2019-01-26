import java.util.Date;
import java.text.SimpleDateFormat;
class Example{
   public static float count_date (String dateBeforeString, String dateAfterString){

	 SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");

	 try {
	       Date dateBefore = myFormat.parse(dateBeforeString);
	       Date dateAfter = myFormat.parse(dateAfterString);
	       long difference = dateAfter.getTime() - dateBefore.getTime();
	       float daysBetween = (difference / (1000*60*60*24));
               /* You can also convert the milliseconds to days using this method
                * float daysBetween =
                *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
                */
	       return daysBetween;
	 } catch (Exception e) {
	       e.printStackTrace();
	 }
   }
}
