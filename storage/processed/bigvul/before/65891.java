class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
                int zeroOrOne = (new SecureRandom()).nextInt(2); /* i will be 0 or 1 */
                boolean isZero = (zeroOrOne == 0);
                if(isZero == true) /* FIX: using == instead of = */
                {
                    IO.writeLine("zeroOrOne is 0");
                }
                IO.writeLine("isZero is: " + isZero);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};