package unical.info.dao.postgres;

import unical.info.dao.Metodo_PagamentoDao;
import unical.info.model.Metodo_Pagamento;

import java.sql.Connection;
import java.util.List;

public class Metodo_pagamentoDaoPostgres implements Metodo_PagamentoDao {
    Connection conn;

    public Metodo_pagamentoDaoPostgres(Connection connection) {
        this.conn =connection;
    }

    @Override
    public List<Metodo_Pagamento> findByPrimaryKey(String IDutente) {
        return null;
    }

    @Override
    public void saveOrUpdate(Metodo_Pagamento metodo, String IDutente) {

    }

    @Override
    public void delete(Metodo_Pagamento metodo, String IDutente) {

    }
}
