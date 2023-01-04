package com.hillel.lessons.lesson5;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scannerTeam1 = new Scanner(System.in);

        System.out.println("Please enter team name ¹1");
        String team1 = scannerTeam1.nextLine();
        System.out.println("Team \"A\" = " + team1);

        int player1Team1 = 0;
        while (true) {
            System.out.println("Please enter the number of frags for Player 1");
            if (scannerTeam1.hasNextInt()) {
                player1Team1 = scannerTeam1.nextInt();
                System.out.println("Player 1 = " + player1Team1);
                break;
            } else {
                System.out.println("Wrong data!");
                scannerTeam1.nextLine();
            }
        }

        int player2Team1 = 0;
        while (true) {
            System.out.println("Please enter the number of frags for Player 2");
            if (scannerTeam1.hasNextInt()) {
                player2Team1 = scannerTeam1.nextInt();
                System.out.println("Player 2 = " + player2Team1);
                break;
            } else {
                System.out.println("Wrong data!");
                scannerTeam1.nextLine();
            }
        }

        int player3Team1 = 0;
        while (true) {
            System.out.println("Please enter the number of frags for Player 3");
            if (scannerTeam1.hasNextInt()) {
                player3Team1 = scannerTeam1.nextInt();
                System.out.println("Player 3 = " + player3Team1);
                break;
            } else {
                System.out.println("Wrong data!");
                scannerTeam1.nextLine();
            }
        }

        int player4Team1 = 0;
        while (true) {
            System.out.println("Please enter the number of frags for Player 4");
            if (scannerTeam1.hasNextInt()) {
                player4Team1 = scannerTeam1.nextInt();
                System.out.println("Player 4 = " + player4Team1);
                break;
            } else {
                System.out.println("Wrong data!");
                scannerTeam1.nextLine();
            }
        }

        int player5Team1 = 0;
        while (true) {
            System.out.println("Please enter the number of frags for Player 5");
            if (scannerTeam1.hasNextInt()) {
                player5Team1 = scannerTeam1.nextInt();
                System.out.println("Player 5 = " + player5Team1);
                break;
            } else {
                System.out.println("Wrong data!");
                scannerTeam1.nextLine();
            }
        }

        Scanner scannerTeam2 = new Scanner(System.in);
        System.out.println("Please enter team name ¹2");
        String team2 = scannerTeam2.nextLine();
        System.out.println("Team \"B\" = " + team2);

        int player1Team2 = 0;
        while (true) {
            System.out.println("Please enter the number of frags for Player 1");
            if (scannerTeam2.hasNextInt()) {
                player1Team2 = scannerTeam2.nextInt();
                System.out.println("Player 1 = " + player1Team2);
                break;
            } else {
                System.out.println("Wrong data!");
                scannerTeam2.nextLine();
            }
        }

        int player2Team2 = 0;
        while (true) {
            System.out.println("Please enter the number of frags for Player 2");
            if (scannerTeam2.hasNextInt()) {
                player2Team2 = scannerTeam2.nextInt();
                System.out.println("Player 2 = " + player2Team2);
                break;
            } else {
                System.out.println("Wrong data!");
                scannerTeam2.nextLine();
            }
        }

        int player3Team2 = 0;
        while (true) {
            System.out.println("Please enter the number of frags for Player 3");
            if (scannerTeam2.hasNextInt()) {
                player3Team2 = scannerTeam2.nextInt();
                System.out.println("Player 3 = " + player3Team2);
                break;
            } else {
                System.out.println("Wrong data!");
                scannerTeam2.nextLine();
            }
        }

        int player4Team2 = 0;
        while (true) {
            System.out.println("Please enter the number of frags for Player 4");
            if (scannerTeam2.hasNextInt()) {
                player4Team2 = scannerTeam2.nextInt();
                System.out.println("Player 4 = " + player4Team2);
                break;
            } else {
                System.out.println("Wrong data!");
                scannerTeam2.nextLine();
            }
        }

        int player5Team2 = 0;
        while (true) {
            System.out.println("Please enter the number of frags for Player 5");
            if (scannerTeam2.hasNextInt()) {
                player5Team2 = scannerTeam2.nextInt();
                System.out.println("Player 5 = " + player5Team2);
                break;
            } else {
                System.out.println("Wrong data!");
                scannerTeam2.nextLine();
            }
        }
        int fragTeam1 = player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1;
        double arithmeticMeanTeam1 = fragTeam1 / 5;
        int fragTeam2 = player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2;
        double arithmeticMeanTeam2 = fragTeam2 / 5;
        System.out.println("Average number of frags Team " + team1 + " = " + arithmeticMeanTeam1);
        System.out.println("Average number of frags Team " + team2 + " = " + arithmeticMeanTeam2);
        System.out.println();

        if (arithmeticMeanTeam1 < arithmeticMeanTeam2) {
            System.out.println("Win team " + team2 + ". Scored points - " + fragTeam2);
        } else if (arithmeticMeanTeam1 > arithmeticMeanTeam2) {
            System.out.println("Win team " + team1 + ". Scored points - " + fragTeam1);
        } else {
            System.out.println("We have draw:\nTeam " + team1 + ". Scored points - " + fragTeam1 + "\nTeam "
                    + team2 + ". Scored points - " + fragTeam2);
        }
    }


}

