import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import espol.sd.Calculation;
import espol.sd.Employee;
import espol.sd.EmployeeType;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

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
        // Caso 1
        Employee employee1 = new Employee(5, "USD", 20, EmployeeType.Worker);
        float result1 = employee1.cs();
        assertEquals(69.33F, result1, 0.01);

        // Caso 2
        Employee employee2 = new Employee(10, "USD", 30, EmployeeType.Supervisor);
        float result2 = employee2.cs();
        assertEquals(84.83F, result2, 0.01);

        // Caso 3
        Employee employee3 = new Employee(12, "USD", 40, EmployeeType.Manager);
        float result3 = employee3.cs();
        assertEquals(104.33F, result3, 0.01);

        // Caso 4
        Employee employee4 = new Employee(30, "EUR", 50, EmployeeType.Worker);
        float result4 = employee4.cs();
        assertEquals(92.83F, result4, 0.01);

        // Caso 5
        Employee employee5 = new Employee(15, "USD", 30, EmployeeType.Worker);
        float result5 = employee5.cs();
        assertEquals(31.08F, result5, 0.01);

        // Caso 6
        Employee employee6 = new Employee(30, "USD", 60, EmployeeType.Supervisor);
        float result6 = employee6.cs();
        assertEquals(67.08F, result6, 0.01);

        // Caso 7
        Employee employee7 = new Employee(20, "USD", 70, EmployeeType.Manager);
        float result7 = employee7.cs();
        assertEquals(85.08F, result7, 0.01);
    }

    @Test
    public void testCalculateYearBonus() {
        Employee worker = new Employee(20F, "USD", 20, EmployeeType.Worker);
        assertEquals(386.00F, worker.CalculateYearBonus(), 0.01);

        Employee supervisor = new Employee(55F, "USD", 20, EmployeeType.Supervisor);
        assertEquals(248.00F, supervisor.CalculateYearBonus(), 0.01);

        Employee managerUSD = new Employee(70F, "USD", 20, EmployeeType.Manager);
        assertEquals(456.00F, managerUSD.CalculateYearBonus(), 0.01);

        Employee managerEUR = new Employee(85F, "EUR", 20, EmployeeType.Manager);
        assertEquals(466.75F, managerEUR.CalculateYearBonus(), 0.01);
    }
}
