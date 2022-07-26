public class Loops {

    public static void main(String[] args) {

        for (int i = 50; i < 56; i++) {

            System.out.println(i * 3);
        }

        int[] numbers = {12, 16, 9, 4, 22, 104, 66};
        for (int i = 0; i < 7; i++) // for (int = 0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);

        }
        int counter = 0;
        while (counter < 10) {
            System.out.println("hello");
            counter++; // without this line it will keep running since counter will be 0 only
        }
        System.out.println("finished");

        //-- activity

        int[] selectednumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int counter2 = 0;
        while (selectednumbers[counter2] < 7) {
            System.out.println(selectednumbers[counter2]);
            counter2++;
        }

        int myAge = 25;
        while (myAge < 20) {
            System.out.println("you are young");
            myAge++;
        }
        while (myAge < 20) ;
        System.out.println(myAge);
    }
  //
}
