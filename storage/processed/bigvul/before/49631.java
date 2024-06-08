class badSink_class{
    public void badSink(Object passwordObject ) throws Throwable
        {
            String password = (String)passwordObject;
    
            if (password != null)
            {
                /* POTENTIAL FLAW: Use password directly in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};