class goodG2BSink_class{
    public void goodG2BSink(String dataArray[] ) throws Throwable
        {
            String data = dataArray[2];
    
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};