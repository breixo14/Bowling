package org.example;



public class Brunosbox {
    public static void main(String[] args) {

        System.out.println("\n - I see three of them out there." +
                "\n - Hit the one in the middle.- Rocky Balboa\n");

        String[] headers = {"Round 1", "Round 2", "Round 3", "Round 4", "Round 5",
                "Round 6", "Round 7", "Round 8", "Round 9", "Round 10"};

        String[][] data = {

                //  White ScoreCard
                {"9 - 10",
                        "9 - 10",
                        "9 - 10",
                        "9 - 10",
                        "10 - 9",
                        "10 - 9",
                        "10 - 9",
                        "9 - 10",
                        "10 - 9",
                        "9 - 10"},

                // Blue ScoreCard
                {"9 - 10",
                        "9 - 10",
                        "9 - 10",
                        "8 - 10", // knockdown
                        "10 - 8", // knockdown
                        "10 - 8",
                        "10 - 9",
                        "9 - 10",
                        "10 - 9",
                        "10 - 9"},

                // Pink ScoreCard
                {"9 - 10",
                        "9 - 10",
                        "9 - 10",
                        "1, 8 - 10", // referee point deduction
                        "10 - 8",    // knockdown
                        "10 - 8 ,1", // referee point deduction
                        "10 - 9",
                        "9 - 10",
                        "10 - 9",
                        "10 - 8" // knockdown
                }

        };

        /**
         * Crea una tarjeta de puntos de boxeo
         * a partir de la tarjeta blanca entregada
         * por el juez blanco.
         */

        ScoreCard whiteScoreCard = new ScoreCard("WHITE");

        /**
         * Asigna el nombre de los pugiles
         * Rocky Balboa (red) vs Apollo Creed (blue)
         */

        whiteScoreCard.setRCorner("Rocky Balboa");
        whiteScoreCard.setBCorner("Apollo Creed");
        System.out.println(whiteScoreCard.getRCorner());
        System.out.println(whiteScoreCard.getBCorner());

        /**
         * Muestra la tarjeta por consola con
         * el formato que se propone en el enunciado
         * del ejercicio.
         */

        System.out.println(whiteScoreCard.toString());


    /**
     * Crea una clase llamada RegularRound
     * que implemente la interfaz Round.
     * <p>
     * Crea un round del tipo "10 - 9" o "9 - 10".
     * Muestra la puntuación obtenida por
     * cada boxeador.
     * <p>
     * En Round la puntuacion se almacena
     * como un número entero, no como un String.
     * <p>
     * Pasa el caso test que propongo.
     */

        RegularRound round = new RegularRound("10 - 9");
            round.boxerRoundScore();
            System.out.println("\n\t Regular round\t"+round.getRedBoxerScore()+
                 " - "+round.getBlueBoxerScore());

        /**
         * Carga en la tarjeta blanca
         * los puntos de todos los rounds
         * de la primera tarjeta del array data.
         *
         * Cada round es un objeto del tipo RegularRound.
         * La tarjeta blanca es una colección de objetos
         * de tipo Round.
         *
         * Al mostrar la tarjeta se observan los
         * puntos obtenidos por cada pugil en cada round.
         * Se llaman round score.
         */
        /*
         * Calcula el final score o puntuación total
         * de cada pugil y muestralo en la tarjeta.
         */

        /*
         * Calcula los puntos acumulados en cada
         * round de cada pugil y muestralo en la tarjeta.
         * Se llaman score total.
         */

        whiteScoreCard.loadJudgeScoreCard(data[0]);
        System.out.println(whiteScoreCard);

        /**
         * Calcula el final score o puntuación total
         * de cada pugil y muestralo en la tarjeta.
         */

        System.out.println("\t FINAL SCORE: " + whiteScoreCard.getRedBoxerFinalScore() +
                " - " + whiteScoreCard.getBlueBoxerFinalScore() + " FINAL SCORE");

        /**
    }


}


