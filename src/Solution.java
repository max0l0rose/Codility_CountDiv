public class Solution {
	public int solution(int A, int B, int K) {
		System.out.print(A + ", " + B + ", " + K + " = ");
		if (A>B)
			return -1;

		int c = 0;
		for (int i = A; i <= B ; i++) {
			if (i % K == 0)
				c++;
		}

		int d = B-A;
		int c2 = d/K;

		if (A % K == 0
			|| B % K == 0)
			c2++;
		else
		if (A<=K && K<=B)
			c2++;

		if (c!=c2) {
			int a = 1;
		}
		return c2;
	}
}
