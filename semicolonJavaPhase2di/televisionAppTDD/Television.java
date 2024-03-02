package semicolonJavaPhase2di.televisionAppTDD;

public class Television {
    private boolean isTelevisionOn;
    private int volume;
    private int channel = 1;

    private int brightness;

    public void toggle(){
        isTelevisionOn = !isTelevisionOn;
    }
    public boolean getTelevisionState(){ return isTelevisionOn; }

    public int getVolume() { return volume; }

    public void volumeUp(){
        if (isTelevisionOn && volume < 10){
            volume++;
        }
    }

    public void volumeDown() {
        if (isTelevisionOn && volume > 0){
            volume--;
        }
    }

    public void switchChannelUpward() {
        if (isTelevisionOn && channel >= 1 && channel < 10){
            channel++;
        }
    }

public int getChannel(){ return channel; }


    public void switchChannelDownward() {
        if (isTelevisionOn && channel > 1 && channel < 10) {
            channel--;
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public void increaseBrightness() {
        if (isTelevisionOn && brightness >= 0 && brightness < 10){
            brightness++;
        }
    }

    public void decreaseBrightness() {
        if (isTelevisionOn && brightness > 0 && brightness <= 10){
            brightness--;
        }
    }
}
