class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            String data;
    
            goodG2B1_private = false;
            data = goodG2B1_source();
    
            if (data != null)
            {
                /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};