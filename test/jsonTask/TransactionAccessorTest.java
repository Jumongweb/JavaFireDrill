package jsonTask;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionAccessorTest {

    @Test
    public void testCalculateTotalAmountTransaction() throws IOException {
        String input = "C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\jsonTask\\Transaction.Json";
        int totalAmount = 9000;
        assertEquals(totalAmount, TransactionAccessor.calculateTotalAmountTransactions(input));
    }

}