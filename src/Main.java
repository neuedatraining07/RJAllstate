public class Main {

    public static void main(String[] args) {
        int i = 7;
        System.out.println(i);
        int j;
        j = 19;
        System.out.println(j);
        long myVariable = 176;
        long anotherVariable = 9000000000L;


        int first = 50;
        int second = 100;
        int third = first +10;

        first = 65;
        System.out.println(first);
        System.out.println(third);
        System.out.println("first * 3 = " + first *3 );
        System.out.println(second/50);
        System.out.println(second/first);
        double size = 17.3;
        float smallerSize = 17.1f;
        double largerSize = 18; // data type to store decimal numbers
        int extraLargeSize = 19;
        extraLargeSize = extraLargeSize +1;
        //extraLargeSize++; This is same as the above line.
        System.out.println(extraLargeSize);
        System.out.println(largerSize++);
        System.out.println(largerSize);
        double megaSize =++largerSize;
        System.out.println(megaSize);

        int remainder = 26 % 7; // mod
        System.out.println(remainder);
        System.out.println(163 % 2); // this will show whether the number is even or odd - result 1 for odd and 0 for even

        // myage ++;  similar to myage = myage+1;

        boolean iamHappy = true;
        boolean iAmSad = false;
        char firstInitial = 'R';

        int[] participantAges = {52,48,50,60,25};//position is 0,1,2,3,4
        participantAges[0] = 51; //change the value of position 0 from 52 to 51
        System.out.println(participantAges[0]);
        int[] scores = new int[20];
        System.out.println(scores);


    }


}
