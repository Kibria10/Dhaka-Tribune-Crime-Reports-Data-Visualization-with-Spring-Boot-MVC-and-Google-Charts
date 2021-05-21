package in.kibria.services;

import java.util.List;

import in.kibria.entities.DataDAO;

public interface HomeService {
    public Iterable<DataDAO> findAll();
	public List<DataDAO> findByHeadline ();
}

