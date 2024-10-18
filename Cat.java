/** A Cat is a special kind of animal that rules other humans. */

class Cat extends Animal {

    private boolean mangy;
    private boolean hungry;

    Cat(boolean mangy) {
        this.mangy = mangy;
        this.hungry = false;
    }

    String makeNoise() {
        if (this.hungry) {
            return "meeoooowwww";
        } else {
            return "prrrrr";
        }
    }
}
