class good1_class{
    private void good1() throws Throwable
        {
            if (privateReturnsFalse())
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: plaintext command */
                String decodedPayload = "calc.exe";
                try
                {
                    Runtime.getRuntime().exec(decodedPayload);
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error executing command", exceptIO);
                }
    
            }
        }
};