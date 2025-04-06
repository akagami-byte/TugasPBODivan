import java.util.ArrayList;
@SuppressWarnings("FieldMayBeFinal")

public class Character {
    // Sesuai spesifikasi minimum
    private String name;
    private int health;
    private int XP;
    private ArrayList<String> inventory = new ArrayList<>(); //semeua item yang diambil masuk ke inventory
    //private ArrayList<String[]> tambahItem = new ArrayList<>(); //item yang akan diambil dari scene
    private int attackDamage; // Default damage
    private int bonusDamage; //set buat item biar bisa stack damage
    

    public Character(String name, int health, int XP) {
        this.name = name;
        this.health = health;
        this.XP = XP;
        this.attackDamage = 5; // Default damage
        this.bonusDamage = 0; // Damage untuk diinisiasi ke item, bisa di stack
        this.inventory = new ArrayList<>();
        // this.tambahItem = new ArrayList<>();

        // tambahItem.add(new String[]{"Pisau", "Pistol", "Taser gun"}); // Bonus damage dari senjata
        // tambahItem.add(new String[]{"Pisau", "Pistol", "Taser gun"});
    }
    
    // Metode wajib sesuai spesifikasi
    public void takeDamage(int damage) {this.health -= damage;}

    public void addXP(int additionalXP) {this.XP += additionalXP;}
    public int getXP() {return this.XP;}

    public String getName() {return name;} // Ambil nama karakter
    
    public int getHealth() {return health;} //Atur health Character
    public void setHealth(int health) {this.health = health;} //Atur health Character

    public ArrayList<String> getItem(){return inventory;} //getter untuk inventory jadi bisa dipakai di scene
    
    public int getAttackDamage() {return attackDamage + bonusDamage;} // Beri damage default + item(kalau ada)
     
    //public ArrayList<String[]> getAddItem() {return tambahItem;}
    
    
    
    // public void setItem(String item) {
    //     if(!inventory.contains(item)) {
    //         if("Pisau".equals(item)) {
    //             addInventory("Pisau"); // Menambahkan item ke inventory
    //             System.out.println("Anda mengambil " + item + "!");
    //             this.bonusDamage = 15; // Bonus damage dari setItem
    //         }
    //         else if("Pistol".equals(item)) {
    //             this.bonusDamage = 20; // Bonus damage dari senjata
    //             addInventory("Pistol"); // Menambahkan item ke inventory
    //             System.out.println("Anda mengambil " + item + "!");
    //         }
    //         else if("Tongkat baseball".equals(item)) {
    //             this.bonusDamage = 10; // Bonus damage dari senjata
    //         }
    //         else if("Ramuan ajaib".equals(item)) {
    //             this.health += 10; // Bonus health dari item
    //         }
    //     }
    // }

    public void setItem(String item) {
        if(!inventory.contains(item)) {
            switch(item) {
                case "Pisau" -> {
                    addInventory(item);
                    this.bonusDamage += 15;
                }
                case "Pistol" -> {
                    addInventory(item);
                    this.bonusDamage += 20;
                }
                case "Taser gun" -> {
                    addInventory(item);
                    this.bonusDamage += 18;
                }
                case "Ju-hee" -> {
                    addInventory(item);
                    this.bonusDamage += 10;
                }
                case "Kartu Akses" -> {
                    addInventory(item);
                    this.health += 10;
                }
                default -> System.out.println("Item tidak dikenali!");
            }
        }
    }
    
    // Tambahan minimal untuk combat
    
    public boolean containsItem(String item) {return inventory.contains(item);} // Cek apakah item ada di inventory
    public void addInventory(String item){
        if(!inventory.contains(item)) {
            inventory.add(item);
            System.out.println("Item " + item + " berhasil ditambahkan ke inventory!");
        } else {
            System.out.println("Item " + item + " sudah ada di inventory!");
        }
    }


}