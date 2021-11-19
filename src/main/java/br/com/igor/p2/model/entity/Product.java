package br.com.igor.p2.model.entity;

public class Product {
    private Integer id;
    private String name;
    private String image;
    private Float oldPrice;
    private Float price;
    private String description;
    private Instalments instalments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Float getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Float oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instalments getInstalments() {
        return instalments;
    }

    public void setInstalments(Instalments instalments) {
        this.instalments = instalments;
    }
}