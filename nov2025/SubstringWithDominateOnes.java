public class SubstringWithDominateOnes {

	public static void main(String[] args) {
		System.out.println(numberOfSubString("00011"));
	}

	public static int numberOfSubString(String s) {
	  int n = s.length();
        int maxZ = (int) Math.sqrt(n) + 2;  // highest zeros needed
        long ans = 0;

        for (int i = 0; i < n; i++) {
            int zeros = 0;
            int ones = 0;

            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '0') zeros++;
                else ones++;

                if (zeros > maxZ) break;      // impossible to satisfy o ≥ z²
                if (ones >= zeros * zeros) ans++;
            }
        }

        return (int) ans;
	} 

}
