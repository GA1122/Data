class bad_class{
    public void bad() throws Throwable
        {
            byte data = (new CWE190_Integer_Overflow__byte_rand_postinc_61b()).badSource();
    
            /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
            data++;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};