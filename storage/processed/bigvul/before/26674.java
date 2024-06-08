class bad_class{
    public void bad() throws Throwable
        {
            long data = (new CWE190_Integer_Overflow__long_max_postinc_61b()).badSource();
    
            /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
            data++;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};