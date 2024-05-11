public class User {
    private static User istanza;
    private String nome;
    private Integer eta;

    public User() {
        this.nome = "---NON ABBIAMO UN NOME---";
        this.eta = 0;
    }
    public static User getInstance() {
        if (istanza== null) {
            istanza = new User();
        }
        return istanza;
    }


    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void stampaInfo(){
        System.out.println("nome " + nome);
        System.out.println("eta " + eta);
    }
}

