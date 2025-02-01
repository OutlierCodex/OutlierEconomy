package org.outliertech.outliereconomy;


public class PlayerData {
    String uuid;
    double playerBalance;
    double playerBankBalance;

    // Constructor
    public PlayerData(String uuid, double playerBalance, double playerBankBalance) {
        this.uuid = uuid;
        this.playerBalance = playerBalance;
        this.playerBankBalance = playerBankBalance;
    }

    // Getters
    public String getUuid() {
        return uuid;
    }

    public double getPlayerBalance() {
        return playerBalance;
    }

    public double getPlayerBankBalance() {
        return playerBankBalance;
    }

    // Setters
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setPlayerBalance(double playerBalance) {
        this.playerBalance = playerBalance;
    }

    public void setPlayerBankBalance(double playerBankBalance) {
        this.playerBankBalance = playerBankBalance;
    }
}
