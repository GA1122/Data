class bad_class{
    public void bad() throws Throwable
        {
            String data = (new CWE259_Hard_Coded_Password__passwordAuth_61b()).badSource();
    
            if (data != null)
            {
                /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};