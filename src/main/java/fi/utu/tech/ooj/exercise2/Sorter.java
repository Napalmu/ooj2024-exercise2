package fi.utu.tech.ooj.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorter {

    /*Tehtävä 7. Suunnittele ja toteuta tarvittavat testit alla olevalle triangleSort rutiinille. */

    /* Alkuehto: true
     * Loppuehto: palauttaa kokonaislukutaulukon, joka sisältää syötteenä annetun taulukon alkiot, jotka ovat
     * ala- (limitLow) ja ylärajan (limitHigh) välissä, järjestettynä niin että määrättyä rajaa (middlePoint)
     * pienemmät alkiot on järjestettu nousevaan järjestykseen ja rajaa suuremmat laskevaan järjestykseen. Raja-alkio
     * kuuluu pienempien alkioiden joukkoon.
     */
    public static int[] triangleSort(int[] arr, int limitLow, int middlePoint, int limitHigh) {
        List<Integer> smallerNumbers = new ArrayList<>();
        List<Integer> largerNumbers = new ArrayList<>();
        for (int number: arr) {
            if (number >= limitLow && number < middlePoint) {
                smallerNumbers.add(number);
            }
            else if (number <= limitHigh && number > middlePoint ) {
                largerNumbers.add(number);
            }
        }
        Collections.sort(smallerNumbers);
        Collections.sort(largerNumbers);
        Collections.reverse(largerNumbers);
        return Stream.of(smallerNumbers, largerNumbers).flatMap(x -> x.stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
    }


}
