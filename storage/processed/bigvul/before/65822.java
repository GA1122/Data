class bad_class{
    public void bad() throws Throwable
        {
            if (privateReturnsTrue())
            {
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
            }
        }
};