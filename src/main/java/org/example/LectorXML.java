package org.example;
//Se quieren consolidar dos bases de datos, una con datos de clientes y otra con información de pedidos de dichos clientes, y fusionar sus datos.
//
//Para ello nos han proporcionado un volcado de datos en forma de fichero XML para los clientes y JSON para los pedidos.
//
//Se deben unir ambos ficheros en un único documento que indique los pedidos asociados a cada cliente (identificados por el DNI del cliente).
//
//El resultado debe guardarse en un fichero XML con su correspondiente indentación.
//
//Tareas a realizar:
//
//Eliminar el campo DNI de los pedidos, ya que al estar asociados al cliente que tiene su DNI es redundante.
//Para cada pedido indicar su ID como atributo del pedido en el XML y borrar el elemento ID.
//Escribir los datos en un fichero de acceso aleatorio.
//Pedir al usuario por teclado una posición, un rango (ej. 2-5) o varias posiciones (ej. 2,4,6), validar las entradas (en caso de no ser correcta, pedir que la introduzca de nuevo) y mostrarlas por pantalla.
//Se debe capturar todas las excepciones y validar la entrada de datos, el programa no puede terminar de forma inesperada.
//
//En la siguiente tabla, se puede ver la puntuación de cada una de las tareas que componen el programa.

import java.io.*;
import java.util.*;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class LectorXML {

    private final Document documento;

    public LectorXML(String rutaClientes) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
        DocumentBuilder constructor = fabrica.newDocumentBuilder();
        documento = constructor.parse(rutaClientes);
    }

    public void leerClientes() {
        NodeList clientes = documento.getElementsByTagName("cliente");
        System.out.println("Número de clientes: " + clientes.getLength());
    }
}
