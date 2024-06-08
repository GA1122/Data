class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticTrue)
            {
                FileInputStream fis = null;
                try
                {
                    int bytesToRead = 1024;
                    byte[] byteArray = new byte[bytesToRead];
                    fis = new FileInputStream("c:\\file.txt");
                    /* FLAW: Incorrect check on result of read().  Should check if the return value is -1 or is less than bytesToRead. */
                    if (fis.read(byteArray) == 0)
                    {
                        IO.writeLine("Error reading file.");
                    }
                    else
                    {
                        IO.writeLine(new String(byteArray, "UTF-8"));
                    }
                }
                catch (FileNotFoundException exceptFileNotFound)
                {
                    IO.logger.log(Level.WARNING, "FileNotFoundException opening file", exceptFileNotFound);
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "IOException reading file", exceptIO);
                }
                finally
                {
                    try
                    {
                        if (fis != null)
                        {
                            fis.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "IOException closing FileInputStream", exceptIO);
                    }
                }
            }
        }
};