package string;

public class ReplaceAllDemo2 {

	public static void main(String[] args) {
		String regex = "(wqnmlgb|cnm|mmp|sb|nc|dsb|mdzz|djb)";
		String message = "mmp!cnm!ÄãÕâ¸ösb!ÄãÔõÃ´mdzz";
		message = message.replaceAll(regex, "***");
		System.out.println(message);
	}

}
