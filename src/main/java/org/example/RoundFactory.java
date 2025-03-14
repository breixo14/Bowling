package org.example;

public class RoundFactory {
    private String[] BluePoints;
    private String[] RedPoints;
    private int finalRedPoints;
    private int finalBluePoints;

    public RoundFactory(String[] args) {
        this.BluePoints = new String[10];
        this.RedPoints = new String[10];
        this.finalRedPoints = 0;
        this.finalBluePoints = 0;

        for (int i = 0; i < 10; i++) {
            if (i<9) {
                this.BluePoints[i] = String.format("%2s", args[i].substring(0, 2).trim());
                this.RedPoints[i] = String.format("%2s", args[i].substring(4).trim());
            }
            else {
                this.BluePoints[i] =args[i].substring(0, 2).trim();
                this.RedPoints[i] =args[i].substring(4).trim();
            }
        }
    }

    public String getBluePoints(int index) {
        return this.BluePoints[index];
    }

    public String getRedPoints(int index) {
        return this.RedPoints[index];
    }

    public String marcador(int index) {
        return String.format("%s           %d           %s", this.getBluePoints(index), index+1, this.getRedPoints(index));
    }
    public String nombre(int index) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < index; i++) {
            resultado.append(marcador(i)).append("\n");
        }

        return resultado.toString();
    }
    public String finalScore(){
        for (int i = 0; i < 10; i++) {
            this.finalRedPoints += Integer.parseInt(this.getRedPoints(i).trim());
            this.finalBluePoints += Integer.parseInt(this.getBluePoints(i).trim());
        }
        return "FINAL SCORE " + this.finalRedPoints + " - " + this.finalBluePoints + " FINAL SCORE";
    }

}

