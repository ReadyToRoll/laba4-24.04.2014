package laba4;

class Welcome implements Replica {
	int index = 1;
	int type;
	String blop;

	Welcome(int index, int type, int rand) {
		blop = text[index][type][rand];
		this.type = type + 1;
	}

	public void say() {
		switch (type) {
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(blop + "(сияя)");
			break;
		case 2:
			System.out.println(blop + "(грустно)");
			break;
		case 3:
			System.out.println(blop + "(с улыбкой)");
			break;
		case 4:
			System.out.println(blop + "(со злостью)");
			break;
		}
	}
}

class Phrase implements Replica {
	int index = 2;
	int type;
	String blop;

	Phrase(int index, int type, int rand) {
		blop = text[index][type][rand];
		this.type = type + 1;
	}

	public void say() {
		switch (type) {
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(blop + "(сияя)");
			break;
		case 2:
			System.out.println(blop + "(грустно)");
			break;
		case 3:
			System.out.println(blop + "(с улыбкой)");
			break;
		case 4:
			System.out.println(blop + "(со злостью)");
			break;
		}
	}
}

class Question implements Replica {
	int index = 3;
	int type;
	String blop;

	Question(int index, int type, int rand) {
		blop = text[index][type][rand];
		this.type = type + 1;
	}

	public void say() {
		switch (type) {
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(blop + "(сияя)");
			break;
		case 2:
			System.out.println(blop + "(грустно)");
			break;
		case 3:
			System.out.println(blop + "(с улыбкой)");
			break;
		case 4:
			System.out.println(blop + "(со злостью)");
			break;
		}
	}

}

class Answer implements Replica {
	int index = 4;
	int type;
	String blop;

	Answer(int index, int type, int rand) {
		blop = text[index][type][rand];
		this.type = type + 1;
	}

	public void say() {
		switch (type) {
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(blop + "(сияя)");
			break;
		case 2:
			System.out.println(blop + "(грустно)");
			break;
		case 3:
			System.out.println(blop + "(с улыбкой)");
			break;
		case 4:
			System.out.println(blop + "(со злостью)");
			break;
		}
	}
}

class Finale implements Replica {
	int index = 5;
	int type;
	String blop;

	Finale(int index, int type, int rand) {
		blop = text[index][type][rand];
		this.type = type + 1;
	}

	public void say() {
		switch (type) {
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(blop + "(сияя)");
			break;
		case 2:
			System.out.println(blop + "(грустно)");
			break;
		case 3:
			System.out.println(blop + "(с улыбкой)");
			break;
		case 4:
			System.out.println(blop + "(со злостью)");
			break;
		}
	}
}

public interface Replica {
	final static String happy_welcome[] = { " - Приветик! ",
			" - Привет, солнце! ", " - Как я рад тебя видеть! ", " - Аллоха! " };
	final static String sad_welcome[] = { " - привет...", " - Здрастье..",
			" - Хай..", " - Дарова.." };
	final static String kind_welcome[] = {
			" - Какооой сегодня дееень..я вижу вновь теебяяя... Здравствуйте, мы начинаем)",
			" - Привет-привет!", " - Здароооовааа! ", " - Бобра тебе!" };
	final static String anger_welcome[] = { " - Ну неужели ты пришел!",
			" - Откуда ты взялся, черт возьми", " - Опять ты тут..!",
			" - Никуда от вас не деться.." };

	final static String happy_phrase[] = { " - А  у нас в квартире газ!)",
			" - Оооооберниииись, ты красивее со спины) ",
			" - Щаас скажу!... ой, не скажу - забыл ",
			" - А у меня дочка родилась!!" };
	final static String sad_phrase[] = {
			" - Поверь мне, не в пирогах счастье",
			" - О, я самый больной в мире человек",
			" - Женщины.. она такие женщины",
			" - Как безумен этот мир.. на земле столько красивого, а мы тратим кучу времени на то чтоб виртуальный мир был как можно более реалистичным" };
	final static String kind_phrase[] = {
			" - Я тучка, тучка, тучка, я вовсе не медведь",
			" - С ума поодиночке не сходят. Это только гриппом все вместе болеют)",
			" - Поздравляю тебя, Шарик! ты балбес!)",
			" - Я мужчина хоть куда! в полном расцвете сил" };
	final static String anger_phrase[] = { "- Как же ты меня уже задрал",
			"- Сил нет больше тебя терпеть!",
			"- Давай говори что надо и проваливай",
			"- Нет у меня времени на твои глупости" };

