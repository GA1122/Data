class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                /* FLAW: encoded "calc.exe" */
                String encodedPayload = "Y2FsYy5leGU=";
                try
                {
                    Runtime.getRuntime().exec(new String(Base64.decodeBase64(encodedPayload), "UTF-8"));
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error executing command", exceptIO);
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};