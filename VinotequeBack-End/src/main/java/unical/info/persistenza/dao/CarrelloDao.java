package unical.info.persistenza.dao;

import unical.info.persistenza.model.Carrello;
import unical.info.persistenza.model.Utente;

import java.sql.SQLException;
import java.util.List;

public interface CarrelloDao {

    public List<Utente> findAll();

    Carrello findByIdUtente(Long IDutente);

    void save(Carrello carrello) throws SQLException;

    public void delete(Carrello carrello, String IDutente);
}
