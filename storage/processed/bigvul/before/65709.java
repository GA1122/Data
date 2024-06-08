class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
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
        }
};