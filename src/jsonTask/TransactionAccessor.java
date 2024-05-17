package jsonTask;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TransactionAccessor {

    public static double calculateTotalAmountTransactions(String input) throws IOException {
        Transaction[] transactions = new ObjectMapper().readValue(new File(input),Transaction[].class);
        double totalAmount = 0.0;
        for (Transaction transaction : transactions) {
            totalAmount += transaction.getAmount();
        }
        return totalAmount;
    }
}
