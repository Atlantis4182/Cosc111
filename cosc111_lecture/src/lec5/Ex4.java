package lec5;

public class Ex4 {

	public static void main(String[] args) {
		String univ = "UBC Okanagan";
		
		int n = univ.length();
		System.out.println(n);
		System.out.println(univ.length());
		
		System.out.println("abc".length());
		
		
		String s = univ.toUpperCase();
		
		System.out.println(s);
		
		// index start from 0. eg. ubc okanagan would be 0,1,2,3,4,5,6,7,8,9,10,11
		System.out.println(univ.substring(0,3)); // 0-3, not including ch. 3
		System.out.println(univ.substring(4)); // to the end
		
		int firstA = univ.indexOf("a");
		System.out.println(firstA);
		//second 'a'
		int secondA = univ.indexOf("a", firstA+1);
		System.out.println(secondA);
		//index of last 'a'
		System.out.println(univ.lastIndexOf(univ.lastIndexOf("a")));
		
		
		int i = univ.indexOf(' ');
		String word1 = univ.substring(0,i);
		String word2 = univ.substring(i+1);
		System.out.println(word1);
		System.out.println(word2);
		
		
		
	}

}
