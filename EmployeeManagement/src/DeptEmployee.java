import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    protected double salary;
    private LocalDate hireDate;

    DeptEmployee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double computeSalary () {
        return salary;
    }

    @Override
    public String toString() {
        return "name=" + name +
                "\nsalary=" + salary +
                "\nhireDate='" + hireDate;
    }
}
