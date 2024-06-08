class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                /* Read a line of user input from console with deprecated DataInputStream.readLine() method */
            {
                /* FLAW: Read input from the console using DataInputStream.readLine() */
                DataInputStream streamDataInput = new DataInputStream(System.in);
                String myString = streamDataInput.readLine();
                IO.writeLine(myString); /* Use myString */
                /* NOTE: Tools may report a flaw here because streamDataInput is not closed.  Unfortunately, closing that will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
            }
            break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};