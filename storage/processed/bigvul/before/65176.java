class bad_class{
    public void bad() throws Throwable
        {
            Integer data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            Integer[] dataArray = new Integer[5];
            dataArray[2] = data;
            (new CWE476_NULL_Pointer_Dereference__Integer_66b()).badSink(dataArray  );
        }
};