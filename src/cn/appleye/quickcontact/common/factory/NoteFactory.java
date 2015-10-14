package cn.appleye.quickcontact.common.factory;

public class NoteFactory implements IFactory{
	public static String[] sSample = {
			"Genius only means hard-working all one's life. (Mendeleyev  Russian chemist)",
			"The man who has made up his mind to win will never say \"impossible \". (Bonaparte Napoleon ,French emperor )",
			"There is no such thing as a great talent without great will - power. (Balzac)",
			"Cease to struggle and you cease to live.（Thomas Carlyle）",
			"A strong man will struggle with the storms of fate.(Thomas Addison)",
			"Living without an aim is like sailing without a compass.（John Ruskin）",
			"Live a noble and honest life. Reviving past times in your old age will help you to enjoy your life again.",
			"Accept what was and what is, and you’ll have more positive energy to pursue what will be.",
			"Behind every successful man there's a lot u unsuccessful years. (Bob Brown)",
			"Enrich your life today,. yesterday is history.tomorrow is mystery.",
			"The secret of success is constancy to purpose.",
			"Between two stools one falls to the ground.",
			"You have to believe in yourself. That's the secret of success. (Charles Chaplin)",
			"Success grows out of struggles to overcome difficulties.",
			"The dictionary is the only place where success comes before work.",
			"There are no shortcuts to any place worth going.",
			"You're uinique, nothing can replace you.",
			"Great works are performed not by strengh, but by perseverance.(Samuel Johnson, British writer and critic)",
			"Until you make peace with who you are, you’ll never be content with what you have.",
			"If you would go up high , then use your own legs ! Do not let yourselves carried aloft; do not seat yourselves on other people's backs and heads .(F.W .Nietzsche , German Philosopher)",
			"Keep trying no matter how hard it seems. it will get easier.",
			"True mastery of any skill takes a lifetime.",
			"The first wealth is health .(Ralph Waldo Emerson , American thinker)",
			"Where there is life, there is hope.",
			"What makes life dreary is the want of motive.(George Eliot)",
			"At twenty years of age , the will reigns; at thirty , the wit ; and at forty , the judgment .(Benjamin Franklin ,American president)",
			"Shallow men believe in luck.Self-trust is the first secret of success.",
			"I have no secret of success but hard work.",
			"If you fail, don't forget to learn your lesson.",
			"I have nothing to offer but blood, boil, tears and sweat. (Winston Churchill, British politician)",
			"Sweat is the lubricant of success.",
			"A contented mind is the greatest blessing a man can enjoy in this world.",
			"That man is the richest whose pleasure are the cheapest.",
			"You make the failure complete when you stop trying.",
			"If winter comes , can spring be far behind ?( P. B. Shelley , British poet )",
			"Will, work and wait are the pyramidal cornerstones for success.",
			"Success often depends upon knowing how long it will take to succeed.",
			"Think great thoughts and you will be great!",
			"Only those who have the patience to do simple things perfectly ever acquire the skill to do difficult things easily.",
			"Gods determine what you're going to be.(Julius Erving)",
			"A man can succeed at almost anything for which he has unlimited enthusiasm.",
			"If you would hit the mark, you must aim a little above it. Every arrow that flies feels the attraction of earth. －Henry Wadsworth Longfellow.",
			"The man who has made up his mind to win will never say “impossible”.",
			"If you have great talents, industry will improve them;if you have but moderate abilities, industry will supply their deficiency.",
			"The only limit to our realization of tomorrow will be our doubts of today.",
			"Don't aim for success if you want it; just do what you love and believe in, and it will come naturally.",
			"One thorn of experience is worth a whole wilderness of warning.",
			"It never will rain roses.When we want to have more roses we must plant trees.",
			"No man or woman is worth your tears, and the one who is, won't make you cry.",
			"Each man is the architect of his own fate.",
			"Great works are performed not by strength , but by perseverance.",
			"Dare and the world always yields.If it beats you sometimes, dare it again and again and it will succumb.",
			"I think success has no rules, but you can learn a lot from failure.(Jean Kerr)",
			"All time is no time when it is past.",
			"Do you love life ? Then do not squander time ; for that's the stuff5 life is made of .(Benjamin Franklin , American president )",
			"Live well, love lots, and laugh often.",
			"Don't give up and don't give in.",
			"To the world you may be one person, but to one person you may be the world.",
			"To choose time is to save time .( Francis Bacon , British philosopher )",
			"Whatever is worth doing is worth doing well.",
			"Do not , for one repulse , give up&nbsp; the purpose that you resolved to effect .(William Shakespeare , British dramatist)",
			"There are no secrets to success. It is the result of preparation, hard work, and learning from failure.",
			"A chain is no stronger than its weakest link.",
			"The best preparation for tomorrow is doing your best today.",
			"Few things are impossible in themselves; and it is often for want of will, rather than of means, that man fails to succeed.(La Rocheforcauld, French writer)",
			"One needs 3 things to be truly happy living in the world: some thing to do, some one to love, some thing to hope for.",
			"Faith will move mountains.",
			"Take control of your own desting.",
			"Adversity is a good discipline.",
			"In the end, it’s not the years in your life that count. It’s the life in your years.",
			"Great oaks from little acorns grow.",
			"A man can fail many times, but he isn't a failure until he begins to blame somebody else.(J. Burroughs)",
			"A friend without faults will never be found.",
			"If you are doing your best,you will not have to worry about failure.",
			"Don't try so hard, the best things come when you least expect them to.",
			"He is wise that knows when he's well enough.",
			"A man is not old as long as he is seeking something. A man is not old until regrets take the place of dreams. (J. Barrymore)",
			"If there were no clouds, we should not enjoy the sun.",
			"Perseverance can sometimes equal genius in its results.",
			"An aim in life is the only fortune worth finding.(Robert Louis Stevenson)",
			"Experience is the mother of wisdom.",
			"If you don't aim high you will never hit high.",
			"However mean your life is, meet it and live it; do not shun it and call it hard names.",
			"It is the first step that costs.",
			"All that you do, do with your might; things done by halves are never done right.",
			"Ideal is the beacon. Without ideal , there is no secure direction ; without direction , there is no life .( Leo Tolstoy , Russian writer)",
			"I succeeded because I willed it; I never hesitated.",
			"Every man is best know to himself.",
			"No matter how bad your heart has been broken, the world doesn’t stop for your grief. The sun comes right back up the next day.",
			"The people who get on in this world are the people who get up and look for circumstances they want, and if they cannot find them, make them.(Bernara Shaw)",
			"Labour is often the father of pleasure.",
			"Never underestimate your power to change yourself!",
			"Every noble work is at first impossible.",
			"Whatever happens, happens for a reason.",
			"Winners do what losers don't want to do.",
			"Happiness is a way station between too much and too little.",
			"Don't part with&nbsp; your illusions . When they are gone you may still exist , but you have ceased to live.(Mark Twain , American writer)",
			"You cannot improve your past, but you can improve your future. Once time is wasted, life is wasted.",
			"Energy and persistence conquer all things.(Benjamin Franklin)",
			"Try not to become a man of success but rather try to become a man of value. ( A. Einstein)"
	};
	
	public static String createRandomNote() {
		int index = (int)(Math.random() * sSample.length);
		String note = sSample[index];
		
		return note;
	}

	@Override
	public String createFirstRandomData() {
		return createRandomNote();
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
