package Module3;

public class Encapsulation {
    private int bankbalance;
    private int Salary;
    //Setter
    public void setBankBalance(int bankbalance){
        this.bankbalance=bankbalance;
    }
    public void setSalary(int Salary){
        this.Salary=Salary;
    }
    //Getter
    public int getBankBalance(){
        return this.bankbalance;
    }
    public int getSalary(){
        return this.Salary;
    }

}

