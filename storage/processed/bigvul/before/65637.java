class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE476_NULL_Pointer_Dereference__String_67b()).badSink(dataContainer  );
        }
};