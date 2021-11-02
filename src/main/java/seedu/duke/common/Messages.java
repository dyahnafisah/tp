package seedu.duke.common;

/**
 * Class containing various output messages that are printed to the user.
 */
public class Messages {
    public static final String LOGO = "        _.-\"\\\n"
            + "    _.-\"     \\\n"
            + " ,-\"          \\\n"
            + "( \\            \\\n"
            + " \\ \\            \\\n"
            + "  \\ \\            \\\n"
            + "   \\ \\         _.-;\n"
            + "    \\ \\    _.-\"   :\n"
            + "     \\ \\,-\"    _.-\"\n"
            + "      \\(   _.-\"  libmgr\n"
            + "       `--\""
            + "";
    public static final String DIVIDER = "  ========================================";
    public static final String WELCOME_MESSAGE = "Welcome to libmgr";
    public static final String EXIT_MESSAGE = "See you soon!";
    public static final String INVALID_VALUES = "  (!) Invalid/missing values";

    // Add Commands

    public static final String ADD_DUPLICATE_ID = "  (!) ID cannot be a duplicate of an existing ID!";

    // List
    public static final String LIST_ALL_MESSAGE = "  (+) Listing out all items in library";
    public static final String LIST_FORMAT_INCORRECT = " (!) Invalid listing command" + System.lineSeparator()
            + " (!) Format: 'list'";
    // List deadline
    public static final String LIST_DEADLINE_TODAY = "  (+) Listing out loaned items that have to be returned today";
    public static final String LIST_DEADLINE_OVERDUE = "  (+) Listing out loaned items that are overdue";
    public static final String LIST_DEADLINE_DATE = "  (+) Listing out loaned items that are due this date: ";
    public static final String EMPTY_DEADLINE_COMMAND = " (!) Oops! Please specify the due date!";
    public static final String INVALID_DEADLINE_COMMAND = " (!) Oops! Please input the command in one of these format"
            + System.lineSeparator()
            + " 1. deadline today" + System.lineSeparator()
            + " 2. deadline overdue" + System.lineSeparator()
            + " 3. deadline d/dd-mm-yyyy";
    public static final String EMPTY_DATE = " (!) Oops! Please specify the due date!";
    // Search
    public static final String SEARCH_MESSAGE = "  (+) Here are the searching results in library";
    public static final String SEARCH_FORMAT_INCORRECT = " (!) Invalid searching format!" + System.lineSeparator()
            + " (!) Format: 'search i/ID t/TITLE s/STATUS(LOANED/AVAILABLE/RESERVED) "
            + "c/CATEGORY(Magazine/Book/Audio/Video)' or its subset";
    public static final String NO_SEARCH_RESULT = " (!) No search result! "
            + "Please check again whether your search format is correct." + System.lineSeparator()
            + " (!) Format: 'search i/ID t/TITLE s/STATUS c/CATEGORY' or its subset";
    // Loan and Return
    public static final String UNAVAILABLE_ITEM_MESSAGE = "  (!) Sorry, the item is unavailable.";
    public static final String RETURN_SUCCESS = "  (+) Item has been returned:";
    public static final String WRONG_ITEM_MESSAGE = "  (!) Item is not on loan!";
    // Remove
    public static final String RM_SUCCESS = "  (+) Removed the following item:";
    // Edit
    public static final String EDIT_AUDIO_MESSAGE = "  (+) Edited audio item details:";
    public static final String EDIT_BOOK_MESSAGE = "  (+) Edited book item details:";
    public static final String EDIT_VIDEO_MESSAGE = "  (+) Edited video item details:";
    public static final String EDIT_MAGAZINE_MESSAGE = "  (+) Edited magazine item details:";
    public static final String EDIT_INVALID_ITEM = "  (!) Invalid ID entered. No such item in library";
    public static final String KEY_TITLE = "t";
    public static final String KEY_ID = "i";
    public static final String KEY_ARTIST = "a";
    public static final String KEY_DURATION = "d";
    public static final String KEY_PUBLISHER = "p";
    public static final String KEY_AUTHOR = "a";
    public static final String KEY_EDITION = "e";


    // Invalid Formats
    public static final String RM_INVALID_FORMAT = "  (!) Invalid/missing values" + System.lineSeparator()
            + "  (!) Format: rm ID";

    public static final String RESERVE_INVALID_FORMAT = "  (!) Invalid/missing values" + System.lineSeparator()
            + "  (!) Format: reserve i/ID u/USER";
    public static final String LOAN_INVALID_FORMAT = "  (!) Invalid/missing values" + System.lineSeparator()
            + "  (!) Format: loan i/ID u/USER d/DUE_DATE(dd-mm-yyyy)";
    public static final String EDIT_INVALID_FORMAT = "  (!) Invalid/missing values" + System.lineSeparator()
            + "  (!) Format: edit ID MARKER/ATTRIBUTE";
    public static final String EDIT_AUDIO_INVALID_FORMAT = "  (!) Invalid/missing values" + System.lineSeparator()
            + "  (!) Format: edit ID [t|i|a|d]/ATTRIBUTE";
    public static final String EDIT_BOOK_INVALID_FORMAT = "  (!) Invalid/missing values" + System.lineSeparator()
            + "  (!) Format: edit ID [t|i|a]/ATTRIBUTE";
    public static final String EDIT_MAGAZINE_INVALID_FORMAT = "  (!) Invalid/missing values" + System.lineSeparator()
            + "  (!) Format: edit ID [t|i|p|e]/ATTRIBUTE";
    public static final String EDIT_VIDEO_INVALID_FORMAT = "  (!) Invalid/missing values" + System.lineSeparator()
            + "  (!) Format: edit ID [t|i|p|d]/ATTRIBUTE";


    // Generic Errors
    public static final String WARN_INVALID_ARGS = "  (*) Invalid arguments detected, ignoring them";
    public static final String INVALID_ID = "  (!) Invalid Item ID!";
    public static final String INVALID_DATE = "  (!) Invalid date format! It should be in dd-mm-yyyy";
}
