import java.util.*;

class LoopedRope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] arr = new char[r][c];

        for (int i = 0; i < r; i++) {
            String line = sc.next();
            for (int j = 0; j < c; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int[][] diff = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == '#') {
                    int black = 0;
                    for (int x = 0; x < 4; x++) {
                        int adjr = i + diff[x][0];
                        int adjc = j + diff[x][1];
                        if (adjr >= 0 && adjr < r && adjc >= 0 && adjc < c
                                && arr[adjr][adjc] == '#') {
                            black++;
                        }
                    }
                    if (!(black == 2 || black == 4)) {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }

        System.out.println("Yes");
    }
}