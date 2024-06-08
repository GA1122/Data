class badSink_class{
    private void badSink() throws Throwable
        {
            int data = dataBad;
    
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            data--;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};