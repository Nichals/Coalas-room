/**
 * 
 */
package br.com.coalaroom.controller;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import br.com.coalaroom.model.User;
/**
 * @author vinicius.nichals
 *
 */
public class Sockets {
	Socket socket;
	OutputStream ou;
	OutputStreamWriter ouw;
	BufferedWriter bfw;
	
	public void conect(String ip, String port,User user) throws IOException{
        
		  socket = new Socket(ip,Integer.parseInt(port));
		  ou = socket.getOutputStream();
		  ouw = new OutputStreamWriter(ou);
		  bfw = new BufferedWriter(ouw);
		  bfw.write("\r\n");
		  bfw.flush();
		}
}
