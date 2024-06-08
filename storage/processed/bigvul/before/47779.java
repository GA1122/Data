class badSink_class{
    public void badSink(HashMap<Integer,String> dataHashMap ) throws Throwable
        {
            String data = dataHashMap.get(2);
    
            if (data != null)
            {
                /* POTENTIAL FLAW: data used as password in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};