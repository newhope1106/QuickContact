package cn.appleye.quickcontact.common.factory;

public class StructuredPostalFactory implements IFactory{
	
	public static String[] sPostalPrefix = {
			"Jiuzhaigou County, Aba Tibetan and Qiang Autonomous Prefecture, Sichuan Province", 
			"Anhui Province Fuyang City, Taihe County G105 ",
			"Gansu Province Gannan Tibetan Autonomous Prefecture Hezuo city ",
			"Anyang City, Henan Province Neihuang County ",
			"Hebei Province Handan Yongnian County",
			"Shandong Rizhao City Juxian", "Henan Province, Lushan County, Pingdingshan City", 
			"Henan Province, Ruzhou City, Pingdingshan City", "Hubei Province Shiyan Zhushan County", 
			"Shaanxi Province, Yulin Shenmu county", 
			"Huangnan Tibetan Autonomous Prefecture", 
			"Qinghai Province Henan Mongolian Nationality Autonomous County",
			"Fujian, Fuqing City, Fuzhou City", "Ganzi Tibetan Autonomous Prefecture, Sichuan Province, Jiulong County", 
			"Shaanxi Xianyang City, Liquan County X215", "Hubei Province Xiangyang City Nanzhang county", 
			"Gansu Province Wuwei Minqin County","Yunnan Province Zhaotong City Zhenxiong County",
			"Shandong Province Heze Caoxian s254", "Henan Province Nanyang City Xichuan County", "Shawan District, Leshan City, Sichuan Province",
			"Shaanxi Province Baoji Fengxian", "Baoji City in Shaanxi Province Taibai county", 
			"Guizhou Qiandongnan Miao and Dong Autonomous Prefecture in Liping County","Yichang City, Hubei Province, Wufeng Tujia Autonomous County",
			" Sichuan province city Xuanhan county ","Sichuan Province Liangshan Yi Autonomous, Yuexi County S208 ",
			"Qinghai Province Guoluo Tibetan Autonomous Prefecture Maqin county ","Guizhou Province Bijie City qixingguan District",
			"Shandong Province Zibo City Huantai County G205", "Shangrao City, Jiangxi Province, Yushan County", 
			"Wuxi County, Chongqing City, ",", Nanchuan District, Chongqing City, ",", Zunyi City, Guizhou Province, Chishui City S208 ",
			"Shaanxi Province in Shangluo City Zhen'an County "," Shandong Province Dezhou Wucheng County",
			"Anhui Province, Huaibei City Suixi County", "Qinghai Haibei Tibetan Autonomous Prefecture Menyuan Hui Autonomous County",
			"Shandong Province Weifang City Hanting district X056 "," Inner Mongolia Autonomous Region Alxa League Alashan Left Banner",
			"Huangnan Tibetan Autonomous Prefecture, Qinghai Province Henan Mongolian Nationality Autonomous County",
			"Ningxia Hui Autonomous Wuzhong, Yanchi county", "Shandong Province, Yishui County, Linyi City, G22 Qing Lan highway", 
			"Chaohu City, Hefei City, Anhui Province, China", "Qinghai Province Guoluo Tibetan Autonomous Prefecture in dari County", 
			"Hunan Province, Dingcheng District, Changde City","Yunnan Province Zhaotong City Weixin county ",
			"Yunnan Province Kunming Luquan Yi and Miao Autonomous County","Jiangxi Province Shangrao City Dexing City ",
			" Hubei Province Enshi Tujia and Miao Autonomous Prefecture Jianshi County g209 ","Sichuan Province Liangshan Yi Autonomous, Ningnan County",
			"Jinchuan County, Aba Tibetan and Qiang Autonomous Prefecture, Sichuan Province", "Yunnan Province, Dali Bai Autonomous Prefecture in Eryuan County", 
			"Ningxia Hui Autonomous Region Wuzhong City Tongxin County","Guangxi Zhuang Autonomous Region, Ziyuan County, Guilin City",
			"Jiangsu Province Taizhou Xinghua City Y716", "Jiangsu Province Xuzhou Suining county", 
			"Shaanxi Province, Ankang City ningshaan County","Changde City, Hunan Province, Taoyuan County XJ55 ",
			" Qinghai Province Guoluo Tibetan Autonomous Prefecture banma county ",
			"Huangnan Tibetan Autonomous Prefecture, Qinghai Province Henan Mongolian Nationality Autonomous County",
			"Zhangjiajie City, Hunan Province, Wulingyuan City","Jiangxi Province, Enshi Province, Hubei County",
			"Xuanen Province, province, Shandong County, Linyi City, Pingyi Province", 
			"Jiangxi Province, Jiujiang City, Ruichang Province, Chenzhou City", 
			"Hunan Province, Yongxing City", "Gansu Province Zhangye City Minle county", 
			"Shaanxi Shangluo City province Shanyang County Y266", "Jiangsu province Zhenjiang Jurong City", 
			"Anhui Province Suzhou Yongqiao district", "Fujian Province, Sanming city county", 
			"Guangxi Zhuang Autonomous Region Liuzhou Rongshui Miao Autonomous County",
			"Guangdong Province Shaoguan Ruyuan Yao Autonomous County", "Gansu Province Longnan City, Hui County", 
			"Inner Mongolia Autonomous Region, Erdos Wushenqi", 
			"Sichuan Province Liangshan Yi Autonomous, Mianning County"," Sichuan Province Mianyang, Pingwu County",
			"Hunan Zhuzhou City Youxian G72 (Quan Nan Expressway)", "Xuancheng City, Anhui Province Jing County X073 and the Ningxia Hui Autonomous Region Zhongwei Zhongning county", 
			"Fujian Province Quanzhou Dehua", "Ningxia Hui Autonomous Region Zhongwei Shapotou District",
			"Shanxi, Jinzhong City, Xiyang County s317", "Inner Mongolia Autonomous Region Alxa Left Banner, Alxa League,", 
			"Guizhou Province Qiannan Buyei and Miao Autonomous Prefecture Luodian County", "Hunan Province Shaoyang City longhui County S219", 
			"Chongqing Municipality Pengshui Miao and Tujia Autonomous County",
			"Hunan Province city of Zhangjiajie Sangzhi County", "Guizhou Province Bijie City Zhijin County", "Yunnan Province Kunming XUNDIAN Hui and Yi Autonomous County G213", "Jiangxi Ji'an Yongfeng county", 
			"Neiqiu County, Xingtai City, Hebei Province Sheng Li Dong Lu, Hubei Xianning Jiayu County",
			"Gansu Province, Tianshui City Gangu County", "Shaanxi Province, Yongshou County, Xianyang City Yu Xu Lu",
			"Jinkouhe District, Leshan City, Sichuan Province "," Henan Province Zhoukou Fugou county ", 
			"Hunan Province Huaihua Yuanling County", "Hunan Province Yiyang Taojiang County",
			"Wuxi City, Jiangsu Province, Yixing City S342 (Qingyuan Avenue)", "Shandong Province Jinan City District", 
			"Fujian Province Nanping Shaowu City", "Jiangsu Province Taizhou Taixing plant road", 
			"Guangxi Zhuang Autonomous Region Guilin Gongcheng Yao Autonomous County",
			"Inner Mongolia Autonomous Region Alxa Left Banner, Alxa League", "Shanxi, Linfen City, Huozhou city", 
			"Shanxi Province Jinzhong Zuoquan county", "Jiangsu Province, Liyang City, Changzhou City G25 (long deep highway)", 
			"Hubei Enshi Tujia and Miao Autonomous Prefecture in Hefeng County",
			"Shandong Province Jinan Pingyin County, Liangshan Yi Autonomous Prefecture, Sichuan Province will county", 
			"Hunan Province Loudi Xinhua County", "Chongqing Jiulongpo District Yun Xin Lu, Fujian Province Putian Hanjiang District of Thailand (river line)", 
			"Shaanxi Province Hanzhong Yangxian G108", "Yunnan Province Lijiang Ninglang Yi Autonomous County, Liupanshui City, Guizhou Province, Liuzhi special zone", 
			"Hubei Province, Shiyan City Yunxi County s338", "Aba Tibetan and Qiang Autonomous Prefecture in Sichuan Province Jiuzhaigou County", 
			"Inner Mongolia Autonomous Region Alxa Left Banner, Alxa League", "Handan City, Hebei Province Shexian", 
			"Jiangxi Jiujiang Duchang County", "Gansu Province Pingliang Zhuanglang County", "Hubei Province Suizhou Guangshui Hongshi Avenue ",
			"Sichuan Province, Leshan Qianwei county and street ","Lianyungang City, Jiangsu Province, Donghai County Y736 (real rigging)",
			"Yinchuan City, Ningxia Hui Autonomous Region Helan County East Sunshine Avenue", "Shanxi Province, Luliang City Fangshan County",
			"Wuxi County, Chongqing City", "Chongqing Municipal Youyang Tujia and Miao Autonomous County" ,"Hunan Province, Chenzhou City Guidong County X003 ",
			" Fujian Province Nanping City, Jianyang City, X817", "Qinghai Province Huangnan Tibetan Autonomous Prefecture Zeku County", 
			"Chongqing Shizhu Tujia Autonomous County", "Wuzhong City of Ningxia Hui Autonomous Region red temple fort area G2012 (Wu highway)", 
			"Sichuan Province Neijiang City Dongxing District", "Dangyang city, Yichang City in Hubei Province", "Shanxi Province, Luliang City Xingxian",
			"Guizhou Qianxinan Buyei and Miao Autonomous Prefecture in Anlong county Y547", "Gansu Province Wuwei City in Minqin County", 
			"Guangxi Zhuang Autonomous Region Liuzhou Rongshui Miao Autonomous County", "Shaanxi Province, Yulin Shenmu county ",
			"Sichuan Province Ziyang City Yanjiang District", "Hunan Province Loudi Lengshuijiang City S312", 
			"Ningxia Hui Autonomous Region Zhongwei Haiyuan county", "Jiangxi Province Ganzhou Ruijin City", 
			"Gansu Province Qingyang City Huachi County", "Guangxi Zhuang Autonomous Region, Liuzhou City, Rong'an County,", 
			"Hezhou City, Guangxi Zhuang Autonomous Region, Zhongshan County, X707","Guangdong Heyuan city peaceful county", 
			"Henan Province Shangqiu City Yongcheng city", "Sichuan province city Xuanhan county", 
			"Shaanxi Province, Weinan City of Pucheng County", "Sichuan Province Yaan City Baoxing County", 
			"Guangxi Zhuang Autonomous Region, Yongfu County, Guilin City, ","Gansu Province Longnan Lixian",
			"Sichuan Gongxian County, Yibin City", "Shaanxi Province Xianyang City Qianxian county", "Gansu Province Wuwei Minqin County",
			"Anhui Province, Fanchang County, Wuhu City"," Shanxi Province Changzhi Qinyuan county ",
			"Chongqing Municipal Youyang Tujia and Miao Autonomous County", "Guangdong Province, Meizhou City, Xingning City",
			"Zhongshan County, Hezhou City, Guangxi Zhuang Autonomous Region", "Qinghai province Hainan Tibetan Autonomous Prefecture in guide County",
			"Hebei Province Hengshui Zaoqiang County", "Henan Province, Luoyang City, Luoning County", "Shanxi Province, Luliang City Lanxian county", 
			"Hebei Province Shijiazhuang City Jingxing Jing Yuan Road", "Guizhou Qianxinan Buyei and Miao Autonomous Prefecture Qinglong County G320", 
			"Shaanxi Province, Yulin Yuyang District", "Yunnan Province Qujing Fuyuan County", "Gansu Province Baiyin Huining county ",
			"Guangxi Zhuang Autonomous Region Guilin, Longsheng Various Nationalities Autonomous County G321",
			"Shanxi Province, Linfen City Hongdong county ", "Shandong Province Linyi City Pingyi County, Jiangxi Province, Fuzhou City Nanfeng County", 
			"Guizhou Province Qiannan Buyei and Miao Autonomous Prefecture Guiding County", "Hunan Province Loudi City Lianyuan City", 
			"Hubei Province Huanggang Xishui county", "Hunan Province, Changsha City, Liuyang City",
			"Hubei Enshi Tujia and Miao Autonomous Prefecture in Hefeng County s325", "Fujian Province Ningde Pingnan County ",
			" Sichuan Province Aba Tibetan and Qiang Autonomous Prefecture Ruoergai County ",
			"Guizhou Province Tongren City Yinjiang Tujia and Miao Autonomous County S304 ", "Changsha City, Hunan Province, Changsha County",
			"Hubei Province Jingzhou city sanded urban district of G318", "Putian City, Fujian Province, Xianyou County", 
			"Yunnan, Dali Bai Autonomous Prefecture Nanjian Yi Autonomous County Citizens Lu", " Gansu Province Wuwei City Gulang county ",
			" Sichuan Province Liangshan Yi Autonomous Muli Tibetan Autonomous County","Shandong city of Weifang province Changyi city Wei Xia"
	};
	
