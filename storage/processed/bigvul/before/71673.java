class goodG2BSink_class{
    public void goodG2BSink(String data ) throws Throwable
        {
    
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};