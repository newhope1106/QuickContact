package cn.appleye.quickcontact.common.factory;

public class OrganizationFactory {
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
}
