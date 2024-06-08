class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data = (new CWE190_Integer_Overflow__int_database_postinc_61b()).goodG2BSource();
    
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            data++;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};