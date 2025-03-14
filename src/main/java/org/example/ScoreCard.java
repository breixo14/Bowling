package org.example;

public class ScoreCard {
    private String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScore;
    private int score;
    private int[] rounds = new int[9];

    public ScoreCard(String color) {
        this.color = "red";
        this.redCorner = "0";
        this.blueCorner = "0";
        this.judgeScore = new String[]{"10 - 10", "10 - 10", "10 - 10", "10 - 10", "10 - 10",
                                "10 - 10", "10 - 10", "10 - 10", "10 - 10", "10 - 10"};
        this.score = 10;
        this.rounds[0] = 1;
    }

    public void setRCorner(String redCorner) {
        this.redCorner = redCorner;
    }

    public void setBCorner(String blueCorner) {
        this.blueCorner = blueCorner;
    }

    public String getBCorner() {
        return blueCorner;
    }
    public String getRCorner() {
        return redCorner;
    }
    public void loadJudgeScoreCard(String[] data){
        this.judgeScore=data;

    }
    public String viewRounds(String[] judgeScore){
        RoundFactory factory = new RoundFactory(judgeScore);
        return factory.nombre(judgeScore.length);
    }
    public String viewScore(String[] judgeScore){
        RoundFactory factory = new RoundFactory(judgeScore);
        return factory.finalScore();
    }
    @Override
    public String toString() {
        return "\n\t\t\t   " + this.color
                + "\n" + this.blueCorner
                + "\t" + this.redCorner
                + "\n\t\t\t"
                + judgeScore.length + " rounds\n" /** getNumRounds() **/
                + viewRounds(this.judgeScore)  /** viewRounds **/
                + viewScore(this.judgeScore);
    }
}