class goodG2BSink_class{
    public void goodG2BSink(CWE134_Uncontrolled_Format_String__URLConnection_format_67a.Container dataContainer ) throws Throwable
        {
            String data = dataContainer.containerOne;
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
    
        }
};