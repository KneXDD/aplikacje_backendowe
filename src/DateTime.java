import java.util.Date;
import java.util.TimeZone;
public class DateTime
{
    public static void main(String[] args)
    {
        Date polDate = new Date();
        System.out.println(polDate);
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        System.out.println(polDate);
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        System.out.println(polDate);
    }
}
