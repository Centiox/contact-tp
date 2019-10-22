package fr.lp.ic.contact;

import fr.lp.ic.contact.dao.IContactDao;
import fr.lp.ic.contact.exception.ContactException;
import fr.lp.ic.contact.model.Contact;
import org.easymock.EasyMock;
import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import java.util.Optional;

public class ContactServiceMockTest {

    @Rule
    public EasyMockRule rule = new EasyMockRule(this);

    @TestSubject
    ContactService contactService = new ContactService();

    @Mock
    IContactDao contactDao;

    @Test(expected = ContactException.class)
    public void shouldFailIfNameAlreadyExists() throws ContactException {
        String name = "nicolas";
        EasyMock.expect(contactDao.findByName(name)).andReturn(Optional.of(new Contact()));
        EasyMock.replay(contactDao);
        contactService.deleteContact(name);

        contactService.newContact(name, "0675852417", "test@yopmail.com");
        Contact value = capturedContact.getValue();
        Assert.assertEquals(name, value.getName());
        Assert.assertEquals("Phone error", "0675852417", value.getPhone());
        Assert.assertEquals("email error","test@yopmail.com", value.getEmail());
    }

    @Test(expected = ContactException.class)
    public void shouldShowSomeEasyMockSamples() throws ContactException {
        String name = "nicolas";
        EasyMock.expect(contactDao.findByName(name)).andReturn(Optional.of(new Contact()));
        EasyMock.replay(contactDao);
        contactService.deleteContact(name);
}
