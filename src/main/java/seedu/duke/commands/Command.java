package seedu.duke.commands;

import seedu.duke.ui.TextUI;

/**
 * The command class is an abstract class representing the underlying command object
 * It is inherited by all other command objects
 */
public abstract class Command {
    /**
     * This method executes the command, performing the required operations
     * It is only meant to be called by child classes
     * @param ui Object that handles user IO
     */
    public void execute(TextUI ui) {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns whether exit command has been issued by the user
     * @return Boolean true if exit command has been issued, false if other commands issued
     */
    public Boolean isExit() {
        return this instanceof ExitCommand;
    }
}
