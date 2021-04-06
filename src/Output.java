import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Output {
    public static Student[] readStudent() {
        FileInputStream stream = null;
        String fileString="";
        try {
            try{
                InputStream ips = new FileInputStream(Input.FILENAME);
                InputStreamReader ipsr = new InputStreamReader(ips);
                BufferedReader br = new BufferedReader(ipsr);
                String line;
                while ((line = br.readLine()) != null){
                    fileString += line + "\n";
                }
                br.close();
            }
            catch (Exception e){
                System.out.println(e.toString());
            }

            String lines[] = fileString.split("\\n");

            Student[]students= new Student[lines.length];

            for (int i=0; i< students.length; i++){
                Student student=  parseStudent(lines[i]);
                students[i]= student;

            }

            return students;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Student parseStudent(String line) {
        String[] studentParams = line.split(",");

        Student student = new Student(studentParams[0], studentParams[1],
                Integer.parseInt(studentParams[2]), Boolean.parseBoolean(studentParams[3]), Double.parseDouble(studentParams[4]));
        return student;
    }
}
