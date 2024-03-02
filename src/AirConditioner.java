public class AirConditioner {

    private int temperature = 16;
    private boolean airConditionerState;

    public boolean getAirConditionerState(){ return airConditionerState; }
    public int getTemperature() { return temperature; }
    public boolean turnOn() {
          airConditionerState = true;

          return airConditionerState;
    }

    public void turnOff() {
          airConditionerState = false;
    }

    public void increaseTemperature() {
        boolean temperatureRange = temperature >= 16 && temperature < 30;
        if (airConditionerState == turnOn() && temperatureRange){
                  temperature++;
        }
    }

    public void decreaseTemperature() {
        boolean temperatureRange = temperature > 16 && temperature <= 30;
        if (airConditionerState == turnOn() && temperatureRange){
            temperature--;
        }
    }

    public void toggle() {
        airConditionerState = !airConditionerState;
    }
}
