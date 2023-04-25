import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class JavaNetURLConsumeExample {
    public static void main(String[] args) {

        //getting access and consuming a resource

        try {
            //try to establish connecton to this link
            URL url = new URL("http", "www.gnu.org", 80, "/licenses/gpl.txt");
            System.out.println("The URL is: " + url.toString() + "\n");

            //open url stream as an input stream to print the contnets of the txt file to the command line

            try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {

                String inputLine;
                //read the output of the txt file from its URL represenatation
                System.out.println("/**** File content (URL) *****/n");
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
