package cn.appleye.quickcontact.common.factory;

public class OrganizationFactory implements IFactory{
	public static String[] sSample = {
			"Baidu", "Google", "Alibaba", "Tencent", "Yahoo", "Apple", "VIVO", "OPPO", "Xiaomi"
	};
	
	public static String[] sSampleJob = {
			"Engineer", "CEO", "CTO", "Manager", "Minister", "Chairman", "Marketing minister", "Strategy minister", "COO"
	};
	
	public static String creatRandomOrganization() {
		int index = (int)(Math.random() * sSample.length);
		String Organization = sSample[index];
		
		return Organization;
	}
	
	public static String createRandomJob() {
		int index = (int)(Math.random() * sSampleJob.length);
		String job = sSampleJob[index];
		
		return job;
	}

	@Override
	public String createFirstRandomData() {
		return creatRandomOrganization();
	}
	
	public String[] createRandomOrg(int count, boolean allowRepeat) {
		String[] orgs = new String[count];
		
		for(int i=0; i<count; i++) {
			String number= creatRandomOrganization();
			
			orgs[i] = number;
			boolean willRepeat = false;
			if(allowRepeat && i<count-1) {
				willRepeat = (int)(Math.random()*2)==1;
			}

			if (willRepeat) {
				i++;
				orgs[i] = number;
			}
		}
		
		return orgs;
	}

	@Override
	public String[] createFirstRandomData(int count, boolean repeatAllowed) {
		return createRandomOrg(count, repeatAllowed);
	}

	@Override
	public String createSecondRandomData() {
		return createRandomJob();
	}
}
