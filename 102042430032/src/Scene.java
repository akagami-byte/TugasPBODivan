import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("FieldMayBeFinal")
public class Scene {
    // Sesuai spesifikasi
    private String description;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private Scene nextSceneA;
    private Scene nextSceneB;
    private Scene nextSceneC;
    private int damageA;
    private int damageB;
    private int damageC;
    private int XPA;
    private int XPB;
    private int XPC;
    private Scene[] scenes;
    private Map<String, String> sceneItems;
    
    
    
    // Tambahan untuk musuh system
    private String musuhName;
    private int musuhHealth;
    
    public Scene(String description, String choiceA, String choiceB, String choiceC,
                 Scene nextSceneA, Scene nextSceneB, Scene nextSceneC,
                 int damageA, int damageB, int damageC,
                 int XPA, int XPB, int XPC, Scene[] scenes) {
        this.description = description;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.nextSceneA = nextSceneA;
        this.nextSceneB = nextSceneB;
        this.nextSceneC = nextSceneC;
        this.damageA = damageA;
        this.damageB = damageB;
        this.damageC = damageC;
        this.XPA = XPA;
        this.XPB = XPB;
        this.XPC = XPC;
        this.musuhName = null; // Default tidak ada musuh
        this.musuhHealth = 0; // Default tidak ada musuh
        this.scenes = scenes;
        this.sceneItems = new HashMap<>();
    }
    
    // Metode wajib
    public void displayScene() {
        System.out.println(description);
        if(hasMusuh()) {
            System.out.println("Musuh: " + musuhName + " (HP: " + musuhHealth + ")");
        }
        System.out.println("A. " + choiceA);
        if (choiceB != null && !choiceB.isEmpty()) {
            System.out.println("B. " + choiceB);
        }
        // if((this != scenes[6]) || this != scenes[5] || this != scenes[16] || this != scenes[10] || this != scenes[17]) {
        //     System.out.println("C. " + choiceC);
        // }
        if (choiceC != null && !choiceC.isEmpty()) {
            System.out.println("C. " + choiceC);
        }
    }
    
    public void setSceneItem(String choice, String item) {
        sceneItems.put(choice, item);
    }

    public Scene makeChoice(String choice, Character player) {
        // Scene result = TakeWeaponScene(player, choice, scenes);
        // if (result != null && this.hasMusuh()) {
        //     return result; // Jika ada scene yang diambil, kembalikan scene tersebut
        // }

        String item = sceneItems.get(choice.toUpperCase());
        if (item != null) {
            player.setItem(item);
        }
        
        int CariSceneMusuh = getSceneIndex(scenes);
        boolean ignoreMusuh = 
        ((CariSceneMusuh == 4 && "C".equalsIgnoreCase(choice)) ||
        (CariSceneMusuh == 5 && "B".equalsIgnoreCase(choice)) ||
         (CariSceneMusuh == 28 && "B".equalsIgnoreCase(choice)));

        if (CariSceneMusuh == 29) {
        switch (choice.toUpperCase()) {
            case "B" -> {
                if (!player.containsItem("Ju-hee")) {
                    System.out.println("\n Opsi terkunci karena kamu tidak memilih Ju-hee di scene sebelumnya");
                    return this; // Tetap di scene saat ini
                }
                }
            case "C" -> {
                if (!player.containsItem("Kartu Akses")) {
                    System.out.println("\n Opsi terkunci karena kamu tidak memilih Kartu Akses di scene sebelumnya");
                    return this; // Tetap di scene saat ini
                }
                }
        }
    }

        switch (choice.toUpperCase()) {
            case "A":
            if (!ignoreMusuh && hasMusuh()) {
                    handleCombat(player, damageA);
                    System.out.println("Monster masih hidup! Kamu harus mengalahkannya untuk melanjutkan.");
                    return this; // Stay in the current scene
                } else {
                    player.addXP(XPA);
                    return nextSceneA;
                }
    
            case "B":
            if (!ignoreMusuh && hasMusuh()) {
                    handleCombat(player, damageB);
                    System.out.println("Monster masih hidup! Kamu harus mengalahkannya untuk melanjutkan.");
                    return this; // Stay in the current scene
                } else {
                    player.addXP(XPB);
                    return nextSceneB;
                }
    
            case "C":
            if (!ignoreMusuh && hasMusuh()) {
                    handleCombat(player, damageC);
                    System.out.println("Monster masih hidup! Kamu harus mengalahkannya untuk melanjutkan.");
                    return this; // Stay in the current scene
                } else {
                    player.addXP(XPC);
                    return nextSceneC;
                }

            default:
                System.out.println("Pilihan tidak valid");
                return this;
        }
    }
    
    
    
