class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            badPrivate = true;
            data = bad_source();
    
            if (data != null)
            {
                /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};