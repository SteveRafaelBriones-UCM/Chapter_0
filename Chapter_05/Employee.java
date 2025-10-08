public class Employee {
    private int employeeNumber;
    private double payRate;
    private double hoursWorked;

    private final int MAX_EMPLOYEE_NUMBER = 9999;
    private final double MAX_RATE = 60.00;
    private final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate, double hoursWorked) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER)
            employeeNumber = MAX_EMPLOYEE_NUMBER;
        if (payRate > MAX_RATE)
            payRate = MAX_RATE;

        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getRegularPay() {
        double regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double getOvertimePay() {
        double overtimeHours = Math.max(hoursWorked - 40, 0);
        return overtimeHours * payRate * OVERTIME_MULTIPLIER;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}
