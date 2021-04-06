import java.io.*;
import java.util.Scanner;

public class Input {
    public static final String FILENAME;
    static {
        FILENAME = "/Users/syuzannamuradyan/IdeaProjects/Students/student.txt";

    }

    public static void studentInput(){
        System.out.println("Please enter student data \n");

        String file = FILENAME;

        Scanner scan = new Scanner(System.in);
       // scan.useDelimiter("\\n");

       // System.out.println("Enter DONE to terminate");
        try (FileWriter fw = new FileWriter(new File(file))) {
            String line = null;

            line = scan.nextLine();

            fw.write(line);
            fw.close();
            scan.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
