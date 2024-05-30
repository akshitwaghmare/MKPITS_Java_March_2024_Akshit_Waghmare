package setGet;

public class setgetEmp {
    String name;
    int salary;
    String empid;
    String designation;

    // Default constructor
    public setgetEmp() {
        System.out.println("Default constructor is invoked.");
    }

    // Constructor with name and salary parameters
    public setgetEmp(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Constructor with name and salary is invoked.");
    }

    // Constructor with all parameters
    public setgetEmp(String name, int salary, String empid, String designation) {
        this.name = name;
        this.salary = salary;
        this.empid = empid;
        this.designation = designation;
        System.out.println("Constructor with all parameters is invoked.");
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
