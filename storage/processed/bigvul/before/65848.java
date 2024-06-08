class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
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
                    /* FIX: Add a default case */
                default:
                    stringIntValue = "2";
                }
                IO.writeLine(stringIntValue);
            }
        }
};