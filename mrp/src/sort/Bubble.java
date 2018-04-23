package sort;

import data.Sort;

public class Bubble {

	public static void main(String[] args) {

		new Bubble();

	}

	Bubble() {

		for (int n = 0; n < Sort.test; n++) {
			for (int i = 0; i < test.length - 1; i++) {
				if (test[i] > test[i + 1]) {
					int sts;
					sts = test[i];
					test[i] = test[i + 1];
					test[i + 1] = sts;

				}
			}

		}

		prnt(test);

	}

	protected void prnt(int[] outp) {
		// System.out.println(outp.length);
		for (int s = 0; s < outp.length - 1; s++) {
				System.out.print(outp[s] + ",");

			if (s == outp.length - 2)
					System.out.print(outp[s + 1]);
		}
	}

	public int[] test = { 5, 4, 26, 4, 3, 27, 5, 3, 14, 32, 5, 3, 2, 53, 2, 5, 6, 33, 6 };

}
