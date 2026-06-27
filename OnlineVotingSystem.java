import java.util.Scanner;

public class OnlineVotingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;

        System.out.println("===== ONLINE VOTING SYSTEM =====");

        System.out.print("Enter Username: ");
        String user = sc.next();

        System.out.print("Enter Password: ");
        String pass = sc.next();

        if(user.equals(username) && pass.equals(password)){

            while(true){

                System.out.println("\n===== MENU =====");
                System.out.println("1. Vote");
                System.out.println("2. View Results");
                System.out.println("3. Exit");

                System.out.print("Enter Choice: ");
                int choice = sc.nextInt();

                switch(choice){

                    case 1:

                        System.out.println("\nCandidates");
                        System.out.println("1. Candidate A");
                        System.out.println("2. Candidate B");
                        System.out.println("3. Candidate C");

                        System.out.print("Choose Candidate: ");
                        int vote = sc.nextInt();

                        if(vote == 1){
                            candidate1++;
                            System.out.println("Vote Cast Successfully!");
                        }
                        else if(vote == 2){
                            candidate2++;
                            System.out.println("Vote Cast Successfully!");
                        }
                        else if(vote == 3){
                            candidate3++;
                            System.out.println("Vote Cast Successfully!");
                        }
                        else{
                            System.out.println("Invalid Candidate!");
                        }

                        break;

                    case 2:

                        System.out.println("\n===== RESULTS =====");
                        System.out.println("Candidate A : " + candidate1 + " Votes");
                        System.out.println("Candidate B : " + candidate2 + " Votes");
                        System.out.println("Candidate C : " + candidate3 + " Votes");

                        break;

                    case 3:

                        System.out.println("Thank You!");
                        sc.close();
                        System.exit(0);

                    default:

                        System.out.println("Invalid Choice!");

                }

            }

        }else{

            System.out.println("Invalid Username or Password!");

        }

    }
}