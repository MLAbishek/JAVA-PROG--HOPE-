import java.util.*;

class DeckCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int cards = sc.nextInt();
            char card[] = new char[cards];
            for (int i = 0; i < cards; i++) {
                card[i] = '+';
            }
            int op = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            if (op >= cards) {
                for (int i = 0; i < cards; i++) {
                    card[i] = '-';
                }
            } else {
                int left = 0;
                int right = cards - 1;
                int i = 0;
                char a[] = s.toCharArray();
                Arrays.sort(a);
                String p = new String(a);
                while (op-- > 0) {
                    if (p.charAt(i) == '1') {
                        card[right] = '-';
                        right--;
                    } else if (p.charAt(i) == '0') {
                        card[left] = '-';
                        left++;
                    } else {
                        card[left] = '?';
                        card[right] = '?';
                        left++;
                        right--;
                    }
                    i++;
                }
            }
            String str = new String(card);
            System.out.println(str);
        }
    }
}
