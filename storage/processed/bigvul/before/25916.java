class goodG2BSink_class{
    public void goodG2BSink(CWE190_Integer_Overflow__long_console_readLine_postinc_67a.Container dataContainer ) throws Throwable
        {
            long data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
            data++;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};