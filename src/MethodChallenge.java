public class MethodChallenge {

    public static void main(String[] args) {

        String name = "Jenny";
        int score = 1500;
        displayHighScorePosition(name, score);

        name = "Tom";
        score = 1000;
        displayHighScorePosition(name, score);

        name = "Luna";
        score = 500;
        displayHighScorePosition(name, score);

        name = "Jessy";
        score = 100;
        displayHighScorePosition(name, score);

        name = "Nicky";
        score = 25;
        displayHighScorePosition(name, score);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}
