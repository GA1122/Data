class badSink_class{
    public void badSink(HashMap<Integer,String> dataHashMap ) throws Throwable
        {
            String data = dataHashMap.get(2);
    
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};