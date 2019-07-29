package me.wolflie.superffa.data;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class PlayerData {

    private PlayerState preGameState;
    private int kills, deaths;
    private int highestKillStreak;
    private final UUID id;

    public PlayerData(UUID id) {
        this.id = id;
    }

    public PlayerState getPreGameState() {
        return preGameState;
    }

    public int getHighestKillStreak() {
        return highestKillStreak;
    }

    public void setPreGameState(PlayerState preGameState) {
        this.preGameState = preGameState;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public UUID getId() {
        return id;
    }

    public static class PlayerState {
        private double health;
        private float exp;
        private int foodLevel;
        private Location location;
        private ItemStack[] items;
        private ItemStack[] armor;

        public PlayerState(double health, float exp, int foodLevel, Location location, ItemStack[] items, ItemStack[] armor) {
            this.health = health;
            this.exp = exp;
            this.foodLevel = foodLevel;
            this.location = location;
            this.items = items;
            this.armor = armor;
        }

        public void apply(Player player) {
            player.setHealth(health);
            player.setExp(exp);
            player.setFoodLevel(foodLevel);
            player.teleport(location);
            player.getInventory().setArmorContents(armor);
            player.getInventory().setContents(items);
        }

        public double getHealth() {
            return health;
        }

        public void setHealth(double health) {
            this.health = health;
        }

        public float getExp() {
            return exp;
        }

        public void setExp(float exp) {
            this.exp = exp;
        }

        public int getFoodLevel() {
            return foodLevel;
        }

        public void setFoodLevel(int foodLevel) {
            this.foodLevel = foodLevel;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public ItemStack[] getItems() {
            return items;
        }

        public void setItems(ItemStack[] items) {
            this.items = items;
        }

        public ItemStack[] getArmor() {
            return armor;
        }

        public void setArmor(ItemStack[] armor) {
            this.armor = armor;
        }
    }

}
