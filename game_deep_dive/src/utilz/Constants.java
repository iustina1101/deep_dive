package utilz;

public class Constants {
    public static class Directions {
        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int RIGHT = 2;
        public static final int DOWN = 3;
    }

    public static class PlayerConstants {
        public static final int IDLE = 0;
        public static final int SWIMMING = 1;
        public static final int HURT = 2;
        public static final int ATTACK = 3;

        public static int GetSpriteAmount (int player_action){
            switch(player_action){
                case IDLE:
                case ATTACK:
                    return 4;
                case SWIMMING:
                    return 16;
                case HURT:
                    return 3;
                default:
                    return 1;
            }
        }
    }
}
