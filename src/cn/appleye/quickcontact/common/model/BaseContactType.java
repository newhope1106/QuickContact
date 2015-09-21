package cn.appleye.quickcontact.common.model;

import java.util.ArrayList;

import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.provider.ContactsContract.CommonDataKinds.Nickname;
import android.provider.ContactsContract.CommonDataKinds.Note;
import android.provider.ContactsContract.CommonDataKinds.Organization;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.CommonDataKinds.Photo;
import android.provider.ContactsContract.CommonDataKinds.StructuredName;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import android.provider.ContactsContract.CommonDataKinds.Website;

public class BaseContactType {
	private ArrayList<DataKind> mDataKinds = new ArrayList<DataKind>();
	
	public void clear() {
		mDataKinds.clear();
	}
	
	public ArrayList<DataKind> getDataKinds() {
		return mDataKinds;
	}
	
	/**
	 * 姓名
	 * */
	public void addDataKindStructuredName() {
		DataKind dataKind = new DataKind();
		dataKind.mimetype = StructuredName.CONTENT_ITEM_TYPE;
		dataKind.typeOverallMax = 1;
		dataKind.columnName = StructuredName.DISPLAY_NAME;
		
		mDataKinds.add(dataKind);
	}
	
	/**
	 * 昵称
	 * */
	public void addDataKindNickname() {
		DataKind dataKind = new DataKind();
		dataKind.mimetype = Nickname.CONTENT_ITEM_TYPE;
		dataKind.typeOverallMax = 1;
		dataKind.columnName = Nickname.NAME;
		
		mDataKinds.add(dataKind);
	}
	
	/**
	 * 号码
	 * */
	public void addDataKindPhone() {
		DataKind dataKind = new DataKind();
		dataKind.mimetype = Phone.CONTENT_ITEM_TYPE;
		dataKind.typeOverallMax = 3;
		dataKind.columnName = Phone.NUMBER;
		dataKind.typeColumn = Phone.TYPE;
		
		dataKind.typeList = new ArrayList<DataType>();
		DataType dataType = new DataType();
		dataType.type = Phone.TYPE_MOBILE;
		dataType.typeName = "mobile";
		dataKind.typeList.add(dataType);
		
		dataType = new DataType();
		dataType.type = Phone.TYPE_HOME;
		dataType.typeName = "home";
		dataKind.typeList.add(dataType);
		
		dataType = new DataType();
		dataType.type = Phone.TYPE_WORK;
		dataType.typeName = "work";
		dataKind.typeList.add(dataType);
		
		mDataKinds.add(dataKind);
	}
	
	/**
	 * email
	 * */
	public void addDataKindEmail() {
		DataKind dataKind = new DataKind();
		dataKind.mimetype = Email.CONTENT_ITEM_TYPE;
		dataKind.columnName = Email.ADDRESS;
		dataKind.typeColumn = Email.TYPE;
		dataKind.typeOverallMax = 3;
		
		dataKind.typeList = new ArrayList<DataType>();
		DataType dataType = new DataType();
		dataType.type = Email.TYPE_MOBILE;
		dataType.typeName = "mobile";
		dataKind.typeList.add(dataType);
		
		dataType = new DataType();
		dataType.type = Email.TYPE_HOME;
		dataType.typeName = "home";
		dataKind.typeList.add(dataType);
		
		dataType = new DataType();
		dataType.type = Email.TYPE_WORK;
		dataType.typeName = "work";
		dataKind.typeList.add(dataType);
		
		mDataKinds.add(dataKind);
	}
	
