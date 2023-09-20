public class Animal {
    String gjj;

    int x = 5;
    int y = 10;


    Animal()
    {
        System.out.println("Wywolano konstruktor");
    }



    //zwracany_typ nazwa (opcjonalnie: parametry) {
    // OPCJONALNIE, JESLI TYP INNY NIZ VOID: return costam;
    // }

    void nicNieRob() {

    }

    void wypiszCos() {
        System.out.println("Wypisuje coś");
    }

    int dodawanie(int x, int y) {
        return x + y;
    }

    int odejmowanie(int x, int y) {
        return x - y;
    }

}

