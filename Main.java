//import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {

        int rock = 1;
        int paper = 2;
        int scissor = 3;

        int win = 5;
        int tie = 2;
        int lose = -1;

        int move = 0;
        int totalMoney = 0;
        int userNum = 0;

        for(int i = 0; i < 100; i++)
        {
            int randomNum = 1 + (int)(3*Math.random( ));

            userNum++;

            if(userNum == 4)
                userNum = 1;

            String r = "rock";
            String p = "paper";
            String s = "scissor";
            String userString = "";
            String randomString = "";

            if(userNum == rock)
                userString = r;
            if(userNum == paper)
                userString = p;
            if(userNum == scissor)
                userString = s;

            if(randomNum == rock)
                randomString = r;
            if(randomNum == paper)
                randomString = p;
            if(randomNum == scissor)
                randomString = s;

            if((userNum == 1 && randomNum == 1) ||
                    (userNum == 2 && randomNum == 2) ||
                    (userNum == 3 && randomNum == 3))
            {
                totalMoney += 2;
                move = tie;
            }

            if((userNum == 1 && randomNum == 3) ||
                    (userNum == 3 && randomNum == 2) ||
                    (userNum == 2 && randomNum == 1))
            {
                totalMoney += 5;
                move = win;
            }

            if((userNum == 3 && randomNum == 1) ||
                    (userNum == 2 && randomNum == 3) ||
                    (userNum == 1 && randomNum == 2))
            {
                totalMoney -= 1;
                move = lose;
            }

            int round = i +1;

            System.out.println("Round " + round);

            /*
            System.out.println("randomNum = " + randomNum);
            System.out.println("userNum = " + userNum);
             */

            System.out.println("User: " + userString);
            System.out.println("Computer: " + randomString);

            System.out.println("Player gained/lost: " + move);

            System.out.println("Current Reward: $" + totalMoney);
            System.out.println();
        }

        System.out.println("Total Reward: $" + totalMoney);
    }
}