class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
    
            /* FIX: hardcode data to non-null */
            data = new StringBuilder();
    
            Vector<StringBuilder> dataVector = new Vector<StringBuilder>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE476_NULL_Pointer_Dereference__StringBuilder_72b()).goodG2BSink(dataVector  );
        }
};