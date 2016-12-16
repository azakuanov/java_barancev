package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import ru.stqa.pft.addressbook.model.GroupData;


import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase {

  @DataProvider
  public Iterator<Object[]> validContacts() {
    File photo = new File("src/test/resources/stru.jpg");
    List<Object[]> list = new ArrayList<Object[]>();
    list.add(new Object[] {new ContactData().withFirstName("test").withGroup("test").withLastName("testerov")
            .withPhoto(photo).withGroup("group name")});
    list.add(new Object[] {new ContactData().withFirstName("test").withGroup("test").withLastName("testerov")
            .withPhoto(photo).withGroup("group name")});
    list.add(new Object[] {new ContactData().withFirstName("test").withGroup("test").withLastName("testerov")
            .withPhoto(photo).withGroup("group name")});
    return list.iterator();
  }

  @Test(dataProvider = "validContacts")
  public void contactCreationTests(ContactData contact) {
    Contacts before = app.contact().all();
    app.contact().create(contact);
    Contacts after = app.contact().all();
    assertThat(after.size(), equalTo(before.size() + 1));
    assertThat(after, equalTo(
            before.withAdded(contact.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
  }
}
