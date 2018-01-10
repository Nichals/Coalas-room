/**
 * 
 */
package br.com.coalaroom.model;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author vinicius.nichals
 *
 */
public class User {
	
	Integer id;
	String name;
	String lastName;
	String password;
	LocalDateTime lastLogOn;
	List<Room> listRoom;

}
