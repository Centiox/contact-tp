package fr.lp.ic.contact;

import java.util.List;

import fr.lp.ic.contact.dao.ContactDaoImpl;
import fr.lp.ic.contact.dao.IContactDao;
import fr.lp.ic.contact.exception.ContactException;
import fr.lp.ic.contact.exception.ContactNotFoundException;
import fr.lp.ic.contact.model.Contact;

/**
 * Service - M�thodes a d�velopper ici
 * 
 * @author athorel
 *
 */
public class ContactService {

	// Ne pas bouger
	private IContactDao contactDao = new ContactDaoImpl();

	/**
	 * D�velopper ici la m�thode qui retourne une liste de contact, tri� par le nom
	 * 
	 * @return list des contact tri�s
	 */
	public List<String> listAll() {
		return null;
	}

	/**
	 * D�velopper ici la m�thode permettant d'afficher le nombre de contact
	 * 
	 * @return nombre de contact
	 */
	public int count() {
		return 0;
	}

	/**
	 * D�velopper ici la m�thode permettant d'ajouter un nouveau contact
	 * 
	 * @param name        le nom doit �tre compris entre 3 et 40 caract�res
	 * @param phoneNumber le num�ro de t�l�phone doit commencer par 02 et contenir
	 *                    10 chiffres
	 * @param email       l'email doit contenir au mois 5 caract�res et avoir un @
	 *                    et un .
	 * @throws ContactException Le nom doit �tre unique, si il est d�j� existant on
	 *                          l�ve une ContactException
	 */
	public void newContact(String name, String phoneNumber, String email) throws ContactException {

	}

	/**
	 * D�velopper ici la m�thode permettant de mettre � jour un contact
	 * 
	 * @param name        le nom doit �tre compris entre 3 et 40 caract�res
	 * @param phoneNumber le num�ro de t�l�phone doit commencer par 02 et contenir
	 *                    10 chiffres
	 * @param email       l'email doit contenir au mois 5 caract�res et avoir un @
	 *                    et un .
	 * @throws ContactException         Le nom doit �tre unique, si il est d�j�
	 *                                  existant on l�ve une ContactException
	 *                                  
	 * @throws ContactNotFoundException Si l'utilisateur n'existe pas on l�ve une
	 *                                  ContactNotFoundException
	 */
	public void updateContact(String name, String newName, String phoneNumber, String email)
			throws ContactException, ContactNotFoundException {

	}

	/**
	 * D�velopper ici la m�thode permettant de supprimer un contact
	 * 
	 * @param name        le nom de l'utilisateur a supprimer                                 
	 * @throws ContactNotFoundException Si l'utilisateur n'existe pas on l�ve une
	 *                                  ContactNotFoundException
	 */
	public void deleteContact(String name) throws ContactException {

	}

}
