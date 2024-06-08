class badSink_class{
    public void badSink(String dataArray[] ) throws Throwable
        {
            String data = dataArray[2];
    
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};