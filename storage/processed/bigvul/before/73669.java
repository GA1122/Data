class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE789_Uncontrolled_Mem_Alloc__listen_tcp_HashMap_67b()).goodG2BSink(dataContainer  );
        }
};