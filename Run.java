package laba4;

import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.util.logging.*;

public class Run {
	private static Logger log = Logger.getLogger(Run.class.getName());
	static public void handle(int stat1, int stat2) throws StatException{ 
		if (stat1>20)
		throw new StatException("" + stat1);
		if (stat2>20)
	    throw new StatException("" + stat2);
		}

	public static int rand_value() {
		Random rand = new Random();
		return rand.nextInt(3);
	}

	public static void hello(Temperament first, Temperament second,
			Replica phrase_first, Replica phrase_second) {
		phrase_first = new Welcome(0, first.analyzing() - 1, rand_value());
		phrase_first.say();
		second.changeStatement(first.analyzing());
		phrase_second = new Welcome(0, second.analyzing() - 1, rand_value());
		phrase_second.say();
		first.changeStatement(second.analyzing());
	}

	public static void question_answer(Temperament first, Temperament second,
			Replica phrase_first, Replica phrase_second) {
		phrase_first = new Question(2, first.analyzing() - 1, rand_value());
		phrase_first.say();
		second.changeStatement(first.analyzing());
		phrase_second = new Answer(3, second.analyzing() - 1, rand_value());
		phrase_second.say();
		first.changeStatement(second.analyzing());
	}

	public static void phrase(Temperament first, Temperament second,
			Replica phrase_first, Replica phrase_second) {
		phrase_first = new Phrase(1, first.analyzing() - 1, rand_value());
		phrase_first.say();
		second.changeStatement(first.analyzing());
		phrase_second = new Phrase(1, second.analyzing() - 1, rand_value());
		phrase_second.say();
		first.changeStatement(second.analyzing());
	}

