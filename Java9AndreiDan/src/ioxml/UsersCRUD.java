/*
 * Run CRUD operations on users.xml file
 */
package ioxml;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Turbotwins
 */
public class UsersCRUD {

    /**
     * Method that creates a user element and appends it to users.xml
     */
    public void createUser(Document doc, NodeList userList, Integer userID, String newUsername, String newPassword) {
        
        int length = userList.getLength();
        
        Element usersTag = doc.getDocumentElement();
        Element newUser = doc.createElement("user");
        newUser.setAttribute("id", Integer.toString(userID));
            
        Element username = doc.createElement("username");
        username.setTextContent(newUsername);
            
        Element password = doc.createElement("password");
        password.setTextContent(newPassword);
            
        newUser.appendChild(username);
        newUser.appendChild(password);
        usersTag.appendChild(newUser);
    }
    
    /**
     * Method that deletes given user from users.xml
     */
    public void deleteUser(NodeList userList, Integer userIndex) {
        Node user = userList.item(userIndex);
        System.out.println("\nCurrent Element :" + user.getNodeName());
        if (user.getNodeType() == Node.ELEMENT_NODE) {
           Element userElement = (Element) user;
           user.getParentNode().removeChild(user);
           System.out.println("Element deleted");
        }
    }
    
    /**
     * Method that retrieves all data from users.XML
     */
    public void retrieveUsers(NodeList userList) {
        int length = userList.getLength();
        for (int temp = 0; temp < length; temp++) {
            Node user = userList.item(temp);
            System.out.println("\nCurrent Element :" + user.getNodeName());
            if (user.getNodeType() == Node.ELEMENT_NODE) {
                Element userElement = (Element) user;
                System.out.println("username : " 
                + userElement.getElementsByTagName("username")
                    .item(0)
                    .getTextContent());
                System.out.println("password : " 
                + userElement
                    .getElementsByTagName("password")
                    .item(0)
                    .getTextContent());
            }
        }
    }
    
    /**
     * Method that updates given user in users.xml
     */
    public void updateUser(NodeList userList, Integer userIndex, String username, String password, Integer id) {
    
        Node user = userList.item(userIndex);
        System.out.println("\nCurrent Element :" + user.getNodeName());
        if (user.getNodeType() == Node.ELEMENT_NODE) {
           Element userElement = (Element) user;
           
           Element usernameElement = (Element) userElement.getElementsByTagName("username").item(0);
           usernameElement.setTextContent(username);
           
           Element passwordElement = (Element) userElement.getElementsByTagName("password").item(0);
           passwordElement.setTextContent(password);
           
           userElement.setAttribute("id", Integer.toString(id));
        }
    }
}