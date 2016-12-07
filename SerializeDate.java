import java.io*;
import java.util.*;

public class SerializeDate
{
SerializeDate()
{
	Date d = new Date();
	try
	{
	FileOutputStream f = new FileOutputStream("date.ser");
	ObjectOutputStream os = new ObjectOutputStream(f);
	os.writeObject(d);
	os.close();
	}
	catch(IOException e){}
}
public static void main(String args[])
{
new SerializeDate();
}		
}