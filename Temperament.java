package laba4;

public interface Temperament {
	int[] find_max();
	int analyzing();
	void changeStatement(int type);
}

class Sanguine implements Temperament {
	int[] character = new int[6];
	int[] statement = new int[4];

	Sanguine(int[] arr, int[] arr2) {
		this.character = arr;
		this.statement = arr2;
	}

	public int[] find_max() {
		int index = 0;
		int max_x = statement[0];
		for (int i = 0; i < 4; i++)
			if (statement[i] > max_x) {
				max_x = statement[i];
				index = i;
			}
		int arr[] = { index, max_x };
		return arr;
	}

	public int analyzing() {
		float i, j;
		boolean kind = false, happy = false;
		if (statement[0] + character[1] > statement[1] + character[2]) {
			i = statement[0] + character[1];
			happy = true;
		} else if (statement[0] + character[1] < statement[1] + character[2]) {
			i = statement[1] + character[2];
			happy = false;
		} else
			i = 1;

		if (statement[2] + (character[1] + character[1]) / 2 > statement[3]
				+ character[0]) {
			j = statement[2] + (character[1] + character[1]) / 2;
			kind = true;
		} else if (statement[2] + (character[1] + character[1]) / 2 < statement[3]
				+ character[0]) {
			j = statement[3] + character[0];
			kind = false;
		} else
			j = 1;
		if (i > j && happy == true)
			return 1;
		if (i > j && happy == false)
			return 2;
		if (i < j && kind == true)
			return 3;
		if (i < j && kind == false)
			return 4;
		if (happy == false && kind == false)
			return 3; // заменить на нейтральность
		return 3; // и это тоже
	}

