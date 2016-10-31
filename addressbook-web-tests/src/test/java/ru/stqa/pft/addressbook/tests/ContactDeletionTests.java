package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testsContactModification() {
    app.getContactHelper().selectContact();;
    app.getContactHelper().deleteContact();
    app.getContactHelper().acceptAlert();
  }
}
