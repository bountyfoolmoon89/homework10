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
    static int[] arr = generateRandomArray();
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
        for (int element: arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }
    public static void task2(){
        int maxSalary = -1;
        int minSalary = 200_001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxSalary) {
                maxSalary = arr[i];
            }
            if (arr[i]<minSalary) {
                minSalary = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minSalary+" рублей. Максимальная сумма трат за день составила "+maxSalary+" рублей");
    }
    public static void task3(){
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        double midSpending = sum / 30.0;
        System.out.println("Средняя сумма трат за месяц составила "+ midSpending +" рублей.");
    }
    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
        }
    }
}