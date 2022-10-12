//import java.util.Scanner;
//
//public class HM {
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//
//        double totalSecs, seconds;
//
//        System.out.println("Enter number of hours: ");
//
//        totalSecs = scan.nextInt();
//
//        seconds = 3600/totalSecs;
//        seconds = (Math.abs(Math.round(seconds)-seconds))*3600;
//
//        System.out.print(seconds + "\n");
//
//    }
//}

import java.util.Scanner;

public class HW {

    public static void main(String[] args) {
        int seconds = 0;
        int hours = 0;
        int minutes = 0;
        int secondsDisp = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        seconds = in.nextInt();
        hours = seconds/3600;
        minutes = (seconds - (hours*3600))/60;
        secondsDisp = ((seconds - (hours*3600)) - (minutes * 60));
        System.out.println(seconds + " seconds equals " + hours + " hours, " + minutes + " minutes and " + secondsDisp + " seconds");
    }
}