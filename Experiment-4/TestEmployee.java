public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice Johnson", 85000.0, 2019, "AB123456C");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Salary: $" + emp.getSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
    }
}

