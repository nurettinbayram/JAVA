//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       BankaHesabi bankaHesabi =new BankaHesabi("Nurettin Bayram", "789654", 0);
       bankaHesabi.paraYatir(2500);
       bankaHesabi.paraCek(1500);
       bankaHesabi.bakiyeGoster();
       bankaHesabi.bilgiGoster();
       bankaHesabi.paraTranfer("456321", 550);
       bankaHesabi.paraTranfer("456321", 550);

    }
}