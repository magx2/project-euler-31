package pl.grzeslowski.project_euler_31;

public class Main {

    public static void main(final String[] args) {
        final int coin = Integer.parseInt(args[0]);
        
        final ProjectEuler31 euler = new ProjectEuler31NsnMoneyChange();
        
        System.out.println(euler.waysToChangeCoin(coin));
    }

}
