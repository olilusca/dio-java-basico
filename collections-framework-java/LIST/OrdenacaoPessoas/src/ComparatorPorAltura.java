
import java.util.*;
public class ComparatorPorAltura implements Comparator<Pessoa>
{

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		// TODO: Implement this method
		return Double.compare(p1.getAltura(), p2.getAltura());
	}

	
	
	
}
