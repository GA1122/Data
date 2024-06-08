class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            String password;
    
            switch (5)
            {
            case 6:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure password is inititialized before the Sink to avoid compiler errors */
                password = null;
                break;
            default:
                /* FIX: Use a hardcoded password as the password (it was not sent over the network) */
                /* INCIDENTAL FLAW: CWE-259 Hard Coded Password */
                password = "Password1234!";
                break;
            }
    
            switch (7)
            {
            case 7:
                if (password != null)
                {
                    /* POTENTIAL FLAW: Use password directly in PasswordAuthentication() */
                    PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
                    IO.writeLine(credentials.toString());
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};