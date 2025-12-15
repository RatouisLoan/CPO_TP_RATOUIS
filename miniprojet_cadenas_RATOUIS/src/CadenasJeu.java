/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LOAN
 */

public class CadenasJeu {

    private int[] codeSecret = new int[4];
    private int tentatives = 0;
    private final int TENTATIVES_MAX = 5;

    public CadenasJeu() {
        genererCode();
    }

    public void genererCode() {
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < 4; i++) {
            codeSecret[i] = r.nextInt(10);
        }
        tentatives = 0;
    }

    public int getTentatives() {
        return tentatives;
    }
    
    public int getTentativesMax() {
        return TENTATIVES_MAX;
    }

    /**
     * Compare la combinaison proposée
     * @return tableau [chiffresExacts, tropHaut, tropBas]
     */
    public int[] tester(int[] entree) {

        tentatives++;

        int exact = 0;
        int haut = 0;
        int bas = 0;

        for (int i = 0; i < 4; i++) {
            if (entree[i] == codeSecret[i]) {
                exact++;
            } else if (entree[i] > codeSecret[i]) {
                haut++;
            } else {
                bas++;
            }
        }

        return new int[]{ exact, haut, bas };
    }

    public boolean partieTerminee() {
        return tentatives >= TENTATIVES_MAX;
    }
}