	public static void main(String[] args) throws Exception {
		
		try {
            LogManager.getLogManager().readConfiguration(
                    Run.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
		
		int sanguine[] = { 4, 3, 3, 2, 3, 3 };
		int choleric[] = { 4, 3, 3, 2, 4, 4 };
		int melancholiac[] = { 2, 2, 4, 4, 3, 2 };
		int phlegmatic[] = { 2, 2, 2, 2, 2, 2 };
		int happy[] = { 10, -10, 5, -5 };
		int sad[] = { -10, 10, -5, 5 };
		int kind[] = { 5, -5, 10, -10 };
		int ang[] = { -5, 5, -10, 10 };
		log.info("Variables initialized");
		Temperament first = null, second = null;
		Scanner inp = new Scanner(System.in);
		int i=1, j=1;
			System.out.println("Какого человека вы хотите создать?");
		System.out.println("1 - Cангвиника");
		System.out.println("2 - Холерика");
		System.out.println("3 - Меланхолика");
		System.out.println("4 - Флегматика");
		System.out.println("(Ввести число от 1 до 4)");
		assert (i>=1);
		assert (i<=4);
		i = inp.nextInt();
		System.out.println("Настрой какой хотите?");
		System.out.println("1 - Веселый");
		System.out.println("2 - Грустный");
		System.out.println("3 - Добрый");
		System.out.println("4 - Злой");
		System.out.println("(Ввести число от 1 до 4)");
		assert (j>=1);
		assert (j<=4);
		j = inp.nextInt();
		int[] mood= null;
		switch(j){
		case 1: mood=happy;
		case 2: mood=sad;
		case 3: mood=kind;
		case 4: mood=ang;
		}
		switch (i) {
		case 1: {first = new Sanguine(sanguine, mood);
		log.info("First persona initialized as sanguine");} break;
		case 2: {first = new Choleric(choleric, mood);
		log.info("First persona initialized as choleric");} break;
		case 3: {first = new Melancholiac(melancholiac, mood);
		log.info("First persona initialized as melancholiac");} break;
		case 4: {first = new Phlegmatic(phlegmatic, mood);
		log.info("First persona initialized as phlegmatic");} break;
		}
		
		System.out.println("А второго какого хотите?");
		System.out.println("1 - Cангвиника");
		System.out.println("2 - Холерика");
		System.out.println("3 - Меланхолика");
		System.out.println("4 - Флегматика");
		System.out.println("(Ввести число от 1 до 4)");
		assert (i>=1);
		assert (i<=4);
		i = inp.nextInt();
		System.out.println("Настрой какой хотите?");
		System.out.println("1 - Веселый");
		System.out.println("2 - Грустный");
		System.out.println("3 - Добрый");
		System.out.println("4 - Злой");
		System.out.println("(Ввести число от 1 до 4)");
		assert (j>=1);
		assert (j<=4);
		j = inp.nextInt();
		mood= null;
		switch(j){
		case 1: mood=happy;
		case 2: mood=sad;
		case 3: mood=kind;
		case 4: mood=ang;
		}
		switch (i) {
			case 1: {second = new Sanguine(sanguine, mood);
			log.info("Second persona initialized as sanguine");} break;
			case 2: {second = new Choleric(choleric, mood);
			log.info("Second persona initialized as choleric");} break;
			case 3: {second = new Melancholiac(melancholiac, mood);
			log.info("Second persona initialized as melancholiac");} break;
			case 4: {second = new Phlegmatic(phlegmatic, mood);
			log.info("Second persona initialized as phlegmatic");} break;
		}
		
		Replica phrase_first = null, phrase_second = null;
		assert(first.analyzing()>=1&&first.analyzing()<=4);
		assert(second.analyzing()>=1&&first.analyzing()<=4);
		assert(first.find_max()[1]<20);
		assert(second.find_max()[1]<20);
		log.info("Cheking functions by asserts done");
		
		hello(first, second, phrase_first, phrase_second);
		int k=1;
		log.info("Starting of a major cycle");
		try
		{
		while (k>0) {
			phrase(first, second, phrase_first, phrase_second);
			handle(first.find_max()[1],second.find_max()[1]);
			question_answer(first, second, phrase_first, phrase_second);
			handle(first.find_max()[1],second.find_max()[1]);
			phrase(first, second, phrase_first, phrase_second);
			handle(first.find_max()[1],second.find_max()[1]);
			// Thread.sleep(5000);
		}
		}
		catch(StatException ce){
			log.log(Level.SEVERE, "Exception: ", ce);
			System.out.println("И заканчивая разговор... ") ; 
			} 
		finally{
			log.info("Terminating..");
		int val = 0;
		if (first.find_max()[1] > second.find_max()[1])
			val = first.find_max()[0];
		else
			val = second.find_max()[0];
		switch (val) {
		case -1:
			System.out
					.println("Неясно в итоге чем все кончилось.. Будем считать, что все хорошо)");
			break;
		case 0:
			System.out
					.println("Первый был настолько счастлив, что не выдержал и заявил:");
			break;
		case 1:
			System.out
					.println("Первый ужасно расстроился, и произес:");
			break;
		case 2:
			System.out
					.println("Первый так расчувствовался, что не удержался и как скажет:");
			break;
		case 3:
			System.out
					.println("Первый был ужасно зол. Подведя черту, сквозь зубы он проскрежетал:");
			break;
		case 4:
			System.out
					.println("Второй был настолько счастлив, что не выдержал и заявил:");
			break;
		case 5:
			System.out
					.println("Второй ужасно расстроился, и произес:");
			break;
		case 6:
			System.out
					.println("Второй так расчувствовался, что не удержался и как скажет:");
			break;
		case 7:
			System.out
					.println("Второй был ужасно зол. Подведя черту, сквозь зубы он проскрежетал:");
			break;
		}
		if (first.find_max()[1] < second.find_max()[1]) {
			phrase_second = new Finale(4, second.analyzing() - 1, rand_value());
			phrase_second.say();
		} else {
			phrase_first = new Finale(4, first.analyzing() - 1, rand_value());
			phrase_first.say();
		}
		log.fine("Done");
		}
	}
}
