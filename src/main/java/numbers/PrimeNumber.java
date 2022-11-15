package numbers;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(20));
		for (int i = 1; i < 20; i++) {
			if (isPrime(i))
				System.out.println(i);
		}

	}

	public static boolean isPrime(int num) {

		if (num <= 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
