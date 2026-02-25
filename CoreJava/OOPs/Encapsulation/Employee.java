public class Employee {
    private int empId;
    private double salary;

    public Employee(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }
}
