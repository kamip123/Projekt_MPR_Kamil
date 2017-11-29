package library.repos;

import library.domain.Samochod;
import java.util.List;
public interface ISamochodRepository extends IRepository<Samochod>{
	public List<Samochod> withType(String typ);
	public List<Samochod> withModel(String model);
	public List<Samochod> withRocznik(int rocznik);
	public List<Samochod> withPrzebieg(int przebieg);
}
