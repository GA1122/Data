class bad_class{
    public void bad() throws Throwable
        {
            String data = badSource();
    
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};