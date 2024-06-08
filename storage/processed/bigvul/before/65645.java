class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: hardcode data to non-null */
            data = "This is not null";
    
            Vector<String> dataVector = new Vector<String>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE476_NULL_Pointer_Dereference__String_72b()).goodG2BSink(dataVector  );
        }
};