
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        PaymentCard card = new PaymentCard(5);
        System.out.println(card);
        
        card.eatHeartily();
        System.out.println(card);
        card.eatAffordably();
        System.out.println(card);
        
        

    }
}
