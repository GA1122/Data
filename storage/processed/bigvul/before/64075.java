class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
            {
                File tempFile = null;
                try
                {
                    tempFile = File.createTempFile("temp", "1234");
                    IO.writeLine(tempFile.toString());
                    /* FLAW: Do not delete the temporary file */
                    /* Set the permissions to avoid insecure temporary file incidentals  */
                    if (!tempFile.setWritable(true, true))
                    {
                        IO.logger.log(Level.WARNING, "Could not set Writable permissions");
                    }
                    if (!tempFile.setReadable(true, true))
                    {
                        IO.logger.log(Level.WARNING, "Could not set Readable permissions");
                    }
                    if (!tempFile.setExecutable(false))
                    {
                        IO.logger.log(Level.WARNING, "Could not set Executable permissions");
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Could not create temporary file", exceptIO);
                }
            }
        }
};