class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                String sentence = "Convert this to bytes";
                /* FIX: Use preferred String.getBytes() method */
                byte[] sentenceAsBytes = sentence.getBytes("UTF-8");
                IO.writeLine(IO.toHex(sentenceAsBytes)); /* Use sentenceAsBytes */
            }
            else
            {
    
                String sentence = "Convert this to bytes";
    
                /* FIX: Use preferred String.getBytes() method */
                byte[] sentenceAsBytes = sentence.getBytes("UTF-8");
    
                IO.writeLine(IO.toHex(sentenceAsBytes)); /* Use sentenceAsBytes */
    
            }
        }
};