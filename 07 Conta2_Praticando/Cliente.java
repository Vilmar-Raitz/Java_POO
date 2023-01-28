class Cliente {
    String nome;
    String sobrenome;
    String cpf;

    public Cliente(String nome, String sobrenome, String cpf) { //contrutor de clase 

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = formatarCpf(cpf, nome, sobrenome);
    }

    private String formatarCpf(String cpf, String nome, String sobrenome) {

        if (validarCpf(cpf)) {
            return String.format("%s.%s.%s-%s", cpf.substring(0, 3), cpf.substring(3, 6), cpf.substring(6, 9),
                    cpf.substring(9, 11));
        } else
            throw new IllegalArgumentException(
                    "\nA conta do cliente: " + nome + " " + sobrenome + ", nao foi criado pois o CPF é INVALIDO!!!");

    }

    boolean validarCpf(String cpf) {
        return cpf.length() == 11;
    }
}
