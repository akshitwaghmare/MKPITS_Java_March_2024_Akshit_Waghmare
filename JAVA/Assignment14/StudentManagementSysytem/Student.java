package StudentManagementSysytem;

public class Student implements Comparable {
    private int id;
    private String name;
    private int grade;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
    public void display(){
        System.out.println("id : "+id);
        System.out.println("name : "+name);
        System.out.println("grade : "+grade);
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return new Integer(this.grade).compareTo(((Student)o).getGrade());
    }
}
