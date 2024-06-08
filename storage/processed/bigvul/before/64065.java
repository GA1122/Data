class good1_class{
    private void good1() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                File tempFile = null;
    
                try
                {
                    tempFile = File.createTempFile("temp", "1234");
                    IO.writeLine(tempFile.toString());
    
                    /* FIX: Call deleteOnExit() so that the file will be deleted */
                    tempFile.deleteOnExit();
    
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