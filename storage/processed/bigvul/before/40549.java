class goodG2BSink_class{
    private void goodG2BSink() throws Throwable
        {
            long data = dataGoodG2B;
    
            /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
            data--;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};