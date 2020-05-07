public class BonusMilesService {
    public int calculate(int cost) {
        int condInRub = 20;
        int bonus = 1;
        int miles = (cost / condInRub) * bonus;
        return miles;
    }
}
