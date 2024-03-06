package backToSenderLogistics;

public class LogisticServices {

    public static int riderPayment(int delivery){
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
        if (!(delivery < 0)) riderWage = amountPerParcel * delivery + basePay;
        return riderWage;
    }
}
