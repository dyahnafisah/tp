package seedu.duke.commands;

import seedu.duke.data.item.Catalogue;
import seedu.duke.data.item.Item;
import seedu.duke.libmgrException;
import seedu.duke.ui.TextUI;

import static seedu.duke.commands.Parser.COMMAND_ADD;
import static seedu.duke.common.Messages.*;

/**
 * Class encapsulating an add command.
 */
public class AddCommand extends Command {
    protected String args; // Format: add t/TITLE i/ID
    protected String title;
    protected String id;

    /**
     * Sole Constructor.
     *
     * @param args Additional arguments supplied by user after command word "add"
     */
    public AddCommand(String args) {
        this.args = args;
    }

    /**
     * Processes Add Command, including exceptions.
     *
     * @param ui Object that handles user IO
     * @param catalogue Object that encapsulates the library catalogue
     * @throws libmgrException when user input is invalid
     */
    public void handlesAddCommand(TextUI ui, Catalogue catalogue) throws libmgrException {
        if (args.length() <= 4 || !args.contains("t/") || !args.contains("i/")) {
            throw new libmgrException(FORMAT_INCORRECT);
        }
        String parameters = args.substring(COMMAND_ADD.length() + 1);
        String[] argList = parameters.split("/");
        int endIndex = argList[1].length() - 1;
        if (endIndex <= 0) {
            throw new libmgrException(NO_TITLE);
        }
        title = argList[1].substring(0, endIndex).trim();
        if (title.equals("")) {
            throw new libmgrException(NO_TITLE);
        }
        if (argList.length < 3) {
            throw new libmgrException(NO_ID);
        }
        id = argList[2].trim();
        if (id.equals("")) {
            throw new libmgrException(NO_ID);
        }
        Item newItem = new Item(title, id, "Available");
        catalogue.add(newItem);
        ui.print(ADD_MESSAGE);
        ui.print("[" + newItem.getStatus() + "] " + newItem.getTitle());
    }

    /**
     * Executes add command.
     * Overrides method from parent class.
     *
     * @param ui Object that handles user IO
     * @param catalogue Object that encapsulates the library catalogue
     */
    @Override
    public void execute(TextUI ui, Catalogue catalogue) {
        try {
            handlesAddCommand(ui, catalogue);
        } catch (libmgrException e) {
            ui.print(e.getMessage());
        }
    }
}
