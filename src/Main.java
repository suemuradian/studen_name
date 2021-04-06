public class Main {
    public static void main(String[] args) {
       // Input.studentInput();
      Student[] students = Output.readStudent();
        for(int i=0 ; i< students.length; i++){

            students[i].print();
        }
    }
}
