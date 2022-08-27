import java.util.Scanner;

class FirstLetterPrinter {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println(firstLetterPrinter(input));
	}

	static String firstLetterPrinter(String str){
		// write your code here
		String res = "";
		String[] sArr = str.trim().split(" ");
		for(String s : sArr){
			int i = 0;
			while(!Character.isLetter(s.charAt(i))){
				i++;
			}
			res += s.charAt(i);
		}
		return res;
	}
}