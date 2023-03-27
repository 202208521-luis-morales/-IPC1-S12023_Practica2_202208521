package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import views.DataModel;

public class Utils {
    public static void generateHTMLReport(String path, DataModel datos) {
        try {
            String nDate = (new Date()).toString();
            nDate = nDate.replace(" ", "_");
            nDate = nDate.replace(":", "_");
            File archivo = new File(path, "Reporte_" + nDate + ".html");
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("<!DOCTYPE html>\n" +
"<html lang=\"es\">\n" +
"<head>\n" +
"  <meta charset=\"UTF-8\">\n" +
"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\n" +
"  <title>Reporte</title>\n" +
"</head>\n" +
"<body>\n" +
"  <div class=\"container\">\n" +
"    <h1 class=\"text-center\">Reporte " + (new Date()) + "</h1>\n" +
"    <table class=\"table table-striped\">\n" +
"      <tbody>\n" +
"        <tr>\n" +
"          <th scope=\"row\">Inventario</th>\n" +
"          <td>Q" + (datos.getInventary().getTime() * datos.getInventary().getCost() * 30) + "</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"          <th scope=\"row\">Producción</th>\n" +
"          <td>Q" + (datos.getProduction().getTime() * datos.getProduction().getCost() * 30) + "</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"          <th scope=\"row\">Empaquetamiento</th>\n" +
"          <td>Q" + (datos.getPackaging().getTime() * datos.getPackaging().getCost() * 30) + "</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"          <th scope=\"row\">Salida</th>\n" +
"          <td>Q" + (datos.getDeparture().getTime() * datos.getDeparture().getCost() * 30) + "</td>\n" +
"        </tr>\n" +
"        <tr class=\"fs-4 table-success\">\n" +
"          <th scope=\"row\">Total</th>\n" +
"          <td>Q" + (
                (datos.getInventary().getTime() * datos.getInventary().getCost() * 30)
                 + (datos.getProduction().getTime() * datos.getProduction().getCost() * 30)
                 + (datos.getPackaging().getTime() * datos.getPackaging().getCost() * 30)
                 + (datos.getDeparture().getTime() * datos.getDeparture().getCost() * 30)
            ) + "</td>\n" +
"        </tr>\n" +
"      </tbody>\n" +
"    </table>\n" +
"\n" +
"    <hr>\n" +
"    <h2>Luis Rodrigo Morales Florián</h2>\n" +
"    <h2>202208521</h2>\n" +
"  </div>\n" +
"</body>\n" +
"</html>");
            escritor.close();
            JOptionPane.showMessageDialog(null, "El archivo HTML fue creado en la ruta " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
