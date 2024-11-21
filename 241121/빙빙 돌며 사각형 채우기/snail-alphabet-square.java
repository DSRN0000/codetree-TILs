import java.util.*;

public class Main {
	private static int n, m, x, y, dirNum;
	private static int[] dx = new int[] { 0, 1, 0, -1 };
	private static int[] dy = new int[] { 1, 0, -1, 0 };
	private static char[][] arr;

	private static boolean isRange(int x, int y) {
		return (0 <= x && x < n && 0 <= y && y < m);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new char[n][m];
		char c = 'B';
		int num = (int) c;

		arr[x][y] = 'A';
		for (int i = 1; i < n * m; i++) {
			int nx = x + dx[dirNum];
			int ny = y + dy[dirNum];

			if (!(isRange(nx, ny) && arr[nx][ny] == 0)) {
				dirNum = (dirNum + 1) % 4;
			}

			x += dx[dirNum];
			y += dy[dirNum];

			arr[x][y] = (char) num;
			num += 1;

			if ((int)'Z' < num) {
				num = (int)'A';
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}