class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
                /* Read a line of user input from console with preferred BufferedReader.readLine() method */
            {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);
                /* FIX: Read input from the console using preferred method BufferedReader.readLine() */
                String myString = readerBuffered.readLine();
                IO.writeLine(myString); /* Use myString */
                /* NOTE: Tools may report a flaw here because readerBuffered and readerInputStream are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
            }
            break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};