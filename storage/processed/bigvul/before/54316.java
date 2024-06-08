class goodB2GSink_class{
    public void goodB2GSink(Vector<Integer> dataVector ) throws Throwable
        {
            int data = dataVector.remove(2);
    
            /* FIX: test for a zero denominator */
            if (data != 0)
            {
                IO.writeLine("100/" + data + " = " + (100 / data) + "\n");
            }
            else
            {
                IO.writeLine("This would result in a divide by zero");
            }
    
        }
};