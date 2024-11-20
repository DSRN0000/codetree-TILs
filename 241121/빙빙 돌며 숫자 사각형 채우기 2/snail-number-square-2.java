import java.util.*;

public class Main {
	private static int n, m, x, y, dirNum;
	private static int[][] arr;
	private static int[] dx = new int[] { 1, 0, -1, 0 };
	private static int[] dy = new int[] { 0, 1, 0, -1 };

	private static boolean isRange(int x, int y) {
		return (0 <= x && x < m && 0 <= y && y < n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m][n];
		arr[x][y] = 1;
		for (int i = 2; i <= m * n; i++) {

			int nx = x + dx[dirNum];
			int ny = y + dy[dirNum];

			if (!(isRange(nx, ny) && arr[nx][ny] == 0)) {

				dirNum = (dirNum + 1) % 4;
			}

			x += dx[dirNum];
			y += dy[dirNum];
			arr[x][y] = i;

		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}