	/**
	 * 邮政地址
	 * */
	public void addDataKindStructuredPostal() {
		DataKind dataKind = new DataKind();
		dataKind.mimetype = StructuredPostal.CONTENT_ITEM_TYPE;
		dataKind.columnName = StructuredPostal.FORMATTED_ADDRESS;
		dataKind.typeColumn = StructuredPostal.TYPE;
		dataKind.typeOverallMax = 3;
		
		dataKind.typeList = new ArrayList<DataType>();
		DataType dataType = new DataType();
		dataType.type = StructuredPostal.TYPE_HOME;
		dataType.typeName = "home";
		dataKind.typeList.add(dataType);
		
		dataType = new DataType();
		dataType.type = StructuredPostal.TYPE_WORK;
		dataType.typeName = "work";
		dataKind.typeList.add(dataType);
		
		dataType = new DataType();
		dataType.type = StructuredPostal.TYPE_OTHER;
		dataType.typeName = "other";
		dataKind.typeList.add(dataType);
		
		mDataKinds.add(dataKind);
	}
	
	/**
	 * 及时消息
	 * */
	public void addDataKindIm() {
		DataKind dataKind = new DataKind();
		dataKind.mimetype = Im.CONTENT_ITEM_TYPE;
		dataKind.columnName = Im.DATA;
		dataKind.typeColumn = Im.PROTOCOL;
		dataKind.typeOverallMax = 3;
		
		dataKind.typeList = new ArrayList<DataType>();
		DataType dataType = new DataType();
		dataType.type = Im.PROTOCOL_QQ;
		dataType.typeName = "QQ";
		dataKind.typeList.add(dataType);
		
		dataType = new DataType();
		dataType.type = Im.PROTOCOL_MSN;
		dataType.typeName = "MSN";
		dataKind.typeList.add(dataType);
		
		dataType = new DataType();
		dataType.type = Im.PROTOCOL_ICQ;
		dataType.typeName = "ICQ";
		dataKind.typeList.add(dataType);
		
		mDataKinds.add(dataKind);
	}
	
	/**
	 * 组织
	 * */
	public void addDataKindOrganization() {
		DataKind dataKind = new DataKind();
		dataKind.mimetype = Organization.CONTENT_ITEM_TYPE;
		dataKind.columnName = Organization.COMPANY;
		dataKind.typeColumn = Organization.TYPE;
		dataKind.typeOverallMax = 3;
		
		dataKind.typeList = new ArrayList<DataType>();
		DataType dataType = new DataType();
		dataType.type = Organization.TYPE_WORK;
		dataType.typeName = "work";
		dataKind.typeList.add(dataType);
		
		dataType = new DataType();
		dataType.type = Organization.TYPE_WORK;
		dataType.typeName = "work";
		dataKind.typeList.add(dataType);
		
		dataType = new DataType();
		dataType.type = Organization.TYPE_OTHER;
		dataType.typeName = "other";
		dataKind.typeList.add(dataType);
		
		mDataKinds.add(dataKind);
	}
	
	/**
	 * 头像
	 * */
	public void addDataKindPhoto() {
		DataKind dataKind = new DataKind();
		dataKind.mimetype = Photo.CONTENT_ITEM_TYPE;
		dataKind.columnName = Photo.PHOTO;
		dataKind.typeOverallMax = 1;
		
		mDataKinds.add(dataKind);
	}
	
	/**
	 * 备注
	 * */
	public void addDataKindNote() {
		DataKind dataKind = new DataKind();
		dataKind.mimetype = Note.CONTENT_ITEM_TYPE;
		dataKind.columnName = Note.NOTE;
		dataKind.typeOverallMax = 1;
		
		mDataKinds.add(dataKind);
	}
	
	/**
	 * 网址
	 * */
	public void addDataKindWebsite() {
		DataKind dataKind = new DataKind();
		dataKind.mimetype = Website.CONTENT_ITEM_TYPE;
		dataKind.columnName = Website.URL;
		dataKind.typeColumn = Website.TYPE;
		dataKind.typeOverallMax = 1;
		
		dataKind.typeList = new ArrayList<DataType>();
		DataType dataType = new DataType();
		dataType.type = Website.TYPE_OTHER;
		dataType.typeName = "other";
		dataKind.typeList.add(dataType);
		
		mDataKinds.add(dataKind);
	}
}
