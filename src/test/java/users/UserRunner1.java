package users;


import com.intuit.karate.junit5.Karate;

class UserRunner1 {

    @Karate.Test
    Karate testUsers() {
        LeerDatos datos = new LeerDatos();
        String password = datos.leerDatos().getPassword();
        String username = datos.leerDatos().getUsername();
        System.out.println(datos.leerDatos().getPassword());

        String prueba1=("src/test/java/users/post-login-user-FAIL.feature");
        String prueba2=("src/test/java/users/post-login-user-OK.feature");
        String prueba3=("src/test/java/users/post-signup-user-FAIL.feature");
        String prueba4=("src/test/java/users/post-signup-user-OK.feature");
        // Setear la direccion de donde se encuentran los archivos .feature

            return Karate.run(prueba1,password,username);
            // cambiar la variable prueba para ejecutar los otros endpoints


    }



}
