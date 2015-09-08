package ch3_prexercise1;

import java.util.*;
import java.io.*;

public class Ch3_PrExercise1 {
    static Scanner consule = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException{
        
        File file = new File("inData.txt");
        
        double length;
        double width;
        double areaRectangle;  
        double perimeterRectangle;
        double radius;
        double areaCircle;
        double circumference;
        String firstName;
        String lastName;
        double age;
        double accountBalance;
        double newAccountBalance;
        double interestRate;
        String letterLine;
        char letter;
        int ascii;
        String nextLetter;
                
        try (Scanner inFile = new Scanner(new FileReader(file))) {
            length = inFile.nextDouble();
            width = inFile.nextDouble();
            radius = inFile.nextDouble();
            firstName = inFile.next();
            lastName = inFile.next();
            age = inFile.nextDouble();
            accountBalance = inFile.nextDouble();
            interestRate = inFile.nextDouble();
            letterLine = inFile.next();
        }
    
    areaRectangle = length * width;
    perimeterRectangle = (2 * length) + (2 * width);
    
    areaCircle = 3.1416 * radius * radius;
    circumference = 3.1416 * 2 * radius;
    
    newAccountBalance = (((accountBalance * interestRate) / 100) / 12) + accountBalance;
    
    letter = letterLine.charAt(0);
    letter = Character.toUpperCase(letter);
    ascii = (int) letter;
    nextLetter = Character.toString((char) (ascii + 1) );

        try (PrintWriter outFile = new PrintWriter("outData.txt")) {
            outFile.println("Rectangle:");
            outFile.println("Length = " + length + ", width = " + width + ", area = " + areaRectangle + ", perimeter = " + perimeterRectangle);
            outFile.println("");
            outFile.println("Circle:");
            outFile.println("Radius = " + radius + ", area = " + areaCircle + ", circumference = " + circumference);
            outFile.println("");
            outFile.println("Name: " + firstName + " " + lastName + ", age: " + age);
            outFile.println("Beginning balance = $" + accountBalance + ", interest rate = " + interestRate);
            outFile.println("Balance at the end of the month = $" + newAccountBalance);
            outFile.println("");
            outFile.println("The character that comes after " + letter + " in ASCII set is " + nextLetter);
        }
    
    }
    
}
