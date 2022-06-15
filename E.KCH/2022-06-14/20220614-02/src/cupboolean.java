
public class cupboolean extends Ramen{
	
	public cupboolean(String jejo, String name, int won) {
		super(jejo,name,won);
		
	}
	
	public boolean equals(Ramen Rem) {
		if (Rem instanceof Ramen2) {
			Ramen2 cup = (Ramen2) Rem;
			return jejo.equals(cup.jejo);
		} else {
			return false;
		}
	}
}
