public class OOPSBannerApp {

    /**
     * Inner Static Class to store character and its banner pattern
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to return CharacterPattern object
     */
    public static CharacterPattern getCharacterPattern(char ch) {

        if (ch == 'O') {
            return new CharacterPattern('O', new String[]{
                    "  *****  ",
                    " *     * ",
                    " *     * ",
                    " *     * ",
                    " *     * ",
                    " *     * ",
                    "  *****  "
            });
        }

        if (ch == 'P') {
            return new CharacterPattern('P', new String[]{
                    " ******  ",
                    " *     * ",
                    " *     * ",
                    " ******  ",
                    " *       ",
                    " *       ",
                    " *       "
            });
        }

        if (ch == 'S') {
            return new CharacterPattern('S', new String[]{
                    "  *****  ",
                    " *       ",
                    " *       ",
                    "  *****  ",
                    "       * ",
                    " *     * ",
                    "  *****  "
            });
        }

        return null;
    }

    public static void main(String[] args) {

        char[] word = {'O', 'O', 'P', 'S'};

        CharacterPattern[] patterns = new CharacterPattern[word.length];

        for (int i = 0; i < word.length; i++) {
            patterns[i] = getCharacterPattern(word[i]);
        }

        for (int line = 0; line < 7; line++) {

            StringBuilder bannerLine = new StringBuilder();

            for (CharacterPattern cp : patterns) {
                bannerLine.append(cp.getPattern()[line]).append(" ");
            }

            System.out.println(bannerLine);
        }
    }
}