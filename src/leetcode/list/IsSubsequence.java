package leetcode.list;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "abc", t = "ahbgdc";
		System.out.println(isSubsequence(s,t));
	}

	public static boolean isSubsequence(String s, String t) {
		int sPointer =0, tPointer = 0;
		
		while(sPointer < s.length() && tPointer < t.length()) {
			if(s.charAt(sPointer) == t.charAt(tPointer)) {
				sPointer++;
			}
			tPointer++;
		}
		return sPointer == s.length();	
	}
}
