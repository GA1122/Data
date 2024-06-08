class bad_class{
    public void bad() throws Throwable
        {
            short data = (new CWE190_Integer_Overflow__short_max_postinc_61b()).badSource();
    
            /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
            data++;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};