/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author KendallZR
 * @see 1.1.0
 * @since 17/11/2023
 */

public class GeneradorExcel {

    /**
     * @since 17/11/2023
     * @param metodosGeometricos
     * @param metodosElectricos
     * @param nombreArchivo 
     */
    public void generarInformeExcel(Metodos_Geometricos metodosGeometricos, Metodos_Electricos metodosElectricos, String nombreArchivo) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Resultados Operaciones");

            // Título principal
            Row titleRow = sheet.createRow(0);
            titleRow.createCell(0).setCellValue("Resultado Operaciones - Geométricas");
            sheet.createRow(1);

            // Subtítulos para Tipo de Dato, Datos Utilizados y Resultados (Geometricos)
            Row subtitleRow = sheet.createRow(2);
            subtitleRow.createCell(0).setCellValue("Tipo de Dato");
            subtitleRow.createCell(1).setCellValue("Dato - Geométrico");
            subtitleRow.createCell(2).setCellValue("Resultado - Geométrico");

            int rowNum = 3;

            // Obtener resultados de los cálculos geométricos
            for (String resultado : metodosGeometricos.getResultados()) {
                String[] partes = resultado.split(": ");
                String[] datos = partes[1].split(",");
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue("Tipo de Dato - Geométrico: " + datos[0]);
                row.createCell(1).setCellValue("Datos - Geométrico: " + datos[1]);
                row.createCell(2).setCellValue("Resultado - Geométrico: " + datos[2]);
            }

            // Subtítulos para Tipo de Dato, Datos Utilizados y Resultados (Eléctricos)
            Row subtitleRow2 = sheet.createRow(rowNum++);
            subtitleRow2.createCell(0).setCellValue("Tipo de Dato - Eléctrico");
            subtitleRow2.createCell(1).setCellValue("Dato - Eléctrico");
            subtitleRow2.createCell(2).setCellValue("Resultado - Eléctrico");
            
            //obtener resultados de los calculos electricos
            for (String resultado : metodosElectricos.getResultados()) {
                String[] partes = resultado.split(": ");
                String[] datos = partes[1].split(",");
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue("Tipo de Dato - Geométrico: " + datos[0]);
                row.createCell(1).setCellValue("Datos - Geométrico: " + datos[1]);
                row.createCell(2).setCellValue("Resultado - Geométrico: " + datos[2]);
            }

            // Escribir el libro de trabajo en un archivo
            try (FileOutputStream fileOut = new FileOutputStream(nombreArchivo)) {
                workbook.write(fileOut);
            }

        } catch (IOException ex) {
            //imprime error de documento
            System.out.println("Error al crear el archivo Excel: " + ex.getMessage());
        }
    }
}