package lesson04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ProgramFourth {
    public static void main(String[] args) {

        FileReader fr = null;
        File f = new File("werwerwer");
        f.canRead();
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            simpleWaiter(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            int i= 10/0;
        } catch (IllegalArgumentException ae){
            System.out.println("Exception toString():" + ae);
            System.out.println("");
            System.out.println("Exception getMessage():" + ae.getMessage());
            System.out.println("");
            System.out.println("Exception printStackTrace()");
            ae.printStackTrace();
        }
        finally {
            System.out.println("Final block");
        }

    }
    private static void simpleWaiter(long timeout) throws InterruptedException {
        Thread.sleep(timeout);
    }
}
