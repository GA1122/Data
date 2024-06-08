class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
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
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};