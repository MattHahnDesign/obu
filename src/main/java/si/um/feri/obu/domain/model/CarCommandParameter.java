package si.um.feri.obu.domain.model;

import si.um.feri.obu.domain.xjc.CarCommand;
import si.um.feri.obu.domain.xjc.CommandState;

public class CarCommandParameter {

    private CarCommand carCommand;
    private CommandState commandState;

    public CarCommandParameter() {
    }

    public CarCommand getCarCommand() {
        return carCommand;
    }

    public void setCarCommand(CarCommand carCommand) {
        this.carCommand = carCommand;
    }

    public CommandState getCommandState() {
        return commandState;
    }

    public void setCommandState(CommandState commandState) {
        this.commandState = commandState;
    }

    @Override
    public String toString() {
        return "CarCommandParameter{" +
                "carCommand=" + carCommand +
                ", commandState=" + commandState +
                '}';
    }
}
