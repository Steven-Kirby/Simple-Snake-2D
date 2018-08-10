
public class Snake {

	private String name;
	private int startSize, speed, rank;
	
	Snake(String name, int startSize, int speed){
		this.setName(name);
		this.setStartSize(startSize);
		this.setSpeed(speed);
		this.setRank(1);
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStartSize() {
		return startSize;
	}

	public void setStartSize(int startSize) {
		this.startSize = startSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
