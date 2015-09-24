package cn.appleye.quickcontact.common.factory;

public class OrganizationFactory implements IFactory{
	public static String[] sSample = {
			"Baidu", "Google", "Alibaba", "Tencent", "Yahoo", "Apple", "VIVO", "OPPO", "Xiaomi",
			"中国工商银行/ICBC","中国建设银行/China Construction Bank","中国农业银行/Agricultural Bank of China",
			"中国银行/Bank of China","伯克希尔哈撒韦/Berkshire Hathaway","摩根大通/JPMorgan Chase","埃克森美孚/Exxon Mobil",
			"中国石油/PetroChina","通用电气/General Electric","富国银行/Wells Fargo","丰田汽车/Toyota Motor","苹果/Apple","荷兰皇家壳牌集团/Royal Dutch Shell",
			"大众集团/Volkswagen Group","汇丰控股/HSBC Holdings","雪佛龙/Chevron","沃尔玛/Wal-Mart Stores","三星电子/Samsung Electronics",
			"花旗银行/Citigroup","中国移动/China Mobile","安联保险/Allianz","威瑞森通信/Verizon Communications","美国银行/Bank of America",
			"中国石化/Sinopec","微软/Microsoft","戴姆勒公司/Daimler","美国电报电话公司/AT&T","俄罗斯天然气公司/Gazprom","安盛集团/AXA Group",
			"雀巢公司/Nestle","桑坦德银行/Banco Santander","平安保险集团/Ping An Insurance Group","三菱日联金融集团/Mitsubishi UFJ Financial",
			"强生/Johnson & Johnson","道达尔/Total","宝洁/Procter & Gamble","中国人寿/China Life Insurance","中国交通银行/Bank of Communications","谷歌/Google",
			"沃达丰/Vodafone","英国石油/BP","美国国际集团/American International Group","伊塔乌联合银行控股公司/Itaú Unibanco Holding","国际商用机器公司/IBM",
			"宝马集团/BMW Group","康卡斯特/Comcast","联邦银行/Commonwealth Bank","辉瑞制药/Pfizer","高盛集团/Goldman Sachs Group","必和必拓/BHP Billiton",
			"美国大都会人寿保险/MetLife","诺华/Novartis","加拿大皇家银行/Royal Bank of Canada","西门子/Siemens","中国招商银行/China Merchants Bank","保诚集团/Prudential",
			"百威英博/Anheuser-Busch InBev","日本电报电话公司/Nippon Telegraph & Tel","俄罗斯石油公司/Rosneft","西太平洋银行集团/Westpac Banking Group","布拉德斯科银行/Banco Bradesco",
			"软银集团/Softbank","本田汽车/Honda Motor","通用汽车/General Motors","联合健康集团/UnitedHealth Group","多伦多道明银行集团/TD Bank Group","英特尔/Intel",
			"法国电力公司/EDF","福特汽车/Ford Motor","德国电信/Deutsche Telekom","巴斯夫/BASF","波音公司/Boeing","兴业银行/Industrial Bank","瑞银集团/UBS","澳新银行/ANZ",
			"思科系统/Cisco Systems","三井住友金融集团/Sumitomo Mitsui Financial","苏黎世保险集团/Zurich Insurance Group","民生银行/China Minsheng Banking",
			"默克公司/Merck & Co","罗氏控股/Roche Holding","中信泰富/Citic Pacific","澳大利亚国民银行/National Australia Bank","浦发银行/Shanghai Pudong Development",
			"迪士尼/Walt Disney","希维斯保健标志/CVS Caremark","西班牙电信集团/Telefónica","甲骨文/Oracle","康菲石油公司/ConocoPhillips","赛诺菲/Sanofi",
			"联合技术公司/United Technologies","荷兰国际集团/ING Group","可口可乐/Coca-Cola","中信银行/China Citic Bank","摩根士丹利/Morgan Stanley",
			"惠普/Hewlett-Packard","日产汽车/Nissan Motor","法国燃气苏伊士集团/GDF SUEZ","百事可乐/PepsiCo","劳埃德银行集团/Lloyds Banking Group",
			"慕尼黑再保险/Munich Re","法国兴业银行/Société Générale","中海油/CNOOC","挪威国家石油公司/Statoil","美国运通/American Express","力拓/Rio Tinto",
			"丰业银行/Bank of Nova Scotia","拜耳/Bayer","卢克石油/LukOil","嘉能可国际/Glencore International","法国农业信贷银行/Credit Agricole","中国建筑/China State Construction Engineering",
			"联合利华/Unilever","德意志银行/Deutsche Bank","西班牙毕尔巴鄂比斯开银行/BBVA-Banco Bilbao Vizcaya","沙特基础工业公司/Saudi Basic Industries","沙特阿拉伯",
			"现代汽车/Hyundai Motor","和记黄埔/Hutchison Whampoa","瑞穗金融集团/Mizuho Financial","欧洲宇航防务集团/EADS","埃尼集团/Eni","鸿海精密/Hon Hai Precision",
			"斯伦贝谢/Schlumberger","西伯利亚银行/Sberbank","墨西哥美洲电信公司/América Móvil","美国合众银行/US Bancorp","中国神华/China Shenhua Energy","宏利金融集团/Manulife Financial",
			"忠利集团/Generali Group","上汽集团/SAIC Motor","三菱集团/Mitsubishi Corp","北欧联合银行/Nordea Bank","巴西银行/Banco do Brasil","家得宝/Home Depot","葛兰素史克/GlaxoSmithKline",
			"友邦保险集团/AIA Group","卡特彼勒/Caterpillar","意大利联合信贷集团/UniCredit Group","瑞士信贷集团/Credit Suisse Group","陶氏化学/Dow Chemical","第一金融/Capital One Financial",
			"意大利联合圣保罗银行/Intesa Sanpaolo","信实工业/Reliance Industries","中国电信/China Telecom","中国光大银行/China Everbright Bank","瑞士再保险/Swiss Re",
			"菲利普斯/Phillips 日立/Hitachi","穆勒-马士基集团/M?ller-Maersk","二十一世纪福克斯公司/Twenty-First Century Fox, Inc.","伊维尔德罗拉/Iberdrola","印度国家银行/State Bank of India",
			"渣打银行/Standard Chartered","蒙特利尔银行/Bank of Montreal","中国交通建设/China Communications Construction","高通/Qualcomm","保德信金融集团/Prudential Financial",
			"台积电/Taiwan Semiconductor","霍尼韦尔国际/Honeywell International","中国中铁股份有限公司/China Railway Group","安进/Amgen","英杰华集团/Aviva",
			"ES药品福利管理/Express Scripts","时代华纳/Time Warner","万喜/VINCI","沃尔格林博姿联合公司/Walgreens Boots Alliance","安森/Anthem","联合太平洋/Union Pacific",
			"中国铁建/China Railway Construction","PNC金融服务集团/PNC Financial Services","韩国电力/Korea Electric Power","麦克森公司/McKesson",
			"中国太平洋保险/China Pacific Insurance","杜邦/EI du Pont de Nemours","法通保险/Legal & General Group","KDDI株式会社/KDDI","英国国家电网/National Grid",
			"欧莱雅集团/L'Oréal Group","旅行者保险/Travelers Cos","迪奥/Christian Dior","东京海上控股/Tokio Marine Holdings","瓦莱罗能源公司/Valero Energy","印度油气/Oil & Natural Gas",
			"三井物产/Mitsui & Co","中国联通/China Unicom","菲利浦·莫里斯国际公司/Philip Morris International","联合包裹/United Parcel Service","亿滋国际/Mondelēz International",
			"森科能源公司/Suncor Energy","SAP公司/SAP","杜克能源/Duke Energy","吉利德科学/Gilead Sciences","雷诺/Renault","好事达/Allstate","德国邮政集团/Deutsche Post",
			"洛克希德马丁/Lockheed Martin","Orange公司/Orange","哥伦比亚国家石油公司/Ecopetrol","哥伦比亚","英美烟草公司/British American Tobacco","好市多/Costco Wholesale",
			"ABB集团/ABB","纽约梅隆银行/Bank of New York Mellon","安泰人寿/Aetna","布鲁克菲尔德资产管理公司/Brookfield Asset Management","施耐德电气/Schneider Electric",
			"麦当劳/McDonald's","中国人民保险集团/People's Insurance Company","苏格尼盖石油天然气公司/Surgutneftegas","劳氏/Lowe's Cos","怡和集团/Jardine Matheson","美国家庭生命保险/Aflac",
			"大陆公司/Continental","英国电信/BT Group","日本烟草/Japan Tobacco","ACE保险/ACE","南非米勒酿酒/SABMiller","雷普索尔公司/Repsol YPF","约翰迪尔/John Deere",
			"阿彻丹尼尔斯公司/Archer Daniels Midland","美国航空集团/American Airlines Group","易安信/EMC","贝莱德集团/BlackRock","联邦快递/FedEx","泰国国家石油/PTT PCL",
			"新世代能源/NextEra Energy","信诺/Cigna","梯瓦制药/Teva Pharmaceutical Inds","意大利国家电力公司/Enel","荷兰全球保险集团/Aegon","加拿大帝国商业银行/Canadian Imperial Bank",
			"日本电装/Denso","法国外贸银行集团/Natixis","万达商业/Dalian Wanda Commercial Properties","佳能/Canon","家乐福/Carrefour","奥驰亚集团/Altria Group",
			"I控股/Seven & I Holdings","阿斯利康/AstraZeneca","日本第一生命保险/Dai-ichi Life Insurance","伊藤忠商事/Itochu","莱茵集团/RWE Group","西农集团/Wesfarmers",
			"澳洲电信/Telstra","帝亚吉欧/Diageo","恩桥天然气/Enbridge","新日铁住金/Nippon Steel & Sumitomo Metal","雅培/Abbott Laboratories","美敦力/Medtronic","南方公司/Southern Co",
			"万科集团/China Vanke","东日本铁路/East Japan Railway","通用动力/General Dynamics","哈里伯顿/Halliburton","爱克斯龙/Exelon","时代华纳有线电视/Time Warner Cable",
			"加拿大自然资源公司/Canadian Natural Resources","挪威银行/DNB","帝国烟草公司/Imperial Tobacco Group","比利时联合银行/KBC Group","克罗格公司/Kroger",
			"利安德巴塞尔工业/LyondellBasell Industries","塔塔汽车/Tata Motors","维萨/Visa","礼来/Eli Lilly & Co","野村控股公司/Nomura Holdings","丹纳赫集团/Danaher",
			"星展银行/DBS Group","阿里巴巴/Alibaba","普利司通/Bridgestone","MS&AD保险集团/MS&AD Insurance","意大利电信/Telecom Italia","华夏银行/Huaxia Bank",
			"马拉松石油/Marathon Petroleum","西班牙天然气菲诺莎/Gas Natural Fenosa","爱立信/Ericsson","永明人寿/Sun Life Financial","圣戈班/Saint-Gobain",
			"新韩金融集团/Shinhan Financial Group","Facebook公司/Facebook","北欧斯安银行/SEB","威望迪/Vivendi","费森尤斯集团/Fresenius","印度工业信贷投资银行/ICICI Bank",
			"达能集团/Danone","法国国家寿险/CNP Assurances","金德摩根/Kinder Morgan","美国直播电视集团/Directv","菲亚特克莱斯勒汽车公司/Fiat Chrysler Automobiles","耐克/NIKE",
			"日本中部铁路/Central Japan Railway","EOG能源/EOG Resources","赛默飞世尔科技/Thermo Fisher Scientific","林德/Linde","加拿大贝尔/BCE","新鸿基房地产/Sun Hung Kai Properties",
			"法国液化空气/Air Liquide","现代摩比斯/Hyundai Mobis","百时美施贵宝/Bristol-Myers Squibb","三星人寿保险/Samsung Life Insurance","HCA控股/HCA Holdings",
			"华侨银行/Oversea-Chinese Banking","艾伯维（原名雅培生命）/AbbVie","腾讯控股/Tencent Holdings","三菱电机/Mitsubishi Electric","道富银行/State Street",
			"利洁时集团/Reckitt Benckiser Group","新华人寿保险/New China Life Insurance","北京银行/Bank of Beijing","起亚汽车公司/KIA Motors","美国电力/American Electric",
			"江森自控/Johnson Controls","瑞典商业银行/Svenska Handelsbanken","汉高/Henkel","WPP集团/WPP","雷神/Raytheon","印第纺织/Inditex","伊顿公司/Eaton",
			"富邦金融/Fubon Financial","加拿大鲍尔集团/Power Corp of Canada","瑞典银行/Swedbank","埃森哲/Accenture","BB&T公司/BB&T","国泰金融/Cathay Financial","新加坡电信/SingTel",
			"太平洋煤气电力/PG&E","卡地纳健康集团/Cardinal Health","老年互助保险/Old Mutual","标准银行集团/Standard Bank Group","CaixaBank银行/CaixaBank","戴文能源/Devon Energy",
			"保利地产/Poly Real Estate","爱默生电气/Emerson Electric","三菱重工/Mitsubishi Heavy Industries","阿默普莱斯金融/Ameriprise Financial","诺斯古曼/Northrop Grumman",
			"银瑞达集团/Investor AB","达美航空/Delta Air Lines","伍尔沃斯/Woolworths","道明尼资源/Dominion Resources","美国国民油井华高公司/National Oilwell Varco",
			"贝克休斯石化/Baker Hughes","丘博/Chubb","德国默克/Merck","联合大陆控股公司/United Continental Holdings","佰特国际/Baxter International",
			"诺基亚/Nokia","大华银行/United Overseas Bank","印度石油/Indian Oil","霍尔希姆公司/Holcim","嘉年华/Carnival","房利美/Fannie Mae",
			"华能国际/Huaneng Power International","SK海力士/SK Hynix","美光科技/Micron Technology","武田制药/Takeda Pharmaceutical","东芝/Toshiba",
			"发现金融服务公司/Discover Financial Services","标准人寿保险/Standard Life","孟山都/Monsanto","林肯国民集团/Lincoln National","桑内拉电信/Teliasonera",
			"拉斯维加斯金沙/Las Vegas Sands","西方石油/Occidental Petroleum","加拿大国有铁路公司/Canadian National Railway","南非萨索尔公司/Sasol",
			"KB 金融集团/KB Financial Group","法国巴黎银行/BNP Paribas","丰益国际/Wilmar International","自动化数据处理公司/Automatic Data",
			"马来亚银行/Maybank","哈特福德金融服务/Hartford Financial Services","丹斯克银行/Danske Bank","历峰集团/Richemont","哈门那/Humana",
			"HDFC银行/HDFC Bank","房地美/Freddie Mac","英国航空航天系统/BAE Systems","芬莎/Femsa","喜力控股/Heineken Holding","卡塔尔国民银行/Qatar National Bank",
			"爱迪生国际/Edison International","阿联酋电信/Etisalat","CSX公司/CSX","格力电器/Gree Electric Appliances","挪威电信/Telenor","丸红株式会社/Marubeni",
			"浦项制铁/Posco","EXOR公司/EXOR","麦格理集团/Macquarie Group","葡萄牙电力/EDP-Energias de Portugal","哥伦比亚广播公司/CBS","赫斯/Hess",
			"汤森路透/Thomson Reuters","南非移动/MTN Group","太阳信托银行/SunTrust Banks","第一兰德/FirstRand","诺福克南方公司/Norfolk Southern",
			"赫斯基能源/Husky Energy","PPL公司/PPL","布伊格建设集团/Bouygues","宝钢股份/Baoshan Iron & Steel","曼弗雷保险/Mapfre","巴克莱银行/Barclays",
			"-沙特电信/Saudi Telecom","加拿大运输/TransCanada","通用磨房/General Mills","德纳加国家电力/Tenaga Nasional","威廉姆斯公司/Williams Cos",
			"卡夫食品/Kraft Foods","日本钢铁工程控股/JFE Holdings","梅西百货/Macy's","巴西淡水河谷/Vale","诺和诺德/Novo Nordisk","米其林集团/Michelin Group",
			"巴西石油股份有限公司/Petrobras","-麦格纳国际公司/Magna International","德州仪器/Texas Instruments","英国国际航空公司/International Airlines",
			"丰田工业/Toyota Industries","三井住友信托控股/Sumitomo Mitsui Trust","马拉松原油/Marathon Oil","富士重工/Fuji Heavy Industries",
			"伊利诺伊工具/Illinois Tool Works","维亚康姆/Viacom","英国天空广播公司/British Sky Broadcasting","爱尔兰联合银行/Allied Irish Banks",
			"桑普公司/Sampo","嘉信理财/Charles Schwab","苏格兰皇家银行/Royal Bank of Scotland","-印度国家火电公司/NTPC","中信证券/Citic Securities",
			"三井不动产/Mitsui Fudosan","华润置地/China Resources Land","ACS集团/Grupo ACS","美的集团/Midea Group Co. Ltd.","信安金融集团/Principal Financial Group",
			"CenturyLink公司/CenturyLink","富士胶片控股/Fujifilm Holdings","保乐力加集团/Pernod Ricard","康宁公司/Corning","Voya金融公司/Voya Financial",
			"中国南车/CSR","Talanx集团/Talanx","高露洁棕榄集团/Colgate-Palmolive","金伯利-克拉克/Kimberly-Clark","联想集团/Lenovo Group","安普公司/AMP",
			"土耳其担保银行/Garanti Bank","先正达/Syngenta","凯斯纽荷兰工业集团/CNH Industrial","中国中冶/Metallurgical Corp of China","JBS公司/JBS",
			"小松公司/Komatsu","塞莫拉能源/Sempra Energy","韩国SK电讯/SK Telecom","印尼人民银行/Bank Rakyat Indonesia","亚马逊/Amazon.com","-TJX公司/TJX Cos",
			"星巴克/Starbucks","怡安保险/Aon","英联食品/Associated British Foods","PPG工业/PPG Industries","公共服务企业集团/Public Service Enterprise Group",
			"中国水电/Sinohydro Group","泰科电子/TE Connectivity","雅虎/Yahoo","意昂集团/E.ON","-三菱地产/Mitsubishi Estate","瑞士通讯/Swisscom","欧力士/Orix",
			"飞利浦/Philips","统一爱迪生/Consolidated Edison","沙特电力公司/Saudi Electricity","沙特阿拉伯","中国北车/China CNR","富士通/Fujitsu","索尼/Sony",
			"万事达信用卡/MasterCard","铃木汽车/Suzuki Motor","中国信达资产管理股份有限公司/China Cinda Asset Management","西南航空/Southwest Airlines",
			"切萨皮克能源公司/Chesapeake Energy","普莱克斯/Praxair","印度住房开发金融公司/HDFC","塔塔咨询服务公司/Tata Consultancy Services","帕卡公司/Paccar",
			"国家商业银行National Commercial Bank","T&D控股/T&D Holdings","曼迪利银行/Bank Mandiri","印度煤炭公司/Coal India","金巴斯集团/Compass Group",
			"日本国际石油开发公司/Inpex","前进保险/Progressive","西路控股/CRH","Ko?控股/Ko? Holding","西斯科公司/Sysco","艺康公司/Ecolab","泰森食品/Tyson Foods",
			"恒大地产/Evergrande Real Estate"
	};
	
