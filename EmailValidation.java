package emailvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static boolean EmailIsValid(String email) {
		String regex = "[a-zA-Z][\\w-]{1,20}@\\w{2,20}\\.\\w{2,3}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	
		
		
	

	public static void main(String[] args) {
		String email = "sky@yahoo.com";
		boolean valid = EmailIsValid(email);
		if (valid)
			System.out.println(email + " valid");
		else
			System.out.println(email + " not valid");
		
		// TODO Auto-generated method stub

	}
}