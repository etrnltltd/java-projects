package projects.OOPtesting;

class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Шарик", 5, "Чёрный");
        myDog.voice();

        myDog.happyBirthday();
        myDog.voice();

        myDog.changeColor("Белый");
        myDog.voice();
    }
}
