class badSink_class{
    public void badSink(String passwordArray[] ) throws Throwable
        {
            String password = passwordArray[2];
    
            if (password != null)
            {
                /* POTENTIAL FLAW: Use password directly in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};