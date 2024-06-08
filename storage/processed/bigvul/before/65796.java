class good1_class{
    private void good1() throws Throwable
        {
            switch (8)
            {
            case 7:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            default:
                String sentence = "Convert this to bytes";
                /* FIX: Use preferred String.getBytes() method */
                byte[] sentenceAsBytes = sentence.getBytes("UTF-8");
                IO.writeLine(IO.toHex(sentenceAsBytes)); /* Use sentenceAsBytes */
                break;
            }
        }
};