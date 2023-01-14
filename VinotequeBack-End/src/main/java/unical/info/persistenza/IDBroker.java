package unical.info.persistenza;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IDBroker {
    //Standard SQL (queste stringhe andrebbero scritte in un file di configurazione
    //private static final String query="SELECT NEXT VALUE FOR SEQUENZA_ID AS id";

    private static final String query = "SELECT nextval('db_sequence') AS id";//postgresql

    public static Long getId(Connection connection){
        Long id = null;
        try {
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet result = statement.executeQuery();
            result.next();
            id = result.getLong("id");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return id;
    }
}
