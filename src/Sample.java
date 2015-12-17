import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Sample {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line);
		BigDecimal result = new BigDecimal(n--);
		for (;n>=1; n--) result = result.multiply(new BigDecimal(n));
		String resultStr = result.toString();
		
		Pattern com = Pattern.compile("^([0-9]+?)0*$");
		Matcher matcher = com.matcher(resultStr);
		if (matcher.find()) resultStr = matcher.group(1);
		
		com = Pattern.compile("^([0-9]+)([0-9]{9})$");
		matcher = com.matcher(resultStr);
		if (matcher.find()) resultStr = matcher.group(2);
		
		com = Pattern.compile("^0*([0-9]+)$");
		matcher = com.matcher(resultStr);
		if (matcher.find()) resultStr = matcher.group(1);
		
		System.out.println(resultStr);
	}

}
