import java.io.*;
import java.util.*;

public class Solution {
 	static final FastScanner fs = new FastScanner();
    static int testCases;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCases = fs.nextInt();
		for(int tt = 1; tt<=testCases; ++tt) {
			solve(tt);
      }
	}

  public static void solve(int tt) {
      //write code here
	  int n = fs.nextInt();
	  int k = fs.nextInt();
	  String str = fs.next();
	  
	  char[] s = str.toCharArray();
	  
	  int cnt = 0;
	  for(int i = 0; i < n/2; ++i) {
		  if(s[i] != s[n-1-i]) {
			  cnt++;
		  }
	  }
	  
	  System.out.println("Case #" + tt + ": " + Math.abs(cnt - k));
  }

  static final Random random = new Random();

  public static void ruffleSort(int[] a){
      int n = a.length;
      for(int i = 0; i < n; ++i){
          int oi = random.nextInt(n), temp = a[oi];
      } 
      Arrays.sort(a);
  }

	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try { 
                  st=new StringTokenizer(br.readLine());				               
			} catch (IOException e) {}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
