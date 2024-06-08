class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                String sentence = "Convert this to bytes";
                byte[] sentenceAsBytes = new byte[sentence.length()];
                /* FLAW: Use of deprecated String.getBytes(int, int, byte[], int) method */
                sentence.getBytes(0, sentence.length(), sentenceAsBytes, 0);
                IO.writeLine(IO.toHex(sentenceAsBytes)); /* Use sentenceAsBytes */
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};