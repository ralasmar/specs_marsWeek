import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException{

        Thread.sleep(500);

        System.out.println("Welcome back");

        //array of rocks
        List<String> items = new ArrayList<String>();

        items.add("rock");
        items.add("weird rock");
        items.add("smooth rock");
        items.add("not rock");

        //remove items that are not rocks
        System.out.println("Download successful. The rocks included are " + items);
        Thread.sleep(500);
        System.out.println("Wait a minute, one of those is not a rock. It needs to be removed.");
        Thread.sleep(500);

        items.remove("not rock");
        System.out.println("Download successful. The rocks included are " + items);
        System.out.println("Perfect");

        Thread.sleep(1000);

        //hashmap storing fossils
        Map<String, String> map = new HashMap<>();

        map.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        map.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        map.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Fossil data downloaded");
        Thread.sleep(500);

        //ask user which fossil they want to learn more about
        Scanner input = new Scanner(System.in);
        System.out.println("Which fossil would you like to learn more about? Enter Bird, Fish, or Tooth.");
        String answer = input.nextLine();

        //if loop based on fossil choice
        if (answer.equalsIgnoreCase("Bird")){
            System.out.println("The fossil has wings implying it was capable of flight");
        } else if (answer.equalsIgnoreCase("Fish")){
            System.out.println("The fossil is vaguely fish shaped implies there was once water");
        } else if (answer.equalsIgnoreCase("Tooth")){
            System.out.println("The tooth from an unknown fossil");
        } else {
            System.out.println("Please enter Bird, Fish, or Tooth");
        }

        Thread.sleep(700);

        //hash set to store supplies brought on the expedition
        //note: hash set store unique values, these are special supplies that you only have one of
        //hashcode function transforms the input into an array index
       //initial capacity = 16
        Set<String> set = new HashSet<>();

        set.add("toothbrush");
        set.add("water bottle");
        set.add("stuffed animal");
        set.add("cat");

        System.out.println("Supplies before expedition: " + set);

        set.remove("water bottle");
        System.out.println("Supplies after expedition: " + set);
    }
}