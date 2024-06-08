class goodG2BSink_class{
    public void goodG2BSink(CWE190_Integer_Overflow__int_database_postinc_67a.Container dataContainer ) throws Throwable
        {
            int data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            data++;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};