	public static String[] sSampleJob = {
			"Engineer", "CEO", "CTO", "Manager", "Minister", "Chairman", "Marketing minister", "Strategy minister", "COO", "CFO",
			"CIO", "HRD", "OD", "MD", "OM", "PM", "PG", "GM", "VP", "FVP", "AVP", "Vice-President of Sales", "Senior Customer Manager",
			"Sales Manager", "Regional Sales Manager", "Merchandising Manager", "Sales Assistant", "Wholesale Buyer", "Tele-Interviewer",
			"Real Estate Appraiser", "Marketing Consultant", "Marketing and Sales Director", "Market Research Analyst", "Manufacturer's Representative",
			"Director of Subsidiary Rights", "Regional Customer Manager", "Sales Administrator", "Telemarketing Director", "Systems Engineer",
			"Hardware Engineer", "Applications Programmer", "Information Analyst", "LAN Systems Analyst", "Statistician", "Director of Human Resources",
			"Assistant Personnel Officer", "Import/Export Manager", "Property Manager", "Inventory Control Manager", "Food Service Manager",
			"Production Manager", "Telecommunications Manager", "Assistant Store Manager", "Developmental Engineer", "Telemarketer", "Computer Operator  Product Support Manager",
			"Advertising Manager", "Sales Executive", "MIS Manager", "Project Manager", "Employer Relations Representative", "HMO Product Manager"
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
