package com.oniricam.oniricam_backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "publications")
public class Publication {

    public Publication(String title, String contentUrl, LocalDateTime publishedAt, String bannerUrl) {
        this.title = title;
        this.contentUrl = contentUrl;
        this.publishedAt = publishedAt;
        this.bannerUrl = bannerUrl;
    }

    public Publication(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content_url", nullable = false)
    private String contentUrl;

    @Column(name = "published_at")
    private LocalDateTime publishedAt;

    @Column(name = "banner_url")
    private String bannerUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }
}
