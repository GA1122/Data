class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data = (new CWE190_Integer_Overflow__int_database_preinc_61b()).goodB2GSource();
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Integer.MAX_VALUE)
            {
                int result = (int)(++data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to increment.");
            }
    
        }
};