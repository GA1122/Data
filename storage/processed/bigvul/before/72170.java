class goodB2GSink_class{
    public void goodB2GSink(LinkedList<String> dataLinkedList ) throws Throwable
        {
            String data = dataLinkedList.remove(2);
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};