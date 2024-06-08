class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                /* FLAW: java.util.Random() is considered a weak PRNG */
                Random random = new Random();
                IO.writeLine("" + random.nextInt());
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};