// Rule 49. Miscellaneous (MSC)
// MSC03-J. Never hard code sensitive information

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class R49_MSC03_J {
    public final Connection getConnection(String username, String password) throws SQLException {
        // Caller supplies username and password read at runtime from a secure config file
        return DriverManager.getConnection(
                "jdbc:mysql://localhost/dbName", username, password);
    }
}
