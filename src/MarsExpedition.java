import java.util.Scanner;

public class MarsExpedition  {
    //public arsExpedition constructor
    public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's prepare for expedition...");
        System.out.println("Time to begin");
        System.out.println("Greetings, what is your name?");

        //get user's name
        String name = input.nextLine();
        System.out.println("Hi " + name + " Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");

        String ready = input.nextLine();

        //asking if the user is ready to begin
        if(ready.equals("Y") || ready.equals("y")){
            System.out.println("I knew you would say that. You are a team leader for a reason.");
        } else if(ready.equals("N") || ready.equals("n")) {
            System.out.println("Too bad you are a team leader. You have to go.");
        }

        //determine amount of team members
        System.out.println("How many people do you want on your team?");
        int teamMembers = Integer.parseInt(input.nextLine());

        if (teamMembers > 2){
            System.out.println("That's way too many people. We can only send 2 more members.");
            teamMembers = 2;
        } else if(teamMembers < 2){
            System.out.println("That's not enough. We need to send at least 2 more members");
            teamMembers = 2;
        } else {
            System.out.println("Perfect, 2 team members it is!");
        }

        //determine what snack user wants to bring
        Thread.sleep(500);
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();
        System.out.println("Nice choice! You will bring a " + snack + " with you.");
        Thread.sleep(1000);

        //determine what vehicle the user selects from list
        System.out.println("Now you must select a vehicle. Enter the corresponding letter for the vehicle you would like from the following list.");
        Thread.sleep(2000);
        System.out.println("A: Timothy the Octopus");
        System.out.println("B: Henry the Hippo");
        System.out.println("C: Charlie the Horse");
        System.out.println("D: Bertha the Bird");

        String letter = input.nextLine();
        String vehicle = null;
        //switch statement to determine chosen vehicle and save it to variable
        switch (letter.toUpperCase()) {
            case "A" -> {
                System.out.println("Great, you have selected Timothy the Octopus");
                vehicle = "Timothy the Octopus";
            }
            case "B" -> {
                System.out.println("Great, you have selected Henry the Hippo");
                vehicle = "Henry the Hippo";
            }
            case "C" -> {
                System.out.println("Great, you have selected Charlie the Horse");
                vehicle = "Charlie the Horse";
            }
            case "D" -> {
                System.out.println("Great, you have selected Bertha the Bird");
                vehicle = "Bertha the Bird";
            }

        }
        //closing message
        System.out.println("You are now prepared for the journey.");
        Thread.sleep(2000);
        System.out.println("Your name is " + name);
        Thread.sleep(1000);
        System.out.println("you have 2 teammates");
        Thread.sleep(1000);
        System.out.println("you are bringing " + snack + " as a snack");
        Thread.sleep(1000);
        System.out.println("The vehicle you will be using is " + vehicle);
        Thread.sleep(1000);
        System.out.println("Good luck out there. Taking off in 3...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("Blast Off!");


    }

}