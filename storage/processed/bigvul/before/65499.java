class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE476_NULL_Pointer_Dereference__StringBuilder_67b()).badSink(dataContainer  );
        }
};