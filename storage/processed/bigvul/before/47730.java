class bad_class{
    public void bad() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* FLAW: Set data to a hardcoded string */
                data = "7e5tc4s3";
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
                if (data != null)
                {
                    /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                    PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                    IO.writeLine(credentials.toString());
                }
    
            }
        }
};