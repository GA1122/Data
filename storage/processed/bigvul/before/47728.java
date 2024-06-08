class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            String data;
    
            goodG2B1PublicStatic = false;
            data = (new CWE259_Hard_Coded_Password__passwordAuth_22b()).goodG2B1Source();
    
            if (data != null)
            {
                /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};