public class HotPotShop {

    public HotPot ChooseHot(String type) {
        HotPot hotPot = null;
        if (type.equals("麻辣羊肉火锅")) {
            hotPot = new PotType1();
        } else if (type.equals("潮汕牛肉火锅")) {
            hotPot = new PotType2();
        } else if (type.equals("鸳鸯锅")) {
            hotPot = new PotType3();
        }else if (type.equals("酸汤鱼火锅")) {
            hotPot = new PotType4();
        } else {
            throw new RuntimeException("没有该锅底");
        }

        return hotPot;
    }


}