import java.util.Scanner;

public class Main {

    public static class headphone { //CLASS FOR HEADPHONE
        static int volume;

        public headphone() { //CONSTRUCTOR OF CLASS
            volume = 50; //default value to be changed
        }
    }

    public static class Function extends headphone { //SUBCLASS INHERITED FROM HEADPHONE
        public void volup(int inc) { //METHOD TO INCREASE VOLUME
            volume += inc;
            System.out.println("\n[Volume increased]");
        }

        public void voldown(int inc) { //METHOD TO DECREASE VOLUME
            volume -= inc;
            System.out.println("\n[Volume Decreased]");
        }

        public void setvol() { //METHOD TO SET EXACT VOLUME
            Scanner no = new Scanner(System.in);
            System.out.print("Enter Volume amount: ");
            volume = no.nextInt();
            System.out.println("\n[Volume Set]");
        }

    }

    public static void main(String[] args) {
        Function mouse = new Function();

        int inc = 1; //value for volume up and down increments

        while (true) {
            Scanner in = new Scanner(System.in);

            System.out.println("1. Volume up");
            System.out.println("2. Volume down");
            System.out.println("3. Set Volume");
            System.out.println("4. Set volume up/down increments");

            System.out.println("\n{VOLUME} :" + headphone.volume);
            System.out.print("Enter Choice: ");

            int x = in.nextInt(); //INTEGER TO CONTROL THE PROGRAM

            if (x == 1) {
                mouse.volup(inc); //METHOD CALL VOLUME UP BY 1
            } else if (x == 2) {
                mouse.voldown(inc); //METHOD CALL VOLUME DOWN BY 1
            } else if (x == 3) {
                mouse.setvol(); //METHOD CALL TO SET EXACT VALUE
            } else if (x == 4) {
                Scanner no = new Scanner(System.in);
                System.out.print("Enter amount: ");

                inc = no.nextInt();
                System.out.println("\n[Increment set]");
            } else {
                System.out.println("\nInvalid choice try again");
            }

            try { //TRY AND CATCH EXCEPTION IF THE VOLUME EXCEEDS 100 AND GOES BELOW 0
                if (headphone.volume > 100) {
                    headphone.volume = 100;
                    int a = 10 / 0;

                }
                if (headphone.volume < 0) {
                    headphone.volume = 0;
                    int a = 10 / 0;

                }
            } catch (Exception e) { //RESULT OF THE EXCEPTION
                System.out.println("[ERROR VOLUME LIMIT REACHED]");
            }
        }
    }
}
