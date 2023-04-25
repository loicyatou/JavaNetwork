import javax.imageio.IIOException;
import java.net.MalformedURLException;
import java.net.URL;

public class JavaNetURLMethodsExample {
    public static void main(String[] args) {

        //getting access to resource
        try {
            //create a url object to an external resource you want access to
            URL url = new URL("http://www.gnu.org/licenses/gpl.txt");

            //test out some resource access methods provided by Java.network library

                //get the authority of this URL
            System.out.println("URL Authoity: " + url.getAuthority());

                //get the file name of the URL
            System.out.println("URL filename: " + url.getFile());

                //get host name of the URL if there is one
            System.out.println("URL Host name: " + url.getHost());

                //get the path part of the URL
            System.out.println("URL Path name: " + url.getPath());

                //get the protocol name of this URL
            System.out.println("URL protocol " + url.getProtocol());
        } catch (MalformedURLException ioe){
            ioe.printStackTrace();
        }

        //getting access to a resource and consuming it


    }
}
