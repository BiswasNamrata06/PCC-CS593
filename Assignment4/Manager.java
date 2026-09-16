class Employee {
    protected int empId; 
    protected String name; 
    protected double basicSalary;
    Employee(int empId, String name, double basicSalary){
       this.empId=empId;
       this.name=name;
       this.basicSalary=basicSalary;

    }
    void displayEmployee(){
        System.out.println("Employee Id: "+empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + basicSalary);
    }
}
class Manager extends Employee{
    private double bonus;

    Manager(int empId, String name, double basicSalary, double bonus){
        super(empId, name, basicSalary);
        this.bonus=bonus;
    }
    void displayManager() {
        displayEmployee();
        System.out.println("Bonus: " +bonus);
    }
    public static void main(String[] args) {
        Manager m = new Manager(101, "Namrata", 50000, 10000);

        System.out.println("Manager Details:");
        m.displayManager();
    }
}

