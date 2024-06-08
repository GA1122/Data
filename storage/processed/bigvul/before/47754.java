class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data = (new CWE259_Hard_Coded_Password__passwordAuth_61b()).goodG2BSource();
    
            if (data != null)
            {
                /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};