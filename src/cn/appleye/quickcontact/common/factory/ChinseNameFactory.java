package cn.appleye.quickcontact.common.factory;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class ChinseNameFactory {
	private static final String[] sSurname = {
			"王","李","张","刘","陈","杨","黄","赵","吴","周", "徐","孙","马","朱","胡","林","郭",
			"何","高","罗","郑","梁","谢","宋","唐","许","邓","冯","韩","曹","曾","彭","萧","蔡",
			"潘","田","董","袁","于","余","叶","蒋","杜","苏","魏","程","吕","丁","沈","任","姚",
			"卢","傅","钟","姜","崔","谭","廖","范","汪","陆","金","石","戴","贾","韦","夏","邱",
			"方","侯","邹","熊","孟","秦","白","江","阎","薛","尹","段","雷","黎","史","龙","陶",
			"贺","顾","毛","郝","龚","邵","万","钱","严","赖","覃","洪","武","莫","孔","司马","上官",
			"欧阳","夏侯","诸葛","东方","赫连","皇甫","尉迟","公羊","澹台","公冶","淳于","单于","太叔",
			"申屠","公孙","仲孙","轩辕","令狐","钟离","宇文","长孙","慕容","鲜于","闾丘","司徒","司空",
			"司寇","南门","呼延","子车","颛孙","端木","公西","公良","拓跋","宰父","谷梁","百里","东郭",  
	        "梁丘","左丘","东门","西门","南宫","第五","公仪","公乘","太史","东乡","相里","胡母","司城",
	        "张廖","雍门","独孤","北宫"
	};
	
	public static String createRandomName() {
		return getChineseSurname() + getChineseName();
	}
	
	/**
	 * 获取随机姓
	 * */
	private static String getChineseSurname(){
		int index = (int)(Math.random() * sSurname.length);
		
		return sSurname[index];
	}
	
	/**
	 * 获取随机名
	 * */
	private static String getChineseName() {  
        String str = null;  
        int highPos, lowPos;  
        Random random = new Random();  
        highPos = (176 + Math.abs(random.nextInt(71)));//区码，0xA0打头，从第16区开始，即0xB0=11*16=176,16~55一级汉字，56~87二级汉字  
        random=new Random();  
        lowPos = 161 + Math.abs(random.nextInt(94));//位码，0xA0打头，范围第1~94列  
  
        byte[] bArr = new byte[2];  
        bArr[0] = (new Integer(highPos)).byteValue();  
        bArr[1] = (new Integer(lowPos)).byteValue();  
        try {  
            str = new String(bArr, "GB2312");   //区位码组合成汉字  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
        
        return str;  
    }  
}
