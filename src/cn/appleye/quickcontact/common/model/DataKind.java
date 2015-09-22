package cn.appleye.quickcontact.common.model;

import java.util.ArrayList;

import cn.appleye.quickcontact.common.factory.IFactory;

public class DataKind {
	public String mimetype;
	public int typeOverallMax = 3;
	public String columnName;
	
	public String typeColumn;
	
	public ArrayList<DataType> typeList;
	
	public IFactory factoryHandler;
}
