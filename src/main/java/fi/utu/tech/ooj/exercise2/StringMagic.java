package fi.utu.tech.ooj.exercise2;

import java.util.Arrays;

public class StringMagic {

    /*Tehtävä 8. Suunnittele ja toteuta tarvittavat testit alla olevalle piraterize rutiinille. */

    /* Alkuehto: true
     * Loppuehto: palauttaa seuraavalla tavalla muunnetun merkkijonon: Muunnoksessa merkkijonosta poistetaan
     * erikoismerkit, kirjaimet muutetaan pieniksi kirjaimiksi. Vokaaliloppuisiin sanoihin lisätään
     * suoraan loppuun 4 r-kirjainta. Konsonanttiloppuisista sanoista poistetaan viimeinen kirjain
     * ja sen jälkeen lisätään 4 r-kirjainta.
     * Numeroja ei muuteta.
     */
        public static String piraterize(String input) throws IllegalArgumentException{
            if (input == null) {
                throw new IllegalArgumentException();
            }
            String cleanInput = input.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
            String[] words = cleanInput.split(" ");
            String output = "";
            for (String word: words) {
                if ("aeiouåäö".indexOf(Character.toLowerCase(word.charAt(word.length() - 1))) != -1 ) {
                    output += word + "rrrr ";
                }
                else if ("0123456789".indexOf(Character.toLowerCase(word.charAt(word.length() - 1))) != -1 ) {
                    output += word + " ";
                }
                else {
                    output += word.substring(0,word.length()-1) + "rrrr ";
                }
            }
            return output;
        }
}

