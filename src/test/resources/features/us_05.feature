@US_005_Test
Feature: US_005_TC_001

  @US002_TC001_UI
  Scenario: The user should be able to click on"FIYAT SOR" button in the "MENU"  and send the message successfully.
 Given Go to homepage
 Then Click on Iletisim button
 Then Click on "FIYAT SOR" button
 Then Enter your name into the "Adiniz" field
 Then Enter your surname into the "Soyadiniz" field
 Then Enter your email address into the "E-Posta Adresiniz" field
 Then Enter your telephone number into the "Telefon Numaraniz" field
 Then Select the hospital banch from "Sube Seciniz"
 Then Select your insurance status from "Sigorta Durumu"
 Then Enter your message into the "Mesajiniz" field
 Then Enter the 5 digit number in the "Guvenlik Kodu" field
 Then Click on the "GONDER" button
 Then Verifies that the message has been sent