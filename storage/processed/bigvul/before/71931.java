class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: data may be set to null */
                data = System.getProperty("CWE690");
            }
            else
            {
    
                /* FIX: Set data to a fixed, non-null String */
                data = "CWE690";
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: data could be null */
                if(data.equals("CWE690"))
                {
                    IO.writeLine("data is CWE690");
                }
            }
            else
            {
    
                /* FIX: call equals() on string literal (that is not null) */
                if("CWE690".equals(data))
                {
                    IO.writeLine("data is CWE690");
                }
    
            }
        }
};