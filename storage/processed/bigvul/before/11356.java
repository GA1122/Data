class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data = (new CWE134_Uncontrolled_Format_String__Environment_format_61b()).goodG2BSource();
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
    
        }
};