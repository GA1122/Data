class badSink_class{
    public void badSink(CWE134_Uncontrolled_Format_String__PropertiesFile_printf_67a.Container dataContainer ) throws Throwable
        {
            String data = dataContainer.containerOne;
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.printf(data);
            }
    
        }
};