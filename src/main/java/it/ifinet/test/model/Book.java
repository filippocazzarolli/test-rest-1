package it.ifinet.test.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 200)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(name = "unit_cost")
    private Float unitCost;

    private String isnb;

    @Column(name = "publication_date")
    @Temporal(TemporalType.DATE)
    private Date publicationDate;

    private Integer nbOfPages;

    private String imageUrl;

    private Language language;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    public String getIsnb() {
        return isnb;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Integer getNbOfPages() {
        return nbOfPages;
    }

    public void setNbOfPages(Integer nbOfPages) {
        this.nbOfPages = nbOfPages;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", unitCost=" + unitCost +
                ", isnb='" + isnb + '\'' +
                ", publicationDate=" + publicationDate +
                ", nbOfPages=" + nbOfPages +
                ", imageUrl='" + imageUrl + '\'' +
                ", language=" + language +
                '}';
    }
}
