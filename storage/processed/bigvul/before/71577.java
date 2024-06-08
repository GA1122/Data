class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if (privateReturnsTrue())
            {
                FileInputStream streamFileInput = null;
                String propertiesFileName = "./CWE690_NULL_Deref_From_Return__Helper.properties";
                try
                {
                    streamFileInput = new FileInputStream(propertiesFileName);
                    Properties properties = new Properties();
                    properties.load(streamFileInput);
                    /* POTENTIAL FLAW: data may be set to null */
                    data = properties.getProperty("CWE690");
                }
                catch (IOException exceptIO)
                {
                    IO.writeLine("Could not open properties file: " + propertiesFileName);
                    data = ""; /* ensure that data is initialized */
                }
                finally
                {
                    try
                    {
                        if (streamFileInput != null)
                        {
                            streamFileInput.close();
                        }
                    }
                    catch (IOException e)
                    {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", e);
                    }
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (privateReturnsTrue())
            {
                /* POTENTIAL FLAW: data could be null */
                if(data.equals("CWE690"))
                {
                    IO.writeLine("data is CWE690");
                }
            }
        }
};