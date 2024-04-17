package db;

import java.sql.Connection;
import java.sql.SQLException;
import core.BookDao;
import core.BookDaoImpl;

public interface DatabaseConnection {
    Connection getConnection() throws SQLException;

}