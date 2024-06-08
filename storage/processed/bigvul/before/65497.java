class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
    
            /* FIX: hardcode data to non-null */
            data = new StringBuilder();
    
            StringBuilder[] dataArray = new StringBuilder[5];
            dataArray[2] = data;
            (new CWE476_NULL_Pointer_Dereference__StringBuilder_66b()).goodG2BSink(dataArray  );
        }
};