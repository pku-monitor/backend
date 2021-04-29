package br.unicentro.pkubackend.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(position = 1, required = true, hidden=true, notes = "Removendo da documentação do Swagger")
    private Long id;

    private String name;
    private  long consumedAmount;
    private long pkuTotalAmount;

    public Product(String name, long consumedAmount, long pkuTotalAmount) {
        this.name = name;
        this.consumedAmount = consumedAmount;
        this.pkuTotalAmount = pkuTotalAmount;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getConsumedAmount() {
        return consumedAmount;
    }

    public void setConsumedAmount(long consumedAmount) {
        this.consumedAmount = consumedAmount;
    }

    public long getPkuTotalAmount() {
        return pkuTotalAmount;
    }

    public void setPkuTotalAmount(long pkuTotalAmount) {
        this.pkuTotalAmount = pkuTotalAmount;
    }
}
