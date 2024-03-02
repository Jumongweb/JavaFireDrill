package semicolonJavaPhase2di.automaticBikeTDD;

public class Bike {
    private boolean isBikeOn;

    private int gear;
    private int speed;

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getGear() {
        if (isBikeOn && speed >= 0 && speed < 20){
            gear = 1;
        }
        else if (speed >= 20 && speed <= 30){
            gear = 2;
        }
        else if (speed > 30 && speed < 40){
            gear = 3;
        }
        else if (speed >= 40){
            gear = 4;
        }
        return gear;
    }

    public int getSpeed() { return speed; }

    public boolean getBikeCurrentState() { return isBikeOn; }

    public void toggleBike() {
        isBikeOn = !isBikeOn;
    }

    public void accelerate() {
        getGear();
        if (isBikeOn && gear == 1) {
            speed++;
        }
        else if (isBikeOn && gear == 2) {
            speed += 2;
        }
        else if (isBikeOn && gear == 3) {
            speed += 3;
        }
        else if (isBikeOn && gear == 4) {
            speed += 4;
        }

    }

    public void decelerate() {
        getGear();
        if (isBikeOn && gear == 1 && speed > 0) {
            speed--;
        }
        else if (isBikeOn && gear == 2) {
            speed -= 2;
        }
        else if (isBikeOn && gear == 3) {
            speed -= 3;
        }
        else if (isBikeOn && gear == 4) {
            speed -= 4;
        }

    }
}
