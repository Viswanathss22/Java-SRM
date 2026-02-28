public class UC4_ArrayAndLoops {
    public static void main(String[] args) {

        String[] banner = {
            String.join("", "  OOO  ", "  OOO  ", " PPPP  ", " SSSS  "),
            String.join("", " O   O ", " O   O ", " P   P ", "S    S "),
            String.join("", " O   O ", " O   O ", " PPPP  ", " S     "),
            String.join("", " O   O ", " O   O ", " P     ", "  SSS  "),
            String.join("", " O   O ", " O   O ", " P     ", "     S "),
            String.join("", " O   O ", " O   O ", " P     ", "S    S "),
            String.join("", "  OOO  ", "  OOO  ", " P     ", " SSSS  ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}