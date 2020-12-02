import commands.*;
import device.Light;
import device.Radio;
import device.Tv;

public class test {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Radio radio = new Radio();
        Light light = new Light();

        Remote remote = new Remote();

        remote.setCommand(0,new OnTV(tv),new OffTV(tv));
        remote.setCommand(1,new LightOn(light),new LightOff(light));
        remote.setCommand(2,new RadioOn(radio),new RadioOff(radio));

        remote.ButtonOn(0);
        remote.ButtonOn(2);
        remote.annuler();


    }
}