	private static String[] sRoads = {
			"Chongqing building", "Heilongjiang Road", "Mei ten Temple Street", "Zunyi Road", "Xiangtan Street", "Ruijin Plaza", "mountains Street", 
			"Mountains Road", "Xian Shanxi building", "Baisha road", "Zhao Red Square, airport road", "civil Aviation Street", 
			"Chang Cheng Nan Lu", "Liuting overpass", "Hongqiao square", "the building of the Great Wall", "Li Yang Lu","Feng Gang Jie", 
			"Nakagawa road","White Tower Square", "Xing Yang Lu","Wen Yang Jie", "Xiu Cheng Lu","river city building ","Jincheng square ",
			"Chong Yang Jie", "Hua Cheng Lu","Kang Cheng Jie", "Zhengyang Road and Yang square City Road ", "The Jiangcheng building",
			"Shun Cheng Lu city street town square "," Spring City Street "," China Town Road "," Thai city street "," De Yang Lu", 
			"Ming Yang building", "Chun Yang Lu"," Sunny Street ","autumn Yang Lu", "Shuo Yang Jie", "green Weigao speed", "Ruiyang Street", 
			"Feng Hai Lu dual building ","Cherish Fu Zhen Jie Dao", "Xia Zhuang Jie Dao", "Temple Industrial Park", "Zhongshan Street", 
			"Taiping Road", "Guangxi Street", "Wei County Square", "Boshan building", "Hunan Road", "Jining Jie, Zhifu road", "easy to state square", 
			"Heze Second Street "," Heze road "," Heze three building "," Obama second square ","Heze Si Lu",
			"Guangxi Branch Street", "Guanhai road", "Jining Branch Street", "Ju Lu, Pingdu square", "Ming Shui Lu, Mengyin building", 
			"Qingdao Road", "Hu Bei Jie", "Jiangning square", "Tancheng Street", "Tianjin Road", "Baoding Street", "Anhui Road", "Hebei building", 
			"Huangdao road", "Beijing street", "Xin Xian Lu","Jinan Street ","Ningyang square"," Sunshine Street "," de Xian Lu, Xintai building ",
			" Heze road "," Shanxi square ", "Yishui road", "Feicheng Street", "Lan Shan Lu", "Square Street", "plain square", "Surabaya building", 
			"Zhejiang Lu, Qufu Street", "Shou Kang Lu", "Henan Plaza", "Tai An Lu","Dagu Street ","Red gorge branch ","Xiling Gorge a building ",
			"Tai Xi Wei Yi square ","Tai Xi Wei Si Jie","Taiwan Xi Wei Er Lu", "Xiling Gorge Er Jie","Xiling Gorge three road ",
			" Tai Xi Wei three square ","Tai Xi Wei Wu Lu", "the moon gorge building", "bronze col", "Tai Xi Er Jie", "Guanyin gorge square", 
			"Qutang Street", "Tuan Dao Er Lu","Tuandao Street ","Xi Tai San Lu","Tai Xi Yi Building", "Yuncheng road", "Tuandao Street", "Liujiaxia road", 
			"Tibet 2 street", "Tibet a square", "Tai Xi Si Street", "Sanmenxia road", "Takeshi supporting the building", "red gorge road",
			"Yuncheng North Square", "dragon sheep gorge road", "Xiling Gorge Street", "Tai Xi Wu Lu","Tuan Dao Si Jie "," Shi Cun square ",
			" Wu Gorge building "," Sichuan Road "," Shou Zhang Jie, Jiaxiang road "," village square ","Fan Xian Lu", 
			"Xikang Street", "Yunnan Road", "Juye building", "Xijiang square", "Yutai Street", "Shan County Road and Dingtao Street", "Tengxian road", 
			"huge wild square", "Guan Cheng Lu", "Wenshang mansion","Chao Cheng Lu", "Zi Yang Jie","Zouxian square ","Pu Xian Jie", 
			"magnetic hill", "Wen Shui Jie","Tibet Road "," the city of Wuhan University Xiamen "," Tuan Dao Lu", "Nanyang Street", "Guangzhou road", 
			"Dong Ping Jie", "Zaozhuang square", "Guizhou Street", "Fei County Road", "South Building", "Deng Zhou Lu, Wendeng square", 
			"signal hill branch and Yan'an Street", "Signal Hill Road", "Xing Zhi Jie", "Fukuyama branch square", "Hongdao supporting the building", 
			"Laiwu Road", "Wuxian Street", "Jin Kou San Lu","Jinkou square", "Fulong mountain", "Yushan Branch Street", "elephant road", 
			"Wuxian second building", "Laiwu a square", "Jin Kou Er Jie, Haiyang Road", "Longkou Street", "Heng Shan Lu, Yushan square", 
			"Yexian Lu","Fukuyama mansion "," Hongdao Road "," Changzhou Street "," University square "," Longhua Street ",
			"Qihe Road, Laiyang Street "," Huangxian Lu, Zhangdian building "," Zuo Shan Lu, Suzhou Street "," Huashan Road and Fulong Street ",
			" Jiangsu square "," Longjiang Street ","Wang Cun Lu", "Piano Island Building", "Qi Dong Lu","Jingshan square","Long Shan Lu, Muping Street ",
			"Yan San Lu, Yanji Street ","Nanjing Square", "Dong Haidong building and Yinchuan West Road", "Hai Kou Jie", "Shandong Road", "Shaoxing square", 
			"Chi Chuen and the East China Sea Street and Ningxia", "Hong Kong West Building", "Lund square", "Yangzhou Jie, Yunyang road", "Tai Ping Jiao Yi Jie",
			"Ningguo branch", "Taiping Cape second square", "Tian Tai Dong Yi Lu","Taiping Cape three building "," Zhangzhou Road, a road ",
			"Zhangzhou Street Second Street "," Ningguo a square ","Tai Ping Jiao Liu Jie", "Tai Ping Jiao Si Lu","Tian Tai Dong Er Jie", 
			"Tai Ping Jiao Wu Lu, Ningguo three building", "Macau road", "Jiangxi Branch Street", "Macao Road", "Ningguo four street", "Da Yao a square", 
			"Xianyang Zhi Jie, Hongze Lake Road", "Wu Xing Er building", "Chenghai San Lu","The rooftop square ","Xin Zhan Er Lu", "Sanming Bei Jie", 
			"new Cham branch", "the Cham Shan Wu Jie", "Taizhou three square", "Zhanshan four building", "Minjiang road", "Macau Street",
			"The South China Sea Branch and Wu Xingsan square", "Sanming Road", "the Cham Shan Er Jie","Erqing new village","Jiangnan Building ",
			"Wu Xingyi square "," Zhuhai Second Street "," Jiayuguan road "," Gaoyou Lake Street ","The Cham Shan San Lu", 
			"Macau's six square", "Taizhou road", "The East China Sea a building ","Tian Tai Er Lu", "Weishan Lake Street", "Dongting Lake Square", 
			"Zhuhai Zhi Jie"," Fu Zhou Nan Lu", "Chenghai Second Street "," Taizhou Si Lu", "Hong Kong Building", "Macao five road", "Xin Zhan San Jie", 
			"Macao", "Zhengyangguan Street", "Ningwu Guan square", "Minjiang four street", "Xin Zhan way, Ningguo mansion",
			"Wang Maidao", "Macau seven square", "Taizhou way","Taizhou Liu Jie, Yao Da Er Lu, Qingda a street "," Minjiang the second square ",
			" Minjiang River Building "," Pingtung branch and tanzan Street ","East Road "," Xu Jia Maidao Fort square",
			"Da Yao San Lu", "Xiao Wang Zhi Jie", "Show Zhan Lu, happy in the three building", "Macau square", "Taizhou Wu Jie, Chenghai way", 
			"Macau Ba Jie","Fuzhou Road "," Zhuhai, a square, Ningguo road "," Linhuaiguan building "," yanerdao road "," Zijingguan Street ", 
			"the wusheng square "," Happy Street "," show Zhan Si Lu", "Juyong Guan Jie","Shanhaiguan Road, Poyang Lake mansion", "Xin Zhan Lu",
			"Zhangzhou street, Xianyou way", "Hualien street","Yueqing square", "Chaohu Lake Street", "Tai Nan Lu, Wuxing building",
			"Xin Tian Lu, Fuqing square", "Chenghai Road, Putian Street", "swim the sea road"," Jiang Jie", "Shidao square",
			"Yixing building", "Sanming Road", "Yang Kou Jie, Pei Lu, Zhangpu square, barley island", "Taiwan Street", "Tian Tai Lu, Jinhu building",
			"Kaohsiung square", "Hai Jiang Jie, Yueyang Road ", "Shanhua Jie, Rongcheng road", "Macau square", "Wuchang Lu"," Minjiang building",
			" Taipei Road ", "Longyan Street", "Xianyang square", "Ningde Street "," Long Quan Lu, Lishui Street ",
			" Hai Chuan Lu", "Changhua tower", "Jin Tian Lu", "Taizhou Street", "of Taihu Lake Road", "Jiangxi Street", "famous square", 
			"Qing Da Jie, the Golden Gate Road, Nantong building ","Jingde road "," Huiquan square, Ningguo Road",
			"Quanzhou Street", "such as road", "Fenghua Street", "Que Shan Plaza", "Lotus island building", "Huayan road", "Yi Jie, Gutian road", 
			"Nanping square", "Su Zhan Lu, Changting Street", "Zhan Shan Lu","Xuzhou building "," Feng County Square ", "Shantou Jie, Hsinchu road",
			"Yellow street", "anqing road", "Keelung square Shaoguan Lu, Yunxiao building "," Xin An Lu, Xianju Street "," Pingtung square ", 
			"Xiao Wang Jie, Haimen road "," Zhuhai Street "," Shanghang Lu, Yongjia building "," Zhangping road "," Yancheng Street ",
			" Xin Pu Lu, Xinchang Street"
	};
	
	public static int getRandomNumber() {
		return 100 + (int)(Math.random()*100);
	}
	
	public static String createRandomSamplePostal() {
		int index = (int)(Math.random() * sPostalPrefix.length);
		String postal = sPostalPrefix[index];
		
		index = (int)(Math.random() *sRoads.length+1);
		
		postal += "," + sRoads[index];
		return postal + ",No."+ getRandomNumber();
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
