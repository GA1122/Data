class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            Integer data;
    
            /* FIX: hardcode data to non-null */
            data = Integer.valueOf(5);
    
            Integer[] dataArray = new Integer[5];
            dataArray[2] = data;
            (new CWE476_NULL_Pointer_Dereference__Integer_66b()).goodG2BSink(dataArray  );
        }
};