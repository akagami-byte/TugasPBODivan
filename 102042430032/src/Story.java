import java.util.Scanner;
@SuppressWarnings("FieldMayBeFinal") //Buat ngilangin warning, 
public class Story {
    private Scene[] scenes;
    private Character player;
    private Scanner scanner;
    private int currentSceneIndex;
    
    public String getInput(){return scanner.nextLine();}
    public void setInput(String input){this.scanner = new Scanner(input);}


    public Story(Scene[] scenes, Character player) {
        this.scenes = scenes;
        this.player = player;
        this.scanner = new Scanner(System.in);
        this.currentSceneIndex = 0;
        
    }

    public void start() {
        System.out.println("Selamat datang di petualangan text-based!");
        System.out.println("Anda adalah " + player.getName() + " dengan " + player.getHealth() + " HP.");
        System.out.println("Tujuan Anda adalah menyelesaikan petualangan ini dengan selamat.");
        play();
    }

    public void play() {    
        while (player.getHealth() > 0) {
            Scene currentScene = scenes[currentSceneIndex];
            currentScene.displayScene();
            
            if (currentSceneIndex == 30 || currentSceneIndex == 31 || currentSceneIndex == 32) {
                System.out.println("\n=== Permainan Berakhir ===");
                System.out.println("Terima kasih telah bermain!");
                System.exit(0); // Keluar dari program
            }

            System.out.print("Pilihan [A/B/C/INFO]: ");
            String input = getInput();
            
            if (input.equalsIgnoreCase("INFO")) {
                System.out.println("HP: " + player.getHealth() + " | XP: " + player.getXP() + 
                                 " | Item: " + (player.getItem() != null ? player.getItem() : "Tidak ada") + " | Damage: " + player.getAttackDamage() + "\n");
                continue;
            }
            
            Scene nextScene = currentScene.makeChoice(input, player);
             // Selalu cari scene berikutnya, termasuk jika mengarah ke scene yang sama
            int newSceneIndex = -1;
            for (int i = 0; i < scenes.length; i++) {
                if (scenes[i] == nextScene) {
                    newSceneIndex = i;
                    break;
                }
            }
            
            if (newSceneIndex != -1) {
                currentSceneIndex = newSceneIndex;
            }
            
            
            // Periksa health setelah setiap aksi
            if (player.getHealth() <= 0) {
                System.out.println("Game Over! Health Anda habis.");
                break;
            }
            if(player.getXP() <= 100) {
                System.out.println("Game Over! XP Anda habis..");
                break;
            }
        }
    }
}