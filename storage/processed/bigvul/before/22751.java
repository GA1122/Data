class goodG2BSink_class{
    public void goodG2BSink() throws Throwable
        {
            int data = CWE190_Integer_Overflow__int_PropertiesFile_postinc_68a.data;
    
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            data++;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};