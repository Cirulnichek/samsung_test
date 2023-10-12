public class Main {
    public static void main(String[] args) {
        char[] a = {'a', 'z', ' ', 'в', 'G', 'Ж'};
        System.out.println("Изначальный массив:");
        System.out.println(a);
        System.out.println("Новый массив:");
        a = cesar(a, 10);
        System.out.println(a);
        System.out.println("И обратно:");
        a = revCesar(a, 10);
        System.out.println(a);
    }

    public static char[] cesar(char[] arr, int key) {
        for (int i = 0; i != arr.length; i++) {
            int n = arr[i];
            if (97 <= n && n <= 122) {
                int a = n - 97;
                a = (26 + a + key) % 26;
                arr[i] = (char)(97 + a);
            }
            else if (65 <= n && n <= 90) {
                int a = n - 65;
                a = (26 + a + key) % 26;
                arr[i] = (char)(65 + a);
            } else if (1072 <= n && n <= 1103) {
                int a = n - 1072;
                a = (32 + a + key) % 32;
                arr[i] = (char)(1072 + a);
            } else if (1040 <= n && n <= 1071) {
                int a = n - 1040;
                a = (32 + a + key) % 32;
                arr[i] = (char)(1040 + a);
            }
        }
        return arr;
    }

    public static char[] revCesar(char[] arr, int key) {
        for (int i = 0; i != arr.length; i++) {
            int n = arr[i];
            if (97 <= n && n <= 122) {
                int a = n - 97;
                a = (26 + a - key) % 26;
                arr[i] = (char)(97 + a);
            }
            else if (65 <= n && n <= 90) {
                int a = n - 65;
                a = (26 + a - key) % 26;
                arr[i] = (char)(65 + a);
            } else if (1072 <= n && n <= 1103) {
                int a = n - 1072;
                a = (32 + a - key) % 32;
                arr[i] = (char)(1072 + a);
            } else if (1040 <= n && n <= 1071) {
                int a = n - 1040;
                a = (32 + a - key) % 32;
                arr[i] = (char)(1040 + a);
            }
        }
        return arr;
    }
}