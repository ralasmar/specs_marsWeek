public class Mars {
    public static void main(String[] args){
        String colonyName = "Kiki";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        //starting with the landing process until food production is underway, everyone will eat 0.75 meals a day. landing process will take 2 days
        double mealsLeft = (meals - (2 * shipPopulation * 0.75));
        System.out.println(mealsLeft);

        //meals increases by 50percent and 5 babies are born
        meals = meals + (meals * .50);
        shipPopulation += 5;

        String landingLocation = "The Ocean";
        if (landingLocation.equals("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
    }


}