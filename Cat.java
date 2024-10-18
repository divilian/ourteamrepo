
class Cat extends Animal {

    private boolean mangy;
    private boolean hungry;

    Cat(boolean mangy) {
        this.mangy = mangy;
        this.hungry = false;
    }

    String makeNoise() {
        if (this.hungry) {
            return "meow";
        } else {
            this.hungry = false;
            return "prrrrr";
        }
    }
}
