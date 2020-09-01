public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Tim");
        {
            int myFirstNumber = (5*2)+(2+6);
            int mySecondNumber = 10;
            int myThirdNumber = myFirstNumber*2;
            int myTotal= myFirstNumber+mySecondNumber+myThirdNumber;
            int myLastOne=1000-myTotal;
            System.out.println("The value is\n" +myLastOne);

            System.out.println("The value is\t"  +myTotal);
        }
    }
}


