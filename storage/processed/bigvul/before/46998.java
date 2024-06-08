class badSink_class{
    public void badSink(byte[] dataSerialized ) throws Throwable
        {
            /* unserialize data */
            ByteArrayInputStream streamByteArrayInput = null;
            ObjectInputStream streamObjectInput = null;
    
            try
            {
                streamByteArrayInput = new ByteArrayInputStream(dataSerialized);
                streamObjectInput = new ObjectInputStream(streamByteArrayInput);
                String data = (String)streamObjectInput.readObject();
    
                String root;
                if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
                {
                    /* running on Windows */
                    root = "C:\\uploads\\";
                }
                else
                {
                    /* running on non-Windows */
                    root = "/home/user/uploads/";
                }
    
                if (data != null)
                {
                    /* POTENTIAL FLAW: no validation of concatenated value */
                    File file = new File(root + data);
                    FileInputStream streamFileInputSink = null;
                    InputStreamReader readerInputStreamSink = null;
                    BufferedReader readerBufferdSink = null;
                    if (file.exists() && file.isFile())
                    {
                        try
                        {
                            streamFileInputSink = new FileInputStream(file);
                            readerInputStreamSink = new InputStreamReader(streamFileInputSink, "UTF-8");
                            readerBufferdSink = new BufferedReader(readerInputStreamSink);
                            IO.writeLine(readerBufferdSink.readLine());
                        }
                        catch (IOException exceptIO)
                        {
                            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                        }
                        finally
                        {
                            /* Close stream reading objects */
                            try
                            {
                                if (readerBufferdSink != null)
                                {
                                    readerBufferdSink.close();
                                }
                            }
                            catch (IOException exceptIO)
                            {
                                IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                            }
    
                            try
                            {
                                if (readerInputStreamSink != null)
                                {
                                    readerInputStreamSink.close();
                                }
                            }
                            catch (IOException exceptIO)
                            {
                                IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                            }
    
                            try
                            {
                                if (streamFileInputSink != null)
                                {
                                    streamFileInputSink.close();
                                }
                            }
                            catch (IOException exceptIO)
                            {
                                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                            }
                        }
                    }
                }
    
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "IOException in deserialization", exceptIO);
            }
            catch (ClassNotFoundException exceptClassNotFound)
            {
                IO.logger.log(Level.WARNING, "ClassNotFoundException in deserialization", exceptClassNotFound);
            }
            finally
            {
                /* clean up stream reading objects */
                try
                {
                    if (streamObjectInput != null)
                    {
                        streamObjectInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing ObjectInputStream", exceptIO);
                }
    
                try
                {
                    if (streamByteArrayInput != null)
                    {
                        streamByteArrayInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing ByteArrayInputStream", exceptIO);
                }
            }
        }
};