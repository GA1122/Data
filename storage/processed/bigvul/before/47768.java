class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            String data = (String)dataObject;
    
            if (data != null)
            {
                /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};