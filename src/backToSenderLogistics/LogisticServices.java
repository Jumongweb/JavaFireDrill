package backToSenderLogistics;

import myDiary.exceptions.InvalidEntryException;

public class LogisticServices {

    public static int riderPayment(int delivery){
        validate(delivery);

        int numberOfPackages = 100;
        int basePay = 5000;
        int riderWage = 0;
        int amountPerParcel;

        if (delivery > 0 && delivery < 50){
            amountPerParcel = 160;
        } else if (delivery >= 50 && delivery < 60) {
            amountPerParcel = 200;
        }else if (delivery >= 60 && delivery < 70) {
            amountPerParcel = 250;
        } else{
            amountPerParcel = 500;
        }
        riderWage = amountPerParcel * delivery + basePay;
        return riderWage;
    }

    private static void validate(int delivery) {
        if (delivery < 0) throw new InvalidDeliveryException("Invalid delivery");
    }
}
