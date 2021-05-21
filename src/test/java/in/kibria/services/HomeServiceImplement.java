package in.kibria.services;

import in.kibria.entities.DataDAO;
import in.kibria.repositories.HomeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
public class HomeServiceImplement implements HomeService {
    @Autowired
    private HomeRepository productRepository;
    @Override
    public Iterable<DataDAO> findAll() {
    return productRepository.findAll();
    }
    
    @Override
	public List<DataDAO> findByHeadline (){
    	return productRepository.findByHeadline();
    }
    

    
}
