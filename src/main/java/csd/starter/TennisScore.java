package csd.starter;

public class TennisScore {
    public static String tennisScore(int first, int second) {
        String[] discripton = {"Love", "Fifteen", "Thirty", "Forty"};
        if (first == second && first >= 4) {
            return "Deuce";
        }
//        if (first==second && first<4){
//            return discripton[first]+" All";
//        }
//        if(first!=second && Math.max(first,second)<4){
//            return discripton[first]+" "+discripton[second];
//        }
        if (Math.max(first, second) < 4) {
            return discripton[first] + " " + (first == second ? "All" : discripton[second]);
        }
        if (first != second && Math.max(first, second) < 7 && Math.min(first, second) >= 4) {
            return "Advantage " + (first > second ? "Server" : "Receiver");
        }
        if ((Math.max(first, second) == 4 && Math.min(first, second) < 3) ||
                (Math.max(first, second) >= 7 && Math.abs(first - second) == 2)) {
//           return gameto(first, second);
            return "Game to " + (first > second ? "Server" : "Receiver");
        }
//        if(Math.max(first, second)>=7 && Math.abs(first-second)==2){
//            return gameto(first,second);
//            return "Game to "+(first>second?"Server":"Receiver");
//        }
        return "Input Error";
    }

//    private static String gameto(int first, int second) {
//        return "Game to " + (first > second ? "Server" : "Receiver");
//    }
}
