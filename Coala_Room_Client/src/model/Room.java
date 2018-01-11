/**
 * 
 */
package model;

import java.util.List;

/**
 * @author vinicius.nichals
 *
 */
public class Room {
	
	Integer id;
	String name;
	String description;
	User owner;
	User creator;
	String password;
	List<Message> listMessage;

}
