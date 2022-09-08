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
    private boolean active;


    public Customer(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    //pode ser feita uma validação caso o nome passado esteja errado e também substitui o método set
    void changeName(String name) {
        this.name = name;
    }


    //substitui o método set para ativar
    void activate () {
        this.active = true;
    }


    //substitui o método set para desativar
    void desactivate() {
        this.active = false;
    }
}
