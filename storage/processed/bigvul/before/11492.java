class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data = null;
    
            /* FIX: Use a hardcoded string */
            data = "foo";
    
            goodG2BPublicStatic = true;
            (new CWE134_Uncontrolled_Format_String__Environment_printf_22b()).goodG2BSink(data );
        }
};