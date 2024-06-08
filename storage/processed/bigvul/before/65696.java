class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* Read a line of user input from console with deprecated DataInputStream.readLine() method */
                {
                    /* FLAW: Read input from the console using DataInputStream.readLine() */
                    DataInputStream streamDataInput = new DataInputStream(System.in);
                    String myString = streamDataInput.readLine();
                    IO.writeLine(myString); /* Use myString */
                    /* NOTE: Tools may report a flaw here because streamDataInput is not closed.  Unfortunately, closing that will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
                }
            }
            else
            {
    
                /* Read a line of user input from console with preferred BufferedReader.readLine() method */
                {
                    InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                    BufferedReader readerBuffered = new BufferedReader(readerInputStream);
    
                    /* FIX: Read input from the console using preferred method BufferedReader.readLine() */
                    String myString = readerBuffered.readLine();
    
                    IO.writeLine(myString); /* Use myString */
    
                    /* NOTE: Tools may report a flaw here because readerBuffered and readerInputStream are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
                }
    
            }
        }
};