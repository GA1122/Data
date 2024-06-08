class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* FLAW: Set data to a hardcoded string */
            data = "7e5tc4s3";
    
            for (int i = 0; i < 1; i++)
            {
                if (data != null)
                {
                    /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                    PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                    IO.writeLine(credentials.toString());
                }
            }
        }
};