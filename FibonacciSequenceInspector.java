package ca.concordia.algos;

public class FibonacciSequenceInspector {
	static int count;
	public int fibSequence(int i) {
		if (i > 0 && i <= 6) {
			count++;
			return 1;
		} else {
			count++;
			return fibSequence(i - 6) + 2 * fibSequence(i - 5) + fibSequence(i - 3) + fibSequence(i - 1);
		}
	}

	public static void main(String[] args) {
		FibonacciSequenceInspector fsi=new FibonacciSequenceInspector();
		int length = Integer.parseInt(args[0]);
		for (int i = 1; i <= length; i++) {
			int num = fsi.fibSequence(i);
			System.out.print(num + " ");
		}

		System.out.println("\nCalls: " + count);

	}

}