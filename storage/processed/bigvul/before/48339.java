class badSink_class{
    public void badSink(HashMap<Integer,String> passwordHashMap ) throws Throwable
        {
            String password = passwordHashMap.get(2);
    
            if (password != null)
            {
                /* POTENTIAL FLAW: Use password directly in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};