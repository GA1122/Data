class goodB2GSink_class{
    public void goodB2GSink(LinkedList<StringBuilder> dataLinkedList ) throws Throwable
        {
            StringBuilder data = dataLinkedList.remove(2);
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};