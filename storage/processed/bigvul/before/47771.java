class badSink_class{
    public void badSink(Vector<String> dataVector ) throws Throwable
        {
            String data = dataVector.remove(2);
    
            if (data != null)
            {
                /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};