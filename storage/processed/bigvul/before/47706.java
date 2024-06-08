class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if (IO.staticReturnsTrue())
            {
                /* FLAW: Set data to a hardcoded string */
                data = "7e5tc4s3";
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (data != null)
            {
                /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};