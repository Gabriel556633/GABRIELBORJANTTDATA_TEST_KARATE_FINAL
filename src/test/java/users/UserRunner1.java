package users;


import com.intuit.karate.junit5.Karate;

class UserRunner1 {

    @Karate.Test
    Karate testUsers() {
        return Karate.run("C:\\DEUNAPRUEBA\\KARATE1\\KARATE_NTTDATA\\src\\test\\java\\users\\post-login-user-OK.feature");
    }



}
