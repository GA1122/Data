class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data = (new CWE89_SQL_Injection__database_executeUpdate_61b()).goodB2GSource();
    
            Connection dbConnection = null;
            PreparedStatement sqlStatement = null;
    
            try
            {
                /* FIX: Use prepared statement and executeUpdate (properly) */
                dbConnection = IO.getDBConnection();
                sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated') where name=?");
                sqlStatement.setString(1, data);
    
                int rowCount = sqlStatement.executeUpdate();
    
                IO.writeLine("Updated " + rowCount + " rows successfully.");
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
            }
            finally
            {
                try
                {
                    if (sqlStatement != null)
                    {
                        sqlStatement.close();
                    }
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
                }
    
                try
                {
                    if (dbConnection != null)
                    {
                        dbConnection.close();
                    }
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
                }
            }
    
        }
};