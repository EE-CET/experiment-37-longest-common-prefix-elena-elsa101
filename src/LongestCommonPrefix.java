  import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }

        String prefix = arr[0];

        for (int i = 1; i < N; i++) {
            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("-1");
                    return;
                }
            }
        }

        System.out.println(prefix);
    }
}

