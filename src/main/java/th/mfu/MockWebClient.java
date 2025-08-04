package th.mfu;

import java.io.*;
import java.net.*;

// call mockup server at port 8080
public class MockWebClient {
    public static void main(String[] args) {
        
        // TODO: Create a socket to connect to the web server on port 8080
         try( Socket socket = new Socket("localhost", 8080)){
            System.out.println("Connected to server on port 8080");
         

         

        // :TODO Create input and output streams for the socket
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
           
            
        

        // TODO: send an HTTP GET request to the web server

        String request = "GET / HTTP/1.1\r\nHost: localhost\r\n\r\n";
       out.print(request);
       out.flush();

        // Read the response from the web server and print out to console
            String responLine;
            while ((responLine=in.readLine())!= null) {
                System.out.println(responLine);
                
            }
         }
        // Close the socket
            catch(IOException e){
                System.err.println("Client error: "+e.getMessage());
            }
            // Step 5: Close everything
            
    }

}
