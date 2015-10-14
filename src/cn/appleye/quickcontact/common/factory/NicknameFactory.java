package cn.appleye.quickcontact.common.factory;

public class NicknameFactory implements IFactory{
	private static final String[] sNickNames = {
			"☂ .·　Alone°","Breeze ☂","Liar@","Memory〆","ONLY____","╬═☆","autumn*",
			"stay with me","ˉAmor","Party Queen","Almost lover","GG Bond @ ","- Emotiona°",
			"Dream℡","Finer Feelings ","☆→Coquettish★べ","Forever","Sunshine","Excuses°∝","feat mellwo",
			"You are my eyes","ぴIn my heart","Ord1nAry°","Heart-broken°","hcs/u3","orvR╰","Madmaner",
			"Cold Xinxian / Sen√","╭Be happy°〆","tempt▲","Car thief handsome manら","﹏Smile、℡","Love special signs","Love youゞ",
			"Just want to be a good man°","What Z's Dao iota ETA iota)","A person wandering＆",
			"Feng said media","Enchanting, little man","Social youth @","Pink jacket","Cheap PI @","The ring's period","Please call the Russian D AI Chi",
			"￤Ｍ∪sｉC﹖","Addictive", "Гemeｍbeｒ。","disk_ck","Silence。丶","Amour╮","Navelwort","Pretty boy","autumn*",
			"Cute°Ω","somnus °","Qamari","Qori★anka","The one*","「better me","⌒Forevil","じPretty、","ヾsuperman",
			"Jonny ¤、","Endless love▽"};
	
	public static String createRandomNickName() {
		String nickName = "Hello kitty";
		
		int index = (int)(Math.random()*sNickNames.length);
		
		nickName = sNickNames[index];
		
		return nickName;
	}

	@Override
	public String createFirstRandomData() {
		return createRandomNickName();
	}

	@Override
	public String[] createFirstRandomData(int count, boolean repeatAllowed) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createSecondRandomData() {
		// TODO Auto-generated method stub
		return null;
	}
}
