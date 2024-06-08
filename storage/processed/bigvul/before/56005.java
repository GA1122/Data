class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            CWE369_Divide_by_Zero__int_Property_modulo_81_base baseObject = new CWE369_Divide_by_Zero__int_Property_modulo_81_goodG2B();
            baseObject.action(data );
        }
};