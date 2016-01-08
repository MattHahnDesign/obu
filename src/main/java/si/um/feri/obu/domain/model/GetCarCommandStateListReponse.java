package si.um.feri.obu.domain.model;

import si.um.feri.obu.domain.xjc.CommandState;

import java.util.ArrayList;
import java.util.List;

public class GetCarCommandStateListReponse {

    List<CommandState> commandStates;

    public GetCarCommandStateListReponse() {
        commandStates = new ArrayList<>();
    }

    public List<CommandState> getCommandStates() {
        return commandStates;
    }

    public void setCommandStates(List<CommandState> commandStates) {
        this.commandStates = commandStates;
    }

    @Override
    public String toString() {
        return "GetCarCommandStateListReponse{" +
                "commandStates=" + commandStates +
                '}';
    }
}
