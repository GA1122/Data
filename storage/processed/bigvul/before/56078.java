class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Set data to a random value */
                data = (new SecureRandom()).nextInt();
                break;
            }
    
            while (true)
            {
                /* FIX: test for a zero denominator */
                if (data != 0)
                {
                    IO.writeLine("100/" + data + " = " + (100 / data) + "\n");
                }
                else
                {
                    IO.writeLine("This would result in a divide by zero");
                }
                break;
            }
        }
};