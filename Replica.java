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
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(blop + "(����)");
			break;
		case 2:
			System.out.println(blop + "(�������)");
			break;
		case 3:
			System.out.println(blop + "(� �������)");
			break;
		case 4:
			System.out.println(blop + "(�� �������)");
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
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(blop + "(����)");
			break;
		case 2:
			System.out.println(blop + "(�������)");
			break;
		case 3:
			System.out.println(blop + "(� �������)");
			break;
		case 4:
			System.out.println(blop + "(�� �������)");
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
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(blop + "(����)");
			break;
		case 2:
			System.out.println(blop + "(�������)");
			break;
		case 3:
			System.out.println(blop + "(� �������)");
			break;
		case 4:
			System.out.println(blop + "(�� �������)");
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
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(blop + "(����)");
			break;
		case 2:
			System.out.println(blop + "(�������)");
			break;
		case 3:
			System.out.println(blop + "(� �������)");
			break;
		case 4:
			System.out.println(blop + "(�� �������)");
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
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(blop + "(����)");
			break;
		case 2:
			System.out.println(blop + "(�������)");
			break;
		case 3:
			System.out.println(blop + "(� �������)");
			break;
		case 4:
			System.out.println(blop + "(�� �������)");
			break;
		}
	}
}

public interface Replica {
	final static String happy_welcome[] = { " - ��������! ",
			" - ������, ������! ", " - ��� � ��� ���� ������! ", " - ������! " };
	final static String sad_welcome[] = { " - ������...", " - ��������..",
			" - ���..", " - ������.." };
	final static String kind_welcome[] = {
			" - ������� ������� ������..� ���� ����� �������... ������������, �� ��������)",
			" - ������-������!", " - ������������! ", " - ����� ����!" };
	final static String anger_welcome[] = { " - �� ������� �� ������!",
			" - ������ �� ������, ���� ������", " - ����� �� ���..!",
			" - ������ �� ��� �� ������.." };

	final static String happy_phrase[] = { " - �  � ��� � �������� ���!)",
			" - ���������������, �� �������� �� �����) ",
			" - ���� �����!... ��, �� ����� - ����� ",
			" - � � ���� ����� ��������!!" };
	final static String sad_phrase[] = {
			" - ������ ���, �� � ������� �������",
			" - �, � ����� ������� � ���� �������",
			" - �������.. ��� ����� �������",
			" - ��� ������� ���� ���.. �� ����� ������� ���������, � �� ������ ���� ������� �� �� ���� ����������� ��� ��� ��� ����� ����� ������������" };
	final static String kind_phrase[] = {
			" - � �����, �����, �����, � ����� �� �������",
			" - � ��� ���������� �� ������. ��� ������ ������� ��� ������ ������)",
			" - ���������� ����, �����! �� ������!)",
			" - � ������� ���� ����! � ������ �������� ���" };
	final static String anger_phrase[] = { "- ��� �� �� ���� ��� ������",
			"- ��� ��� ������ ���� �������!",
			"- ����� ������ ��� ���� � ����������",
			"- ��� � ���� ������� �� ���� ��������" };

	final static String happy_question[] = {
			" - � ������� ������� �/�! ������ �� ���� ��������?)",
			" - � ������� �������� � �����, ������ ������ �������?) ",
			"� �� ������� �����?) ", "�����! � �� ���� �� �����?" };
	final static String sad_question[] = {
			" - ���� ��� ������..? ������� �����..",
			" - � ����� ������� ������,�?",
			" - �����, ���� � �� �����? ..����� ������?�?",
			" - ��� ����� ���������� � �����?" };
	final static String kind_question[] = { " - �������, ��� ������ �������?",
			"��� ���, ������ �����?",
			" - ��� ��� �������� ���������� �������?",
			" - ���������, ���������, ��� ��?.." };
	final static String anger_question[] = {
			" - ���� ��� �� ������� ���� �����?", " - ����� ������ ���?",
			" - ������ ��������? ", " - � �� ����� �� ����..? ��� ������ ����." };

	final static String happy_answer[] = { "- �������� ����!)", "- Let's go ",
			"- �� ��������� ����! ", " - ����� � ��������� ����������) " };
	final static String sad_answer[] = { "- �� ����� �� �������...",
			"- ���� ��.., � �� ����� ��� ������� �� ������",
			"- ��... �����-������ ", "- �� ������ ��� ��� ���������? " };
	final static String kind_answer[] = {
			"- � ������ ����, ����!",
			"- ���� ��� �� ����..? ������� ����! ",
			"- �� ��� �� ��� ���� � ����� ����? � � �����) ",
			"- � ������ ����� ���������, ��� ������ �� ���� � ����� ��������.. � �� ��� ��� ������ ����� ���� 5 ��� ����� ������ ���� ����������.. �� � �� ����� ����, ��������" };
	final static String anger_answer[] = {
			"- � ���� ������� ������.. �� �� ����� �� �� � ������ ���������!",
			"- ��� �� ����� �������?", "- ����� ��, �������",
			"- �� �� �� �� ������� ��� ����� ����������?" };

	final static String happy_final[] = {
			" - �����������!!!",
			" - �  ����� �� ��������! ",
			" - � ������! ��� ������� ������� �� �����..)) ���-���-��� ",
			" - � ������ �����!!  ���, � �� ������, �� ������,���, � �� �������, �� ����, ���, ����� �������� - ����� �����, ����� ��������" };
	final static String sad_final[] = { " - � ���� �������� ����",
			" - � � ��� ��, ����� �����..?",
			" - �����, ������� ����� �����? � ���� �������� ���� �����",
			" - � ������-�� �����..." };
	final static String kind_final[] = {
			" - �� �������, �������, ��� ���� ����",
			" - �... ����� ������� �� ���..?;)  ", " - ��� � ���� �������!!! ",
			" - �����, ����� ����, �������" };
	final static String anger_final[] = { " - �� � ���� ������ ������!",
			" - ��� �� ����!", " - ������ ���� � ���, ��������",
			" - � �� ��� ����, �����!" };
	String[][][] text = {
			{ happy_welcome, sad_welcome, kind_welcome, anger_welcome },
			{ happy_phrase, sad_phrase, kind_phrase, anger_phrase },
			{ happy_question, sad_question, kind_question, anger_question },
			{ happy_answer, sad_answer, kind_answer, anger_answer },
			{ happy_final, sad_final, kind_final, anger_final } };

	void say();
}
