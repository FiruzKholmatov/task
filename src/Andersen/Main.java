package Andersen;

public class Main {
    public static void main(String[] args) {
//        First first = new First();
//        first.shouldGreetOverSeven(4);
//
//
//        Second second = new Second();
//        second.shouldReplyToVyacheslavOnly("Вячеслав");

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if (i % 3 == 0) {
                System.out.println(i);
            }



        }

    }
}
