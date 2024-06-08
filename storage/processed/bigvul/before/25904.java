class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long data = (new CWE190_Integer_Overflow__long_console_readLine_postinc_61b()).goodG2BSource();
    
            /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
            data++;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};