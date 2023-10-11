package com.ashish.ThreeCardPoker.model;

public class Players {
    private String name;
    private int id;
    private int balance;
    private int wins;
    private int loss;
    private boolean pack;

    public Players(String name, int id, int balance, int wins, int loss, boolean pack) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.wins = wins;
        this.loss = loss;
        this.pack = pack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public boolean isPack() {
        return pack;
    }

    public void setPack(boolean pack) {
        this.pack = pack;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", wins=" + wins +
                ", loss=" + loss +
                ", pack=" + pack +
                '}';
    }
}
