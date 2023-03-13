import java.util.Scanner;

public class LearningPackages {
    public static void main(String[] args) {
        // Create variable for cost
        // Check what learning package it is and update cost
        // Prompt user for amount of courses per month
        // Check what the additional cost is (if any) and update cost

        Scanner keyboard = new Scanner(System.in);

        int learningPackage = 0;
        int baseCost;
        int freeCourses;
        int priceOfAdditionalCourse;
        int amountOfCourses;

        while (learningPackage < 1 || learningPackage > 3){
            System.out.println("Please enter a valid learning package. What learning package would you like to go for? [ 1, 2, 3]");
            learningPackage = keyboard.nextInt();
        }

        if (learningPackage == 1){

            System.out.println("How many courses did you enroll this month?");
            amountOfCourses = keyboard.nextInt();
            baseCost = 10;
            freeCourses = 2;
            priceOfAdditionalCourse = 6;

            int monthlyTotal = (amountOfCourses > freeCourses) ? baseCost + ((amountOfCourses - freeCourses) * priceOfAdditionalCourse) : baseCost;
            System.out.println("Your monthly total is: " + monthlyTotal);

        } else if(learningPackage == 2){

            System.out.println("How many courses did you enroll this month?");
            amountOfCourses = keyboard.nextInt();
            baseCost = 12;
            freeCourses = 4;
            priceOfAdditionalCourse = 4;

            int monthlyTotal = (amountOfCourses > freeCourses) ? baseCost + ((amountOfCourses - freeCourses) * priceOfAdditionalCourse) : baseCost;
            System.out.println("Your monthly total is: " + monthlyTotal);

        } else if(learningPackage == 3){

            System.out.println("How many courses did you enroll this month?");
            amountOfCourses = keyboard.nextInt();
            baseCost = 15;
            freeCourses = 6;
            priceOfAdditionalCourse = 3;

            int monthlyTotal = (amountOfCourses > freeCourses) ? baseCost + ((amountOfCourses - freeCourses) * priceOfAdditionalCourse) : baseCost;
            System.out.println("Your monthly total is: " + monthlyTotal);

        } else{
            System.out.println("Sorry - please enter a valid learning package.");
        }

    }
}
