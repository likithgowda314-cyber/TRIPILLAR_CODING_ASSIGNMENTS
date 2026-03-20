package Module3;
public class Constructor {
    String name;
    String role;
    int Idno;
    int Salary;
    Constructor(String name,String role,int Idno,int Salary){
        this.name=name;
        this.role=role;
        this.Idno=Idno;
        this.Salary=Salary;
    }
    void employeeDetails(){
        System.out.println("Name of Employee is:"+name);
        System.out.println("Role of Employee is:"+role);
        System.out.println("Idno of Employee is:"+Idno);
        System.out.println("Salary of Employee is:"+Salary);
    }

    public static void main(String[] args) {
        Constructor employee = new Constructor("Naveen","Manager",20,200000);
        employee.employeeDetails();
    }
}