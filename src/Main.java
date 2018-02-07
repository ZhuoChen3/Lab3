public class Main {
    public static void main(String[] a) {
        String challen1 = Webscraper.urlToString("http://erdani.com/tdpl/hamlet.txt");
        String challen2 = Webscraper.urlToString("https://www.bls.gov/tus/charts/chart9.txt");
        String challen3 = Webscraper.urlToString("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt");
        String punctuation = "~ ` ! @ # $ % ^ & * ( ) _ + - = { } [ ] | \\ : ; \" ' < > , . ? /";
        String[] punctuationList = punctuation.split(" ");
        String[] numberList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (int i = 0; i < challen1.length(); i++) {
            for (int j = 0; j < punctuationList.length; j++) {
                if (challen1.substring(i, i + 1).equals(punctuationList[j])) {
                    challen1.
                }
            }
        }
    }
}
