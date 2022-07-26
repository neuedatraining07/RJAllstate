public class Conditions {

    public static void main(String[] args) {
        int testscore = 60; // change this to 50 , 40 to see the difference in result.
        if (testscore >50) {
            System.out.println("congratulations - you have passed");

        } else if (testscore==50) {
            System.out.println("we are not sure if you passed");
        }
        else {
            System.out.println("sorry - you failed the test");
        }

        switch (testscore) {
            case 0 :
                System.out.println("Did you even take the test?");
                break;
            case 100:
                System.out.println("you got top marks!");
                break;
            default:
                System.out.println("you didn't do anything special");
                break;

                    }

         int maxScore = 100;
        if (testscore >50 && testscore < maxScore){
            System.out.println("you passed but didn't get full marks");
        }

        if (testscore <10 || testscore >90){
            System.out.println("you are at the boundary");
        }
        if (testscore != 100) {

            System.out.println("You didn't get full marks");
        }
    }
}
