package in.kibria.controllers;


import in.kibria.entities.DataDAO;
import in.kibria.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("taska")
public class crimeRestController {

    @Autowired
    private HomeService homeService;

    @RequestMapping(value = "findall", method = RequestMethod.GET,
            produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<Iterable<DataDAO>> findAll() {
    try {
    return new ResponseEntity<Iterable<DataDAO>>(homeService.findByHeadline(), HttpStatus.OK);
    } catch (Exception e){
        return new ResponseEntity<Iterable<DataDAO>>(HttpStatus.BAD_REQUEST);
    }

    }
}
