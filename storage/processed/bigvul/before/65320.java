class bad_class{
    public void bad() throws Throwable
        {
            int [] data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            Vector<int []> dataVector = new Vector<int []>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE476_NULL_Pointer_Dereference__int_array_72b()).badSink(dataVector  );
        }
};