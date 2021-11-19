package br.com.igor.p2.model.entity;

public class Instalments {
    private Integer count;
    private Float value;

    public Instalments(Integer count, Float price) {
        this.count = 10;
        this.value = (price/count);
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }
}
