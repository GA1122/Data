class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* FLAW: Set data to Integer.MAX_VALUE */
            data = Integer.MAX_VALUE;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE789_Uncontrolled_Mem_Alloc__max_value_HashMap_67b()).badSink(dataContainer  );
        }
};