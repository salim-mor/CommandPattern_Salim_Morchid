package commands;

import device.Radio;

public class RadioOff implements Command {

    private Radio radio ;

    public RadioOff(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.off();
    }

    @Override
    public void undo() {
this.radio.on();
    }
}
