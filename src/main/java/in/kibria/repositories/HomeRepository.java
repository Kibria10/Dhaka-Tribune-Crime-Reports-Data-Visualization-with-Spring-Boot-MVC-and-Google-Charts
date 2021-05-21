package in.kibria.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import in.kibria.entities.DataDAO;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
@Repository("homeRepository")
public interface HomeRepository extends CrudRepository<DataDAO, String> {
	@Query(value ="SELECT * FROM crime WHERE CONCAT(Headline) LIKE '%rape%' ORDER BY Date DESC", nativeQuery = true)
		public List<DataDAO> findByHeadline ();
	
	
	@Query(value ="SELECT * FROM crime WHERE CONCAT(Headline) LIKE '%murder%' OR CONCAT(Headline) LIKE '%kill%' ORDER BY Date DESC", nativeQuery = true)
	public List<DataDAO> findByMurder ();
	
	
	@Query(value ="SELECT * FROM crime WHERE CONCAT(Headline) LIKE '%drug%' OR CONCAT(Headline) LIKE '%yaba%' ORDER BY Date DESC", nativeQuery = true)
	public List<DataDAO> findByDrug ();
	
}
