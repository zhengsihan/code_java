package enumPractice;

/**
 * 用枚举实现接口
 */
public enum Console2 implements ExclusiveGame{
    PLAYSTATION{
        @Override
        public String exclusive() {
            return "PLAYSTATION has UNCHARTED and GOD OF WAR";
        }
    },

    XBOX{
        @Override
        public String exclusive() {
            return "XBOX has HALO AND FORZA";
        }
    }
}
