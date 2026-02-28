public class UC7_InnerClass {

    // Static inner class to store character patterns
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Pattern provider
    static class CharacterPatternMap {

        public static CharacterPattern getO() {
            return new CharacterPattern('O', new String[]{
                "  OOO  ",
                " O   O ",
                " O   O ",
                " O   O ",
                " O   O ",
                " O   O ",
                "  OOO  "
            });
        }

        public static CharacterPattern getP() {
            return new CharacterPattern('P', new String[]{
                " PPPP  ",
                " P   P ",
                " PPPP  ",
                " P     ",
                " P     ",
                " P     ",
                " P     "
            });
        }

        public static CharacterPattern getS() {
            return new CharacterPattern('S', new String[]{
                " SSSS  ",
                "S    S ",
                " S     ",
                "  SSS  ",
                "     S ",
                "S    S ",
                " SSSS  "
            });
        }
    }

    public static void main(String[] args) {

        CharacterPattern o = CharacterPatternMap.getO();
        CharacterPattern p = CharacterPatternMap.getP();
        CharacterPattern s = CharacterPatternMap.getS();

        String[] oPattern = o.getPattern();
        String[] pPattern = p.getPattern();
        String[] sPattern = s.getPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                String.join("", oPattern[i], oPattern[i], pPattern[i], sPattern[i])
            );
        }
    }
}