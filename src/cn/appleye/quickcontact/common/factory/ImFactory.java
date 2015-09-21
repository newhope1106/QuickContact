package cn.appleye.quickcontact.common.factory;

public class ImFactory {
	
	public static final String createRandomIm() {
		int bitCount = (int)(Math.random()*5) + 5;
		
		String Im = "";
		for (int i=0; i<bitCount; i++) {
			if (i==0) {
				Im += (int)(Math.random()*9) + 1;
			} else{
				Im += (int)(Math.random()*10);
			}
		}
		
		return Im;
	}
}
