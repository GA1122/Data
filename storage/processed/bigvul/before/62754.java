class goodB2GSink_class{
    public void goodB2GSink(CWE400_Resource_Exhaustion__sleep_File_67a.Container countContainer ) throws Throwable
        {
            int count = countContainer.containerOne;
    
            /* FIX: Validate count before using it in a call to Thread.sleep() */
            if (count > 0 && count <= 2000)
            {
                Thread.sleep(count);
            }
    
        }
};