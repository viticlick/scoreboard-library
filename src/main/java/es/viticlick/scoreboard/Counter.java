package es.viticlick.scoreboard;

public class Counter {

	private int count;

	private Counter(){}
	
	private Counter(int value){
		this.count = value;
	}
	
	public static Counter of(int value) {
		return new Counter(value);
	}
	
	public static Counter create(){
		return new Counter();
	}
	
	public void add(int addition) {
		this.count += addition;
	}

	public void substract(int substraction) {
		this.count -= substraction;
	}

	public int value() {
		return count;
	}

}
