class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
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