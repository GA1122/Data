class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            Container countContainer = new Container();
            countContainer.containerOne = count;
            (new CWE400_Resource_Exhaustion__max_value_for_loop_67b()).goodB2GSink(countContainer  );
        }
};