package library.repos;

import library.domain.Ogloszenie;
import java.util.List;
public interface IOgloszenieRepository extends IRepository<Ogloszenie>{
	public List<Ogloszenie> cenaDo(int cena);
}
