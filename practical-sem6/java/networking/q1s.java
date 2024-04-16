import java.io.*;
import java.util.*;
import java.net.*;


class q1s {
    public static void main(String args[]) throws UnknownHostException, IOException {
        ServerSocket ss = new ServerSocket(4000);
        System.out.println("Server started");
        Socket s = ss.accept();

        System.out.println("Connected to client");

        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        Date now = new Date();

        out.writeUTF(now.toString());

        out.close();
        s.close();
        ss.close();
    }
}