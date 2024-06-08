class goodB2GSink_class{
    public void goodB2GSink(int countArray[] ) throws Throwable
        {
            int count = countArray[2];
    
            int i = 0;
    
            /* FIX: Validate count before using it as the for loop variant */
            if (count > 0 && count <= 20)
            {
                for (i = 0; i < count; i++)
                {
                    IO.writeLine("Hello");
                }
            }
    
        }
};