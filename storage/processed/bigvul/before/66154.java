class good2_class{
    private void good2() throws Throwable
        {
            if (privateFive == 5)
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