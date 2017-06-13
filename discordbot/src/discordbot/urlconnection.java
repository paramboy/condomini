package discordbot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class urlconnection
{
  public static void main(String[] args)
 {
    StringBuffer document = new StringBuffer();
    try 
    {

        URL url = new URL("http://urzasarchives.com/night/");
        URLConnection conn = url.openConnection();
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line = null;
        while ((line = reader.readLine()) != null)
        document.append(line + " ");
        reader.close();
    }
    catch (MalformedURLException e) 
    {
        e.printStackTrace(); 
    }
    catch (IOException e)
    {
        e.printStackTrace(); 
    }
    System.out.println(document.toString());
}
}
