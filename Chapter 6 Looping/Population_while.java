public class Population_while {
    public static void main(String[] args) {
        double mexicoPopulation = 121_000_000;
        double usPopulation = 315_000_000;
        double japanPopulation = 127_000_000;

        int years = 0;

        while (mexicoPopulation <= usPopulation || japanPopulation <= usPopulation) {
            mexicoPopulation *= 1.0105;
            japanPopulation *= 1.0101;
            usPopulation *= 0.9984;
            years++;
            System.out.println("Year " + years + ": Mexico Population: " + mexicoPopulation +
                    ", US Population: " + usPopulation + ", Japan Population: " + japanPopulation);
        }

        System.out.println("It took " + years + " years for Mexico's and Japan's populations to exceed that of the US.");
    }
}
