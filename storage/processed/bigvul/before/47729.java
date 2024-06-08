class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String data;
    
            goodG2B2PublicStatic = true;
            data = (new CWE259_Hard_Coded_Password__passwordAuth_22b()).goodG2B2Source();
    
            if (data != null)
            {
                /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};