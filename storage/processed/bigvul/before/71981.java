class badSink_class{
    private void badSink() throws Throwable
        {
            String data = dataBad;
    
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};