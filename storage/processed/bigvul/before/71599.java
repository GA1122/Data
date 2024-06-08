class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Set data to a fixed, non-null String */
                data = "CWE690";
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
    
                /* POTENTIAL FLAW: data could be null */
                if(data.equals("CWE690"))
                {
                    IO.writeLine("data is CWE690");
                }
    
            }
        }
};