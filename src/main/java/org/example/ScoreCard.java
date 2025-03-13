package org.example;

public class ScoreCard {
    private String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String judgeScore = "";
    private int score;

    public ScoreCard(String color) {
        this.color = "red";
        this.redCorner = "0";
        this.blueCorner = "0";
        this.judgeScore = "0";
        this.score = 10;
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


    @Override
    public String toString() {
        return "\n\t\t\t   " + this.color
                + "\n\t\t" + this.blueCorner
                + "\t" + this.redCorner
                + "\n\t\t\t"
                + this.score + " rounds\n" /** getNumRounds() **/
                + this.score /** viewRounds **/
                + "\n\t FINAL SCORE: "
                + this.score /** getRedBoxerFinalScore **/
                + " - "
                + this.score /** getBlueBoxerFinalScore **/
                + " FINAL SCORE";
    }
}