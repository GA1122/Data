class goodB2GSink_class{
    public void goodB2GSink(LinkedList<StringBuilder> dataLinkedList ) throws Throwable
        {
            StringBuilder data = dataLinkedList.remove(2);
    
            /* FIX: validate that data is non-null */
            if (data != null)
            {
                IO.writeLine("" + data.length());
            }
            else
            {
                IO.writeLine("data is null");
            }
    
        }
};