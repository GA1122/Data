class badSink_class{
    public void badSink(Vector<String> passwordVector ) throws Throwable
        {
            String password = passwordVector.remove(2);
    
            if (password != null)
            {
                /* POTENTIAL FLAW: Use password directly in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};