package weeks3and4Homework;

import java.util.Arrays;

public class weeks3and4HomeworkClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    //
    // Coding Steps — Arrays and Methods
    
    // Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8,
    // 28, 93.
    
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
    
    // Programmatically subtract the value of the first element in the array from the value in the
    // last element of the array (i.e. do not use ages[7] in your code). Print the result to the
    // console.
    
   System.out.println(ages[ages.length - 1] - ages[0]);
    
    // Add a new age to your array and repeat the step above to ensure it is dynamic (works for
    // arrays of different lengths).
   
//   ages[ages.length -1] = 98;
//   for (int i = 0; i < ages.length; i++) {
//     System.out.println(ages[i]);
//   }
    
   int n = ages.length;
   int newAges[] = new int[n+1];
   int value = 98; 
   System.out.println(Arrays.toString(ages));
   for(int i = 0; i<n; i++) {
     newAges[i] = ages[i];
   }
   newAges[n] = value;
   System.out.println(Arrays.toString(newAges)); // how to print array
   System.out.println(newAges[newAges.length - 1] - newAges[0]);
   
   ages = newAges;
    
    // Use a loop to iterate through the array and calculate the average age. Print the result to
    // the console.
    
   double sum = 0;
   for (double number : ages) {
     sum += number;
   }
   double average = sum / ages.length;
   System.out.println(average);
    
    // Create an array of String called names that contains the following values: “Sam”, “Tommy”,
    // “Tim”, “Sally”, “Buck”, “Bob”.
   
   String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
  
    
    
    // Use a loop to iterate through the array and calculate the average number of letters per name.
    // Print the result to the console.
   
   double sumOfNamesLength = 0;
   for (String name : names) {
     sumOfNamesLength += names.length;
        } 
   System.out.println("Sum of names length: " + sumOfNamesLength);
   
   double averageNamesLength = sumOfNamesLength / names.length;
   
   System.out.println("Average name length: " + averageNamesLength); 
   
    
    // Use a loop to iterate through the array again and concatenate all the names together,
    // separated by spaces, and print the result to the console.
    
    // name placeholder
   String listOfNames = "";
  for (String name : names) {
    listOfNames = listOfNames + name + " ";
  }

    // loop over names array
      // name placehold + " " 
    // print out placeholder
  System.out.println(listOfNames + "."); 
    
    // How do you access the last element of any array?
  
  System.out.println(names[names.length - 1]);
    
    // How do you access the first element of any array?
    
  System.out.println(names[0]);
    // Create a new array of int called nameLengths. Write a loop to iterate over the previously
    // created names array and add the length of each name to the nameLengths array.
    
 
    // calculate the length of names array values 
    // nn int [] nameLengths == what does it equal though 
  
  int [] nameLengths = new int[names.length];
  
  for (int i = 0; i < names.length; i++) { 
    nameLengths[i] = names[i].length();
  
   
    System.out.println("Name lengths are: " + nameLengths[i]);}
   
//  
// int[] nameLengths = {};
//    int nameLength = 0;
//    for (int i = 0; i < names.length; i++) {
//  nameLengths[i]= names.length;
//      
//    System.out.println(nameLengths[i]);
//  
 
  
    // Write a loop to iterate over the nameLengths array and calculate the sum of all the elements
    // in the array. Print the result to the console.
      // 
  int sumOfNamesLengthArray = 0;
  for (int length : nameLengths) {
    sumOfNamesLengthArray  += nameLengths.length;
       } 
  System.out.println("Sum of names length 2nd array: " + sumOfNamesLengthArray);
  
    // Write a method that takes a String, word, and an int, n, as arguments and returns the word
    // concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the
    // method to return “HelloHelloHello”).
    
 // method 1
  System.out.println(concatenanteWord("Jami",4));
  
    
    // Write a method that takes two Strings, firstName and lastName, and returns a full name (the
    // full name should be the first and the last name as a String separated by a space).
    
    //method 2 - fullName
  // public static String fullName(String firstName, String lastName)
  // return = firstName + " " + LastName
