package entities;


//entidade é algo que é único, ou seja cada entidade tem seu id
// carrega valores que alteram com o tempo
//comportamento
//regras de negócio ou seja validaçoes etc, isso é o DDD
//essa classe customer é uma classe anêmica, apenas carrega dados.

public class Customer {

    private Long id;
    private String name;
    private String address;


    public Customer(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
