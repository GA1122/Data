class badSink_class{
    public void badSink() throws Throwable
        {
            String data = CWE134_Uncontrolled_Format_String__PropertiesFile_printf_68a.data;
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.printf(data);
            }
    
        }
};