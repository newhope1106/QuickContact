package cn.appleye.quickcontact.common.factory;

public class WebsiteFactory {
	public static String[] sSample = {
			"www.baidu.com", "www.google.com", "www.yahoo.com", "www.douban.com", "www.youtube"
	};
	
	public static String createRandomWebsite() {
		int index = (int)(Math.random() * sSample.length);
		String website = sSample[index];
		
		return website;
	}
}
