package co.usa.ciclo3.reto3.Reportes;

import co.usa.ciclo3.reto3.model.Client;

public class ContadorClientes {
    private Long total;
    private Client client;
    public ContadorClientes(Long total, Client client) {
        this.total = total;
        this.client = client;
    }
    public Long getTotal() {
        return total;
    }
    public void setTotal(Long total) {
        this.total = total;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    
}
