import java.util.HashMap;

public class OOPSBannerApp {

    public static void main(String[] args) {

        // HashMap to store patterns
        HashMap<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        patterns.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        patterns.put('S', new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });

        String word = "OOPS";

        // print banner
        for (int i = 0; i < 7; i++) {

            for (char c : word.toCharArray()) {

                String[] pattern = patterns.get(c);
                System.out.print(pattern[i] + " ");
            }

            System.out.println();
        }
    }
}