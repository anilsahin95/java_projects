public class Employee {
    String name;
    int salary;
    int workingHours;
    int year;

    Employee(String name,int salary,int workingHours,int year){
        this.name = name;
        this.salary = salary;
        this.workingHours = workingHours;
        this.year = year;

    }

    public double taxCuting(int sal){
        double vergi;
        if(sal >= 1000){
            return vergi = sal * 0.03;
        }
        else return 0;
    }

    public int bonusCal(int saat){
        return (saat > 40) ?  (saat - 40) * 30 : 0;
    }

    public double raiseSalary(int yearss){
        int fark = 2021 - yearss;
        double zam;

        if(fark < 10) return zam = this.salary * 1.05 - this.salary;
        if(fark < 20 && fark > 9) return zam = this.salary * 1.10 - this.salary;
        if (fark > 20) return zam = this.salary * 1.15 - this.salary;
        else return 0;
    }

    @Override
    public String toString() {
        System.out.println("--------------------");
        return "Name: " + this.name + "\nSalary: " + this.salary +
                "\nWork Hours: " + this.workingHours + "\nHire Year: " + this.year +
                "\nTax: " + taxCuting(this.salary) + "\nBonus: " + bonusCal(this.workingHours) + "\nsalary increase: " + raiseSalary(this.year) +
                "\nSalary including tax and bonus: " + (this.salary + bonusCal(this.workingHours) - taxCuting(this.salary)) +
                "\nNet Salary: " + (this.salary + raiseSalary(this.year));
    }

}
