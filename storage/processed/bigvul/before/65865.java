class good2_class{
    private void good2() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_FIVE == 5)
            {
                int zeroOrOne = (new SecureRandom()).nextInt(2); /* i will be 0 or 1 */
                boolean isZero = (zeroOrOne == 0);
                if(isZero == true) /* FIX: using == instead of = */
                {
                    IO.writeLine("zeroOrOne is 0");
                }
                IO.writeLine("isZero is: " + isZero);
            }
        }
};