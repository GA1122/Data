class badSink_class{
    public void badSink() throws Throwable
        {
            String data = CWE259_Hard_Coded_Password__passwordAuth_68a.data;
    
            if (data != null)
            {
                /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};