public class OrderSystem {
    public static void main(String[] args) {
        HotPotShop hotPotShop = new HotPotShop();
        HotPot hotPot = hotPotShop.ChooseHot("酸汤鱼火锅");
        System.out.println(hotPot.getName());
    }
}