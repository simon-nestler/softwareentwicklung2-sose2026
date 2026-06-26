public class SetzerThread extends Thread {

    private PersonHalter halter;

    public SetzerThread(PersonHalter halter) {
        this.halter = halter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000000; i++) {
            // synchronized sorgt dafür, dass dieser Zugriff
            // nur stattfindet, wenn kein anderer Thread gerade den
            // Token für das Objekt "halter" hat

            synchronized (halter) {
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

}