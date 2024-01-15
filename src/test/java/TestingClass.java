import espol.sd.Calculation;
import espol.sd.Employee;
import espol.sd.EmployeeType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestingClass {
    @Test
    public void testFindMax() {
        assertEquals(4, Calculation.findMax(new int[]{1, 3, 4, 2}));
        assertEquals(-1, Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
    }

    @Test
    public void modifiedTestFindMax() {
        assertEquals(9, Calculation.findMax(new int[]{9, -4, 7, 0}));
        assertEquals(8, Calculation.findMax(new int[]{8, 4, 8, -10}));
        assertEquals(1, Calculation.findMax(new int[]{1, -2, -9, -7}));
    }

    @Test
    public void testCS() {
        // Months
        

        // Caso 1
        Employee employee1 = new Employee(5, "USD", 20, EmployeeType.Worker);
        float result1 = employee1.cs();

        // Caso 2
        Employee employee2 = new Employee(10, "USD", 30, EmployeeType.Supervisor);
        float result2 = employee2.cs();

        // Caso 3
        Employee employee3 = new Employee(12, "USD", 40, EmployeeType.Manager);
        float result3 = employee3.cs();

        // Caso 4
        Employee employee4 = new Employee(30, "EUR", 50, EmployeeType.Worker);
        float result4 = employee4.cs();

        // Caso 5
        Employee employee5 = new Employee(15, "USD", 30, EmployeeType.Worker);
        float result5 = employee5.cs();

        // Caso 6
        Employee employee6 = new Employee(30, "USD", 60, EmployeeType.Supervisor);
        float result6 = employee6.cs();

        // Caso 7
        Employee employee7 = new Employee(20, "USD", 70, EmployeeType.Manager);
        float result7 = employee7.cs();
    }
}
