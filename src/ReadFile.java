import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile
{
    public static void main(String[] args)
    {
        Read();
    }
    public static void Read()
    {
        FileInputStream connect = null;

        try //We check if the file exists
        {
            connect = new FileInputStream("File.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FATAL ERROR!");
            System.exit(1);
        }
        ////////////////////////////////////////
        int letter = 0; //Character reading
        try
        {
            letter = connect.read();
            while(letter != -1)
            {
                System.out.print((char)letter);
                letter = connect.read();
            }
        }
        catch (IOException e)
        {
            System.out.println("FATAL ERROR!");
            System.exit(2);
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


