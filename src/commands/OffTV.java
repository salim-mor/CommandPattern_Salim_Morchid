package commands;

import device.Tv;

public class OffTV implements Command{

    private Tv tv ;

    public OffTV(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.off();
    }

    @Override
    public void undo() {
        this.tv.on();
    }
}
