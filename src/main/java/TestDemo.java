import java.util.Random;

public class TestDemo {
	public int addPositive(int a, int b) {

		if(a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		System.out.println(a + b);
		return a + b;
	}

	public int randomNumberSquared() {
		int randNum = getRandomInt();		
		int randNumSquared = randNum * randNum;
		System.out.println(randNum + " * " + randNum + " = " + randNumSquared);
		return randNumSquared;
	}

	//obtain random integer between 1 and 10
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}