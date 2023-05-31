public class Mars {
    public static void main(String[] args) throws InterruptedException {
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

        //if/else statement to check if the location is equal to the plain
        String landingLocation = "The Ocean";
        if (landingLocation.equals("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        //invoke landingCheck
        landing = landingCheck(50);
        //invoke guessing game
        new GuessingGame();
    }

    //function that returns a boolean and takes in parameter called minutesLeft
    //will print directions based on minutes left to touchdown
    public static boolean landingCheck(int minutesLeft) throws InterruptedException{
        //for loop that initializes the minute variable and increments it by 1 until reaching minutesLeft
        for(int minute = 0; minute<= minutesLeft; minute++){
            //if the minutes left is divisible by 3 and 2
            if(((minute%2) == 0) && ((minute%3) == 0)) {
                System.out.println("Keep Center");
            //if minutes left is divisible by 2
            } else if (minute%2 == 0){
                System.out.println("Right");
            //if minutes left is divisible by 3
            } else if(minute%3 == 0){
                System.out.println("Left");
            } else {
                System.out.println("calculating");
            }
            //slow down the console on each loop
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}