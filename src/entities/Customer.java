package entities;


//entidade é algo que é único, ou seja cada entidade tem seu id
// carrega valores que alteram com o tempo
//comportamento
//regras de negócio ou seja validaçoes etc, isso é o DDD
//essa classe customer é uma classe anêmica, apenas carrega dados.

public class Customer {

    private Long id;
    private String name;
    private Address address;
    private boolean active;


    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
        validate();
    }


    void validate() {
        if (this.name.length() == 0){
            throw new RuntimeException("name is required");
        }
        if (this.id == null) {
            throw new RuntimeException("id is required");
        }
    }


    //pode ser feita uma validação caso o nome passado esteja errado e também substitui o método set
    void changeName(String name) {
        this.name = name;
        validate();
    }


    //substitui o método set para ativar
    void activate () {
        if (this.address == null) {
            throw new RuntimeException("Address é obrigatório para ativar o customer");
        }
        this.active = true;
    }

    //substitui o método set para desativar
    void desactivate() {
        this.active = false;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
