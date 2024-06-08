class badSink_class{
    private void badSink(String data ) throws Throwable
        {
            if (badPrivate)
            {
                /* POTENTIAL FLAW: data could be null */
                if(data.equals("CWE690"))
                {
                    IO.writeLine("data is CWE690");
                }
            }
        }
};