    // Tambahan untuk combatchoice
    private void handleCombat(Character player, int damage) {
        if (hasMusuh()){
            int totalDamage = player.getAttackDamage();
            if (!player.containsItem("Pisau") && !player.containsItem("Tombak") && !player.containsItem("Busur")) {
                System.out.println("Anda tidak memiliki Pisau, Pistol, atau Taser gun! Menyerang dengan damage default.");
                totalDamage = 5; // Default damage
            } //Ambil damage dari getAttackDamage
            if (musuhHealth < 0){
                System.out.println("Monster telah mati!");
                return;
            }

            System.out.println("Anda menyerang " + musuhName + " dengan " + totalDamage + " damage!");
            musuhHealth -= totalDamage;
            if(musuhHealth > 0) {
                player.takeDamage(damage);
            }
            System.out.println(musuhName + " menyerangmu dengan " + damage + " damage!");
        }
    }

    

    // public Scene TakeWeaponScene(Character player, String choice, Scene[] scenes){
    //     //int index = getSceneIndex(this.scenes);
    //     int index = 0;
    //     if(this == scenes[4]) {
    //         index = 0;
    //     } else if(this == scenes[7]) {
    //         index = 1;
    //     } else if (this == scenes[8]){
    //         index = 2;
    //     }
    //     if (index < 0 || index >= player.getAddItem().size()) {
    //         System.out.println("Scene tidak valid.");
    //         return null;
    //     }
    //     String[] itemIn = player.getAddItem().get(index);
    //      // Set item default ke Pisau
    //     if ("A".equals(choice) && itemIn[0] != null) {
    //         player.setItem(itemIn[0]); // Item di sini diambil dari ItemIn yang referensinya dari ArrayList TambahItem
            
    //     } else if ("B".equals(choice) && itemIn[1] != null) {   
    //         player.setItem(itemIn[1]);
            
    //     } else if ("C".equals(choice) && itemIn[2] != null) {
    //         player.setItem(itemIn[2]);
    //     }
    //     return null;
    // }
    
    public boolean hasMusuh() {
        return musuhName != null && musuhHealth > 0; // Cek apakah ada musuh
    }

    public void setmusuh(String name, int health) {
        this.musuhName = name;
        this.musuhHealth = health;
        
    }

    public void setNextScenes(Scene nextA, Scene nextB, Scene nextC) {
        this.nextSceneA = nextA;
        this.nextSceneB = nextB;
        this.nextSceneC = nextC;
    }

    //Mengatur scene biar masuk ke Index, fungsinya selain ngatur scene juga mempermudah satuin scene dengan kondisi scene ambil senjata
    public int getSceneIndex(Scene[] scenes) {
        for (int i = 0; i < scenes.length; i++) {
            if (scenes[i] == this) {
                return i;
            }
        }
        return -1; // Jika scene tidak ditemukan
    }

    public Scene[] getScenes() { return scenes; }
    public void setScenes(Scene[] scenes) { this.scenes = scenes; }

    public String getMusuhName() { return musuhName; }
    public void setMusuhName(String musuhName) { this.musuhName = musuhName; }

}