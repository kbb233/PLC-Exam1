import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the integer constant: ");
		String num = s.next();
		String regex = "0?[xX]?[0-9a-f]*[ul]?((I64)|(Ui64))?";
		Pattern p =Pattern.compile(regex);
		Matcher matcher = p.matcher(num);
		if(matcher.matches()) {
			System.out.println("Yes, it is integer constant.");
		}else {
			System.out.println("Wrong!");
		}
		s.close();
	}

}
