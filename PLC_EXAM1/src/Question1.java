import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the local-part or username: ");
		String username = s.next();
		String regex = "([^\\.][\\.]?)*[^\\.]$";
		Pattern p =Pattern.compile(regex);
		Matcher matcher = p.matcher(username);
		Boolean next = false;
		if(matcher.matches()) {
			System.out.println("Please enter the domain: ");
			next = true;
		}else {
			System.out.println("Wrong username");
		}
		if(next) {
			String domain = s.next();
			boolean str = false;
			str = domainVaild(domain);
			
			if(str) {
				System.out.println("Your email address is :"+username+"@"+domain);
			}
			else {
				System.out.println("Wring domain");
			}
		}
		s.close();
	}

	private static Boolean domainVaild(String domain) {
		String regex = "([a-zA-Z0-9][\\-\\.]*)*[a-zA-Z0-9]";
		Pattern p =Pattern.compile(regex);
		Matcher matcher = p.matcher(domain);
		if(matcher.matches()) {
			return true;
		}else {
			return false;
		}
		
	}

}
