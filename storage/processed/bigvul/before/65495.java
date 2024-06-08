class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            StringBuilder[] dataArray = new StringBuilder[5];
            dataArray[2] = data;
            (new CWE476_NULL_Pointer_Dereference__StringBuilder_66b()).badSink(dataArray  );
        }
};