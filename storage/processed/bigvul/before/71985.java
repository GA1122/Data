class goodG2BSink_class{
    private void goodG2BSink() throws Throwable
        {
            String data = dataGoodG2B;
    
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};