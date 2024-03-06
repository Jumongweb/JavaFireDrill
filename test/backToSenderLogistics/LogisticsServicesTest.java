package backToSenderLogistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LogisticsServicesTest {

    @Test
    public void test_thatWith25Deliveries_EmployeeEarns9_000(){
        int expected = 9_000;
        assertEquals(expected, LogisticServices.riderPayment(25));
    }

    @Test
    public void test_thatWith55Deliveries_EmployeeEarns16_000(){
        int expected = 16_000;
        assertEquals(expected, LogisticServices.riderPayment(55));
    }

    @Test
    public void test_thatWith65Deliveries_EmployeeEarns21_250(){
        int expected = 21_250;
        assertEquals(expected, LogisticServices.riderPayment(65));
    }


    @Test
    public void test_thatWith80Deliveries_EmployeeEarns45_000(){
        int expected = 45_000;
        assertEquals(expected, LogisticServices.riderPayment(80));
    }

    @Test
    public void test_thatNegativeDelivery_LeadsToException(){
        assertThrows(InvalidDeliveryException.class, ()->LogisticServices.riderPayment(-23));
    }

    @Test
    public void test_thatIfEmployee_deliverNothing_EarnsOnlyBasePay(){
        int expected = 5000;
        assertEquals(expected, LogisticServices.riderPayment(0));
    }

}
