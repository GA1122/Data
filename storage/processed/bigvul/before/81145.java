class goodG2BSink_class{
    public void goodG2BSink() throws Throwable
        {
            String data = CWE89_SQL_Injection__listen_tcp_execute_68a.data;
    
            Connection dbConnection = null;
            Statement sqlStatement = null;
    
            try
            {
                dbConnection = IO.getDBConnection();
                sqlStatement = dbConnection.createStatement();
    
                /* POTENTIAL FLAW: data concatenated into SQL statement used in execute(), which could result in SQL Injection */
                Boolean result = sqlStatement.execute("insert into users (status) values ('updated') where name='"+data+"'");
    
                if(result)
                {
                    IO.writeLine("Name, " + data + ", updated successfully");
                }
                else
                {
                    IO.writeLine("Unable to update records for user: " + data);
                }
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
                    IO.logger.log(Level.WARNING, "Error closing Statement", exceptSql);
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