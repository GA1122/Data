class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            String data = CWE134_Uncontrolled_Format_String__PropertiesFile_format_68a.data;
    
            if (data != null)
            {
                /* FIX: explicitly defined string formatting */
                System.out.format("%s%n", data);
            }
    
        }
};