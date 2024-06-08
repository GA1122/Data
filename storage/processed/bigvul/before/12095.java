class badSink_class{
    public void badSink() throws Throwable
        {
            String data = CWE134_Uncontrolled_Format_String__listen_tcp_format_68a.data;
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data);
            }
    
        }
};