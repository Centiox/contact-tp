package fr.lp.ic.contact;

import fr.lp.ic.contact.exception.ContactException;
import org.junit.Test;

public class ContactServiceTest {

    public static final String VALID_PHONE_NUMBER = "0236323521";
    public static final String VALID_EMAIL = "text@yopmail.com";
    private ContactService service = new ContactService();

    @Test(expected = IllegalArgumentException.class)
    public void shouldFailedIfNameLessThanThree() throws ContactException {
        //Empty test
        service.newContact("ab", VALID_PHONE_NUMBER, VALID_EMAIL);
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldFailedIfNameGreaterThanForty() throws ContactException {
        //Empty test
        service.newContact("abcdefghijklmnopqrstuvwxyzabcdefghijklmnop", VALID_PHONE_NUMBER, VALID_EMAIL);
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldFailedIfNameIsNull() throws ContactException {
        //Empty test
        service.newContact(null, VALID_PHONE_NUMBER, VALID_EMAIL);
    }

    @Test(expected = ContactException.class)
    public void shouldFailedIfNameAlreadyExists() throws ContactException {
        //Empty test
        service.newContact("nicolas", VALID_PHONE_NUMBER, VALID_EMAIL);
        service.newContact("nicolas", VALID_PHONE_NUMBER, VALID_EMAIL);
    }


    }
