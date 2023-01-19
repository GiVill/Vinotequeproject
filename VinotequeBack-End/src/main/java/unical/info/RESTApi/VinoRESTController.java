package unical.info.RESTapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import unical.info.persistenza.DBManager;
import unical.info.persistenza.model.Vino;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class VinoRESTController {

    @PostMapping("/Wine")
    public List<Vino> getWines(){
        List<Vino> vini = DBManager.getInstance().getVinoDao().findAll();
        return vini;
    }
}