	public void changeStatement(int type) {
		double k = 0.5;
		switch (type) {
		case 1: {
			statement[0] += (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[1] -= (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[2] += (character[0] + character[1] + character[4] + character[5])
					/ 4.0 * k;
			statement[3] -= (character[0] + character[3] + character[4] + character[5])
					/ 4.0 * k;
			break;
		}
		case 2: {
			statement[0] -= (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[1] += (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[2] -= (character[0] + character[1] + character[4] + character[5])
					/ 4.0 * k;
			statement[3] += (character[0] + character[3] + character[4] + character[5])
					/ 4.0 * k;
			break;
		}
		case 3: {
			statement[0] -= (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[1] += (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[2] -= (character[0] + character[1] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			statement[3] += (character[0] + character[3] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			break;
		}
		case 4: {
			statement[0] -= (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[1] += (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[2] -= (character[0] + character[1] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			statement[3] += (character[0] + character[3] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			break;
		}
		}
	}
}

class Choleric implements Temperament {
	int[] character = new int[6];
	int[] statement = new int[4];

	Choleric(int[] arr, int[] arr2) {
		this.character = arr;
		this.statement = arr2;
	}

	public int[] find_max() {
		int index = 0;
		int max_x = statement[0];
		for (int i = 0; i < 4; i++)
			if (statement[i] > max_x) {
				max_x = statement[i];
				index = i;
			}
		int arr[] = { index, max_x };
		return arr;
	}

	public int analyzing()

	{
		float i, j;
		boolean kind = false, happy = false;
		if (statement[0] + character[1] > statement[1] + character[2]) {
			i = statement[0] + character[1];
			happy = true;
		} else if (statement[0] + character[1] < statement[1] + character[2]) {
			i = statement[1] + character[2];
			happy = false;
		} else
			i = 1;

		if (statement[2] + (character[1] + character[1]) / 2 > statement[3]
				+ character[0]) {
			j = statement[2] + (character[1] + character[1]) / 2;
			kind = true;
		} else if (statement[2] + (character[1] + character[1]) / 2 < statement[3]
				+ character[0]) {
			j = statement[3] + character[0];
			kind = false;
		} else
			j = 1;
		if (i > j && happy == true)
			return 1;
		if (i > j && happy == false)
			return 2;
		if (i < j && kind == true)
			return 3;
		if (i < j && kind == false)
			return 4;
		if (happy == false && kind == false)
			return 3;
		return 3;
	}

	public void changeStatement(int type) {
		double k = 0.5;
		switch (type) {
		case 1: {
			statement[0] += (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[1] -= (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[2] += (character[0] + character[1] + character[4] + character[5])
					/ 4.0 * k;
			statement[3] -= (character[0] + character[3] + character[4] + character[5])
					/ 4.0 * k;
			break;
		}
		case 2: {
			statement[0] -= (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[1] += (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[2] -= (character[0] + character[1] + character[4] + character[5])
					/ 4.0 * k;
			statement[3] += (character[0] + character[3] + character[4] + character[5])
					/ 4.0 * k;
			break;
		}
		case 3: {
			statement[0] -= (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[1] += (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[2] -= (character[0] + character[1] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			statement[3] += (character[0] + character[3] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			break;
		}
		case 4: {
			statement[0] -= (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[1] += (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[2] -= (character[0] + character[1] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			statement[3] += (character[0] + character[3] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			break;
		}
		}
	}
}

class Melancholiac implements Temperament {
	int[] character = new int[6];
	int[] statement = new int[4];

	Melancholiac(int[] arr, int[] arr2) {
		this.character = arr;
		this.statement = arr2;
	}

	public int[] find_max() {
		int index = 0;
		int max_x = statement[0];
		for (int i = 0; i < 4; i++)
			if (statement[i] > max_x) {
				max_x = statement[i];
				index = i;
			}
		int arr[] = { index, max_x };
		return arr;
	}

	public int analyzing() {
		float i, j;
		boolean kind = false, happy = false;
		if (statement[0] + character[1] > statement[1] + character[2]) {
			i = statement[0] + character[1];
			happy = true;
		} else if (statement[0] + character[1] < statement[1] + character[2]) {
			i = statement[1] + character[2];
			happy = false;
		} else
			i = 1;

		if (statement[2] + (character[1] + character[1]) / 2 > statement[3]
				+ character[0]) {
			j = statement[2] + (character[1] + character[1]) / 2;
			kind = true;
		} else if (statement[2] + (character[1] + character[1]) / 2 < statement[3]
				+ character[0]) {
			j = statement[3] + character[0];
			kind = false;
		} else
			j = 1;
		if (i > j && happy == true)
			return 1;
		if (i > j && happy == false)
			return 2;
		if (i < j && kind == true)
			return 3;
		if (i < j && kind == false)
			return 4;
		if (happy == false && kind == false)
			return 3;
		return 3;
	}

	public void changeStatement(int type) {
		double k = 0.5;
		switch (type) {
		case 1: {
			statement[0] += (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[1] -= (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[2] += (character[0] + character[1] + character[4] + character[5])
					/ 4.0 * k;
			statement[3] -= (character[0] + character[3] + character[4] + character[5])
					/ 4.0 * k;
			break;
		}
		case 2: {
			statement[0] -= (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[1] += (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[2] -= (character[0] + character[1] + character[4] + character[5])
					/ 4.0 * k;
			statement[3] += (character[0] + character[3] + character[4] + character[5])
					/ 4.0 * k;
			break;
		}
		case 3: {
			statement[0] -= (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[1] += (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[2] -= (character[0] + character[1] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			statement[3] += (character[0] + character[3] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			break;
		}
		case 4: {
			statement[0] -= (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[1] += (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[2] -= (character[0] + character[1] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			statement[3] += (character[0] + character[3] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			break;
		}
		}
	}
}

class Phlegmatic implements Temperament {
	int[] character = new int[6];
	int[] statement = new int[4];

	Phlegmatic(int[] arr, int[] arr2) {
		this.character = arr;
		this.statement = arr2;
	}

	public int[] find_max() {
		int index = 0;
		int max_x = statement[0];
		for (int i = 0; i < 4; i++)
			if (statement[i] > max_x) {
				max_x = statement[i];
				index = i;
			}
		int arr[] = { index, max_x };
		return arr;
	}

	public int analyzing() {
		float i, j;
		boolean kind = false, happy = false;
		if (statement[0] + character[1] > statement[1] + character[2]) {
			i = statement[0] + character[1];
			happy = true;
		} else if (statement[0] + character[1] < statement[1] + character[2]) {
			i = statement[1] + character[2];
			happy = false;
		} else
			i = 1;

		if (statement[2] + (character[1] + character[1]) / 2 > statement[3]
				+ character[0]) {
			j = statement[2] + (character[1] + character[1]) / 2;
			kind = true;
		} else if (statement[2] + (character[1] + character[1]) / 2 < statement[3]
				+ character[0]) {
			j = statement[3] + character[0];
			kind = false;
		} else
			j = 1;
		if (i > j && happy == true)
			return 1;
		if (i > j && happy == false)
			return 2;
		if (i < j && kind == true)
			return 3;
		if (i < j && kind == false)
			return 4;
		if (happy == false && kind == false)
			return 3;
		return 3;
	}

	public void changeStatement(int type) {
		double k = 0.5;
		switch (type) {
		case 1: {
			statement[0] += (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[1] -= (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[2] += (character[0] + character[1] + character[4] + character[5])
					/ 4.0 * k;
			statement[3] -= (character[0] + character[3] + character[4] + character[5])
					/ 4.0 * k;
			break;
		}
		case 2: {
			statement[0] -= (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[1] += (character[0] + character[1] + character[4] + 5)
					/ 3.0 * k;
			statement[2] -= (character[0] + character[1] + character[4] + character[5])
					/ 4.0 * k;
			statement[3] += (character[0] + character[3] + character[4] + character[5])
					/ 4.0 * k;
			break;
		}
		case 3: {
			statement[0] -= (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[1] += (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[2] -= (character[0] + character[1] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			statement[3] += (character[0] + character[3] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			break;
		}
		case 4: {
			statement[0] -= (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[1] += (character[0] + character[1] + character[4]) / 3.0
					* k;
			statement[2] -= (character[0] + character[1] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			statement[3] += (character[0] + character[3] + character[4]
					+ character[5] + 5)
					/ 4.0 * k;
			break;
		}
		}
	}
}