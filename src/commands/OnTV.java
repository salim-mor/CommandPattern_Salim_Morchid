package commands;

import device.Tv;

public class OnTV implements Command {
    private Tv tv ;

    public OnTV(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute(){
        this.tv.on();
    }

    @Override
    public void undo() {
        this.tv.off();
    }
}
