public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = new String[7];

        lines[0] = String.join(" ",
                "  *****  ",
                "  *****  ",
                " ******  ",
                "  *****  ");

        lines[1] = String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ");

        lines[2] = String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       ");

        lines[3] = String.join(" ",
                " *     * ",
                " *     * ",
                " ******  ",
                "  *****  ");

        lines[4] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "       * ");

        lines[5] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                " *     * ");

        lines[6] = String.join(" ",
                "  *****  ",
                "  *****  ",
                " *       ",
                "  *****  ");

        // loop printing (this is the UC4 upgrade)
        for (String line : lines) {
            System.out.println(line);
        }
    }
}