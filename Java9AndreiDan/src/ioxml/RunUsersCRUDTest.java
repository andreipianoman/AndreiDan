/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Turbotwins
 */
public class RunUsersCRUDTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            File inputFile = new File("C:\\Users\\Turbotwins\\Documents\\NetBeansProjects\\Java9AndreiDan\\Java9AndreiDan\\src\\ioxml\\users.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList userList = doc.getElementsByTagName("user");
            System.out.println("----------------------------");
            int length = userList.getLength();
            System.out.println("XML number of elements = "+length);
        
            UsersCRUD crud = new UsersCRUD();
            
            //Below are the CRUD operations commented. To run an operation, uncomment it and enter desired parameters.
            //The parameters are as follows:
            // For createUser: desired id(must be an integer), username and password (must be Strings) of the new user. The first two parameters remain unchanged.
            // For updateUser: The index of the user you want to update(must be integer), the new username and password (must be Strings), and the new desired id (must be integer).
            //The first parameter remains unchanged.
            // For deleteUser: The index (must be integer1) of the user you want to delete. The first parameter remains unchanged.
            // retrieveUsers should be run as it is. It will print all usernames and passwords in the console.
            
            //crud.createUser(doc, userList, 1, "username", "password");
            //crud.retrieveUsers(userList);
            //crud.updateUser(userList, 0, "user0", "passthing0", 6);
            //crud.deleteUser(userList, 4);
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(doc);
            StreamResult streamResult = new StreamResult(inputFile);
            
            transformer.transform(domSource, streamResult);
            
        } catch (ParserConfigurationException | SAXException | IOException | DOMException e) {
         e.printStackTrace();
        } catch (TransformerConfigurationException tce) {
            tce.printStackTrace();
        } catch (TransformerException te) {
            te.printStackTrace();
        }
    }
    
}