class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data = goodG2BSource();
    
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};