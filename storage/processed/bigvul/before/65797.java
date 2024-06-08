class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
                String sentence = "Convert this to bytes";
                /* FIX: Use preferred String.getBytes() method */
                byte[] sentenceAsBytes = sentence.getBytes("UTF-8");
                IO.writeLine(IO.toHex(sentenceAsBytes)); /* Use sentenceAsBytes */
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};