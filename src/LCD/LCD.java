package LCD;

public class LCD {
    private String status;
    private int volume;
    private int brightness;
    private String cable;

    LCD(){}

    public void turnOff(){
        status = "Off";
    }

    public void turnOn(){
        status = "On";
    }

    public void Freeze(){
        status = "Freeze";
    }

    public void volumeUp(){
        volume += 1;
    }

    public void volumeDown(){
        volume -= 1;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void brightnessUp(){
        brightness += 1;
    }

    public void brightnessDown(){
        brightness -= 1;
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
    }

    public void setCable(int option) {
        String[] kabel = new String[] {"VGA", "DVI", "HDMI", "DisplayPort"};
        this.cable = kabel[option];
    }

    public void displayMessage() {
        System.out.println("LCD Status: " + status);
        System.out.println("Volume: " + volume);
        System.out.println("Brightness: " + brightness);
        System.out.println("Cable: " + cable);
        
    }
}