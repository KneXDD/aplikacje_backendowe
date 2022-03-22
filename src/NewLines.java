public class NewLines
{
    public static void main(String[] args)
    {
        String text = "1.Line 2.Line 3.Line 4.Line";
        String[] line = text.split(" ");
        for (int i = 0; i< line.length; i++)
        {
            String part = line[i];
            System.out.println(part);
        }
    }
}
