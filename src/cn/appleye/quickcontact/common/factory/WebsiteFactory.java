package cn.appleye.quickcontact.common.factory;

public class WebsiteFactory implements IFactory{
	public static String[] sSample = {
			"www.baidu.com", "www.google.com", "www.yahoo.com", "www.douban.com", "www.youtube"
	};
	
	public static String createRandomWebsite() {
		int index = (int)(Math.random() * sSample.length);
		String website = sSample[index];
		
		return website;
	}

	@Override
	public String createFirstRandomData() {
		return createRandomWebsite();
	}
	
	public String[] createRandomPostals(int count, boolean allowRepeat) {
		String[] websites = new String[count];
		
		for(int i=0; i<count; i++) {
			String website= createRandomWebsite();
			
			websites[i] = website;
			boolean willRepeat = false;
			if(allowRepeat && i<count-1) {
				willRepeat = (int)(Math.random()*2)==1;
			}
			
			i++;
			if (willRepeat) {
				websites[i] = website;
			}
		}
		
		return websites;
	}

	@Override
	public String[] createFirstRandomData(int count, boolean repeatAllowed) {
		return createRandomPostals(count, repeatAllowed);
	}

	@Override
	public String createSecondRandomData() {
		// TODO Auto-generated method stub
		return null;
	}
}
