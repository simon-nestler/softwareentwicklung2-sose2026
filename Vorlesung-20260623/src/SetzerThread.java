public class SetzerThread extends Thread {

    private PersonHalter halter;

    public SetzerThread(PersonHalter halter) {
        this.halter = halter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000000; i++) {
            if (i % 4 == 0) {
                halter.person = null;
            } else {
                Person person = new Person();
                person.setName("Andreas");
                halter.person = person;
            }
        }
    }

}