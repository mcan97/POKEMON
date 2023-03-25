package pokemon;

public abstract class pokemon {
private String name;
private int power;


public pokemon(String name, int power) {
	super();
	this.name = name;
	this.power = power;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPower() {
	return power;
}
public void setPower(int power) {
	this.power = power;
}
public  void hit(player enemy) {
	enemy.setHealth(enemy.getHealth()-this.power);
}
@Override
public String toString() {
	return "pokemon [" + name + "-" + power + "]";
}

}
