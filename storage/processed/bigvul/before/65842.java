class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                String stringIntValue = "";
                int x = (new SecureRandom()).nextInt(3);
                switch (x)
                {
                case 0:
                    stringIntValue = "0";
                    break;
                case 1:
                    stringIntValue = "1";
                    break;
                    /* FLAW: x could be 2, and there is no 'default' case for that */
                }
                IO.writeLine(stringIntValue);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};