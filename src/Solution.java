public class Solution {
	public int solution(int A, int B, int K) {
		//System.out.print(A + ", " + B + ", " + K + " = ");
		if (A>B)
			return -1;

//		int c = 0;
//		for (int i = A; i <= B ; i++) {
//			if (i % K == 0)
//				c++;
//		}

		int cb = B/K;
		int ca = (A-1)/K;
		if (A == 0)
			ca = -1;
		int cc = cb - ca;

//		if (A % K == 0
//			|| B % K == 0)
//			c2++;
//		else
//		if (A<=K && K<=B)
//			c2++;

//		if (c!=cc) {
//			int a = 1;
//		}
		return cc;
	}
}
