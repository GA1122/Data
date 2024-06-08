class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            short data = (new CWE190_Integer_Overflow__short_max_postinc_61b()).goodG2BSource();
    
            /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
            data++;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};