	final static String happy_question[] = {
			" - Я получил сегодня з/п! подешь со мной отмечать?)",
			" - Я сегодня выступаю в школе, будешь вторым клоуном?) ",
			"А ты сегодня бухал?) ", "Гаити! а вы были на Гаити?" };
	final static String sad_question[] = {
			" - Есть что поесть..? кууушат ахота..",
			" - А давай бояться вместе,а?",
			" - Малыш, ведь я же лучше? ..лучше собаки?а?",
			" - Или может обратиться к врачу?" };
	final static String kind_question[] = { " - Говорят, вас счатья привало?",
			"это что, сказка такая?",
			" - Там еще осталось немножечко варенья?",
			" - Чебурашка, Чебурашка, где ты?.." };
	final static String anger_question[] = {
			" - Тебе еще не надоело чушь нести?", " - Может хватит уже?",
			" - Совсем придурок? ", " - А не пойти бы тебе..? сам знаешь куда." };

	final static String happy_answer[] = { "- Отличная идея!)", "- Let's go ",
			"- Ты черотвски прав! ", " - Лучше и придумать невозможно) " };
	final static String sad_answer[] = { "- Ну может не сегодня...",
			"- вряд ли.., я не лежал еще сегодня на диване",
			"- ну... когда-нибудь ", "- ты уверен что это неоходимо? " };
	final static String kind_answer[] = {
			"- я помогу тебе, друг!",
			"- быть или не быть..? пожалуй быть! ",
			"- ну как же без меня в таком деле? я с тобой) ",
			"- я обещал своей черепашке, что больше не буду с тобой общаться.. и то что она умерла ВСЕГО ЛИШЬ 5 лет назад должно меня остановить.. но я не брошу тебя, товарищщ" };
	final static String anger_answer[] = {
			"- Я тебя конечно удивлю.. но не пошел бы ты с такими вопросами!",
			"- Что за тупые вопросы?", "- Пошел ты, ублюдок",
			"- Да ты ли не охренел мне такое предлагать?" };

	final static String happy_final[] = {
			" - Обнимааашки!!!",
			" - А  пошли на карусели! ",
			" - А теперь! все танцуют босиком на песке..)) тыц-тыц-тыц ",
			" - А сейчас песня!!  Ага, а мы гуляем, мы крутые,Ага, а мы хорошие, не злые, Ага, когда проснёмся - будет вечер, Будут выходные" };
	final static String sad_final[] = { " - Я хочу остаться один",
			" - А в чем он, смысл жизни..?",
			" - Дождь, сегодня будет дождь? Я хочу спрятать свои слезы",
			" - А птичку-то жалко..." };
	final static String kind_final[] = {
			" - До скорого, братюнь, мне пора идти",
			" - А... может сегодня ко мне..?;)  ", " - Дай я тебя поцелую!!! ",
			" - Добра, Бобра тебе, человек" };
	final static String anger_final[] = { " - Да я тебя сейчас ушатаю!",
			" - Шоп ты сдох!", " - Гореть тебе в аду, придурок",
			" - А ну иди сюда, козел!" };
	String[][][] text = {
			{ happy_welcome, sad_welcome, kind_welcome, anger_welcome },
			{ happy_phrase, sad_phrase, kind_phrase, anger_phrase },
			{ happy_question, sad_question, kind_question, anger_question },
			{ happy_answer, sad_answer, kind_answer, anger_answer },
			{ happy_final, sad_final, kind_final, anger_final } };

	void say();
}
