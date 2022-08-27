public class Main {
    public static void main(String[] args) {
//task1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        //for (int i = 0; i < numbers.length; i++) {
        //numbers[i] = i++;
        double[] fructions = {1.57, 7.654, 9.986};
        int[] team = {5, 6, 15, 23, 68};


//task2
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < fructions.length; i++) {
            System.out.print(fructions[i]);
            if (i != fructions.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < team.length; i++) {
            System.out.print(team[i]);
            if (i != team.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        ;
//task3
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) ;
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = fructions.length - 1; i >= 0; i--) {
            System.out.print(fructions[i]);
            if (i != 0) ;
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = team.length - 1; i >= 0; i--) {
            System.out.print(team[i]);
            if (i != 0) ;
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
//task4

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i]++;
            }
                System.out.print(numbers[i]);
                if (i != numbers.length - 1) {
                    System.out.print(", ");
                }
            }
        }


}