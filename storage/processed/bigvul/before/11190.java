class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            String data = CWE134_Uncontrolled_Format_String__database_printf_68a.data;
    
            if (data != null)
            {
                /* FIX: explicitly defined string formatting */
                System.out.printf("%s%n", data);
            }
    
        }
};