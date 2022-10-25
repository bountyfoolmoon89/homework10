public class Main {
    public static void main(String[] args) {
        System.out.println(" Task 1");
        task1();
        System.out.println(" Task 2");
        task2();
        System.out.println(" Task 3");
        task3();
        System.out.println(" Task 4");
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1(){
        int sum = 0;
        for (int element: generateRandomArray()) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }
    public static void task2(){
        int maxSalary = -1;
        int minSalary = 200_001;
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (generateRandomArray()[i]>maxSalary) {
                maxSalary = generateRandomArray()[i];
            }
            if (generateRandomArray()[i]<minSalary) {
                minSalary = generateRandomArray()[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minSalary+" рублей. Максимальная сумма трат за день составила "+maxSalary+" рублей");
    }
    public static void task3(){
        int sum = 0;
        for (int element: generateRandomArray()) {
            sum += element;
        }
        double midSpending = sum / 30.0;
        System.out.println("Средняя сумма трат за месяц составила "+ midSpending +" рублей");
    }
    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
        }
    }
}