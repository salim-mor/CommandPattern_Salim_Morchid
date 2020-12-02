import commands.Command;

import java.util.Map;

public class Remote {//invoke

    private Command[] commandOn;
    private Command[] commandOff;
    private Command annulCommand;

    public Remote() {
        this.commandOff = new Command[3];
        this.commandOn = new Command[3];
    }

    public  void setCommand(int i , Command commandOn, Command commandOff){
        this.commandOn[i]= commandOn;
        this.commandOff[i] = commandOff;
    }

    public void ButtonOn(int i ){

        this.commandOn[i].execute();
        this.annulCommand=this.commandOn[i];
    }

    public void ButtonOff(int i ){

        this.commandOff[i].execute();
        this.annulCommand=this.commandOff[i];
    }
    public void annuler(){
        this.annulCommand.undo();
    }

}
