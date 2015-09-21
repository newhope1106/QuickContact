package cn.appleye.quickcontact.common.factory;

public class EmailFactory {
	private static String[] sEmailDomain= {
			"qq.com", "126.com", "163.com", "sina.com", "139.com", 
			"189.com", "gmail.com", "yahoo.com", "souhu.com", "hotmail.com"
	};
	
	public static String createOneRandomEmail() {
		int domainIndex = (int)(Math.random()*sEmailDomain.length);
		String emailSuffix = "@" + sEmailDomain[domainIndex];
		
		String prefix = EnglishNameFactory.createRandomSecondName() + "." + EnglishNameFactory.createRandomFamilyName();
		
		return prefix + emailSuffix;
	}
}
