
import java.util.*;
public class OrdenaNumeroComparator implements Comparator<Numero>
{

	@Override
	public int compare(Numero p1, Numero p2)
	{
		// TODO: Implement this method
		return Integer.compare(p2.getNumero(), p1.getNumero());
	}

	
}
