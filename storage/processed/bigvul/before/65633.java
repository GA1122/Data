class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE476_NULL_Pointer_Dereference__String_66b()).badSink(dataArray  );
        }
};