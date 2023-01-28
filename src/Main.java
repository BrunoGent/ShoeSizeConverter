import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = false;
        int Size = 0;
        Converter ShoeConverter = new Converter(0, 0);
        Scanner reader = new Scanner(System.in);
        System.out.println("please enter you shoe size");
        do { //loop to validate radius input
            try {
                Size = Integer.parseInt(reader.nextLine());
                flag = true; //true to exit the loop unless exception
            } catch (Exception e) {
                System.out.println("Input not valid, enter a number");
            }

        } while (!flag);

        if (Size >2 && Size < 14) {
            ShoeConverter.setUKSize(Size);
            System.out.println("you entered a UK shoe number, the EU equivalent is " + ShoeConverter.getEUSize());
        } else if (Size > 35 && Size < 48) {
            ShoeConverter.setEUSize(Size);
            System.out.println("you entered a EU shoe number, the UK equivalent is " + ShoeConverter.getUKSize());
        } else {
            System.out.println("this shoe size does not exist");
        }
    }
}