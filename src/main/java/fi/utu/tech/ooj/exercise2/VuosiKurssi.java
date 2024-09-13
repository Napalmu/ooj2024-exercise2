package fi.utu.tech.ooj.exercise2;

import fi.utu.tech.ooj.exercise2.Opiskelija;

import java.util.ArrayList;

public class VuosiKurssi {

    /* Tehtävä 3 Määrittele luokkainvariantti
     *
     * Luokkainvariantti:
     */
    private int kurssinAloitusvuosi;
    private String opintoOhjaajanNimi;
    private ArrayList<Opiskelija> opiskelijat;

    /*GETTERIT*/
    public ArrayList<Opiskelija> getOpiskelijat() {
        return opiskelijat;
    }
    public int getKurssinAloitusvuosi() {
        return kurssinAloitusvuosi;
    }

    /*SETTERIT*/
    public void setKurssinAloitusvuosi(int kurssinAloitusvuosi) {
        this.kurssinAloitusvuosi = kurssinAloitusvuosi;
    }



    /* Tehtävä 4
     * Määrittele  alku- ja loppuehdot lisaaOpiskelija rutiinille
     *
     * Alkuehto:
     * Loppuehto:
     */
    public void lisaaOpiskelija(Opiskelija opiskelija) {
        this.opiskelijat.add(opiskelija);
    }

    /* Tehtävä 5 Toteuta tämä rutiini
     * Tehtävä 6 Lisää lisääOpiskelijaTurvallisesti-rutiiniin poikkeuskäsittely
     *
     * @.pre true
     * @.post true
     *
     */
    public void lisaaUusiOpiskelijaTurvallisesti(String etunimi, String sukunimi, String opiskelijaNumero, int syntymavuosi) {


    }
}
