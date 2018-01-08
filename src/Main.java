public class Main {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        double arr3[] = new double[5];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            int a = (int) (Math.random() * 8) + 1;
            arr1[i] = a;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            int b = (int) (Math.random() * 8) + 1;
            arr2[i] = b;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (double) arr1[i] / (double) arr2[i];
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 1 == 0) {
                count++;
            }
        }
        System.out.println("Количество целых элементов равно " + count);

    }
}


