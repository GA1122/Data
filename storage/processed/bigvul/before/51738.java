class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            float data = 0.0f;
    
            /* FIX: Use a hardcoded number that won't a divide by zero */
            data = 2.0f;
    
            goodG2BPublicStatic = true;
            (new CWE369_Divide_by_Zero__float_File_modulo_22b()).goodG2BSink(data );
        }
};