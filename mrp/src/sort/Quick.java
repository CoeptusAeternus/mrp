package sort;

public class Quick {

	public static void main(String[] args) {

		new Quick();

	}

	Quick() {
		sort(0, 0);

	}

	public void sort(int r, int l) {
		int f;
		l = 0;
		r = test.length - 1;

		if (l < r) {

			f = factor(r, l);
			sort(l, f);
			sort(f + 1, r);
		}
		
		System.out.println("test");
		for (int s = 0; s < test.length - 1; s++) {
			System.out.print(test[s] + ",");
		}
	}

	public int factor(int l, int r) {

		int i, j, p, temp;

		i = l;
		j = r + 1;
		p = test[r];

		while (test[i] < p && i < r - 1) {
			i++;
		}
		while (test[j] >= p && j > l) {
			j--;
		}
		if (i < j) {
			temp = test[i];
			test[i] = test[j];
			test[j] = temp;
		}

		return i;
	}

	public int[] test = { 5, 4, 26, 4, 3, 27, 5, 3, 14, 32, 5, 3, 2, 53, 2, 5, 6, 33, 6 };

}
