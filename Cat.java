
class Cat extends Animal {

    private boolean mangy;
    private boolean hungry;

    Cat(boolean mangy) {
        mangy = mangy;
        hungry = false;
    }

    String makeNoise() {
        if (this.hungry) {
            return "meeoooowwww";
        } else {
            return "prrrrr";
        }
    }
}
