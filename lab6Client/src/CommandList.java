import data.HumanBeing;

import java.util.HashSet;

public class CommandList {
    public final HashSet<String> commandsObject = new HashSet<>();

    /**
     * initializing the list of commands needs an object
     *
     */
    public CommandList() {
        commandsObject.add("add");
        commandsObject.add("update");
        commandsObject.add("add_if_min");
    }

    /**
     * Check if command needs an object
     *
     * @param command input command
     */
    public HumanBeing checkIn(String command, Long id) {
        HumanBeing object = null;
        if (commandsObject.contains(command)) {
            ElementInput input = new ElementInput();
            object = input.createElement(id);
        }
        return object;
    }
}
