class goodB2GSink_class{
    public void goodB2GSink(LinkedList<Integer> dataLinkedList ) throws Throwable
        {
            Integer data = dataLinkedList.remove(2);
    
            /* FIX: validate that data is non-null */
            if (data != null)
            {
                IO.writeLine("" + data.toString());
            }
            else
            {
                IO.writeLine("data is null");
            }
    
        }
};