class badSink_class{
    public void badSink(CWE259_Hard_Coded_Password__passwordAuth_67a.Container dataContainer ) throws Throwable
        {
            String data = dataContainer.containerOne;
    
            if (data != null)
            {
                /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};