import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the floating-point constant: ");
		String num = s.next();
		String regex = "[-]?([0-9]*\\.?[0-9]+)[eE]?[-]?[0-9]*[FLfl]?";
		Pattern p =Pattern.compile(regex);
		Matcher matcher = p.matcher(num);
		if(matcher.matches()) {
			System.out.println("Yes, it is floating number constant.");
		}else {
			System.out.println("Wrong!");
		}
		s.close();

	}

}
