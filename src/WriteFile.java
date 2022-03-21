import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class WriteFile
{
    public static void main(String[] args)
    {
        FileOutputStream connect = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Get File Name:");
        String fileName = input.nextLine();
        System.out.println("Get Text:");
        String text = input.nextLine();
        String fileVariant = ".txt";
        try //Create file
        {
            connect = new FileOutputStream(fileName+fileVariant);
            for(int i = 0; i < text.length(); i++)
            {
                connect.write((int)text.charAt(i));
            }
        }
        catch(IOException ex)
        {
            System.out.println("FATAL ERROR");
        }
        ////////////////////////////////////////
        try //Close file
        {
            connect.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
