
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        String file_name = "prova.txt";
        Auto[] cars = new Auto[]{
                        new Auto("TO123BB"),
                        new Auto("BO648CD"),
                        new Auto("CA452UP", 6)
                                };

        for(int i = 0; i < 3; ++i) {
            System.out.println(cars[i].toString());
        }

        System.out.println(ANSI_RED + "\nNOW LETS SAVE EVERYTHING ON A FILE!\n" + ANSI_RESET);
    }
}
