class goodB2GSink_class{
    public void goodB2GSink(CWE134_Uncontrolled_Format_String__console_readLine_printf_67a.Container dataContainer ) throws Throwable
        {
            String data = dataContainer.containerOne;
    
            if (data != null)
            {
                /* FIX: explicitly defined string formatting */
                System.out.printf("%s%n", data);
            }
    
        }
};