class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            data = 0; /* POTENTIAL FLAW: data is set to zero */
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE369_Divide_by_Zero__int_zero_divide_67b()).badSink(dataContainer  );
        }
};