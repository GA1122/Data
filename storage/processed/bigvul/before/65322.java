class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int [] data;
    
            /* FIX: hardcode data to non-null */
            data = new int[5];
    
            Vector<int []> dataVector = new Vector<int []>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE476_NULL_Pointer_Dereference__int_array_72b()).goodG2BSink(dataVector  );
        }
};