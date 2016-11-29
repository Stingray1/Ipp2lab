package com.company.Builder;

class Builder {

    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new VisitCardsWebBuilder());
        WebSite website = director.buildWebSite();
        System.out.println(website);

                                            }
}

enum Cms
{
    WordPress,
    AliFresco;
}
class WebSite
{
    private String name;
    private Cms cms;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cms getCms() {
        return cms;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", price='" + price + '\'' +
                '}';
    }
}

abstract class WebsiteBuilder
{
    WebSite webSite;
    void createWebSite()
    {
        webSite = new WebSite();
    }
    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    WebSite getWebSite()
    {
        return  webSite;
    }
}

class VisitCardsWebBuilder extends  WebsiteBuilder
{
    @Override
    void buildName() {
        webSite.setName("VisitCards");
    }

    @Override
    void buildCms() {
    webSite.setCms(Cms.WordPress);
    }

    @Override
    void buildPrice() {
        webSite.setPrice("100 euro");
    }
}

class EnterpriseWebsiteBuilder extends  WebsiteBuilder
{
    @Override
    void buildName() {
        webSite.setName("Enteprise");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.AliFresco);
    }

    @Override
    void buildPrice() {
        webSite.setPrice("1000 euro");
    }
}

class Director
{
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }
    WebSite buildWebSite()
    {
        builder.createWebSite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        WebSite webSite =builder.getWebSite();
        return webSite;
    }

}