System.out.println(fullName("Jami","Mason"));
  
    // Write a method that takes an array of int and returns true if the sum of all the ints in the
    // array is greater than 100.
    // Method 3 
    // public static int greaterThanHundred(int sum, boolean min)
        // int integer = 1 
        // for (int i = 0; i =< min; i++) {
        // integer = int[i] 
//if (integer >= 100) {
//  return
//}
int[] newIntArray = {1, 2, 7, 90};
System.out.println(greaterThanHundred(newIntArray));
    
    // Write a method that takes an array of double and returns the average of all the elements in
    // the array.

// Method 4 
// Double array average 
double[] doubles = {2.34, 3.45, 3.23, 1.23};
System.out.println(doubleAverage(doubles));
    
    
    // Write a method that takes two arrays of double and returns true if the average of the
    // elements in the first array is greater than the average of the elements in the second array.
    // Method 5 

//  public static boolean greaterThan(double [] a, double [] b) {
     // 
double[] greaterTest = {3.4, 5.5, 3.9, 9.8};
System.out.println(greaterThan(greaterTest, doubles));
    
    // Write a method called willBuyDrink that takes a boolean isHotOutside, and a double
    // moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than
    // 10.50.
//Method 6 

boolean isHotOutside = true;
double moneyInPocket = 10.55;
System.out.println(willBuyDrink(isHotOutside,moneyInPocket));
    


// 

    
    // Create a method of your own that solves a problem. In comments, write what the method does
    // and why you created it.
    // Method 7 

// If toddler sleep hours are less than 10 print "It's going to be a hard day, sorry." if toddler sleep hours are greater than 
// 10 hours print "Got enough sleep." -- 
int sleepHours = 11;
System.out.print(toddlerSleep(sleepHours));
    
  } // method 
  
  
  // Method 1 Concatenante word by int number of times 
  public static String concatenanteWord(String word, int n) {
    String result = "";
    for (int index = 1; index <= n; index++) {
      result = result + word;
    }
    return result;
  
  }
  
  // Method 2
  public static String fullName(String firstName, String lastName) {
  return firstName + " " + lastName;
  }
  
  
  
   // Method 3
   public static boolean greaterThanHundred(int[] sum) {
   int integer = 0;
   for(int index = 0; index < sum.length; index++) {
     integer += sum[index];
   }
   // for every integer called "number" (or any variable) in the array called " sum " do something 
   // integer = integer + number (same as integer += number) 
//   for (int number : sum) {
//     integer += number ; 
//   }
   
//   (int i = 0; i < sum; i++) {
//   integer = sum[i];
//   }
//if (integer >100) {
//return true;
//}
//else { 
//  return false;
//}
   return integer > 100 ; 
   }
   
// Method 4 average of double
 public static double doubleAverage(double[] array) {
 double sum = 0; 
 for (double number : array) {
 sum += number; 

 }
 double average = sum / array.length;
 return average;
  } 
 
 // Method 5 - boolean a greater than b. 

public static boolean greaterThan(double[] a, double[] b) {
 double arrayA = 0;
 double arrayB = 0;
   for (double number : a) {
     arrayA += number;
   }
   double averageA = arrayA / a.length;
 
     for (double number : b) {
       arrayB += number;
     }
     double averageB = arrayB / b.length; 
 return averageA > averageB;
}
 // return a > b 

// Method 6
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
//
if (isHotOutside != false && moneyInPocket > 10.50) {
  
  return true;
}
else {
  return false; 
}

}

// Method 7 - Toddler sleep 
public static String toddlerSleep(int sleepHours) {
  String enoughSleep = "Got enough sleep";
  String notEnoughSleep = "It's going to be a hard day, sorry.";
  

    if (sleepHours < 10) {
      return notEnoughSleep;  
    }
  else if (sleepHours > 10) {
    return enoughSleep; 
  }
    return notEnoughSleep;
    
  }

    
  
  
  


} // class
