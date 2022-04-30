public class Task3 {
    public static void main(String[] args) {
        int value = (int)(Math.random() * 101);
        System.out.println("Random [0;101) = " + value);

        int count = 1;

        if(value == 3)
            count = 3;
        else if(value > 10)
            count = 2;

        System.out.println("Count of digits: " + count);
    }
}
