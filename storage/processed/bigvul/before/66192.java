class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrue())
            {
                Properties properties = new Properties();
                Session session = Session.getDefaultInstance(properties, null);
                String messageBody = "...";
                try
                {
                    Message message = new MimeMessage(session); /* INCIDENTAL: CWE506 Encoded Payload */
                    message.setFrom(new InternetAddress("sender@example.com"));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress("recipient@example.com"));
                    message.setSubject("Shhh, I'm sending some bad stuff!");
                    message.setText(messageBody);
                    /* FLAW: Send an e-mail */
                    Transport.send(message);
                }
                catch (AddressException exceptAddress)
                {
                    /* If you are trying to hide the presence of something bad in code
                     * (i.e. e-mail) then you normally would not indicate errors in
                     * the log, but we're trying to avoid numerous incidentals for
                     * an empty catch block
                     */
                    IO.logger.log(Level.WARNING, "Address is formatted incorrectly", exceptAddress);
                }
                catch (MessagingException exceptMessaging)
                {
                    /* If you are trying to hide the presence of something bad in code
                     * (i.e. e-mail) then you normally would not indicate errors in
                     * the log, but we're trying to avoid numerous incidentals for
                     * an empty catch block
                     */
                    IO.logger.log(Level.WARNING, "Error sending message", exceptMessaging);
                }
            }
        }
};