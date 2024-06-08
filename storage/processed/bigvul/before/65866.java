class bad_class{
    public void bad() throws Throwable
        {
            if (privateFive == 5)
            {
                int zeroOrOne = (new SecureRandom()).nextInt(2);
                boolean isZero = (zeroOrOne == 0);
                if(isZero = true) /* FLAW: should be == and INCIDENTIAL CWE 571 Expression Is Always True */
                {
                    IO.writeLine("zeroOrOne is 0");
                }
                IO.writeLine("isZero is: " + isZero);
            }
        }
};