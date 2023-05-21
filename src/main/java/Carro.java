class Carro {
    private String modelo;

    private boolean disponivel;

    public Carro(String modelo, boolean disponivel) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public Carro setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public Carro setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        return this;
    }
}