class goodG2BSink_class{
    public void goodG2BSink() throws Throwable
        {
            String data = CWE134_Uncontrolled_Format_String__Environment_format_68a.data;
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
    
        }
};