package com.oniricam.oniricam_backend.model;

public class Email {
    private String receiver;
    private String subject;
    private String body;

    public Email(String receiver, String subject, String body) {
        this.receiver = receiver;
        this.subject = subject;
        this.body = body;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public static String serializeEmailBody(String nome, String bannerUrl, String link) {
       return String.format("<!doctype html><html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\"><meta charset=\"UTF-8\"><meta content=\"width=device-width,initial-scale=1\" name=\"viewport\"><meta name=\"x-apple-disable-message-reformatting\"><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><meta content=\"telephone=no\" name=\"format-detection\"><title></title><body class=\"body\"><div dir=\"ltr\" class=\"es-wrapper-color\"><table width=\"100%%\" cellspacing=\"0\" cellpadding=\"0\" class=\"es-wrapper\"><tr><td valign=\"top\" class=\"esd-email-paddings\"><table cellspacing=\"0\" cellpadding=\"0\" align=\"center\" class=\"es-content\"><tr><td align=\"center\" class=\"esd-stripe\"><table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\" class=\"es-content-body\"><tr><td align=\"left\" class=\"esd-structure es-p20t es-p20r es-p20l\"><table width=\"100%%\" cellpadding=\"0\" cellspacing=\"0\"><tr><td align=\"left\" width=\"560\" class=\"esd-container-frame\"><table cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%%\"><tr><td align=\"left\" class=\"esd-block-text\"><p>Olá, %s!<p>Passando aqui pra te avisar que lançamos uma nova publicação, venha conferir!</table></table><tr><td align=\"left\" class=\"es-p20t es-p20r es-p20l esd-structure\"><table width=\"100%%\" cellspacing=\"0\" cellpadding=\"0\"><tr><td width=\"560\" valign=\"top\" align=\"center\" class=\"esd-container-frame\"><table width=\"100%%\" cellspacing=\"0\" cellpadding=\"0\"><tr><td align=\"center\" class=\"esd-block-image\" style=\"font-size: 0\"><a target=\"_blank\"><img src=\"%s\" alt=\"\" width=\"100%%\" height=\"100%%\"></a></table></table><tr><td align=\"left\" class=\"esd-structure es-p20t es-p20r es-p20l\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%%\" class=\"es-m-p20b\"><tr><td align=\"left\" width=\"560\" class=\"esd-container-frame\"><table cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%%\"><tr><td align=\"center\" class=\"esd-block-button\"><span class=\"es-button-border\"><a href=\"%s\" target=\"_blank\" class=\"es-button\">Acessar</a></span></table></table></table></table></table></div>", nome, bannerUrl, link);
    }
}

