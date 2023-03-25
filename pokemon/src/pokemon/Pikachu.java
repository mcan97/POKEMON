package pokemon;

public class Pikachu  extends pokemon implements Boostable{
public static final String NAME="Pikachu";
public static final int POWER=10;	

	public Pikachu() {
		super(NAME,POWER);
	}

	@Override
	public void boost() {
this.setPower(POWER*2);		
	}

}
