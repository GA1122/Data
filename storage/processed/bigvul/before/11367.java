class goodB2GSink_class{
    public void goodB2GSink(CWE134_Uncontrolled_Format_String__Environment_format_67a.Container dataContainer ) throws Throwable
        {
            String data = dataContainer.containerOne;
    
            if (data != null)
            {
                /* FIX: explicitly defined string formatting */
                System.out.format("%s%n", data);
            }
    
        }
};