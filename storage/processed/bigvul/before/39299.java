class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long data = goodG2BSource();
    
            /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
            data--;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};