public class Main {
    public static void main(String[] args) throws Exception {
        mission Farcry01 = new mission();
        System.out.println("----------------");
        System.out.println("new mission");
        System.out.println("----------------");
        Farcry01.cash = "1000";
        Farcry01.weapon = "M4 Glacier";
        Farcry01.vehicle = "Buggy";
        Farcry01.knife = "xenonite";
        Farcry01.killmission = "tribal leader";
        Farcry01.findlocalresidents = "yuda";

        System.out.println("cash="+Farcry01.cash);
        System.out.println("weapon="+Farcry01.weapon);
        System.out.println("vehicle="+Farcry01.vehicle);
        System.out.println("knife="+Farcry01.knife);
        System.out.println("killmission="+Farcry01.killmission);
        System.out.println("findlocalresidents="+Farcry01.findlocalresidents);
        System.out.println("=================");

        Farcry01.bonuscash();
        Farcry01.achievement();
        System.out.println("=================");

        explore Farcry02 = new explore();
        System.out.println("----------------");
        System.out.println("explore maps");
        System.out.println("----------------");
        Farcry02.cash = "2500";
        Farcry02.weapon = "M4 Glacier";
        Farcry02.vehicle = "helicopter";
        Farcry02.knife = "xenonite";
        Farcry02.basecamp = "kampung durian runtuh";
        Farcry02.enemylocation = "tk tadika mesra";

        System.out.println("cash="+Farcry02.cash);
        System.out.println("weapon="+Farcry02.weapon);
        System.out.println("vehicle="+Farcry02.vehicle);
        System.out.println("knife="+Farcry02.knife);
        System.out.println("basecamp="+Farcry02.basecamp);
        System.out.println("enemylocation="+Farcry02.enemylocation);
        System.out.println("=================");

        Farcry01.achievement();
        System.out.println("=================");

        crafting Farcry3 = new crafting();
        System.out.println("----------------");
        System.out.println("crafting");
        System.out.println("----------------");
        Farcry3.cash = "5000";
        Farcry3.weapon = "M4 Glacier + Bow";
        Farcry3.vehicle = "Buggy";
        Farcry3.knife = "xenonite";
        Farcry3.medkit = "paint killer";
        Farcry3.ammo = "reload";

        System.out.println("cash="+Farcry3.cash);
        System.out.println("weapon="+Farcry3.weapon);
        System.out.println("vehicle="+Farcry3.vehicle);
        System.out.println("knife="+Farcry3.knife);
        System.out.println("medkit="+Farcry3.medkit);
        System.out.println("jumlah ammo="+Farcry3.ammo);
        System.out.println("=================");

        Farcry01.bonuscash();
        Farcry01.achievement();
        System.out.println("=================");

        
        
    }
}
