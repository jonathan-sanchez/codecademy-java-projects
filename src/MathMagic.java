public class MathMagic {
    public static void main(String[] args) {

        //myNumber is the original number
        int myNumber = 7;

        //Step 1 - Step 6
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        //Print last step
        System.out.println(stepSix);
    }
}
