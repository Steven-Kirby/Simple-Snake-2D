
public abstract class Fruit {

	private String name;
	private int points, despawnTime;
	
	public Fruit(String name, int points, int despawnTime){
		this.setName(name);
		this.setPoints(points);
		this.setDespawnTime(despawnTime);
		
	}

	public int getDespawnTime() {
		return despawnTime;
	}

	public void setDespawnTime(int despawnTime) {
		this.despawnTime = despawnTime;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
