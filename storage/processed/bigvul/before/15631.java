class goodG2BSink_class{
    public void goodG2BSink() throws Throwable
        {
            byte data = CWE190_Integer_Overflow__byte_max_postinc_68a.data;
    
            /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
            data++;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};