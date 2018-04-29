import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class JamesBond {
	public boolean bondRegex(String input) {
		Pattern p = Pattern.compile("((\\d\\s)*|(\\)\\s)*)*\\(\\s((\\d\\s)*|(\\(\\s)*|(\\)\\s)*)*0\\s0\\s7\\s((\\d\\s)|(\\(\\s))*\\)\\s((\\d\\s)|(\\(\\s)|(\\)\\s))*");
		Matcher m = p.matcher(input);
		return m.find();
	}
}