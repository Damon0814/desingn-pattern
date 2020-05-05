package com.cn.observer;

/**
 * 具体观察者
 */
public class Taopiaopiao extends SaleTicketPlatform {

    public Taopiaopiao(MovieCenter movieCenter) {
        this.movieCenter = movieCenter;
    }

    @Override
    protected void update(String type) {
        if (type.equals("New")) {
            System.out.println("[TaoPiaoPiao]--New movie: " + movieCenter.getMovieName() + " is on line!");
        } else if (type.equals("Off")) {
            System.out.println("[TaoPiaoPiao]--Movie: " + movieCenter.getMovieName() + "is off line!");
        }
    }
}
