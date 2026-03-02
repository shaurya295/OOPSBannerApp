public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = {
                String.join(" ", getOLine1(), getOLine1(), getPLine1(), getSLine1()),
                String.join(" ", getOLine2(), getOLine2(), getPLine2(), getSLine2()),
                String.join(" ", getOLine3(), getOLine3(), getPLine3(), getSLine3()),
                String.join(" ", getOLine4(), getOLine4(), getPLine4(), getSLine4()),
                String.join(" ", getOLine5(), getOLine5(), getPLine5(), getSLine5()),
                String.join(" ", getOLine6(), getOLine6(), getPLine6(), getSLine6()),
                String.join(" ", getOLine7(), getOLine7(), getPLine7(), getSLine7())
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }

    // ---------- O Pattern ----------
    static String getOLine1() { return "  *****  "; }
    static String getOLine2() { return " *     * "; }
    static String getOLine3() { return " *     * "; }
    static String getOLine4() { return " *     * "; }
    static String getOLine5() { return " *     * "; }
    static String getOLine6() { return " *     * "; }
    static String getOLine7() { return "  *****  "; }

    // ---------- P Pattern ----------
    static String getPLine1() { return " ******  "; }
    static String getPLine2() { return " *     * "; }
    static String getPLine3() { return " *     * "; }
    static String getPLine4() { return " ******  "; }
    static String getPLine5() { return " *       "; }
    static String getPLine6() { return " *       "; }
    static String getPLine7() { return " *       "; }

    // ---------- S Pattern ----------
    static String getSLine1() { return "  *****  "; }
    static String getSLine2() { return " *       "; }
    static String getSLine3() { return " *       "; }
    static String getSLine4() { return "  *****  "; }
    static String getSLine5() { return "       * "; }
    static String getSLine6() { return " *     * "; }
    static String getSLine7() { return "  *****  "; }
}