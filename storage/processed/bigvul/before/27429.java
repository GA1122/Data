class badSink_class{
    public void badSink() throws Throwable
        {
            long data = CWE190_Integer_Overflow__long_rand_postinc_68a.data;
    
            /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
            data++;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};