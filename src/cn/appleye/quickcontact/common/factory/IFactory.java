package cn.appleye.quickcontact.common.factory;

public interface IFactory{
	public abstract String createFirstRandomData();
	
	public abstract String[] createFirstRandomData(int count, boolean repeatAllowed);
	
	public abstract String createSecondRandomData();
}
