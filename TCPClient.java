package tcpclient;
import java.net.*;
import java.io.*;

public class TCPClient {

    public static String askServer(String hostname, int port, String ToServer) throws IOException {

        if (ToServer == null)
            return askServer(hostname, port);
        else {

            String answer = "";
            int i = 0;
            Socket socketClient = new Socket(hostname, port);
            socketClient.setSoTimeout(3000);
            InputStream in = socketClient.getInputStream();

            DataOutputStream out = new DataOutputStream(socketClient.getOutputStream());

            out.writeBytes(ToServer + '\n');

            try{

              while ((i = in.read()) != -1) {

                answer += (char) i;

              }

            }

          catch(SocketTimeoutException e){
            in.close();
            out.close();
            socketClient.close();
            return answer;
          }

            in.close();
            out.close();
            socketClient.close();
            return answer;
        }

    }

    public static String askServer(String hostname, int port) throws IOException {
      String answer = "";
      int i = 0;
      Socket socketClient = new Socket(hostname, port);
      socketClient.setSoTimeout(3000);
      InputStream in = socketClient.getInputStream();

      try{
        int countr = 0;
        while ((i = in.read()) != -1 && countr < 2000) {
          answer += (char) i;
          countr++ ;

        }

      }

    catch(SocketTimeoutException e){
      in.close();
      socketClient.close();
      return answer;
    }

      in.close();
      socketClient.close();
      return answer;
    }
}
