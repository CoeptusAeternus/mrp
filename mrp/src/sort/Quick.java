package sort;

public class Quick {

	public static void main(String[] args) {

		new Quick();

	}

	Quick() {

		sort(0, test.length - 1);

		for (int s = 0; s < test.length - 1; s++) {
			System.out.print(test[s] + ",");
		}System.out.print(test[test.length-1]);

	}

	public void sort(int l, int r) {

		if (l < r) {
			teiler = quicksort(l, r);
			sort(l, teiler);
			sort(teiler + 1, r);

		}

	}

	public int quicksort(int l, int r) {

		int i, j, pivot, swap;

		i = l;
		j = r - 1;
		pivot = test[r];

		while (i < j) {

			while (test[i] < pivot && i < r - 1)
				i++;

			while (test[j] >= pivot && j > l)
				j--;

			if (i < j) {
				swap = test[i];
				test[i] = test[j];
				test[j] = swap;
			}
		}

		if (test[i] > pivot) {
			swap = test[i];
			test[i] = test[r];
			test[r] = swap;
		}

		return i;

	}

	private int teiler;

	public int[] test = { 5, 4, 26, 4, 3, 27, 5, 3, 14, 32, 5, 3, 2, 53, 2, 5, 6, 33, 6 };

}
