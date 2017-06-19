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
	
	public Counter add(int points) {
		return Counter.of(this.count + points);
	}

	public Counter substract(int points) {
		return Counter.of(this.count - points);
	}

	public int value() {
		return count;
	}

}
