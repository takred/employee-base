package pro.sky.employeebase;

public class Employee {
    private final String firstName;
    private final String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(Employee employee) {
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Employee employee = new Employee((Employee)obj);
        if (this.firstName.equals(employee.getFirstName())
                && this.lastName.equals(employee.getLastName())) {
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";
        result += "Имя - " + firstName + "\n";
        result += "Фамилия - " + lastName + "\n";
        return result;
    }
}
