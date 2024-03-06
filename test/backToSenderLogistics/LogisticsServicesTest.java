package backToSenderLogistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void test_thatNegativeDelivery_EmployeeEarnsZero(){
        int expected = 0;
        assertEquals(expected, LogisticServices.riderPayment(-80));
    }

}
