import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("How many days' temperatures ");
    int days = scan.nextInt();
    double avrage = 0;
    double[] tempDays = new double[days];
    for (int i = 0; i < days; i++){
      System.out.print("Day "+ (i+1) + "'s high temp: ");
      tempDays[i] = scan.nextInt();
      avrage += tempDays[i];
    }
    avrage /= days;
    int count = 0;
    for (int i = 0; i < days; i++){
      if (tempDays[i] > avrage){
        count++;
      }
    }
    System.out.println("Average temp = " + avrage);
    System.out.println(count + " days were above average.");
  }
}