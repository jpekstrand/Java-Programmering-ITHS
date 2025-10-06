public class MakeUnicorns {
<<<<<<< HEAD
    public static void main(String[] args) {
        Unicorn bengt = new Unicorn(5, "blå", true, "Glad", true); 
        Unicorn Ilse = new Unicorn(4, "gul", false, "likgiltig", true);
        Pegasus Bertil = new Pegasus(19, "Bertil", "lila", true, true);

        
        
        System.out.print(Ilse + "age");




        
        
    }

=======
    
    public static void main(String[] args) {
        Unicorn bengt = new Unicorn(5, "Blå", "Glad", true, true);
        Unicorn ilse = new Unicorn(4, "Gul", "Likgiltig", true, false);

        isThisAUnicorn(ilse);
        isThisAUnicorn(bengt);
    }

    static void isThisAUnicorn(Unicorn name) {
            System.out.println("Is this a unicorn? ");

        if (name.horn == true){
            System.out.println(name + " is a unicorn");
        }
        else{
            System.out.println(name + " is an imposter! It's just a horse with a dream!");
        }
    }
>>>>>>> e4ae8c770eff8545e69527e453e5c8400cdf2c0c
}
