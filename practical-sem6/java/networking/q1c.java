import java.util.*;
import java.net.*;
import java.io.*;

class q1c {
    public static void main(String args[]) throws UnknownHostException, IOException {
        Socket s = new Socket("localhost", 4000);
        
        DataInputStream out = new DataInputStream(s.getInputStream());

        System.out.println("Server machine date and time is " + out.readUTF());

        s.close();
        out.close();
    }
}