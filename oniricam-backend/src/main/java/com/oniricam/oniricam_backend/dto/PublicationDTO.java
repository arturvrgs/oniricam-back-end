package com.oniricam.oniricam_backend.dto;
import java.time.LocalDateTime;
import jakarta.

public class PublicationDTO {

    @NotBlank(message = "O título é obrigatório")
    private String title;
    private String contentUrl;
    private LocalDateTime publishedAt;
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
