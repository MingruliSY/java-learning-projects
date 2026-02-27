/*
 *
 * Write the Buses program inside the main method
 * according to the assignment description.
 * 
 * To compile:
 *        javac Buses.java
 * To execute:
 *        java Buses 7302
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */
public class Buses {
    public static void main(String[] args) {
       int busNumber = Integer.parseInt(args[0]);
       if (busNumber < 0){
        System.out.println("ERROR");
        return;
       }
       int sum = 0;
       int i = busNumber;
       while (i > 0){
       sum += (i % 10);
       i /= 10; 
       }
       if (sum % 2 == 0){
        System.out.println("LX");
       }else{
        System.out.println("H");
       }
    }
}
