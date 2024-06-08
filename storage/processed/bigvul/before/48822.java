class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String passwordCopy;
            {
                String password;
    
                /* FIX: Use a hardcoded password as the password (it was not sent over the network) */
                /* INCIDENTAL FLAW: CWE-259 Hard Coded Password */
                password = "Password1234!";
    
                passwordCopy = password;
            }
            {
                String password = passwordCopy;
    
                if (password != null)
                {
                    /* POTENTIAL FLAW: Use password directly in PasswordAuthentication() */
                    PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
                    IO.writeLine(credentials.toString());
                }
    
            }
        }
};