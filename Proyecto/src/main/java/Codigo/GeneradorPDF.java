/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.FileNotFoundException;

/**
 *
 * @author KendallZR
 * @see 1.1.0
 * @since 17/11/2023
 */

public class GeneradorPDF {
    /**
     * @since 17/11/2023
     * @param metodosGeometricos
     * @param metodosElectricos
     * @param nombreArchivo 
     */
    public void generarInformePDF(Metodos_Geometricos metodosGeometricos, Metodos_Electricos metodosElectricos, String nombreArchivo) {
        try {
            PdfWriter writer = new PdfWriter(nombreArchivo);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // Título principal
            document.add(new Paragraph("Resultado Operaciones"));
            document.add(new Paragraph("\n"));

            // Subtítulos para Tipo de Dato, Datos Utilizados y Resultados (Geometricos)
            document.add(new Paragraph("Tipo de Dato - Geométrico"));
            document.add(new Paragraph("Dato - Geométrico"));
            document.add(new Paragraph("Resultado - Geométrico"));
            document.add(new Paragraph("\n"));

            // Obtener resultados de los cálculos geométricos
            for (String resultado : metodosGeometricos.getResultados()) {
                String[] partes = resultado.split(": "); // Dividir por ": " en lugar de " es: "
                String[] datos = partes[1].split(", ");
                document.add(new Paragraph("Tipo de Dato - Geométrico: " + datos[0]));
                document.add(new Paragraph("Datos - Geométrico: " + datos[1]));
                document.add(new Paragraph("Resultado - Geométrico: " + datos[2]));
                document.add(new Paragraph("\n"));
            }

            // Subtítulos para Tipo de Dato, Datos Utilizados y Resultados (Eléctricos)
            document.add(new Paragraph("Tipo de Dato - Eléctrico"));
            document.add(new Paragraph("Dato - Eléctrico"));
            document.add(new Paragraph("Resultado - Eléctrico"));
            document.add(new Paragraph("\n"));

            // Obtener resultados de los cálculos eléctricos
            for (String resultado : metodosElectricos.getResultados()) {
                String[] partes = resultado.split(": "); // Dividir por ": " en lugar de " es: "
                String[] datos = partes[1].split(", ");
                document.add(new Paragraph("Tipo de Dato - Geométrico: " + datos[0]));
                document.add(new Paragraph("Datos - Geométrico: " + datos[1]));
                document.add(new Paragraph("Resultado - Geométrico: " + datos[2]));
                document.add(new Paragraph("\n"));
            }
            
            //cierre de documento
            document.close();
        } catch (FileNotFoundException ex) {
            //imprimir mensaje de error
            System.out.println("Error al crear el archivo PDF: " + ex.getMessage());
        }
    }
}