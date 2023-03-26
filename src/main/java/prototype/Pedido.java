package padroescriacao.prototype;

public class Pedido implements Cloneable {
    private String logradouro;

    private Integer pedidoNum;

    public Pedido(String logradouro, Integer pedidoNum) {
        super();
        this.logradouro = logradouro;
        this.pedidoNum = pedidoNum;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getpedidoNum() {
        return pedidoNum;
    }

    public void setPedidoNum(Integer pedidoNum) {
        this.pedidoNum = pedidoNum;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "logradouro='" + logradouro + '\'' +
                ", pedidoNum=" + pedidoNum +
                '}';
    }
}
