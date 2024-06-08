class good2_class{
    private void good2() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_FIVE == 5)
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