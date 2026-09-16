class Person{
    protected String name; 
    protected int age; 

    void setPersonData(){
        name="Namrata Biswas";
        age=18;
    }

    void displayPersonData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person{
    private int rollNo; 
    private String course;

    void setStudentData(){
        rollNo=118;
        course="CSE";
    }

    void displayStudentData() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        Student s = new Student();



        s.setPersonData();
        s.setStudentData();

        System.out.println("\nStudent Details:");
        s.displayPersonData();
        s.displayStudentData();
    }
}