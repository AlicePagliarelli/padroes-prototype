package padroescriacao.prototype;

public class Cliente implements Cloneable {

    private int identificacao;
    private String nome;

    private padroescriacao.prototype.Pedido pedido;
    private String localNascimento;

    public Cliente(int identificacao, String nome, padroescriacao.prototype.Pedido pedido, String localNascimento) {
        this.identificacao = identificacao;
        this.nome = nome;
        this.pedido = pedido;
        this.localNascimento = localNascimento;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public padroescriacao.prototype.Pedido getPedido() { return pedido;
    }

    public void setPedido(padroescriacao.prototype.Pedido pedido) {
        this.pedido = pedido;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    @Override
    public Cliente clone() throws CloneNotSupportedException {
        Cliente clienteClone = (Cliente) super.clone();
        clienteClone.pedido = (padroescriacao.prototype.Pedido) clienteClone.pedido.clone();
        return clienteClone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "identificacao=" + identificacao +
                ", nome='" + nome + '\'' +
                ", pedido=" + pedido +
                ", localNascimento='" + localNascimento + '\'' +
                '}';
    }
}
