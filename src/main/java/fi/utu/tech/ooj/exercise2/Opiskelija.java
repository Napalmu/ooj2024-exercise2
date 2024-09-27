package fi.utu.tech.ooj.exercise2;

public class Opiskelija {

    /* Tehtävä 3 Määrittele luokkainvariantti
     *
     * Luokkainvariantti:
     * etunimi, sukunimi ja opiskelijaNumero eivät ole tyhjiä merkkijonoja tai null -arvoisia. OpiskelijaNumero on lisäksi voimassa.
     * syntymavuosi >= 1900 && syntymavuosi <= kuluva vuosi
     *
     *
     */
    private String etunimi;
    private String sukunimi;
    private String opiskelijaNumero;
    private int syntymavuosi;

    /* Tehtävä 4
     * Määrittele  alku- ja loppuehdot konstruktorille
     */

    /* Alkuehto:
     * Loppuehto:
     */

    /*KONSTRUKTORI*/
    public Opiskelija(String etunimi, String sukunimi, String opiskelijaNumero, int syntymavuosi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.opiskelijaNumero = opiskelijaNumero;
        this.syntymavuosi = syntymavuosi;
    }

    /*GETTERIT*/
    public String getEtunimi() {
        return etunimi;
    }
    public String getSukunimi() {
        return sukunimi;
    }
    public String getOpiskelijaNumero() {
        return opiskelijaNumero;
    }
    public int getSyntymavuosi() {
        return syntymavuosi;
    }

    /*SETTERIT*/

    /* Tehtävä 4
     * Määrittele  alku- ja loppuehdot alla oleville settereille
     */

     /* Alkuehto:
     * Loppuehto:
     */

    public void setEtunimi(String etunimi) throws IllegalArgumentException{
        if (etunimi == null || etunimi.isEmpty()) throw new IllegalArgumentException();
        this.etunimi = etunimi;
    }

    /* Alkuehto:
     * Loppuehto:
     */
    public void setSukunimi(String sukunimi) throws IllegalArgumentException{
        if (sukunimi == null || sukunimi.isEmpty()) throw new IllegalArgumentException();
        this.sukunimi = sukunimi;
    }

    /* Alkuehto:
     * Loppuehto:
     */
    public void setOpiskelijaNumero(String opiskelijaNumero) {
        this.opiskelijaNumero = opiskelijaNumero;
    }

    /* Alkuehto:
     * Loppuehto:
     */
    public void setSyntymavuosi(int syntymavuosi) {
        this.syntymavuosi = syntymavuosi;
    }


}


