package dietel_c8.time1;

public class Time1 {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toUniversalString(){
        return String.format("%d:%02d:%02d", hour, minute, second);
    }
    @Override
    public String toString(){
        return String.format("%d:%02d:%02d %s",
            ((hour == 0 || hour == 12) ? 12 : hour),
            minute, second, (hour < 12 ? "AM" : "PM"));
    }
    public void validateHour(int hour){
        if (hour < 0 || hour > 23) throw new IllegalArgumentException("Hour should be between 0 - 23");
    }

    public void validateMinute(int minute){
        if (minute < 0 || minute > 59) throw new IllegalArgumentException("Minute should be between 0 - 59");
    }

    public void validateSecond(int second){
        if (second < 0 || second > 23) throw new IllegalArgumentException("Second should be between 0 - 59");
    }
}
