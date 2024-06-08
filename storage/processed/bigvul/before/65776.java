class good1_class{
    private void good1() throws Throwable
        {
            if (privateReturnsFalse())
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
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