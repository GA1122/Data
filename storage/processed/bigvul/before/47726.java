class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String data;
    
            goodG2B2_private = true;
            data = goodG2B2_source();
    
            if (data != null)
            {
                /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};