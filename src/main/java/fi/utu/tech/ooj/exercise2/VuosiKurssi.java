package fi.utu.tech.ooj.exercise2;

import fi.utu.tech.ooj.exercise2.Opiskelija;

import java.util.ArrayList;

public class VuosiKurssi {

    /* Tehtävä 3 Määrittele luokkainvariantti
     *
     * Luokkainvariantti:
     * kurssinAloitusvuosi on suurempi kuin 1640 ja pienempi tai yhtäsuuri kuin kuluva vuosi.
     * Jokaisella vuosikurssilla on opinto-ohjaaja. Lisäksi opintoOhjaajanNimi ei ole null eikä tyhjä merkkijono.
     * Sama Opiskelija-olio ei voi esiintyä opiskelijat-arraylistissä kuin kerran. Eikä myöskään samalla opiskelijaNumerolla varustettu opiskelija-olio.
     *
     *
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
     * opiskelija != null
     *
     * Loppuehto:
     * Opiskelija lisättiin opiskelijat ArrayListiin onnistuneesti.
     */
    public void lisaaOpiskelija(Opiskelija opiskelija) {
        this.opiskelijat.add(opiskelija);
    }

    /* Tehtävä 5 Toteuta tämä rutiini
     * Tehtävä 6 Lisää lisääOpiskelijaTurvallisesti-rutiiniin poikkeuskäsittely
     *
     * VuosilKurssi-luokkaan halutaan lisätä lisääOpiskelijaTurvallisesti-rutiini.
     *
     * Rutiini lisää opiskelijan vuosikurssille samoin kuin olemassa oleva lisaaOpiskelija-rutiini,
     * mutta tämän rutiinin alkuehto on true. Toteuta rutiinin niin, että se turvaa aiemmassa tehtävässä
     * määrittämäsi luokkainvariantin voimassaolon.
     *
     * @.pre true
     * @.post true
     *
     */
    public void lisaaUusiOpiskelijaTurvallisesti(String etunimi, String sukunimi, String opiskelijaNumero, int syntymavuosi) {
        if (etunimi == null || etunimi.isEmpty()) throw new IllegalArgumentException();
        if (sukunimi == null || sukunimi.isEmpty()) throw new IllegalArgumentException();
        if (opiskelijaNumero == null || opiskelijaNumero.isEmpty()) throw new IllegalArgumentException();
        if (syntymavuosi < 1900 || syntymavuosi > java.time.LocalDateTime.now().getYear()) throw new IllegalArgumentException();
        for (Opiskelija opiskelija : opiskelijat){
            if(opiskelija.opiskelijaNumero = opiskelijaNumero) throw new IllegarArgumentException();
        }
        Opiskelija op = new Opiskelija(etunimi, sukunimi, opiskelijaNumero, syntymavuosi);
        opiskelijat.add(op);

    }
}
