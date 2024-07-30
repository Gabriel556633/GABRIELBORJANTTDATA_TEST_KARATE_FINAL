package users;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerDatos {

    Gson gson = new Gson();

        // Lee el archivo JSON
        BufferedReader br;

    public datos leerDatos() {
        datos datos1;
        try {
            br = new BufferedReader(new FileReader("src/test/java/users/datos.json"));
            // Convierte el contenido del archivo JSON a una clase Java
            datos1 = gson.fromJson(br, datos.class);
            // Ahora puedes acceder a los datos del objeto como lo harías normalmente en Java

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return datos1;
    }

}


