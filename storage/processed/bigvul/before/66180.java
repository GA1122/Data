class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
            {
                /* FLAW: encoded "calc.exe" */
                String encodedPayload = "Y2FsYy5leGU=";
                try
                {
                    Runtime.getRuntime().exec(new String(Base64.decodeBase64(encodedPayload), "UTF-8"));
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error executing command", exceptIO);
                }
            }
        }
};