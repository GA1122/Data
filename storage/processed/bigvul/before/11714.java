class bad_class{
    public void bad() throws Throwable
        {
            String data = (new CWE134_Uncontrolled_Format_String__File_format_61b()).badSource();
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
    
        }
};