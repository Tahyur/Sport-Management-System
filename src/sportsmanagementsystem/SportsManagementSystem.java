/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsmanagementsystem;

import java.util.Scanner;

/**
 *
 * @author T'Drillz
 */
public class SportsManagementSystem {
 
    private static void fixtures(){
        System.out.println("Spartak Moskav Vs Liverpool \t Sept. 26 \t14:45");
        System.out.println("Dortmund Vs Real Madrid \t Sept. 26 \t14:45");
        System.out.println("Monaco Vs Porto \t\t Sept. 26 \t14:45");
    }
    private static void competition(int choice){
        switch(choice){
            case 1:
                System.out.println("Barclays Premier League");
                System.out.println("Carabao Cup");
                System.out.println("FA Cup");
                break;
            case 2:
                System.out.println("La Liga BBVA");
                System.out.println("Spanish Cup");
                System.out.println("Spanish Super Cup");
                break;
            case 3:
                System.out.println("Seria A");
                System.out.println("Tim Cup");
                System.out.println("Italian Super Cup");
                break;
            case 4:
                System.out.println("Ligue 1");
                System.out.println("Coupe de France");
                System.out.println("Super Cup");
                break;
        }
        
    }
    private static void country() {
        System.out.println("Choose a Country\nEnter the corresponding index value to make a selection\n");
        System.out.println("1.English\t2.Spain \n3.Italy\t\t4.France\n");
        
        System.out.print("Selection --> ");
        Scanner input = new Scanner(System.in);
         int choice = Integer.parseInt(input.nextLine());
         System.out.println();
         switch (choice){
             case 1:
                 System.out.println("**********************");
                 System.out.println("\tENGLISH");
                 System.out.println("**********************");
                 competition(choice);
                 break;
             case 2:
                 System.out.println("**********************");
                 System.out.println("\tSPAIN");
                 System.out.println("**********************");
                 competition(choice);
                 break;
                 
             case 3:
                 System.out.println("**********************");
                 System.out.println("\tITALY");
                 System.out.println("**********************");
                 competition(choice);
                  break;
             case 4:
                 System.out.println("**********************");
                 System.out.println("\tFRANCE");
                 System.out.println("**********************");
                 competition(choice);
                 break;
             default:
                 System.out.println("Invalid Choice\nReview the instructions and make a valid choice.Thanks\n");
                 country();          
         }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("**************************************************");
        System.out.print("\n\t HUMBER SPORTS MANAGEMENT SYSTEM");
        System.out.println("\n**************************************************");

        System.out.println("\nThis is a basic Console Menu_Driven Application \nfor managing popular sports in humber college\n");
        System.out.println("Kindly select one of the following options below. \nEnter the corresponding index value to make a selection\n");
        System.out.println("1.Fixtures \t2.Schedules \n3.Departments \t4.Competitions\n");

        System.out.print("Selection --> ");
        Scanner input = new Scanner(System.in);
        String strChoice = input.nextLine();
        int choice = Integer.parseInt(strChoice);
        
        System.out.println();
        switch (choice) {
            case 1:
                System.out.println("************************");
                System.out.println("\tFIXTURES");
                System.out.println("************************");
                System.out.println("Clubs\t\t\t\t Date\t\tTime");
                fixtures();
                //System.out.println("No Fixture lists yet\nIn Construction\nCheck back in a weeks time.\nThanks");
                break;

            case 2:
                System.out.println("************************");
                System.out.println("\tSCHEDULES");
                System.out.println("************************");
                System.out.println("No Schedules yet\nIn Construction\nCheck back in a weeks time.\nThanks");
                break;

            case 3:
                System.out.println("************************");
                System.out.println("\tDEPARTMENTS");
                System.out.println("************************");
                System.out.println("In Construction\nKindly check back later\nThanks!");
                break;

            case 4:
                System.out.println("************************");
                System.out.println("\tCOMPETITIONS");
                System.out.println("************************");
               // System.out.println("In Construction\nKindly check back later\nThanks!");
                country();
                break;
                
            default:
                System.out.println("Invalid Choice\n Program will  now terminate");
                break;
        }

    }

    

}
