public class Employee extends Person {
    double salary;
    int yearStarted;
    String nationalInsuranceNumber;

    public Employee(String name, double salary, int yearStarted, String nationalInsuranceNumber) {
        super(name);
        this.salary = salary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }
}

