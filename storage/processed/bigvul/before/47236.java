class good1_class{
    private void good1() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_FIVE != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                FileInputStream fis = null;
    
                try
                {
                    int bytesToRead = 1024;
                    byte[] byteArray = new byte[bytesToRead];
    
                    fis = new FileInputStream("c:\\file.txt");
    
                    int numberOfBytesRead = fis.read(byteArray);
    
                    /* FIX: Check the return value of read() and handle possible errors */
                    if (numberOfBytesRead == -1)
                    {
                        IO.writeLine("The end of the file has been reached.");
                    }
                    else
                    {
                        if (numberOfBytesRead < bytesToRead)
                        {
                            IO.writeLine("Could not read " + bytesToRead + " bytes.");
                        }
                        else
                        {
                            IO.writeLine(new String(byteArray, "UTF-8"));
                        }
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