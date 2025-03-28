package part1;

// ANSI escape codes for colors
public class ConsoleColors {
    // Reset color
    public static final String RESET = "\u001B[0m";  // Reset to default color

    // Text Colors
    public static final String BLACK = "\u001B[30m";  // Black
    public static final String RED = "\u001B[31m";    // Red
    public static final String GREEN = "\u001B[32m";  // Green
    public static final String YELLOW = "\u001B[33m"; // Yellow
    public static final String BLUE = "\u001B[34m";   // Blue
    public static final String MAGENTA = "\u001B[35m"; // Magenta
    public static final String CYAN = "\u001B[36m";    // Cyan
    public static final String WHITE = "\u001B[37m";   // White

    // Background Colors
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String MAGENTA_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";

    // Bright Text Colors
    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_MAGENTA = "\u001B[95m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_WHITE = "\u001B[97m";

    // Bright Background Colors
    public static final String BRIGHT_BLACK_BACKGROUND = "\u001B[100m";
    public static final String BRIGHT_RED_BACKGROUND = "\u001B[101m";
    public static final String BRIGHT_GREEN_BACKGROUND = "\u001B[102m";
    public static final String BRIGHT_YELLOW_BACKGROUND = "\u001B[103m";
    public static final String BRIGHT_BLUE_BACKGROUND = "\u001B[104m";
    public static final String BRIGHT_MAGENTA_BACKGROUND = "\u001B[105m";
    public static final String BRIGHT_CYAN_BACKGROUND = "\u001B[106m";
    public static final String BRIGHT_WHITE_BACKGROUND = "\u001B[107m";

    // Bold Text (foreground)
    public static final String BOLD = "\u001B[1m";

    // Underline Text (foreground)
    public static final String UNDERLINE = "\u001B[4m";

    // Inverse (swap foreground and background colors)
    public static final String INVERT = "\u001B[7m";
}