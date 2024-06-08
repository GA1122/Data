class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            String data = (String)dataObject;
    
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};