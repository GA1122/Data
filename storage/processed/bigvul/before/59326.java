class goodG2BSink_class{
    public void goodG2BSink(Vector<Integer> countVector ) throws Throwable
        {
            int count = countVector.remove(2);
    
            int i = 0;
    
            /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
    
        }
};