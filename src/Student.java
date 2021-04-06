public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private boolean isFemale;
    private double mark;

    public Student(String name, String lastName, int y, boolean isFemale, double m) {
        firstName = name;
        this.lastName = lastName;
        year = y;
        this.isFemale = isFemale;
        mark = m;
    }
     public void print(){
         System.out.println("First Name=" + firstName + " Last Name=" + lastName + " Age="
                 + year + " Gender=" + isFemale + " Mark=" + mark);

    }
}
//Student: First Name, Last Name, year, gender, mark