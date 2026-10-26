package org.example;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        // Main method implementation
        LectorXML lector = new LectorXML("src\\main\\java\\org.example\\clientes.xml");
        lector.leerClientes();
    }
}
