package fi.utu.tech.ooj.exercise2;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("DTEK0066 2024 syksy, Tehtäväkerta 2");

        /*  Tämä main-metodi on ainoa, joka tarvitaan kaikkien tehtävien suorittamiseksi.
            Jokaisessa tehtäviä sisältävässä pakkauksessa on Teht* luokka, josta löytyy
            kyseiseen tehtävään kuuluvat ajot suorittava staattinen rutiini.
            Näitä rutiineja kutsumalla suoritamme tässä kaikkien tehtävien ajot.
         */

        System.out.println("Tehtäväpohja käynnistyy");

        System.out.println("--------------");
        System.out.println("Tehtävä7 esimerkkilajittelu");
        int[] lajittelematonTaulukko = { 4, 7, 100, 45, 38, -10, -34, 77, 2, 10, -33, 156, -234, -177, 123, 90, 9, 44, -15};
        int alaraja = -40;
        int keskikohta = 10;
        int ylaraja = 100;
        int [] lajiteltuTaulukko = Sorter.triangleSort(lajittelematonTaulukko, alaraja, keskikohta, ylaraja);
        System.out.println("Lajittelematon taulukko");
        System.out.println(Arrays.toString(lajittelematonTaulukko));
        System.out.println("Lajiteltu ja rajoitettu taulukko");
        System.out.println(Arrays.toString(lajiteltuTaulukko));
        System.out.println("--------------");

        System.out.println("Tehtävä8 merkkijonomuunnos");
        String testiMerkkijono = "#Olipa kerran 1 merkkijono!!";
        System.out.println("Syöte on: " + testiMerkkijono);
        System.out.println("Piraattiversio on: " + StringMagic.piraterize(testiMerkkijono));
        System.out.println("Tehtävien suoritus on päättynyt");

    }
}
