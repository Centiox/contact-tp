package fr.lp.ic.contact.dao;

import java.util.List;
import java.util.Optional;

import fr.lp.ic.contact.model.Contact;

/**
 * Interface d'acc�s aux donn�es de type contact 
 * @author athorel
 *
 */
public interface IContactDao {

	/**
	 * R�cup�re la liste des contacts 
	 * @return liste des contacts 
	 */
	List<Contact> findAll();
	
	/**
	 * R�cup�re un contact a partir de son nom 
	 * @param name nom du contact 
	 * @return contact 
	 */
	Optional<Contact> findByName(String name);
	
	/**
	 * Permet de cr�er un contact 
	 * @param contact contact a cr�er 
	 * @return <code>true</code> si la cr�ation s'est correctement pass�e 
	 */
	boolean save(Contact contact);

	/**
	 * Permet de mettre un jour un contact 
	 * @param contact contact a mettre � jour 
	 * @return <code>true</code> si la mise � jour s'est correctement pass�e 
	 */
	boolean update(String name, Contact contact);
	
	/**
	 * Permet de supprimer un contact 
	 * @param name nom du contact a supprimer 
	 * @return <code>true</code> si la supression s'est bien pass�e
	 */
	boolean delete(String name);
	
}
