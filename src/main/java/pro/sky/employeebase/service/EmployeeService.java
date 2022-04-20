package pro.sky.employeebase.service;

import org.springframework.stereotype.Service;
import pro.sky.employeebase.exception.ArrayIsFullException;
import pro.sky.employeebase.Employee;
import pro.sky.employeebase.exception.EmployeeNotFoundException;

@Service
public class EmployeeService {
    private Employee[] employees = new Employee[2];

    public String addEmployee(String firstName, String lastName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(firstName, lastName);
                return "Сотрудник " + firstName + " " + lastName + " успешно создан.";
            }
        }
        throw new ArrayIsFullException();
    }

    public String deleteEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if (employee.equals(currentEmployee)) {
                employees[i] = null;
                return "Сотрудник " + firstName + " " + lastName + " удалён.";
            }
        }
        throw new EmployeeNotFoundException();
    }
    public Employee searchEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if (employee.equals(currentEmployee)) {
                return employees[i];
            }
        }
        throw new EmployeeNotFoundException();
    }
}
