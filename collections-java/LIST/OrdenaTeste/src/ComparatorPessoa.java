
import java.util.*;

public class ComparatorPessoa implements Comparator<Pessoa>
{

	@Override
	public int compare(Pessoa p1, Pessoa p2)
	{
		// TODO: Implement this method
		return p1.getNome().compareTo(p2.getNome());
	}

	
}
