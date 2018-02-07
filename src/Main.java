public class Main {
    public static void main(String[] a) {
        String challen1 = Webscraper.urlToString("http://erdani.com/tdpl/hamlet.txt");
        String challen2 = Webscraper.urlToString("https://www.bls.gov/tus/charts/chart9.txt");
        String challen3 = Webscraper.urlToString("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt");
        String punctuation = "~ ` ! @ # $ % ^ & * ( ) _ + - = { } [ ] | \\ : ; \" ' < > , . ? /";
        String[] punctuationList = punctuation.split(" ");
        String[] numberList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String[] c1 = challen1.split(" ");
        String[] c2 = challen2.split(" ");
        String[] c3 = challen3.split(" ");
        System.out.println("Website 1 has " + c1.length + " words.");
        System.out.println("Website 2 has " + c2.length + " words.");
        System.out.println("Website 3 has " + c3.length + " words.");
    }
}