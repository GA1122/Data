class badSink_class{
    public void badSink() throws Throwable
        {
            short data = CWE190_Integer_Overflow__short_console_readLine_postinc_68a.data;
    
            /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
            data++;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};