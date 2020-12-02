package commands;

import device.Radio;

public class RadioOn implements Command{

    private Radio radio;

    public RadioOn(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.on();
    }

    @Override
    public void undo() {
        this.radio.off();
    }
}
