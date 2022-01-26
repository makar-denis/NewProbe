public class User implements UserInterfece{
    private final String name;
    private final Byte age;
    public User(String name, byte age, String name1, Byte age1){
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;

    }

    @Override
    public void setNameUser() {


    }
}
