public class UC6_StaticFunctions {

    // Helper method for letter O
    public static String[] letterO() {
        return new String[]{
            "  OOO  ",
            " O   O ",
            " O   O ",
            " O   O ",
            " O   O ",
            " O   O ",
            "  OOO  "
        };
    }

    // Helper method for letter P
    public static String[] letterP() {
        return new String[]{
            " PPPP  ",
            " P   P ",
            " PPPP  ",
            " P     ",
            " P     ",
            " P     ",
            " P     "
        };
    }

    // Helper method for letter S
    public static String[] letterS() {
        return new String[]{
            " SSSS  ",
            "S    S ",
            " S     ",
            "  SSS  ",
            "     S ",
            "S    S ",
            " SSSS  "
        };
    }

    public static void main(String[] args) {

        String[] o = letterO();
        String[] p = letterP();
        String[] s = letterS();

        for (int i = 0; i < o.length; i++) {
            System.out.println(
                String.join("", o[i], o[i], p[i], s[i])
            );
        }
    }
}