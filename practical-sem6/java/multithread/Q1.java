import java.io.*;
import java.util.*;

class ReadFile extends Thread {
    String word;
    String fileName;

    public ReadFile(String word, String fileName) {
        this.word = word;
        this.fileName = fileName;
    }

    public void start() {
        boolean found = false;
        try {
            File file = new File(this.fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line.contains(this.word)) {
                    found = true;
                    break;
                }
            }
            scanner.close();

            if (found) {
                System.out.println("Word found !" + this.fileName);
            } else {
                System.out.println("Word not found !" + this.fileName);
            }
        } catch(FileNotFoundException e) {
                System.out.println("File not found !" + this.fileName);
        }
    }
}

class Q1 {
    public static void main(String args[]) {
        File dir = new File(args[1]);   //direactory name
        System.out.println("Directory is :" + args[1]);

        if (dir.isDirectory()) {
            File[] list = dir.listFiles();
            ReadFile[] readFile = new ReadFile[list.length];
            int j = 0;
            for (int i = 0; i < list.length; i++) {
                if (list[i].isFile() && list[i].getName().endsWith(".txt")) {
                    readFile[j] = new ReadFile(args[0], args[1] + "/"+ list[i].getName());
                    readFile[j++].start();
                }
            }
        } else {
            System.out.println(args[1] + " is not a directory");
        }
    } 
}