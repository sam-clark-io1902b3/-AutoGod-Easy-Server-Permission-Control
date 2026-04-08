import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RandomCodeGenerator {
    
    private static final String[] FUNNY_MESSAGES = {
        "Why did the Java developer wear glasses? Because he couldn't C#!",
        "I told my computer I needed a break... now it won't stop sending me vacation ads.",
        "Java developers are like magicians - they turn coffee into code!",
        "99 little bugs in the code, 99 little bugs. Take one down, patch it around, 127 little bugs in the code!",
        "My code works... I have no idea why."
    };
    
    private static final String[] NAMES = {"Steve", "Alex", "Herobrine", "Notch", "Jeb", "Dream", "GeorgeNotFound", "Technoblade"};
    private static final String[] ACTIONS = {"mining", "building", "fighting", "exploring", "farming", "trading", "flying", "using god mode"};
    private static final String[] LOCATIONS = {"Overworld", "Nether", "End", "village", "desert temple", "ocean monument", "stronghold"};
    
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║           RANDOM JAVA CODE GENERATOR v1.0               ║");
        System.out.println("║              For AutoGod Minecraft Plugin               ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.println();
        
        Random random = new Random();
        
        // Task 1: Generate random player data
        System.out.println("📊 RANDOM PLAYER DATA:");
        System.out.println("─────────────────────────────────────────────────────────");
        
        for (int i = 0; i < 5; i++) {
            String name = NAMES[random.nextInt(NAMES.length)];
            int level = random.nextInt(100) + 1;
            int health = random.nextInt(40) + 1;
            boolean hasGodMode = random.nextBoolean();
            boolean canFly = random.nextBoolean();
            
            System.out.printf("👤 %-12s | Level: %3d | ❤️ HP: %2d | 👑 God: %-5s | 🦅 Fly: %-5s%n",
                name, level, health, hasGodMode, canFly);
        }
        
        System.out.println();
        
        // Task 2: Generate random server events
        System.out.println("🎮 RANDOM SERVER EVENTS:");
        System.out.println("─────────────────────────────────────────────────────────");
        
        for (int i = 0; i < 3; i++) {
            String player = NAMES[random.nextInt(NAMES.length)];
            String action = ACTIONS[random.nextInt(ACTIONS.length)];
            String location = LOCATIONS[random.nextInt(LOCATIONS.length)];
            int duration