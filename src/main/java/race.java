public class race {

    public static String race(car car1, car car2, car car3){
        String winner;

        int car1Distance = 24 * car1.speed;
        int car2Distance = 24 * car2.speed;
        int car3Distance = 24 * car3.speed;

        int maxDistance = Math.max(car1Distance, Math.max(car2Distance, car3Distance));
        if (maxDistance == car1Distance){
           winner = car1.model;
        } else if (maxDistance == car2Distance) {
           winner = car2.model;
        } else {
           winner = car3.model;
        }
        return winner;
    }
}
