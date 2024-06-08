class badSink_class{
    public void badSink(Object dataObject ) throws Throwable
        {
            int data = (Integer)dataObject;
    
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            data++;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};