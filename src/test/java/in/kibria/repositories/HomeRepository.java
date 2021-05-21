package in.kibria.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import in.kibria.entities.DataDAO;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
@Repository("homeRepository")
public interface HomeRepository extends CrudRepository<DataDAO, String> {
	@Query(value ="SELECT * FROM crime WHERE CONCAT(Headline) LIKE '%rape%' ORDER BY year DESC", nativeQuery = true)
		public List<DataDAO> findByHeadline ();
}
