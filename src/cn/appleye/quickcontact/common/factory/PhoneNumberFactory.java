package cn.appleye.quickcontact.common.factory;

public class PhoneNumberFactory implements IFactory{
	
	private static final String[] sCountryPrefix = {
			"0091",
			"+91-"
	};
	
	private static final String[] sCityPrefix = {
			"9", "8"
	};

	public static String createOneRandomPhoneNumber(){
		String phoneNumber = "";
		
		if((int)(Math.random()*2) == 0) {
			int index = (int)(Math.random()*sCountryPrefix.length);
			phoneNumber += sCountryPrefix[index];
		}
		
		int index = (int)(Math.random()*sCityPrefix.length);
		phoneNumber += sCityPrefix[index];
		
		StringBuffer tel = new StringBuffer(phoneNumber);
		
		for (int i = 0; i < 8; i++) {
			tel.append((int) (Math.random() * 9));
		}
		
		return tel.toString();
	}
	
	public String[] createRandomNumbers(int count, boolean allowRepeat) {
		String[] numbers = new String[count];
		
		for(int i=0; i<count; i++) {
			String number= createOneRandomPhoneNumber();
			
			numbers[i] = number;
			boolean willRepeat = false;
			if(allowRepeat && i<count-1) {
				willRepeat = (int)(Math.random()*2)==1;
			}

			if (willRepeat) {
				i++;
				numbers[i] = number;
			}
		}
		
		return numbers;
	}

	@Override
	public String createFirstRandomData() {
		return createOneRandomPhoneNumber();
	}

	@Override
	public String[] createFirstRandomData(int count, boolean repeatAllowed) {
		return createRandomNumbers(count, repeatAllowed);
	}

	@Override
	public String createSecondRandomData() {
		// TODO Auto-generated method stub
		return null;
	}
}
