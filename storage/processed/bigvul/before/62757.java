class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            int count = CWE400_Resource_Exhaustion__sleep_File_68a.count;
    
            /* FIX: Validate count before using it in a call to Thread.sleep() */
            if (count > 0 && count <= 2000)
            {
                Thread.sleep(count);
            }
    
        }
};