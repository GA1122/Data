class goodG2BSink_class{
    public void goodG2BSink(CWE190_Integer_Overflow__short_max_postinc_67a.Container dataContainer ) throws Throwable
        {
            short data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
            data++;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};