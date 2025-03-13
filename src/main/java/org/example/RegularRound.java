package org.example;

public class RegularRound implements round {
    private String round ;
    private int blueboxer;
    private int redboxer;



    public RegularRound(String round) {
        this.round = round;
        this.redboxer =Integer.parseInt(round.substring(0, 2).trim()) ;
        this.blueboxer =Integer.parseInt(round.substring(round.length()-2).trim()) ;

    }


    @Override
     public int getBlueBoxerScore() {
        return this.blueboxer;
     }
     @Override
     public int getRedBoxerScore() {
        return this.redboxer;
     }
     @Override
     public String boxerRoundScore() {
        return this.round;
     }


}




