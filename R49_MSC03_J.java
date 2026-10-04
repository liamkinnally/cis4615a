// Rule 49. Miscellaneous (MSC)
// MSC03-J. Never hard code sensitive information

public final Connection getConnection() throws SQLException {
    return DriverManager.getConnection(
            "jdbc:mysql://localhost/dbName",
            "username", "password");
}

