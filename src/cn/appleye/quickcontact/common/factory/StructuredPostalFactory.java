package cn.appleye.quickcontact.common.factory;

public class StructuredPostalFactory implements IFactory{
	public static String[] sSample = {
			"深圳市南山区科技园科发路12号",
			"深圳市龙岗区中心城龙翔大道",
			"龙华新区龙华镇人民北路442号",
			"尖沙咀东部麼地道65号安达中心 ",
			"铜锣湾怡和街19-31号乐声大厦",
			"太子道西193号新世纪广场502~508",
			"USA N.Y. Washington DC",
			"Street, College Point, NY 11356",
			"广东省深圳市深南大道9037号世界之窗",
			"London SW1A 1AA UK"
	};
	
	public static String createRandomSamplePostal() {
		int index = (int)(Math.random() * sSample.length);
		String postal = sSample[index];
		
		return postal;
	}
	
	public String[] createRandomPostals(int count, boolean allowRepeat) {
		String[] postals = new String[count];
		
		for(int i=0; i<count; i++) {
			String postal= createRandomSamplePostal();
			
			postals[i] = postal;
			boolean willRepeat = false;
			if(allowRepeat && i<count-1) {
				willRepeat = (int)(Math.random()*2)==1;
			}

			if (willRepeat) {
				i++;
				postals[i] = postal;
			}
		}
		
		return postals;
	}

	@Override
	public String createFirstRandomData() {
		return createRandomSamplePostal();
	}

	@Override
	public String[] createFirstRandomData(int count, boolean repeatAllowed) {
		return createRandomPostals(count, repeatAllowed);
	}

	@Override
	public String createSecondRandomData() {
		return null;
	}
}
