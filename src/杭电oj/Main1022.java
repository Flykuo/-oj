package º¼µçoj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main1022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			String string = scanner.next();
			String desk = scanner.next();
			Stack<Integer> stack = new Stack<>();
			int j = 0;
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < string.length(); i++) {
				stack.push(Integer.parseInt(string.charAt(i) + ""));
				list.add("in");
				if (j < desk.length()) {
					while (!stack.isEmpty() && j < desk.length() && stack.peek() == Integer.parseInt(desk.charAt(j) + "")) {
						stack.pop();
						j++;
						list.add("out");
					}
				}
			}
			if (stack.isEmpty()) {
				System.out.println("Yes.");
				for (String string2 : list) {
					System.out.println(string2);
				}
				System.out.println("FINISH");
			} else {
				System.out.println("No.");
				System.out.println("FINISH");
			}
			stack.clear();
		}
	}
}
