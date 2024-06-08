class bad_class{
    public void bad() throws Throwable
        {
            String data = (new CWE134_Uncontrolled_Format_String__PropertiesFile_printf_61b()).badSource();
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.printf(data);
            }
    
        }
};