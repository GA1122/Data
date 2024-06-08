class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            byte data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            Vector<Byte> dataVector = new Vector<Byte>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE191_Integer_Underflow__byte_console_readLine_multiply_72b()).goodG2BSink(dataVector  );
        }
};