import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Question16 {
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the integer constant: ");
		String num = s.next();
		String regex = "/\\*[\\s\\S]*?\\*/";
		Pattern p =Pattern.compile(regex);
		Matcher matcher = p.matcher(num);
		if(matcher.matches()) {
			System.out.println("Yes, it is satisfy.");
		}else {
			System.out.println("Wrong!");
		}
		s.close();
	}
}
