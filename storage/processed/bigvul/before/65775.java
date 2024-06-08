class bad_class{
    public void bad() throws Throwable
        {
            if (privateReturnsTrue())
            {
                String sentence = "Convert this to bytes";
                byte[] sentenceAsBytes = new byte[sentence.length()];
                /* FLAW: Use of deprecated String.getBytes(int, int, byte[], int) method */
                sentence.getBytes(0, sentence.length(), sentenceAsBytes, 0);
                IO.writeLine(IO.toHex(sentenceAsBytes)); /* Use sentenceAsBytes */
            }
        }
};