package org.trackensure.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonPropertyOrder({ "id", "name", "company", "city", "country"})
public class Garage {

    private Integer id;
    private String name;
    private String company;
    private String city;
    private String country;

    public Garage() {
    }

    public Garage(Integer id, String name, String company, String city, String country) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.city = city;
        this.country = country;
    }

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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(id, garage.id) &&
                Objects.equals(name, garage.name) &&
                Objects.equals(company, garage.company) &&
                Objects.equals(city, garage.city) &&
                Objects.equals(country, garage.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, company, city, country);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
