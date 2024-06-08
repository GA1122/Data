class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: hardcode data to non-null */
            data = "This is not null";
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE476_NULL_Pointer_Dereference__String_66b()).goodG2BSink(dataArray  );
        }
};