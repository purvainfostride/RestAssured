package utility;


import org.apache.commons.lang3.RandomStringUtils;

public class RestUtil {
	static String generatedString=RandomStringUtils.randomAlphabetic(3);
	public static String  CustName()
	{
		return generatedString;		
	}
	public static String Custemailid()
	{
		
		return(generatedString+"@gmail.com");
	}
}