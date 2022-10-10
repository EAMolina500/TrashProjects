package tcg;

public class BasicCard implements Card {
	
	int number;

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void setNumber(int n) {
		number = n;
	}
	
	public String toString() {
		return String.valueOf(number);
	}

}
