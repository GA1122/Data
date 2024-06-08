class bad_class{
    public void bad() throws Throwable
        {
            int data = (new CWE190_Integer_Overflow__int_random_postinc_61b()).badSource();
    
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            data++;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};