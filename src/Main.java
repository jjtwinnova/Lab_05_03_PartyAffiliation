public class Main {
    public static void main(String[] args)
    {
        //Declare Variables
        String party = "S";

        //input
        System.out.println("What is your party affiliation? (D, R or I) ");

        //Output
        if(party == "D")
        {
            System.out.println("You are a Democratic Donkey!");
        }
        else if(party == "R")
        {
            System.out.println("You are a Republican Elephant!");
        }
        else if(party == "I")
        {
            System.out.println("You are an Independent Person!");
        }
        else
        {
            System.out.println("You chose another party!");
        }
    }
}