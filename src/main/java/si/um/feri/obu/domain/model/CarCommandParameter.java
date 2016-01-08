package si.um.feri.obu.domain.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import si.um.feri.obu.domain.xjc.CarCommand;
import si.um.feri.obu.domain.xjc.CommandState;

@ApiModel(value = "Car Command Parameter", description = "Object with car command and its state")
public class CarCommandParameter {

    @ApiModelProperty(value = "One of the possible car commands ", required = true)
    private CarCommand carCommand;
    @ApiModelProperty(value = "One of the possible car command states ", required = true)
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
